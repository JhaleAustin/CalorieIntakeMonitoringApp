package com.example.calorieintakemonitoringapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MessageListActivity extends AppCompatActivity {

    private ListView messageListView;
    private List<Message> messageList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_list);

        messageListView = findViewById(R.id.messageListView);

        // Populate message list with sample data
        messageList = new ArrayList<>();
        // Messages from John
        messageList.add(new Message("John", "Hey, do you want to go to the gym later?", "2024-05-01", "10:00 AM"));
        // Messages from Lisa
        messageList.add(new Message("Lisa", "Hi there! How about grabbing lunch tomorrow?", "2024-05-01", "11:00 AM"));
        // Messages from Crisa
        messageList.add(new Message("Crisa", "Hello! Are you free for a movie tonight?", "2024-05-01", "12:00 PM"));

        // Set up adapter
        MessageListAdapter adapter = new MessageListAdapter(this, messageList);
        messageListView.setAdapter(adapter);

        // Handle click on message item
        messageListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the clicked message
                Message clickedMessage = messageList.get(position);

                // Navigate to conversation activity, passing the clicked message
                Intent intent = new Intent(MessageListActivity.this, ConversationActivity.class);
                intent.putExtra("clickedMessage", clickedMessage);
                startActivity(intent);
            }
        });
    }
}
