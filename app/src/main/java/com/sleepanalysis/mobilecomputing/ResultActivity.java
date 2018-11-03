package com.sleepanalysis.mobilecomputing;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

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

        // Brightness Data Chart
        LineChart chart_light = findViewById(R.id.brightness_chart);
        chart_light.setDescription(null);
        chart_light.setBackgroundColor(Color.parseColor("#EFEFFB"));
        chart_light.getAxisRight().setEnabled(false);

        // XAxis
        XAxis x_axis_light = chart_light.getXAxis();
        x_axis_light.setPosition(XAxis.XAxisPosition.BOTTOM);
        x_axis_light.setDrawGridLines(true);
        int start_time, end_time = 0;
        start_time = (int)((intent.getExtras().getLong("start_time") / 3600000 + 9) % 24);
        end_time = (int)((intent.getExtras().getLong("end_time") / 360000 + 9) % 24);
        x_axis_light.setAxisMinimum(start_time);
        x_axis_light.setAxisMaximum(end_time);

        // YAxis
        YAxis left_axis_light = chart_light.getAxisLeft();
        left_axis_light.setDrawGridLines(true);
        left_axis_light.setDrawAxisLine(true);
        left_axis_light.setAxisMinimum(0);
        left_axis_light.setAxisMaximum(300);
//        left_axis_light = chart_light.getAxis(YAxis.AxisDependency.LEFT);

        // Making Data
        ArrayList<Entry> values_light = new ArrayList<Entry>();
//        values_light.add(new Entry(1, 0));
//        values_light.add(new Entry(2, 4));
//        values_light.add(new Entry(3, 2));
//        values_light.add(new Entry(4, 7));

        // DataSet (= Line)
        LineDataSet dataset_light = new LineDataSet(values_light, "Brightness");
        dataset_light.setColor(Color.BLUE);
        dataset_light.setLineWidth(2);
        dataset_light.setDrawValues(false);

        // Set the chart
        LineData data_light = new LineData(dataset_light);
        chart_light.setData(data_light);
        chart_light.invalidate();
    }
}