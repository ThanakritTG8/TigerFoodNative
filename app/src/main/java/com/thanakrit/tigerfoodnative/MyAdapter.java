package com.thanakrit.tigerfoodnative;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>  {

    private ArrayList<String> mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

//        public TextView restaurent_item_name;
//        public TextView restaurent_item_num_ratings;
//        public TextView restaurant_item_category;
//        public ImageView restaurant_item_image;

        public TextView textView;
//        public TextView text_description;

        public MyViewHolder(TextView v) {
            super(v);
            textView = v;

//            restaurent_item_name = itemView.findViewById(R.id.restaurant_item_name);
//            restaurent_item_num_ratings = itemView.findViewById(R.id.restaurant_item_num_ratings);
//            restaurant_item_category = itemView.findViewById(R.id.restaurant_item_category);
//            restaurant_item_image = itemView.findViewById(R.id.restaurant_item_image);
        }
//        public void setItem(int position){
//            restaurent_item_name.setText(firebaseData.get(position));
//        }
    }


    public MyAdapter(ArrayList<String> firebaseData) {
        mDataset = firebaseData;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_text_view, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(mDataset.get(position));
//        holder.text_description.setText(firebaseData.get(position));
//        holder.restaurent_item_num_ratings.setText(firebaseData.get(position));
//        holder.restaurant_item_image.setImageResource(firebaseData.get(position));
//
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

}
