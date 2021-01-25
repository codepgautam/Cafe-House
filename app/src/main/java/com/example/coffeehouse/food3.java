package com.example.coffeehouse;

public class food3 {
    Integer imageid;
    String price;
    String foodname;
    Integer ratingicon;
    float rating;
    String time;
    String deliveryprice;

    public food3(int backgroundimg, String s, String biryani, int ricon, double v, String s1, String free_delivery) {
        imageid = backgroundimg;
        price = s;
        foodname = biryani;
        ratingicon = ricon;
        rating = (float) v;
        time = s1;
        deliveryprice = free_delivery;
    }

}
