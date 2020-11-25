package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.grancentre.FragmentsHotel.PageAdapter;
import com.example.grancentre.FragmentsHotel.Hotel2;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ActivityHotel extends AppCompatActivity implements Hotel2.OnHotel2FragmentListener, Hotel2.ViewInterface {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabItem hotel2,hotel3,hotel4;
    public Intent viewIntent;
    public PagerAdapter PageAdapter;
    FragmentPagerAdapter fragmentPagerAdapter;
    Fragment fragment2 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);

        tabLayout = findViewById(R.id.tabLayout);
        hotel2 = findViewById(R.id.hotel2);
        hotel3 = findViewById(R.id.hotel3);
        hotel4 = findViewById(R.id.hotel4);
        viewPager = findViewById(R.id.view_pager);

        FragmentManager frm = getSupportFragmentManager();
        PageAdapter = new PageAdapter(frm,tabLayout.getTabCount());
        viewPager.setAdapter(PageAdapter);
        FragmentPagerAdapter fragmentPagerAdapter = (FragmentPagerAdapter) viewPager.getAdapter();
        //  for (int i =0; i< fragmentPagerAdapter.getCount(); i++)
        fragment2 = (Fragment) fragmentPagerAdapter.instantiateItem(viewPager,viewPager.getCurrentItem());/*
            if (fragment2!= null && fragment2.getView()!= null) {
               // Fragment fragment = frm.findFragmentById(R.id.hotel2);
               // if (fragment != null) {
                com.google.android.material.button.MaterialButton boto1 = fragment2.getView().findViewById(R.id.website);
                boto1.setOnClickListener(this);
              //  }
            }*/
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0){
                    PageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 1){
                    PageAdapter.notifyDataSetChanged();
                } else if (tab.getPosition() == 2) {
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
    @Override
    public void onHotel2LayoutCreated(View v) {
        //TODO: Ja han clicat al botó del fragment, ara què cal fer?
        switch (v.getId()){
            case R.id.websiteHotel2Estrellas_1:
                //Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse((String) resultat.getText()));
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hotel-bb.com/es/hotel/barcelona-granollers"));
                startActivity(viewIntent);
                break;
            case R.id.telefonHotel2Estrellas_1:
                //Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse((String) resultat.getText()));
                Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:tel:938407132"));
                startActivity(intent2);
                break;
            //resultat.setText("Hola"); break;
        }
    }
}