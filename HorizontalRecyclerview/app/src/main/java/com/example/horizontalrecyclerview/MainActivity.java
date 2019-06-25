package com.example.horizontalrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.util.ArrayList;

public class MainActivity extends H2_NDBaseActivity{
    private static final String TAG = "MainActivity";
    CarouselView carouselView;

    String[] sampleImages = {"https://imgur.com/UCO49aJ.png","https://imgur.com/vuGc4Hn.png","https://imgur.com/PnmAIJk.png","https://imgur.com/kWviREv.png","https://imgur.com/Hp3WgXI.png"};
    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    ImageView refer,black,orange,redbus,sale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBaseContentView(R.layout.activity_main);

        refer=findViewById(R.id.referandearn);
        Picasso.get().load("https://i.imgur.com/poa1AWa.jpg").into(refer);
        black=findViewById(R.id.black);
        Picasso.get().load("https://i.imgur.com/rVQWv37.jpg").into(black);
        orange=findViewById(R.id.orange);
        Picasso.get().load("https://i.imgur.com/r40yB2V.jpg").into(orange);
        redbus=findViewById(R.id.redbus);
        Picasso.get().load("https://i.imgur.com/Cphqsjr.jpg").into(redbus);
        sale=findViewById(R.id.sale);
        Picasso.get().load("https://i.imgur.com/i7S5Wf9.jpg").into(sale);


        carouselView = (CarouselView) findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);

        carouselView.setImageListener(imageListener);

        getImages();

    }
    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            Picasso.get().load(sampleImages[position]).into(imageView);
            //imageView.setImageResource(sampleImages[position]);
        }
    };

    /**
     * getImages method is called to fill the ArrayLists with data so they can be passed to the adapter for recyclerview
     */
    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://img.etimg.com/thumb/msid-66421537,width-1200,height-900,resizemode-4,imgsize-165547/untitled-7.jpg");
           mNames.add("papperfy");

        mImageUrls.add("https://hippoprod.s3.amazonaws.com/merchants/logos/000/000/037/large/cleartrip_india_logo.png");
         mNames.add("Cleartip");

        mImageUrls.add("https://www.searchpng.com/wp-content/uploads/2019/03/Swiggy-PNG-Logo-715x715.png");
        mNames.add("Swiggy");

        mImageUrls.add("https://upload.wikimedia.org/wikipedia/en/0/09/Zomato_company_logo.png");
        mNames.add("Zomato");


        mImageUrls.add("https://pngimg.com/uploads/amazon/amazon_PNG13.png");
        mNames.add("Amazon");



        initRecyclerView();

    }

    /**
     * initRecyclerView is called to call the adapter with data inserted by getImages methods in the arrarlists
     *
     */

    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mImageUrls,mNames);
        recyclerView.setAdapter(adapter);
    }

    /**
     * calls the refer_and_earn activity on the click on imageview of Refer and earn
     * @param view
     */

    public void Refers(View view) {
        Intent refer=new Intent(this,Refer_and_earn.class);
        startActivity(refer);
    }


}

