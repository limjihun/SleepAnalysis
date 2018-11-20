package com.sleepanalysis.mobilecomputing;

import android.content.Intent;

import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.formatter.IValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

import weka.core.Instances;

public class ResultActivity extends AppCompatActivity {
    String time;


  
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView sleep_time_result = findViewById(R.id.sleep_time_result);

        Intent intent = getIntent();

        // sleep_time 받아와서 띄우기
        int sleep_time = (int)intent.getExtras().getLong("sleep_time");
        int h, m, s;
        h = sleep_time / (1000 * 60 * 60);
        m = (sleep_time / (1000 * 60)) % 60;
        s = (sleep_time / 1000) % 60;
        sleep_time_result.setText( // Sleep time : h:mm:ss
                String.format(getResources().getString(R.string.sleep_time_result), h, m, s));

        // button_measure 클릭 시 MeasureActivity로 전환
        ImageButton button_measure = findViewById(R.id.measure_button);
        button_measure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, MeasureActivity.class);
                startActivity(intent);
            }
        });

        // Birghtness Graph Load
        FileReader light_fr;
        BufferedReader light_br;
        ArrayList<Entry> values_light = new ArrayList<Entry>();
        String date_string = intent.getExtras().getString("date_string");
        File light_file = new File(date_string + "light.txt");
        try {
            light_fr = new FileReader(light_file);
            light_br = new BufferedReader(light_fr);
            String line;
//            String d, v;
            String dd;
            int d;
            float v;
            while((line = light_br.readLine()) != null){
                d = Integer.parseInt(line.substring(0, 8).replace(":", ""));
                v = Float.parseFloat(line.substring(10));
                values_light.add(new Entry(d, v));
                Log.d("llllllll", String.valueOf(d));
                Log.d("lllllllll", String.valueOf(v));
//                Log.d(";;;;;;;;;", line);
            }
        } catch (IOException e) {
            Log.d("errrrrrrrrrrrrrrrrrrrrrrrrr", "error in file");
        }

        // Brightness Data Chart
        LineChart chart_light = findViewById(R.id.brightness_chart);
        chart_light.setDescription(null);
        chart_light.setBackgroundColor(Color.parseColor("#EFEFFB"));
        chart_light.getAxisRight().setEnabled(false);
        chart_light.setScaleYEnabled(false);
        chart_light.setDoubleTapToZoomEnabled(false);

        // XAxis
        XAxis x_axis_light = chart_light.getXAxis();
        x_axis_light.setPosition(XAxis.XAxisPosition.BOTTOM);
        x_axis_light.setDrawGridLines(true);
        x_axis_light.setTextSize(1);
        x_axis_light.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                SimpleDateFormat parse_format = new SimpleDateFormat("hhmmss");
                SimpleDateFormat return_format = new SimpleDateFormat("hh:mm:ss");

                Date date = null;
                try{
                    date = parse_format.parse(String.valueOf((int)value));
                }catch ( Exception e ){
                    e.printStackTrace();
                }

                Log.d("parameter_raw", String.valueOf(value));
                Log.d("parameter_date", String.valueOf(date));

                return return_format.format(date);
            }
        });

        // YAxis
        YAxis left_axis_light = chart_light.getAxisLeft();
        left_axis_light.setDrawGridLines(true);
        left_axis_light.setDrawAxisLine(true);
        left_axis_light.setAxisMinimum(0);

        // DataSet (= Line)
        LineDataSet dataset_light = new LineDataSet(values_light, "Brightness");
        dataset_light.setColor(Color.BLUE);
        dataset_light.setDrawCircles(false);
        dataset_light.setLineWidth(2);
        dataset_light.setDrawValues(false);
        dataset_light.setValueFormatter(new IValueFormatter() {
            @Override
            public String getFormattedValue(float value, Entry entry, int dataSetIndex, ViewPortHandler viewPortHandler) {
                SimpleDateFormat parse_format = new SimpleDateFormat("hhmmss");
                SimpleDateFormat return_format = new SimpleDateFormat("hh:mm:ss");
                Date date = null;
                try {
                    date = parse_format.parse(String.valueOf((int) value));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return return_format.format(date);
            }
        });

        // Set the chart
        LineData data_light = new LineData(dataset_light);
        chart_light.setData(data_light);
        chart_light.animateXY(2000, 2000);
        chart_light.invalidate();

        // Weka generated code
        WekaWrapper wrapper = new WekaWrapper();
        int count = 0;
        int numInstances = 0;
        try {
            // test data
            Instances data = new Instances(new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.snoring_test_android2))));
            // set snore Yes or No index
            data.setClassIndex(data.numAttributes()-1);
            numInstances = data.numInstances();
            for (int i=0; i<numInstances; i++) {
                double result = wrapper.classifyInstance(data.instance(i));

                Log.d("Weka Result", data.classAttribute().value((int)result));
                if (data.classAttribute().value((int)result).equals("yes")) {
                    count++;
                }
//                Log.d("Weka Result2", data.instance(i).toString());
//                String instance = data.instance(i).toString();
//                String[] temp = instance.split(",");
//                String correctData = temp[temp.length-1];
//                Log.d("Weka Result3", correctData);

//                if(data.classAttribute().value((int)result).equals(correctData)) {
//                    count++;
//                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Log.d("Weka Result", "snore : " + String.valueOf(count * 100 / numInstances) + "%");

    }
}