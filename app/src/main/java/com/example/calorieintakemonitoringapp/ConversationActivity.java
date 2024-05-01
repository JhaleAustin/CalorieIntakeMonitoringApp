package com.example.calorieintakemonitoringapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.calorieintakemonitoringapp.MessagesAdapter;
import com.example.calorieintakemonitoringapp.R;

import java.util.ArrayList;
import java.util.List;

public class ConversationActivity extends AppCompatActivity {

    private RecyclerView messageRecyclerView;
    private MessagesAdapter messagesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);

        // Initialize RecyclerView
        messageRecyclerView = findViewById(R.id.messageRecyclerView);
        messageRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dummy messages for testing
        List<MessagesAdapter.Message> messages = new ArrayList<>();
        messages.add(new MessagesAdapter.Message("Hey, are you going to the gym today?", "10:00 AM", "Sender1"));
        messages.add(new MessagesAdapter.Message("Yes, I'm planning to go around 5 PM.", "10:05 AM", "Sender2"));
        messages.add(new MessagesAdapter.Message("Great! Let's meet there.", "10:07 AM", "Sender1"));

        // Set up adapter
        messagesAdapter = new MessagesAdapter(messages);
        messageRecyclerView.setAdapter(messagesAdapter);
    }
}
