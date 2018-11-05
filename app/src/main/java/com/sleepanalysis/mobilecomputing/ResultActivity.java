package com.sleepanalysis.mobilecomputing;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class ResultActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView sleep_time_result = findViewById(R.id.sleep_time_result);
        Button button_play = findViewById(R.id.play_button);
        Button button_stop = findViewById(R.id.stop_button);

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

        // Play Button
        button_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    playAudio();
                    Toast.makeText(getApplicationContext(), "Play", Toast.LENGTH_LONG).show();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });

        // Stop Button
        button_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    Toast.makeText(getApplicationContext(), "Stop", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void playAudio() {
        killMediaPlayer();

        mediaPlayer = MediaPlayer.create(this, R.raw.test1);
        mediaPlayer.start();
    }

    protected void onDestroy() {
        super.onDestroy();
        killMediaPlayer();
    }

    private void killMediaPlayer() {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
