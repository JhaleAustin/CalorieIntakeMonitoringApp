package com.example.calorieintakemonitoringapp;

public class Message {
    private String sender;
    private String content;
    private String date;
    private String time;

    public Message(String sender, String content, String date, String time) {
        this.sender = sender;
        this.content = content;
        this.date = date;
        this.time = time;
    }

    public String getSender() {
        return sender;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
