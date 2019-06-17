package com.example.horizontalrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class MainActivity extends H2_NDBaseActivity{
    private static final String TAG = "MainActivity";
    CarouselView carouselView;

    int[] sampleImages = {R.drawable.swiggy, R.drawable.zomato, R.drawable.swiggysale, R.drawable.ajio, R.drawable.paytm};
    //vars
    // private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBaseContentView(R.layout.activity_main);
        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        getImages();

    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };
    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://img.etimg.com/thumb/msid-66421537,width-1200,height-900,resizemode-4,imgsize-165547/untitled-7.jpg");
        //   mNames.add("Havasu Falls");

        mImageUrls.add("https://hippoprod.s3.amazonaws.com/merchants/logos/000/000/037/large/cleartrip_india_logo.png");
        // mNames.add("Trondheim");

        mImageUrls.add("https://www.searchpng.com/wp-content/uploads/2019/03/Swiggy-PNG-Logo-715x715.png");
        //mNames.add("Portugal");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/0/09/Zomato_company_logo.png");
        // mNames.add("Rocky Mountain National Park");


        mImageUrls.add("https://pngimg.com/uploads/amazon/amazon_PNG13.png");
        //mNames.add("Mahahual");



        initRecyclerView();

    }

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mImageUrls);
        recyclerView.setAdapter(adapter);
    }

    public void Refers(View view) {
        Intent refer=new Intent(this,Refer_and_earn.class);
        startActivity(refer);
    }
}

