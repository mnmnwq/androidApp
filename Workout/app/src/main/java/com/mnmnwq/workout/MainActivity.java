package com.mnmnwq.workout;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkoutDetailFragment frag = (WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_frag);
        frag.setWorkout(1);
    }
}
