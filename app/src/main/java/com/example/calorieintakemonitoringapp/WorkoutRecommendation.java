package com.example.calorieintakemonitoringapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WorkoutRecommendation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_recommendation);
        // Example: Display recommendations for Gain Weight - Male - Active - Vegetarian Diet
        displayRecommendations("Gain Weight", "Male", "Active", "Vegetarian Diet");
    }

    // Method to display recommendations based on the given criteria
    private void displayRecommendations(String goal, String gender, String activity, String diet) {
        // Get the LinearLayout where food recommendations will be added
        LinearLayout foodLayout = findViewById(R.id.foodRecommendationsLayout);

        // Construct the combination key
        String key = goal + " - " + gender + " - " + activity + " - " + diet;

        // Get the recommendations based on the key
        String recommendations = getRecommendations(key);

        // Display recommendations dynamically with styling
        TextView textView = new TextView(this);
        textView.setText(recommendations);
        textView.setTextSize(16); // Set text size
        textView.setTextColor(getResources().getColor(android.R.color.black)); // Set text color
        textView.setPadding(16, 8, 16, 8); // Set padding
        foodLayout.addView(textView);
    }

    // Method to get recommendations based on the combination key
    private String getRecommendations(String key) {
        switch (key) {
            case "Gain Weight - Male - Active - Vegetarian Diet":
                return  "Workout Recommendations:\n" +
                        "Strength Training:\n" +
                        " - Squats\n" +
                        " - Lunges\n" +
                        " - Yoga";
            case "Gain Weight - Male - Active - Energetic Diet":
                // Add recommendations for this combination
                return  "Workout Recommendations:\n" +
                        "Jump Squats\n" +
                        "Push-Ups\n" +
                        "Running";
            // Add cases for other combinations
            default:
                return "No recommendations available for this combination.";
        }
    }
}
