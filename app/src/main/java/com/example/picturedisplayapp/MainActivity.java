package com.example.picturedisplayapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    // Array of drawable image IDs
    private final int[] images = {
            R.drawable.car,
            R.drawable.coffee,
            R.drawable.books
    };

    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        imageView = findViewById(R.id.imageView);
        Button changeImageButton = findViewById(R.id.changeImageButton);

        // Set an OnClickListener to change the image
        changeImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cycle through images
                currentImageIndex = (currentImageIndex + 1) % images.length;
                imageView.setImageResource(images[currentImageIndex]);
            }
        });
    }
}
