package com.example.coffeehouse;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

class Food3Adapter extends RecyclerView.Adapter<Food3Adapter.foodholder > {
    private ArrayList<food3> temp;
    public Food3Adapter(FooditemActivity fooditemActivity, ArrayList<food3> foods3) {
        temp = foods3;
    }

    @NonNull
    @Override
    public foodholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item3, parent , false);
        return new Food3Adapter.foodholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodholder holder, int position) {
        food3 currentdata = temp.get(position);
        String text = Float.toString(currentdata.rating);
        holder.foodimage.setImageResource(currentdata.imageid);
        holder.price_text.setText(currentdata.price);
        holder.foodname_text.setText(currentdata.foodname);
        holder.time_text.setText(currentdata.time);
        holder.ratingicon_text.setImageResource(currentdata.ratingicon);
        holder.rating_text.setText(text);
        holder.deliveryprice_text.setText(currentdata.deliveryprice);


    }

    @Override
    public int getItemCount() {
        return temp.size();
    }
    static class foodholder extends RecyclerView.ViewHolder{
        ImageView foodimage;
        TextView price_text;
        TextView foodname_text;
        TextView time_text;
        ImageView ratingicon_text;
        TextView rating_text;
        TextView deliveryprice_text;


        public foodholder(@NonNull View itemView) {
            super(itemView);
            foodimage = itemView.findViewById(R.id.profile_image);
            price_text = itemView.findViewById(R.id.textView11);
            foodname_text = itemView.findViewById(R.id.foodname_text2);
            time_text = itemView.findViewById(R.id.time_text2);
            ratingicon_text = itemView.findViewById(R.id.rating_icon2);
            rating_text = itemView.findViewById(R.id.rating_text2);
            deliveryprice_text = itemView.findViewById(R.id.deliveryprice_text2);
        }
    }
}
