package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FoodRecommendation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recommendation);

        // Get the LinearLayout where food recommendations will be added
        LinearLayout foodLayout = findViewById(R.id.foodRecommendationsLayout);

        // Example: Add 5 food recommendations
        for (int i = 1; i <= 5; i++) {
            // Create a new LinearLayout for each recommendation
            LinearLayout recommendationLayout = new LinearLayout(this);
            recommendationLayout.setLayoutParams(new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
            ));
            recommendationLayout.setOrientation(LinearLayout.HORIZONTAL);

            // Add ImageView for food image
            ImageView foodImage = new ImageView(this);
            // Set food image src, size, etc. - You'll need to replace this with actual data
            // foodImage.setImageResource(R.drawable.food_image);
            // foodImage.setLayoutParams(new LinearLayout.LayoutParams(150, 150));
            recommendationLayout.addView(foodImage);

            // Add TextView for food name
            TextView foodName = new TextView(this);
            // Set food name text and properties
            foodName.setText("Food " + i);
            recommendationLayout.addView(foodName);

            // Add the recommendationLayout to the main foodLayout
            foodLayout.addView(recommendationLayout);
        }
    }
}
