package com.sleepanalysis.mobilecomputing;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MeasureActivity extends AppCompatActivity implements SensorEventListener {

    final static int START = 0;
    final static int END = 1;

    int status = START;
    long start_time, end_time, sleep_time = 0L;

    SensorManager mSensorManager;
    Sensor mLightSensor;
    TextView light_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

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

        mSensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        mLightSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        light_info = findViewById(R.id.light_test);

        // start 클릭 시 시간 측정 시작, end로 문구 변경
        final Button button_start = findViewById(R.id.start_button);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (status) {
                    case START :
                        button_start.setText(getText(R.string.end));
                        start_time = System.currentTimeMillis();

                        mSensorManager.registerListener(MeasureActivity.this, mLightSensor, SensorManager.SENSOR_DELAY_UI);

                        status = END;
                        Log.d("Start time: ", String.valueOf(start_time));
                        break;

                    case END :
                        button_start.setText(getText(R.string.start));
                        end_time = System.currentTimeMillis();

                        mSensorManager.unregisterListener(MeasureActivity.this);

                        status = START;
                        Log.d("End time: ", String.valueOf(end_time));
                        break;

                }

            }
        });
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy){
    }

    public void onSensorChanged(SensorEvent event){
        if(event.sensor.getType() == Sensor.TYPE_LIGHT){
            light_info.setText(String.valueOf(event.values[0]));
        }
    }
}
