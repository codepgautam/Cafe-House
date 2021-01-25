package com.example.coffeehouse;

import android.os.Bundle;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FooditemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fooditem);
        ArrayList<food> foods1 = new ArrayList<food>();
        foods1.add(new food(R.drawable.staeter, "Starter"));
        foods1.add(new food(R.drawable.maincourse , "MainCourse"));
        foods1.add(new food(R.drawable.dessert , "Dessert"));
        foods1.add(new food(R.drawable.drinks , "Drinks"));
        foods1.add(new food(R.drawable.brivereges , "Brivereges"));;

        ArrayList<food2> foods2 = new ArrayList<food2>();
        foods2.add(new food2(R.drawable.biryani , "Rs 230" , "Biryani",R.drawable.ratingicon , 4.5 , "30 min" , "Free Delivery"));
        foods2.add(new food2(R.drawable.chickenkorma , "Rs 350" , "Chicken Korma",R.drawable.ratingicon , 4.4 , "35 min" , "Free Delivery"));
        foods2.add(new food2(R.drawable.fish_fry , "Rs 290" , "Fish Fry",R.drawable.ratingicon , 4.3 , "45 min" , "No Free Delivery"));
        foods2.add(new food2(R.drawable.egg_curry , "Rs 150" , "Egg Curry",R.drawable.ratingicon , 4.2 , "25 min" , "Free Delivery"));
        foods2.add(new food2(R.drawable.muttoncurry , "Rs 390" , "Mutton Curry",R.drawable.ratingicon , 4.5 , "20 min" , "No Free Delivery"));
        foods2.add(new food2(R.drawable.mixveg , "Rs 180" , "Mix Veg",R.drawable.ratingicon , 4.4 , "30 min" , "Free Delivery"));

        ArrayList<food3> foods3 = new ArrayList<food3>();
        foods3.add(new food3(R.drawable.biryani , "Rs 230" , "Biryani",R.drawable.ratingicon , 4.5 , "30 min" , "Free Delivery"));
        foods3.add(new food3(R.drawable.chickenkorma , "Rs 350" , "Chicken Korma",R.drawable.ratingicon , 4.4 , "35 min" , "Free Delivery"));
        foods3.add(new food3(R.drawable.fish_fry , "Rs 290" , "Fish Fry",R.drawable.ratingicon , 4.3 , "45 min" , "No Free Delivery"));
        foods3.add(new food3(R.drawable.egg_curry , "Rs 150" , "Egg Curry",R.drawable.ratingicon , 4.2 , "25 min" , "Free Delivery"));
        foods3.add(new food3(R.drawable.muttoncurry , "Rs 390" , "Mutton Curry",R.drawable.ratingicon , 4.5 , "20 min" , "No Free Delivery"));
        foods3.add(new food3(R.drawable.mixveg , "Rs 180" , "Mix Veg",R.drawable.ratingicon , 4.4 , "30 min" , "Free Delivery"));


        final FoodAdapter adapter = new FoodAdapter(this , foods1);
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recylerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

        final Food2Adapter adapter2 = new Food2Adapter(this , foods2);
        RecyclerView recyclerView1 = (RecyclerView)findViewById(R.id.recyclerview2);
        recyclerView1.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL, false));
        recyclerView1.setAdapter(adapter2);

        final Food3Adapter adapter3 = new Food3Adapter(this , foods3);
        RecyclerView recyclerView2 = (RecyclerView)findViewById(R.id.recyclerview3);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false));
        recyclerView2.setAdapter(adapter3);

        SearchView searchView = findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });


    }
}