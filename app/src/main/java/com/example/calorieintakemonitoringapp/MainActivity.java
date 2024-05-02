package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class MainActivity extends AppCompatActivity {

    private static final long DELAY_MILLISECONDS = 30 * 1000; // 30 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a handler attached to the main (UI) thread's Looper
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                startLoginActivity();
            }
        }, DELAY_MILLISECONDS);
    }

    private void startLoginActivity() {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
        finish(); // Optional, it closes MainActivity to prevent the user from returning to it using the back button
    }
}
