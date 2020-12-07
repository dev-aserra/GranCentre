package com.example.grancentre.FragmentsRestaurant;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.grancentre.FragmentsHotel.Hotel2;
import com.example.grancentre.FragmentsHotel.Hotel3;
import com.example.grancentre.FragmentsHotel.Hotel4;

public class PageAdapter extends FragmentPagerAdapter {

    private int numberTabs;

    public PageAdapter(@NonNull FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numberTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new RestaurantItalia();
            case 1: return new RestaurantVegetaria();
            case 2: return new RestaurantMarisc();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return numberTabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }
}
