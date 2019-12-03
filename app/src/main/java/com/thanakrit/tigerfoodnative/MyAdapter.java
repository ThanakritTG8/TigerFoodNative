package com.thanakrit.tigerfoodnative;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    private ArrayList<Restaurent> restaurent;


    public MyAdapter(Context con, ArrayList<Restaurent> res) {
        this.context = con;
        this.restaurent = res;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(restaurent.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return restaurent.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageView pic;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.name);
            pic = (ImageView) itemView.findViewById(R.id.pic);
        }
    }
}
