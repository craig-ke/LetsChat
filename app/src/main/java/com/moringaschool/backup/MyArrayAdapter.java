package com.moringaschool.backup;

import android.content.Context;
import android.widget.ArrayAdapter;

public class MyArrayAdapter extends ArrayAdapter {

    private Context mContext;
    private String[] mRestaurants;
    private String[] mCuisines;

    public MyArrayAdapter (Context mContext, int resource, String[] mRestaurants, String[] mCuisines){
        super(mContext, resource);
        this.mContext = mContext;
        this.mCuisines = mCuisines;
        this.mRestaurants = mRestaurants;
    }

    @Override
    public Object getItem(int position){
        String restaurant = mRestaurants[position];
        String cuisine = mCuisines[position];
        return String.format("%s \n Serves great: %s", restaurant, cuisine);
    }

    @Override
    public int getCount(){
        return mRestaurants.length;
    }
}


