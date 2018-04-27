package com.example.android.tourapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class CategoryAdapter extends FragmentStatePagerAdapter {

    private Context _context;

    public CategoryAdapter(FragmentManager fm, Context c) {
        super(fm);
        _context = c;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new ParkFragment();
        } else {
            return new MountainsFragment();
        }
    }

    public CharSequence getPageTitle(int position){
        if (position == 0) {
            return _context.getResources().getString(R.string.category_historical);
        } else if (position == 1) {
            return _context.getResources().getString(R.string.category_restaurant);
        } else if (position == 2) {
            return _context.getResources().getString(R.string.category_park);
        } else {
            return _context.getResources().getString(R.string.category_mountains);
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
