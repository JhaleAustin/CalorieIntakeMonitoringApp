package com.example.calorieintakemonitoringapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MessagesAdapter extends RecyclerView.Adapter<MessagesAdapter.MessageViewHolder> {

    private List<Message> messages;

    public MessagesAdapter(List<Message> messages) {
        this.messages = messages;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_message_item, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        holder.bind(messages.get(position));
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView messageTextView;
        TextView messageTimeTextView;
        TextView senderTextView;

        MessageViewHolder(View itemView) {
            super(itemView);
            messageTextView = itemView.findViewById(R.id.messageTextView);
            messageTimeTextView = itemView.findViewById(R.id.messageTimeTextView);
            senderTextView = itemView.findViewById(R.id.senderTextView);
        }

        void bind(Message message) {
            messageTextView.setText(message.getText());
            messageTimeTextView.setText(message.getTime());
            senderTextView.setText(message.getSender());
        }
    }

    public static class Message {
        private String text;
        private String time;
        private String sender;

        public Message(String text, String time, String sender) {
            this.text = text;
            this.time = time;
            this.sender = sender;
        }

        public String getText() {
            return text;
        }

        public String getTime() {
            return time;
        }

        public String getSender() {
            return sender;
        }
    }
}
