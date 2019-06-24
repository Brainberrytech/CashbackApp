package com.example.horizontalrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Categories extends AppCompatActivity {
    ImageView image1,image2,image3,image4,image5,image6;
    String[] imagelink={"https://i.imgur.com/m7EniFi.png","https://i.imgur.com/rZBo0pY.png","https://i.imgur.com/I0rfSE4.png","https://i.imgur.com/4u70MJ3.png","https://i.imgur.com/4F4XJyk.png","https://i.imgur.com/Nx9rVKD.png"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        image1=findViewById(R.id.clothing);
        image2=findViewById(R.id.beauty);
        image3=findViewById(R.id.footwear);
        image4=findViewById(R.id.electronics);
        image5=findViewById(R.id.books);
        image6=findViewById(R.id.food);

        Picasso.get().load(imagelink[0]).into(image1);
        Picasso.get().load(imagelink[1]).into(image2);
        Picasso.get().load(imagelink[2]).into(image3);
        Picasso.get().load(imagelink[3]).into(image4);
        Picasso.get().load(imagelink[4]).into(image5);
        Picasso.get().load(imagelink[5]).into(image6);

    }
}
