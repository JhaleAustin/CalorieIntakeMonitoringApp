package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    Button  b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b1 = findViewById(R.id.myButton5);
        b2 = findViewById(R.id.myButton6);
        b3 = findViewById(R.id.myButton3);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Container.setVisibility(View.INVISIBLE);
//                Container2.setVisibility(View.VISIBLE);

                Intent intent = new Intent(Main.this, FoodRecommendation.class);
               startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Container.setVisibility(View.INVISIBLE);
//                Container2.setVisibility(View.VISIBLE);

                Intent intent = new Intent(Main.this, FoodRecommendation.class);
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Container.setVisibility(View.INVISIBLE);
//                Container2.setVisibility(View.VISIBLE);

                Intent intent = new Intent(Main.this, MessageListActivity.class);
                startActivity(intent);
            }
        });

    }
}