package com.example.calorieintakemonitoringapp;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FoodRecommendation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_recommendation);

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
                return "Food Recommendations:\n" +
                        "Tofu Sisig: Approximately 200-250 calories per serving.\n" +
                        "Vegetable Bicol Express: Approximately 150-200 calories per serving.\n" +
                        "Quinoa Salad with Chickpeas, Avocado, and Mixed Greens: Approximately 300-400 calories per serving.\n\n" ;
            case "Gain Weight - Male - Active - Energetic Diet":
                // Add recommendations for this combination
                return "Food Recommendations:\n" +
                        "Grilled Chicken Tinola: Approximately 250-300 calories per serving.\n" +
                        "Fish Escabeche: Approximately 200-250 calories per serving.\n" +
                        "Quinoa Stir-Fry with Tofu and Mixed Vegetables: Approximately 300-350 calories per serving.\n\n" ;
            // Add cases for other combinations
            default:
                return "No recommendations available for this combination.";
        }
    }
}
