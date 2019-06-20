package com.example.horizontalrecyclerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


public class CarRecyclerViewItemHolder extends RecyclerView.ViewHolder {

        private TextView carTitleText = null;

        private ImageView carImageView = null;

        public CarRecyclerViewItemHolder(View itemView) {
            super(itemView);

            if (itemView != null) {
                carTitleText = (TextView) itemView.findViewById(R.id.card_view_image_title);

                carImageView = (ImageView) itemView.findViewById(R.id.card_view_image);
            }
        }

        public TextView getCarTitleText() {
            return carTitleText;
        }

        public ImageView getCarImageView() {
            return carImageView;
        }


    };


