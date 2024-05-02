package com.example.calorieintakemonitoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConversationActivity extends AppCompatActivity {

    private TextView senderTextView, contentTextView, dateTextView, timeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);

        senderTextView = findViewById(R.id.senderTextView);
        contentTextView = findViewById(R.id.contentTextView);
        dateTextView = findViewById(R.id.dateTextView);
        timeTextView = findViewById(R.id.timeTextView);

        // Retrieve data from intent
        Intent intent = getIntent();
        String sender = intent.getStringExtra("sender");
        String content = intent.getStringExtra("content");
        String date = intent.getStringExtra("date");
        String time = intent.getStringExtra("time");

        // Display data in UI
        senderTextView.setText(sender);
        contentTextView.setText(content);
        dateTextView.setText(date);
        timeTextView.setText(time);
    }
}
