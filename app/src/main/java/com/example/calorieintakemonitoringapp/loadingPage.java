package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class loadingPage extends AppCompatActivity {

    private TextView triviaText;
    private int triviaIndex = 0;
    private String[] triviaTexts = {
            "Did you know? Raspberries are a member of the rose family.",
            "Did you know? Chickpeas and almonds contains almost as much proteins as steaks.",
            "Did you know? Oreos are vegans.",
            "Did you know? Pistachios are one of the oldest nuts known to humans."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        // Initialize the trivia text view
        triviaText = findViewById(R.id.triviaText);

        // Create a new Timer
        Timer timer = new Timer();

        // Define a TimerTask that will be executed every 15 seconds
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                // Update the trivia text
                triviaText.setText(triviaTexts[triviaIndex]);
                triviaIndex = (triviaIndex + 1) % triviaTexts.length;

                // If 30 seconds have passed, navigate to the next page
                if (triviaIndex == 0) {
                    Intent intent = new Intent(loadingPage.this, Main.class);
                    startActivity(intent);
                    finish();
                }
            }
        };

        // Schedule the TimerTask to be executed every 15 seconds
        timer.schedule(task, 0, 15000);
    }
}
