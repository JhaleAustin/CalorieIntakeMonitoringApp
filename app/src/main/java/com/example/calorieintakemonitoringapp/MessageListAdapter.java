package com.example.calorieintakemonitoringapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

public class MessageListAdapter extends ArrayAdapter<Message> {

    private Context context;
    private List<Message> messages;

    public MessageListAdapter(Context context, List<Message> messages) {
        super(context, R.layout.message_list_item, messages);
        this.context = context;
        this.messages = messages;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.message_list_item, parent, false);
        }

        final Message message = messages.get(position);
        if (message != null) {
            TextView senderTextView = view.findViewById(R.id.senderTextView);
            TextView contentTextView = view.findViewById(R.id.contentTextView);
            TextView dateTextView = view.findViewById(R.id.dateTextView);
            TextView timeTextView = view.findViewById(R.id.timeTextView);

            senderTextView.setText(message.getSender());
            contentTextView.setText(message.getContent());
            dateTextView.setText(message.getDate());
            timeTextView.setText(message.getTime());
        }

        return view;
    }
}
