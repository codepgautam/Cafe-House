package com.example.coffeehouse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class  FoodAdapter extends RecyclerView.Adapter<FoodAdapter.foodholder>{

    private ArrayList<food> temp;
    public FoodAdapter(FooditemActivity fooditemActivity, ArrayList<food> foods1) {
        temp = foods1;
    }

    @NonNull
    @Override
    public foodholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item1, parent , false);
        return new foodholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodholder holder, int position) {
        food currentdata = temp.get(position);
        holder.imageView.setImageResource(currentdata.imageid);
        holder.textView.setText(currentdata.getfoodname());


    }

    @Override
    public int getItemCount() {
        return temp.size();
    }

    static class foodholder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public foodholder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_view1);
            textView = itemView.findViewById(R.id.text_view1);
        }
    }
}
