package com.sleepanalysis.mobilecomputing;

import android.content.Intent;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
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

import weka.core.Instances;

public class ResultActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView sleep_time_result = findViewById(R.id.sleep_time_result);

        Intent intent = getIntent();
        // sleep_time 받아와서 띄우기
        int sleep_time = (int) intent.getExtras().getLong("sleep_time");
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
            while ((line = light_br.readLine()) != null) {
                d = Integer.parseInt(line.substring(0, 8).replace(":", ""));
                v = Float.parseFloat(line.substring(10));
                values_light.add(new Entry(d, v));
            }
        } catch (IOException e) {
            Log.d("graph load error", "error in file");
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
        x_axis_light.setGranularity(1f); // https://stackoverflow.com/questions/40803233/mpandroidchart-x-axis-date-time-label-formatting
        //https://github.com/PhilJay/MPAndroidChart/issues/133
        x_axis_light.setTextSize(1);
        x_axis_light.setValueFormatter(new IAxisValueFormatter() {
            @Override
            public String getFormattedValue(float value, AxisBase axis) {
                SimpleDateFormat parse_format = new SimpleDateFormat("hhmmss");
                SimpleDateFormat return_format = new SimpleDateFormat("hh:mm:ss");

                Date date = null;
                try {
                    date = parse_format.parse(String.valueOf((int) value));
                } catch (Exception e) {
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

