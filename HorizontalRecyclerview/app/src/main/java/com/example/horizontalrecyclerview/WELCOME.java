package com.example.horizontalrecyclerview;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

/**
 * @author Abhinav Agarwal
 * version 1.0
 * This activity is used to go to either home screen or to the login activity
 */

public class WELCOME extends AppCompatActivity {
    /**
     * CarouselView is used to change the images in the background.
     */
    CarouselView carouselView;
    /**
     * sampleImages array contains the images for the carousel to display taking them from drawable directory.
     */
    int[] sampleImages = {R.drawable.welcome1, R.drawable.welcome2, R.drawable.welcome5, R.drawable.welcome4};
    Button sign_in, skip_to_browse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        carouselView = (CarouselView) findViewById(R.id.carouselView);
        /**
         * setting size of the carousel view to the number of images in sampleImage array
         */
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);


        sign_in = findViewById(R.id.signin);
        skip_to_browse = findViewById(R.id.skip_to_browse);
        /**
         * sign_in button is used to take the user to the login activity
         */
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign_in = new Intent(WELCOME.this, LoginActivity.class);
                startActivity(sign_in);
            }
        });
        /**
         * skip_to_browse button takes the user directly to home screen
         */
        skip_to_browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skip_to_browse = new Intent(WELCOME.this, MainActivity.class);
                startActivity(skip_to_browse);
            }
        });
    }

    /**
     * setting images in the carousel view when images are present in the array
     */
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };

    public void How_it_works(View view) {
        Intent how_it_works= new Intent(this,How_it_works.class);
        startActivity(how_it_works);
    }
}
