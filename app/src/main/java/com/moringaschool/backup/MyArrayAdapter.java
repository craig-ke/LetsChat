package com.moringaschool.backup;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private String[] mCountries;
    private String[] mNews;

    public MyArrayAdapter (Context mContext, int resource, String[] mRestaurants, String[] mCuisines){
        super(mContext, resource);
        this.mContext = mContext;
        this.mNews = mCuisines;
        this.mCountries = mRestaurants;
    }

    @Override
    public Object getItem(int position){
        String restaurant = mCountries[position];
        String cuisine = mNews[position];
        return String.format("%s \n Lets Chat: %s", restaurant, cuisine);
    }

    @Override
    public int getCount(){
        return mCountries.length;
    }
}


