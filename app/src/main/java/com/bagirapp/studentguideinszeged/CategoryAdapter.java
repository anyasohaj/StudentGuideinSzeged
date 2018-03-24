package com.bagirapp.studentguideinszeged;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context context;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FacultiesFragment();
            case 1:
                return new DormitoriesFragment();
            case 2:
                return new FoodDrinkFragment();
            case 3:
                return new PastimeFragment();
            default:
                return null;

        }
    }

    // Set pages and titles of the tab
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getResources().getString(R.string.category_faculties);
            case 1:
                return context.getResources().getString(R.string.category_dormitories);
            case 2:
                return context.getResources().getString(R.string.category_food_drink);
            case 3:
                return context.getResources().getString(R.string.category_pastime);
            default:
                return null;
        }
    }
}