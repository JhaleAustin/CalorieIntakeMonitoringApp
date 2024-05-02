package com.example.calorieintakemonitoringapp;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class ConversationActivity extends AppCompatActivity {

    private ListView conversationListView;
    private MessageListAdapter adapter;
    private List<Message> conversation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversation);

        conversationListView = findViewById(R.id.conversationListView);

        // Retrieve clicked message from intent
        Message clickedMessage = getIntent().getParcelableExtra("clickedMessage");

        // Initialize conversation list
        conversation = new ArrayList<>();

        // Simulate a conversation based on the clicked message
        if (clickedMessage != null) {
            String sender = clickedMessage.getSender();
            // Populate conversation based on sender
            switch (sender) {
                case "John":
                    conversation.add(new Message("John", "Hey there!", "2024-05-01", "10:30 AM"));
                    conversation.add(new Message("You", "Sure! What time?", "2024-05-01", "10:35 AM"));
                    conversation.add(new Message("John", "How about 5 PM?", "2024-05-01", "10:40 AM"));
                    conversation.add(new Message("You", "Sounds good!", "2024-05-01", "10:45 AM"));
                    conversation.add(new Message("John", "See you then!", "2024-05-01", "10:50 AM"));
                    conversation.add(new Message("You", "Alright!", "2024-05-01", "10:55 AM"));
                    break;
                case "Lisa":
                    conversation.add(new Message("Lisa", "Sure! Let's meet at 12:30 PM.", "2024-05-01", "11:30 AM"));
                    conversation.add(new Message("You", "Sounds good to me!", "2024-05-01", "11:35 AM"));
                    conversation.add(new Message("Lisa", "Great! See you then!", "2024-05-01", "11:40 AM"));
                    conversation.add(new Message("You", "See you!", "2024-05-01", "11:45 AM"));
                    conversation.add(new Message("Lisa", "Bye!", "2024-05-01", "11:50 AM"));
                    conversation.add(new Message("You", "Bye!", "2024-05-01", "11:55 AM"));
                    break;
                case "Crisa":
                    conversation.add(new Message("Crisa", "That sounds fun!", "2024-05-01", "12:30 PM"));
                    conversation.add(new Message("You", "What time?", "2024-05-01", "12:35 PM"));
                    conversation.add(new Message("Crisa", "8 PM?", "2024-05-01", "12:40 PM"));
                    conversation.add(new Message("You", "Perfect!", "2024-05-01", "12:45 PM"));
                    conversation.add(new Message("Crisa", "See you then!", "2024-05-01", "12:50 PM"));
                    conversation.add(new Message("You", "Okay!", "2024-05-01", "12:55 PM"));
                    break;
            }
        }

        // Set up adapter for conversation
        adapter = new MessageListAdapter(this, conversation);
        conversationListView.setAdapter(adapter);
    }
}
