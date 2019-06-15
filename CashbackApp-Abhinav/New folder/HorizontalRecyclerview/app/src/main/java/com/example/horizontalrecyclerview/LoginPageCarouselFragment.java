package com.example.horizontalrecyclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

/**
 * This fragment adds a carousel to the parent activity <br><br>
 *
 * first add the following two lines to your gradle app module:- <br>
 * <code>
 * implementation 'com.synnapps:carouselview:0.1.5'  // carousel view
 * implementation 'com.squareup.picasso:picasso:2.71828' // Picasso: for loading images into imageViews
 * </code>
 *
 * @author Shayak Banerjee
 * @version 0.1
 * @since 11th June 2019
 */
public class LoginPageCarouselFragment extends Fragment {
    // contains the URLs of images that will be displayed in the carousel
    private ArrayList<String> sampleImages;

    // displaying the image in the carousel
    private ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

            String imageLink = sampleImages.get(position);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

            Picasso.get().load(imageLink).into(imageView);
        }
    };

    // Inflates the layout resource of the fragment
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.login_page_carousel_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // the carousel view's images' URLs are stored in sampleImages
        sampleImages = new ArrayList<>();

        // TODO: remove after testing
        loadTestData();

        // the carousel view
        CarouselView carouselView = getView().findViewById(R.id.loginPageCarouselView);

        // sets how many images will be loaded in the carousel
        carouselView.setPageCount(sampleImages.size());
        // imageListener listens for the image and then displays it in the carousel
        carouselView.setImageListener(imageListener);
    }

    /**
     * Loads test data into sampleImages
     */
    private void loadTestData(){
        sampleImages.add("https://i.pinimg.com/originals/66/12/7a/66127a9bdf5c5f62402331976c0d9f7e.jpg");
        sampleImages.add("https://i.pinimg.com/originals/66/12/7a/66127a9bdf5c5f62402331976c0d9f7e.jpg");
        sampleImages.add("https://i.pinimg.com/originals/66/12/7a/66127a9bdf5c5f62402331976c0d9f7e.jpg");
        sampleImages.add("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/lassie-attends-the-television-academys-70th-anniversary-news-photo-537777628-1548692378.jpg");
    }
}
