package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class loadingPage extends AppCompatActivity {

    private TextView triviaText;
    private int triviaIndex = 0;
    private String[] triviaTexts = {
            "Did you know? Raspberries are a member of the rose family.",
            "Did you know? Chickpeas and almonds contains almost as much proteins as steaks.",
            "Did you know? Oreos are vegan.",
            "Did you know? Pistachios are one of the oldest nuts known to humans."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_page);

        // Initialize the trivia text view
        triviaText = findViewById(R.id.triviaText);

        // Create a handler attached to the main (UI) thread's looper
        Handler handler = new Handler();

        // Define a Runnable that updates the trivia text and checks if 30 seconds have passed
        Runnable runnable = new Runnable() {
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
                } else {
                    // Otherwise, schedule the next update after 15 seconds
                    handler.postDelayed(this, 15000);
                }
            }
        };

        // Schedule the first update after 0 seconds
        handler.post(runnable);
    }
}
