package com.example.horizontalrecyclerview;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CardViewActivity extends AppCompatActivity{
    private List<CarRecyclerViewItem> carItemList = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);


           //     setTitle("dev2qa.com - Android CardView Example.");

                initializeCarItemList();

                // Create the recyclerview.
                RecyclerView carRecyclerView = (RecyclerView)findViewById(R.id.card_view_recycler_list);
                // Create the grid layout manager with 2 columns.
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
                // Set layout manager.
                carRecyclerView.setLayoutManager(gridLayoutManager);

                // Create car recycler view data adapter with car item list.
                CarRecyclerViewDataAdapter carDataAdapter = new CarRecyclerViewDataAdapter(carItemList);
                // Set data adapter.
                carRecyclerView.setAdapter(carDataAdapter);

            }

            /* Initialise car items in list. */
            private void initializeCarItemList() {
                if (carItemList == null) {
                    carItemList = new ArrayList<CarRecyclerViewItem>();
                    carItemList.add(new CarRecyclerViewItem("Amazon", R.drawable.amazon));
                    carItemList.add(new CarRecyclerViewItem("Flipkart", R.drawable.flipkart));
                    carItemList.add(new CarRecyclerViewItem("BookMyShow", R.drawable.bookmyshow));
                    carItemList.add(new CarRecyclerViewItem("Food Panda", R.drawable.foodpanda));
                    carItemList.add(new CarRecyclerViewItem("Pizza Hut", R.drawable.pizzahut));
                    carItemList.add(new CarRecyclerViewItem("Swiggy", R.drawable.swiggy));
                }
            }
    }


