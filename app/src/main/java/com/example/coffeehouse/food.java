package com.example.coffeehouse;

public class food {
    Integer imageid;
    String foodname;

    public food(Integer img , String fd){
        imageid = img;
        foodname = fd;
    }

    public Integer getImageid(){return imageid;}
    public String getfoodname(){return foodname;}
}
