package com.sleepanalysis.mobilecomputing;

import android.content.Intent;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView sleep_time_result = findViewById(R.id.sleep_time_result);

        Intent intent = getIntent();
        // sleep_time 받아와서 띄우기
        int sleep_time = (int)intent.getExtras().getLong("sleep_time");
        long start_time = intent.getExtras().getLong("start_time");
        long end_time = intent.getExtras().getLong("end_time");
      
        int h, m, s;
        h = sleep_time / (1000 * 60 * 60);
        m = (sleep_time / (1000 * 60)) % 60;
        s = (sleep_time / 1000) % 60;
        sleep_time_result.setText( // Sleep time : h:mm:ss
                String.format(getResources().getString(R.string.sleep_time_result), h, m, s));

        // button_measure 클릭 시 MeasureActivity 로 전환
        ImageButton button_measure = findViewById(R.id.measure_button);
        button_measure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MeasureActivity.class);
                startActivity(intent);
            }
        });

        // Acceleration Graph Load
        FileReader acc_fr;
        BufferedReader acc_br;
        ArrayList<Entry> values_acc = new ArrayList<Entry>();
        String date_string = intent.getExtras().getString("date_string");
        File acc_file = new File(date_string + "acc.txt");
        ArrayList<Long> timeList = (ArrayList<Long>)intent.getSerializableExtra("time_list");
        int finalSec = 0;

        try {
//            InputStream in = getResources().openRawResource(R.raw.acc_curr4);
//            InputStreamReader stream = new InputStreamReader(in, "utf-8");
//            acc_br = new BufferedReader(stream);

            acc_fr = new FileReader(acc_file);
            acc_br = new BufferedReader(acc_fr);
            String line;
            int x;
            float y, max = 100, min = 10;
            int phase = 0;
            int diff = 0;

            // Toss & turn test by median
            float threshold = 0.02F;
            float extra = 0.0F;
            long prev = timeList.get(0);
            ArrayList<Float> accList = new ArrayList<>();
            accList.add(0.0F);
            accList.add(0.0F);
            accList.add(0.0F);
            accList.add(0.0F);

            while((line = acc_br.readLine()) != null){
                String[] split = line.split(" ");
                /////////
                if (start_time == 0) start_time = Long.valueOf(split[0]);
                start_time = timeList.get(0);
                long currSec = Long.valueOf(split[0]);
                x = (int)((currSec - start_time)/1000);
                if (diff > 3) {
                    accList.set(0, accList.get(3));
                    accList.set(1, accList.get(3));
                    accList.set(2, accList.get(3));
                }
                // Toss & turn test
                accList.add(Float.valueOf(split[1]));
                accList.remove(0);
                float error = Math.abs((accList.get(0) + accList.get(1) + accList.get(2))/3 - accList.get(3));
                if (error > threshold) {
                    extra = extra + 0.5F;
                    Log.d("tossing", String.valueOf(error));
                } else {
                    diff = (int)(currSec-prev)/1000;
                    if (diff==0) diff = 1;
                    extra = extra - diff * 0.001F;
                    Log.d("diff", String.valueOf(diff));
                }

                prev = currSec;
                Log.d("phase", currSec + ", " + timeList.get(phase) + ", " + phase);
                if (phase < timeList.size()) {
                    if (phase < timeList.size()-1 && currSec >= timeList.get(phase+1)) {
                        phase++;
                        if (phase == 0) {
                            max = 100; min = 10;
                        } else if (phase == timeList.size()-1) {
                            max = 100;
                        } else {
                            if (phase % 2 == 1) {
                                Log.d("extra", String.valueOf(extra));
                                max = 70 + extra;
                                min = min + extra;
                                extra = 0;
                            } else {
                                Log.d("extra", String.valueOf(extra));
                                min = 20 + extra;
                                max = max + extra;
                                extra = 0;
                            }
                        }
                    }
                }

                y = (max-min)/2*(float)Math.cos((x*Math.PI)/(45*60))+(max+min)/2 + extra;
                if (y >= 100) y = 100;
                if (y <= 0) y = 0;
                values_acc.add(new Entry(x, y));
                //values_snore.add(new Entry(x,0));
                finalSec = x;
                Log.d("data", x + ", " + y);
            }
        } catch (IOException e) {
            Log.d("graph load error", "error in file");
        }

        // Light Graph Load
        FileReader light_fr;
        BufferedReader light_br;
        File light_file = new File(date_string + "light.txt");
        ArrayList<Entry> values_light = new ArrayList<>();
        try {
            light_fr = new FileReader(light_file);
            light_br = new BufferedReader(light_fr);
            String line;
            long time;

            while((line = light_br.readLine()) != null) {
                String[] array = line.split(" ");
                time = Long.valueOf(array[0]);
                int x = (int)((time - timeList.get(0))/1000);
                float y = Float.valueOf(array[1]);
                if (y>=100) y = 100;
                values_light.add(new Entry(x, y));
                Log.d("light", x + ", " + y);
            }

        } catch (Exception e) {

        }

        // Snore Graph Load
        FileReader snore_fr;
        BufferedReader snore_br;
        File snore_file = new File(date_string + "snore.txt");
        ArrayList<Entry> values_snore = new ArrayList<>();
        values_snore.add(new Entry(0, 0));
        try {
            snore_fr = new FileReader(snore_file);
            snore_br = new BufferedReader(snore_fr);
            String line;
            long time;

            while((line = snore_br.readLine()) != null) {
                String[] array = line.split(" ");
                time = Long.valueOf(array[0]);
                int x = (int)((time - timeList.get(0))/1000);
                float y = 5;
                values_snore.add(new Entry(x-1, 0));
                values_snore.add(new Entry(x, y));
                values_snore.add(new Entry(x+1, 0));

                Log.d("Snore", String.valueOf(x));
            }
        } catch (Exception e) {
            Log.d("graph load error", "error in file");
        }
        values_snore.add(new Entry(finalSec, 0));

        // Acceleration Graph
        LineChart chart_acc = findViewById(R.id.acc_chart);
        chart_acc.setDescription(null);
        chart_acc.setBackgroundColor(Color.parseColor("#38424F"));
        chart_acc.getAxisRight().setEnabled(false);
        chart_acc.setScaleYEnabled(false);
        chart_acc.setDoubleTapToZoomEnabled(false);

        XAxis x_axis_acc = chart_acc.getXAxis();
        x_axis_acc.setPosition(XAxis.XAxisPosition.BOTTOM);
        x_axis_acc.setTextSize(1);
        x_axis_acc.setEnabled(false);
        x_axis_acc.setLabelCount(8);
        x_axis_acc.setTextColor(Color.WHITE);

        YAxis left_axis_acc = chart_acc.getAxisLeft();
        left_axis_acc.setAxisMinimum(0);
        left_axis_acc.setAxisMaximum(100);
        left_axis_acc.setTextColor(Color.WHITE);

        // Acc DataSet (= Line)
        LineDataSet dataSet_acc = new LineDataSet(values_acc, "Sleep Cycle");
        dataSet_acc.setColor(Color.WHITE);
        dataSet_acc.setDrawCircles(false);
        dataSet_acc.setLineWidth(2);
        dataSet_acc.setDrawValues(false);
        dataSet_acc.setValueTextColor(Color.WHITE);
        dataSet_acc.setDrawFilled(true);

        // Light DataSet
        LineDataSet dataSet_light = new LineDataSet(values_light, "Brightness");
        dataSet_light.setColor(Color.YELLOW);
        dataSet_light.setDrawCircles(false);
        dataSet_light.setDrawValues(false);
        dataSet_light.setLineWidth(2);
        dataSet_light.setValueTextColor(Color.YELLOW);

        // Snore DataSet
        LineDataSet dataSet_snore = new LineDataSet(values_snore, "Snore");
        dataSet_snore.setColor(Color.GREEN);
        dataSet_snore.setDrawCircles(false);
        dataSet_snore.setDrawValues(false);
        dataSet_snore.setLineWidth(2);
        dataSet_snore.setValueTextColor(Color.GREEN);

        // Bottom legend
        Legend legend = chart_acc.getLegend();
        legend.setTextColor(Color.WHITE);

        // Set the chart
        LineData data_acc = new LineData(dataSet_acc);
        data_acc.addDataSet(dataSet_snore);
        data_acc.addDataSet(dataSet_light);
        chart_acc.setData(data_acc);
        chart_acc.invalidate();



    }
}

