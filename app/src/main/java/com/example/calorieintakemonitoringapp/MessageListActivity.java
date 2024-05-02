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
        messageList.add(new Message("John", "Hey, how are you?", "2024-05-01", "10:00 AM"));
        messageList.add(new Message("Alice", "I'm good, thanks!", "2024-05-01", "10:05 AM"));
        // Add more messages...

        // Set up adapter
        MessageListAdapter adapter = new MessageListAdapter(this, messageList);
        messageListView.setAdapter(adapter);

        // Handle click on message item
        messageListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the clicked message
                Message clickedMessage = messageList.get(position);

                // Navigate to conversation activity, passing relevant data
                Intent intent = new Intent(MessageListActivity.this, ConversationActivity.class);
                intent.putExtra("sender", clickedMessage.getSender());
                intent.putExtra("content", clickedMessage.getContent());
                intent.putExtra("date", clickedMessage.getDate());
                intent.putExtra("time", clickedMessage.getTime());
                startActivity(intent);
            }
        });
    }
}
