package com.example.calorieintakemonitoringapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Message implements Parcelable {
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

    protected Message(Parcel in) {
        sender = in.readString();
        content = in.readString();
        date = in.readString();
        time = in.readString();
    }

    public static final Creator<Message> CREATOR = new Creator<Message>() {
        @Override
        public Message createFromParcel(Parcel in) {
            return new Message(in);
        }

        @Override
        public Message[] newArray(int size) {
            return new Message[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(sender);
        dest.writeString(content);
        dest.writeString(date);
        dest.writeString(time);
    }
}
