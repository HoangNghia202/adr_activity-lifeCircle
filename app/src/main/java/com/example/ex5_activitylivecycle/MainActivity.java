package com.example.ex5_activitylivecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("State", " created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State", " started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("State", " resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State", " paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State", " stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State", " destroyed");
    }
}