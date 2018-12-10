package com.sleepanalysis.mobilecomputing;

import android.content.Intent;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.Legend;
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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import be.tarsos.dsp.AudioDispatcher;
import be.tarsos.dsp.AudioEvent;
import be.tarsos.dsp.AudioProcessor;
import be.tarsos.dsp.io.android.AndroidFFMPEGLocator;
import be.tarsos.dsp.io.android.AudioDispatcherFactory;
import be.tarsos.dsp.mfcc.MFCC;
import cafe.adriel.androidaudioconverter.AndroidAudioConverter;
import cafe.adriel.androidaudioconverter.callback.IConvertCallback;
import cafe.adriel.androidaudioconverter.callback.ILoadCallback;
import cafe.adriel.androidaudioconverter.model.AudioFormat;
import java.util.Locale;

import weka.core.Instances;

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

        // button_measure 클릭 시 MeasureActivity로 전환
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
            ArrayList<Float> accList = new ArrayList<Float>();
            accList.add(0.0F);
            accList.add(0.0F);
            accList.add(0.0F);
            accList.add(0.0F);

            while((line = acc_br.readLine()) != null){
                String[] split = line.split(" ");
                /////////
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
                    if (currSec >= timeList.get(phase+1)) {
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
                Log.d("data", x + ", " + y);
            }
        } catch (IOException e) {
            Log.d("graph load error", "error in file");
        }

        // Acceleration Graph
        LineChart chart_acc = findViewById(R.id.acc_chart);
        chart_acc.setDescription(null);
        chart_acc.setBackgroundColor(Color.parseColor("#38424F"));
        chart_acc.getAxisRight().setEnabled(false);
        chart_acc.setScaleYEnabled(false);
        chart_acc.setDoubleTapToZoomEnabled(false);

        XAxis x_axis_acc = chart_acc.getXAxis();
        x_axis_acc.setPosition(XAxis.XAxisPosition.BOTTOM);
        //x_axis_acc.setDrawGridLines(true);
        x_axis_acc.setTextSize(1);
        x_axis_acc.setEnabled(false);
        x_axis_acc.setLabelCount(8);
        x_axis_acc.setTextColor(Color.WHITE);

        YAxis left_axis_acc = chart_acc.getAxisLeft();
        //left_axis_acc.setDrawGridLines(true);
        //left_axis_acc.setDrawAxisLine(true);
        left_axis_acc.setAxisMinimum(0);
        left_axis_acc.setAxisMaximum(100);
        left_axis_acc.setTextColor(Color.WHITE);

        // Labels
        ArrayList<String> labels = new ArrayList<String>();
        labels.add("1");
        labels.add("2");
        labels.add("3");
        labels.add("4");
        labels.add("5");

        // DataSet (= Line)
        LineDataSet dataset_acc = new LineDataSet(values_acc, "Sleep Cycle");
        dataset_acc.setColor(Color.WHITE);
        dataset_acc.setDrawCircles(false);
        dataset_acc.setLineWidth(2);
        dataset_acc.setDrawValues(false);
        dataset_acc.setValueTextColor(Color.WHITE);
        dataset_acc.setDrawFilled(true);

        // Bottom legend
        Legend legend = chart_acc.getLegend();
        legend.setTextColor(Color.WHITE);

        // Set the chart
        LineData data_acc = new LineData(dataset_acc);
        chart_acc.setData(data_acc);
        //chart_acc.animateXY(2000, 2000);
        chart_acc.invalidate();


        // For analyzing multiple sounds
//        File recorded_file = new File(date_string + "recorded/");
//        String[] wav_list = recorded_file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith(".wav");
//            }
//        });
//
//        for (String st : wav_list) {
//            Log.d("wav_list", st);
//        }

//        String recorded_path;
//        AudioDispatcher dispatcher;
//        int sampleRate = 22050;
//        int bufferSize = 1024;
//        int bufferOverlap = 128;
//        new AndroidFFMPEGLocator(this);
//
//        for (int i = 0; i < wav_list.length; i++) {
//            try {
//                File mfcc_file = new File(date_string + "arff/" + wav_list[i] + ".arff");
//                FileOutputStream mfcc_fos = new FileOutputStream(mfcc_file);
//                String arff_info = "@relation snore\n" +
//                        "\n" +
//                        "@attribute mfcc01 real\n" +
//                        "@attribute mfcc02 real\n" +
//                        "@attribute mfcc03 real\n" +
//                        "@attribute mfcc04 real\n" +
//                        "@attribute mfcc05 real\n" +
//                        "@attribute mfcc06 real\n" +
//                        "@attribute mfcc07 real\n" +
//                        "@attribute mfcc08 real\n" +
//                        "@attribute mfcc09 real\n" +
//                        "@attribute mfcc10 real\n" +
//                        "@attribute mfcc11 real\n" +
//                        "@attribute mfcc12 real\n" +
//                        "@attribute mfcc13 real\n" +
//                        "@attribute mfcc14 real\n" +
//                        "@attribute mfcc15 real\n" +
//                        "@attribute mfcc16 real\n" +
//                        "@attribute mfcc17 real\n" +
//                        "@attribute mfcc18 real\n" +
//                        "@attribute mfcc19 real\n" +
//                        "@attribute mfcc20 real\n" +
//                        "@attribute is_snore {yes, no}\n" +
//                        "\n" +
//                        "@data\n";
//                mfcc_fos.write(arff_info.getBytes());
//
//                recorded_path = date_string + "recorded/" + wav_list[i];
//                Log.d("path_list", recorded_path);
//                //new AndroidFFMPEGLocator(this);
//                final List<float[]> mfccList = new ArrayList<>(200);
//                dispatcher = AudioDispatcherFactory.fromPipe(recorded_path, sampleRate, bufferSize, bufferOverlap);
//                final MFCC mfcc = new MFCC(bufferSize, sampleRate, 20, 50, 0, 20000);
//                dispatcher.addAudioProcessor(mfcc);
//                dispatcher.addAudioProcessor(new AudioProcessor() {
//
//                    @Override
//                    public void processingFinished() {
//                    }
//
//                    @Override
//                    public boolean process(AudioEvent audioEvent) {
//                        mfccList.add(mfcc.getMFCC());
//                        return true;
//                    }
//                });
//                dispatcher.run();
//
//                for (int j = 0; j < mfccList.size(); j++) {
//                    mfcc_fos.write((Arrays.toString(mfccList.get(j)) + ", ?\n")
//                                    .replace("[", "")
//                                    .replace("]", "")
//                                    .getBytes()
//                    );
//                }
//                Log.d("mfcc_complete", String.valueOf(i));
//                mfcc_fos.close();
//            } catch (IOException e) {
//                Log.d("mfccList", "first");}
//        }


        /*// for analyzing multiple arff
        for (int j = 1; j < wav_list.length; j++) {
            WekaWrapper wrapper = new WekaWrapper();
            int count = 0;
            int numInstances = 0;
            try {
                // test data
//                Log.d("Weka Result", date_string + "non_snoring_android (" + String.valueOf(j) + ").arff");
                Instances data = new Instances(new BufferedReader(new InputStreamReader(new FileInputStream(date_string + "arff/" + wav_list[j] + ".arff"))));
                // set snore Yes or No index
                data.setClassIndex(data.numAttributes()-1);
                numInstances = data.numInstances();
                for (int i=0; i<numInstances; i++) {
                    double result = wrapper.classifyInstance(data.instance(i));

//                    Log.d("Weka Result", data.classAttribute().value((int)result));
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
            if (numInstances != 0) {
                Log.d("Weka Result", "test " + String.valueOf(j) + " : " + String.valueOf(count * 100 / numInstances) + "%");
            }
        }*/
    }
}

