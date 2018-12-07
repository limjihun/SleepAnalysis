package com.sleepanalysis.mobilecomputing;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaRecorder;
import android.os.Environment;
import android.os.FileObserver;
import android.support.v4.app.ActivityCompat;
import android.content.Context;
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
import android.widget.Toast;

import org.apache.commons.compress.utils.IOUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

import java.util.Timer;
import java.util.TimerTask;

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

public class MeasureActivity extends AppCompatActivity {

    final static int START = 0;
    final static int END = 1;

    int status = START;
    long start_time, end_time, sleep_time, current_time, record_start_time= 0L;
    Date date, time;
    String date_string, time_string;
    SimpleDateFormat date_format, time_format;
    FileOutputStream acc_fos;
    FileOutputStream light_fos;

    MediaRecorder recorder;
    boolean isRecording = false;
    Timer timer;
    MP3FileObserver mp3_observer;
    WAVFileObserver wav_observer;
    AudioDispatcher dispatcher;
    int sampleRate = 22050;
    int bufferSize = 1024;
    int bufferOverlap = 128;
    LinkedList<File> snore_set;
    int grace;

    SensorManager mSensorManager;

    Sensor mLightSensor;
    SensorEventListener mLightListener;
    TextView light_info;
    long time_light, previous_light, time_acc, previous_acc;

    SensorEventListener mAccListener;
    Sensor mAccSensor;
    double accX;
    double accY;
    double accZ;
    TextView acc_info;

    TextView description;
    boolean isMeasured;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measure);

        // file name format
        current_time = System.currentTimeMillis();
        date = new Date(current_time);
        date_format = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREAN);
        date_string = Environment.getExternalStorageDirectory().getAbsolutePath() + "/SleepAnalysis/" + date_format.format(date) + "/";
        File folder = new File(date_string);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        folder = new File(date_string + "recorded/");
        if (!folder.exists()) {
            folder.mkdirs();
        }
        folder = new File(date_string + "snore/");
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Permission for recording & writing external strorage
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.RECORD_AUDIO},
                    10);}
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                    10);}

        // button_result 클릭 시 ResultActivity로 전환
        isMeasured = false;
        ImageButton button_result = findViewById(R.id.result_button);
        button_result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MeasureActivity.this, ResultActivity.class);

//                if (!isMeasured) {
//                    Toast.makeText(getApplicationContext(), "Please measure first", Toast.LENGTH_LONG).show();
//                    return;
//                }

                sleep_time = end_time - start_time;
                intent.putExtra("date_string", date_string);
                intent.putExtra("sleep_time", sleep_time);
                intent.putExtra("start_time", start_time);
                intent.putExtra("end_time", end_time);
                Log.d("Sleep time : ", String.valueOf(sleep_time));
                startActivity(intent);
            }
        });

        mSensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        mLightSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        mLightListener = new LightListener();
        light_info = findViewById(R.id.light_test);
        previous_light = -1;
        previous_acc = -1;

        mAccSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mAccListener = new AccListener();
        acc_info = findViewById(R.id.acc_test);

        description = findViewById(R.id.description);

        // start 클릭 시 시간 측정 시작, end로 문구 변경
        final Button button_start = findViewById(R.id.start_button);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (status) {
                    case START :
                        button_start.setText(getText(R.string.end));
                        start_time = System.currentTimeMillis();

                        // recording every minutes by scheduling
                        new AndroidFFMPEGLocator(MeasureActivity.this);
                        recorder = new MediaRecorder();
                        timer = new Timer();
                        timer.schedule(new TimerTask(){
                            @Override
                            public void run() {
                                runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        if (!isRecording) {
                                            record_start_time = System.currentTimeMillis();
                                            time = new Date(record_start_time);
                                            time_format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.KOREAN);
                                            time_string = date_string + "recorded/" + time_format.format(time);
                                            snore_set = new LinkedList<>();
                                            grace = 0;

                                            try {
                                                File mp3_file = new File(time_string + ".mp3");
                                                mp3_file.createNewFile();
                                            } catch (IOException e) {
                                            }

                                            recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                                            recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
                                            recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
                                            recorder.setOutputFile(time_string + ".mp3");
                                            try {
                                                recorder.prepare();
                                            } catch (IOException e) {
                                                Log.d("Record_Failed", "Start_Record_Failed in runOnUiThread : If");
                                            }
                                            recorder.start();
                                            isRecording = true;

                                            // Watching recorder to finish writing the file
                                            mp3_observer = new MP3FileObserver(time_string, FileObserver.CLOSE_WRITE);
                                            mp3_observer.startWatching();

//                                            try {
//                                                File arff_file = new File(time_string + ".arff");
//                                                arff_file.createNewFile();
//                                            } catch (IOException e) {
//                                            }
//                                            arff_observer = new ARFFFileObserver(time_string, FileObserver.CLOSE_WRITE);
//                                            arff_observer.startWatching();
                                            try {
                                                File wav_file = new File(time_string + ".wav");
                                                wav_file.createNewFile();
                                            } catch (IOException e) {
                                            }
                                            wav_observer = new WAVFileObserver(time_string, FileObserver.CLOSE_WRITE);
                                            wav_observer.startWatching();
                                        } else {
                                            recorder.reset();

                                            record_start_time = System.currentTimeMillis();
                                            time = new Date(record_start_time);
                                            time_format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.KOREAN);
                                            time_string = date_string + "recorded/" + time_format.format(time);

                                            try {
                                                File mp3_file = new File(time_string + ".mp3");
                                                mp3_file.createNewFile();
                                            } catch (IOException e) {
                                            }

                                            recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
                                            recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
                                            recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
                                            recorder.setOutputFile(time_string + ".mp3");
                                            try {
                                                recorder.prepare();
                                            } catch (IOException e) {
                                                Log.d("Record_Failed", "Start_Record_Failed in runOnUiThread : Else");
                                            }
                                            recorder.start();

                                            // Watching recorder to finish writing the file
                                            mp3_observer = new MP3FileObserver(time_string, FileObserver.CLOSE_WRITE);
                                            mp3_observer.startWatching();

//                                            try {
//                                                File arff_file = new File(time_string + ".arff");
//                                                arff_file.createNewFile();
//                                            } catch (IOException e) {
//                                            }
//                                            arff_observer = new ARFFFileObserver(time_string, FileObserver.CLOSE_WRITE);
//                                            arff_observer.startWatching();
                                            try {
                                                File wav_file = new File(time_string + ".wav");
                                                wav_file.createNewFile();
                                            } catch (IOException e) {
                                            }
                                            wav_observer = new WAVFileObserver(time_string, FileObserver.CLOSE_WRITE);
                                            wav_observer.startWatching();
                                        }
                                    }
                                });
                            }
                        }, 0, 5000);

                        Toast.makeText(getApplicationContext(), "Starting Measurement", Toast.LENGTH_LONG).show();
                        mSensorManager.registerListener(mLightListener, mLightSensor, SensorManager.SENSOR_DELAY_NORMAL);
                        mSensorManager.registerListener(mAccListener, mAccSensor, SensorManager.SENSOR_DELAY_NORMAL);

                        // sensing data file
                        File light_file = new File(date_string + "light.txt");
                        File acc_file = new File(date_string + "acc.txt");
                        try {
                            light_fos = new FileOutputStream(light_file);
                            acc_fos = new FileOutputStream(acc_file);
                        } catch (IOException e) {}

                        description.setVisibility(View.INVISIBLE);

                        status = END;
                        Log.d("Start time: ", String.valueOf(start_time));
                        break;

                    case END :
                        button_start.setText(getText(R.string.start));
                        end_time = System.currentTimeMillis();

                        description.setVisibility(View.VISIBLE);
                        mSensorManager.unregisterListener(mLightListener);
                        mSensorManager.unregisterListener(mAccListener);

                        // close sensing file
                        try {
                            light_fos.close();
                            acc_fos.close();
                        } catch (IOException e) {}

                        status = START;
                        Log.d("is Recording? ", String.valueOf(isRecording));

                        if (isRecording) {
                            timer.cancel();
                            recorder.stop();
                            recorder.release();
                            recorder = null;
                            isRecording = false;
                        }

                        isMeasured = true;

                        Toast.makeText(getApplicationContext(), "Stopping Measurement",
                                Toast.LENGTH_LONG).show();

                        Log.d("End time: ", String.valueOf(end_time));
                        break;

                }
            }
        });
    }

    private class LightListener implements SensorEventListener {
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

        public void onSensorChanged(SensorEvent event) {
            light_info.setText(String.valueOf(event.values[0]));
            time_light = System.currentTimeMillis() / 1000;
            if (time_light - previous_light < 1) return;
            previous_light = time_light;

            // save data file
            current_time = System.currentTimeMillis();
            date = new Date(current_time);
            date_format = new SimpleDateFormat("hh:mm:ss", Locale.KOREAN);

            String data = " " + String.format("%.4f", event.values[0]) + "\n";
            try {
                light_fos.write(date_format.format(date).getBytes());
                light_fos.write(data.getBytes());
            } catch (IOException e) {}
        }
    }

    private class AccListener implements SensorEventListener {
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }

        public void onSensorChanged(SensorEvent event) {
            time_acc = System.currentTimeMillis() / 1000;
            if (time_acc - previous_acc < 1) return;
            previous_acc = time_acc;

            accX = event.values[0];
            accY = event.values[1];
            accZ = event.values[2];
            acc_info.setText(String.format("%.4f", accX) + "\n" + String.format("%4f", accY) + "\n" + String.format("%4f", accZ));

            // save data file
            current_time = System.currentTimeMillis();
            date = new Date(current_time);
            date_format = new SimpleDateFormat("hh:mm:ss", Locale.KOREAN);

            String data = " " + String.format("%.4f", accX)
                    + " " + String.format("%.4f", accY)
                    + " " + String.format("%.4f", accZ)
                    + " " + String.format("%.4f", Math.sqrt(accX*accX + accY*accY))+ "\n";
            try {
                acc_fos.write(String.valueOf(current_time).getBytes());
                acc_fos.write(data.getBytes());
            } catch (IOException e) {}
        }
    }

    private class MP3FileObserver extends FileObserver {
        private String path;

        public MP3FileObserver(String path, int mask) {
            super(path + ".mp3", mask);
            this.path = path;
        }

        public void onEvent(int event, String path) {
//            Log.d("옵져버", "옵져버 실행: " + this.path + ".mp3");
            // mp3 to wav
            AndroidAudioConverter.load(MeasureActivity.this, new ILoadCallback() {
                @Override
                public void onSuccess() {
                }

                @Override
                public void onFailure(Exception error) {
                    Log.d("wav conversion", "Callback Failed");
                }
            });
            Log.d("wav conversion", this.path + ".mp3");
            File recorded = new File(this.path + ".mp3");
            IConvertCallback callback = new IConvertCallback() {
                @Override
                public void onSuccess(File convertedFile) {
//                    Toast.makeText(getApplicationContext(), "wav conversion succeeded", Toast.LENGTH_SHORT).show();
                    Log.d("wav conversion", "Conversion Succeeded");
                }

                @Override
                public void onFailure(Exception error) {
//                    Toast.makeText(getApplicationContext(), "wav conversion failed", Toast.LENGTH_SHORT).show();
                    Log.d("wav conversion", "Conversion Failed");
                }
            };

            AndroidAudioConverter.with(MeasureActivity.this)
                    .setFile(recorded)
                    .setFormat(AudioFormat.WAV)
                    .setCallback(callback)
                    .convert();

            this.stopWatching();
        }
    }

    private class WAVFileObserver extends FileObserver {
        private String path;

        public WAVFileObserver(String path, int mask) {
            super(path + ".wav", mask);
            this.path = path;
        }

        public void onEvent(int event, String path) {
//            Log.d("옵져버", "옵져버 실행: " + this.path + ".wav");
            try {
                File mfcc_file = new File(this.path + ".arff");
                FileOutputStream mfcc_fos = new FileOutputStream(mfcc_file);
                String arff_info = "@relation snore\n" +
                        "\n" +
                        "@attribute mfcc01 real\n" +
                        "@attribute mfcc02 real\n" +
                        "@attribute mfcc03 real\n" +
                        "@attribute mfcc04 real\n" +
                        "@attribute mfcc05 real\n" +
                        "@attribute mfcc06 real\n" +
                        "@attribute mfcc07 real\n" +
                        "@attribute mfcc08 real\n" +
                        "@attribute mfcc09 real\n" +
                        "@attribute mfcc10 real\n" +
                        "@attribute mfcc11 real\n" +
                        "@attribute mfcc12 real\n" +
                        "@attribute mfcc13 real\n" +
                        "@attribute mfcc14 real\n" +
                        "@attribute mfcc15 real\n" +
                        "@attribute mfcc16 real\n" +
                        "@attribute mfcc17 real\n" +
                        "@attribute mfcc18 real\n" +
                        "@attribute mfcc19 real\n" +
                        "@attribute mfcc20 real\n" +
                        "@attribute is_snore {yes, no}\n" +
                        "\n" +
                        "@data\n";
                mfcc_fos.write(arff_info.getBytes());

                final List<float[]> mfccList = new ArrayList<>(200);
                dispatcher = AudioDispatcherFactory.fromPipe(this.path + ".wav", sampleRate, bufferSize, bufferOverlap);
                final MFCC mfcc = new MFCC(bufferSize, sampleRate, 20, 50, 0, 20000);
                dispatcher.addAudioProcessor(mfcc);
                dispatcher.addAudioProcessor(new AudioProcessor() {

                    @Override
                    public void processingFinished() {
                    }

                    @Override
                    public boolean process(AudioEvent audioEvent) {
                        mfccList.add(mfcc.getMFCC());
                        return true;
                    }
                });
                dispatcher.run();

                for (int j = 0; j < mfccList.size(); j++) {
                    mfcc_fos.write((Arrays.toString(mfccList.get(j)) + ", ?\n")
                            .replace("[", "")
                            .replace("]", "")
                            .getBytes()
                    );
                }
                Log.d("옵져버", "mfcc complete");
                mfcc_fos.close();
            } catch (IOException e) {
                Log.d("옵져버", "mfcc_failed");}


            // classification of sound
            WekaWrapper wrapper = new WekaWrapper();
            int count = 0;
            int numInstances = 0;
            int partial_result = 0;
            try {
                Instances data = new Instances(new BufferedReader(new InputStreamReader(new FileInputStream(this.path + ".arff"))));
                // set snore Yes or No index
                data.setClassIndex(data.numAttributes()-1);
                numInstances = data.numInstances();
                for (int i=0; i<numInstances; i++) {
                    double result = wrapper.classifyInstance(data.instance(i));

                    if (data.classAttribute().value((int)result).equals("yes")) {
                        count++;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (numInstances != 0) {
                partial_result = count * 100 / numInstances;
                if (partial_result >= 15) {
                    snore_set.add(new File(this.path + ".mp3"));
                    grace = 0;
                    Log.d("Classification", "snore detected");
                }
                else if (grace == 0 && snore_set.size() != 0) {
                    snore_set.add(new File(this.path + ".mp3"));
                    grace++;
                    Log.d("Classification", "grace detected");
                } else if (grace == 0) {
                    // case for debugging
                    Log.d("Classification", "non-snoring detected");
                } else if (grace == 1) {
                    try {
                        Log.d("Classification", "merge detected");
                        File target_file = new File(this.path.replace("recorded", "snore") + " " + String.valueOf(snore_set.size() * 5) + ".mp3");
                        File[] snore_files = new File[snore_set.size()];
                        for (int i = 0; i < snore_set.size(); i++) {
                            snore_files[i] = snore_set.get(i);
                        }
                        mergeMP3(snore_files, target_file);
                        grace = 0;
                        snore_set.clear();
                        Log.d("Classification", "merge success");
                    } catch (IOException e) {
                    }
                }
                Log.d("Weka Classification / ", this.path + ".arff : " + String.valueOf(partial_result) + "%");
            }

            this.stopWatching();
        }
    }

    private void mergeMP3(File[] inputs, File output) throws IOException {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(output);
            for (File input : inputs) {
                FileInputStream inputStream = null;
                try {
                    IOUtils.copy(inputStream = new FileInputStream(input),
                            outputStream);
                } finally {
                    if (inputStream != null) try {
                        inputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } finally {
            if (outputStream != null) try {
                outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static class IOUtils {
        private static final int BUF_SIZE = 0x1000;

        public static long copy(InputStream from, OutputStream to)
                throws IOException {
            byte[] buf = new byte[BUF_SIZE];
            long total = 0;
            while (true) {
                int r = from.read(buf);
                if (r == -1) {
                    break;
                }
                to.write(buf, 0, r);
                total += r;
            }
            return total;
        }
    }

}