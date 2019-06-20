package com.example.horizontalrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * @author Abhinav Agarwal
 * @since 2/12/2018.
 *
 * Adapter for the horizontal recyclerview in the Main Activity
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    //vars
    /**
     * Array list for components to be shown in the recyclerview.
     */
    private ArrayList<String> mNames;
    private ArrayList<String> mImageUrls;
    private Context mContext;

    /**
     * Called from the main Activity to pass the data for Arraylists and
     * the context of MainActivity to inflate the layout of recyclerview there
     * @param context
     * @param imageUrls
     * @param names
     */
    RecyclerViewAdapter(Context context, ArrayList<String> imageUrls,ArrayList<String> names) {
        mNames = names;
        mImageUrls = imageUrls;
        mContext = context;
    }

    /**
     * called when tha adapter is called to create the layout for recyclerview
     * @param parent
     * @param viewType
     * @return
     */

    @Override
    public ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent,@NonNull int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);
        return new ViewHolder(view);
    }

    /**
     * sets the data into the components of layout with the data received
     * Picasso library is used to inflate the images in the recyclerview
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");


        Picasso.get().load(mImageUrls.get(position)).into(holder.image);
        holder.textView.setText(mNames.get(position));
        /**
         * on click of image takes user to particular coupons of that company
         */
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent coupons = new Intent(mContext,CompanyCouponActivity.class);
                mContext.startActivity(coupons);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageUrls.size();
    }

    /**
     * ViewHolder class is used to set the variables to the layout contents
     */

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image_view);
            textView = itemView.findViewById(R.id.textview_recycler);
        }
    }
}