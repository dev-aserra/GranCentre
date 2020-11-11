package com.example.grancentre.FragmentsHotel;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.grancentre.FragmentsHotel.hotel1;

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
            case 0: return new hotel1();
            case 1: return new hotel2();
            case 2: return new hotel3();
            case 3: return new hotel4();
            case 4: return new hotel5();
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
