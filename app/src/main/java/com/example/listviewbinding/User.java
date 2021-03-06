package com.example.listviewbinding;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class User {
    private String name;
    private int age;
    private boolean active;
    private String imageurl;

    public User(String name, int age, boolean active, String imageurl) {
        this.name = name;
        this.age = age;
        this.active = active;
        this.imageurl = imageurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView imageView,String imageurl){
        RequestOptions options=new RequestOptions()
                .error(R.mipmap.ic_launcher)
                .placeholder(R.drawable.ic_launcher_foreground);
        Glide.with(imageView.getContext())
                .setDefaultRequestOptions(options)
                .load(imageurl)
                .into(imageView);


    }
}
