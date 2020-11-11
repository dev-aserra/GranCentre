package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.grancentre.FragmentsHotel.PageAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ActivityHotel extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabItem hotel1,hotel2,hotel3,hotel4,hotel5;
    public PagerAdapter PageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        tabLayout = findViewById(R.id.tabLayout);
        hotel1 = findViewById(R.id.hotel1);
        hotel2 = findViewById(R.id.hotel2);
        hotel3 = findViewById(R.id.hotel3);
        hotel4 = findViewById(R.id.hotel4);
        hotel5 = findViewById(R.id.hotel5);
        viewPager = findViewById(R.id.view_pager);
        PageAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(PageAdapter);

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0){
                    PageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 1){
                    PageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 2){
                    PageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 3){
                    PageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 4){
                    PageAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }
}