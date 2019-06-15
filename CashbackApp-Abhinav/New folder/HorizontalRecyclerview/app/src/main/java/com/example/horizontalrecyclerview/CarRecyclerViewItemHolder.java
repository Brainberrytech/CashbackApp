package com.example.horizontalrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.horizontalrecyclerview.R;


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

    }
