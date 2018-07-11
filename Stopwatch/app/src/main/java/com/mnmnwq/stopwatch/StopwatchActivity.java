package com.mnmnwq.stopwatch;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;


public class StopwatchActivity extends Activity {
    private int seconds = 0;  //秒数
    private boolean running;  //控制运行
    private boolean wasRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stopwatch);
        if(savedInstanceState != null){  //保留状态
            seconds = savedInstanceState.getInt("seconds");
            running = savedInstanceState.getBoolean("running");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        runTimer();
    }

    protected void onStop(){  //活动不可见
        super.onStop();
        wasRunning = running;
        running = false;
    }

    protected void onStart(){
        super.onStart();
        if(wasRunning){
            running = true;
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
        savedInstanceState.putBoolean("wasRunning",wasRunning);
    }

    public void onClickStart(View view){
        running = true;
    }
    public void onClickStop(View view){
        running = false;
    }
    public void onClickReset(View view){
        seconds = 0;
        running = false;
    }

    private void runTimer(){
        final TextView timeView = (TextView)findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours = seconds/3600;
                int minutes = (seconds%3600)/60;
                int secs = seconds%60;
                String time = String.format("%d:%02d:%02d",hours,minutes,secs);  //格式化 java代码
                timeView.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });

    }
}
