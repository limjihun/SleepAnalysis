package com.sleepanalysis.mobilecomputing;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MeasureActivity extends AppCompatActivity {

    final static int START = 0;
    final static int END = 1;

    int status = START;
    long start_time, end_time, sleep_time, current_time = 0L;
    Date date;
    String date_string;
    SimpleDateFormat date_format;

    MediaRecorder recorder;
    MediaPlayer player;
    boolean isRecording = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

        // Permission for recording & writing external strorage
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO},
                    10);}
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    10);}

        // button_result 클릭 시 ResultActivity로 전환
        ImageButton button_result = findViewById(R.id.result_button);
        button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeasureActivity.this, ResultActivity.class);

                sleep_time = end_time - start_time;
                intent.putExtra("sleep_time", sleep_time);
                Log.d("Sleep time : ", String.valueOf(sleep_time));
                startActivity(intent);
            }
        });

        // start 클릭 시 시간 측정 시작, end로 문구 변경
        final Button button_start = findViewById(R.id.start_button);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (status) {
                    case START :
                        button_start.setText(getText(R.string.end));
                        start_time = System.currentTimeMillis();

                        // recording
                        recorder = new MediaRecorder();
                        try{
                            recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                            recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
                            recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
                            current_time = System.currentTimeMillis();
                            date = new Date(current_time);
                            date_format = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREAN);
                            date_string = Environment.getExternalStorageDirectory().getAbsolutePath() + "/SleepAnalysis/" + date_format.format(date) + "/";
                            Log.d("date_string", date_string);

                            File folder = new File(date_string);
                            if (!folder.exists()) {
                                folder.mkdirs();
                            }

                            recorder.setOutputFile(date_string + "recorded.mp3");

                            recorder.prepare();
                            recorder.start();
                            isRecording = true;
                        } catch (IOException e){
                            Log.d("Record_Failed", "Start_Record_Failed");
                        }

                        Toast.makeText(getApplicationContext(), "Starting Measurement",
                                Toast.LENGTH_LONG).show();

                        status = END;
                        Log.d("Start time: ", String.valueOf(start_time));
                        break;

                    case END :
                        button_start.setText(getText(R.string.start));
                        end_time = System.currentTimeMillis();
                        status = START;
                        Log.d("is Recording? ", String.valueOf(isRecording));

                        if (isRecording) {
                            recorder.stop();
                            recorder.release();
                            recorder = null;
                            isRecording = false;
                        }

                        Toast.makeText(getApplicationContext(), "Stopping Measurement",
                                Toast.LENGTH_LONG).show();

                        Log.d("End time: ", String.valueOf(end_time));
                        break;

                }
            }
        });


    }
}
