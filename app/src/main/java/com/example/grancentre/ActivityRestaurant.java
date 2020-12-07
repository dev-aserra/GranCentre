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
import android.view.View;

import com.example.grancentre.FragmentsRestaurant.PageAdapter;
import com.example.grancentre.FragmentsRestaurant.RestaurantItalia;
import com.example.grancentre.FragmentsRestaurant.RestaurantMarisc;
import com.example.grancentre.FragmentsRestaurant.RestaurantVegetaria;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ActivityRestaurant extends AppCompatActivity implements RestaurantItalia.OnRestaurantItaliaFragmentListener, RestaurantItalia.ViewInterface, RestaurantMarisc.OnRestaurantMariscFragmentListener, RestaurantMarisc.ViewInterface, RestaurantVegetaria.OnRestaurantVegetariaFragmentListener, RestaurantVegetaria.ViewInterface {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TabItem restaurantitalia,restaurantmarisc,restaurantvegetaria;
    private Intent viewIntent;
    public PagerAdapter PageAdapter;
    FragmentPagerAdapter fragmentPagerAdapter;
    Fragment fragment2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        tabLayout = findViewById(R.id.tabLayout);
        restaurantitalia = findViewById(R.id.restaurantitalia);
        restaurantmarisc = findViewById(R.id.restaurantmarisc);
        restaurantvegetaria = findViewById(R.id.restaurantvegetaria);
        viewPager = findViewById(R.id.view_pager);

        FragmentManager frm = getSupportFragmentManager();
        PageAdapter = new PageAdapter(frm,tabLayout.getTabCount());
        viewPager.setAdapter(PageAdapter);
        FragmentPagerAdapter fragmentPagerAdapter = (FragmentPagerAdapter) viewPager.getAdapter();
        fragment2 = (Fragment) fragmentPagerAdapter.instantiateItem(viewPager,viewPager.getCurrentItem());

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
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
    public void onRestaurantItaliaLayoutCreated(View v) {
        //TODO: Ja han clicat al botó del fragment, ara què cal fer?
        switch (v.getId()){
            case R.id.websiteRestaurantItalia_1:
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://lamezzaluna.es/"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantItalia_1:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795223"));
                startActivity(viewIntent);
                break;
            case R.id.websiteRestaurantItalia_2:
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.latagliatella.es/ca"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantItalia_2:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938604899"));
                startActivity(viewIntent);
                break;
            case R.id.websiteRestaurantItalia_3:
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://ilsaporeitalianogranollers.es/"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantItalia_3:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938401532"));
                startActivity(viewIntent);
                break;
        }
    }

    @Override
    public void onRestaurantMariscLayoutCreated(View v) {
        //TODO: Ja han clicat al botó del fragment, ara què cal fer?
        switch (v.getId()){
            case R.id.websiteRestaurantMarisc_1:
                //La pàgina és TripAdvisor perquè no té pàgina web
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d1789988-Reviews-Restaurant_La_Piranya-Granollers_Catalonia.html"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantMarisc_1:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938795100"));
                startActivity(viewIntent);
                break;
            case R.id.websiteRestaurantMarisc_2:
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.osgalegos.com/"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantMarisc_2:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938403039"));
                startActivity(viewIntent);
                break;
            case R.id.websiteRestaurantMarisc_3:
                //La pàgina és TripAdvisor perquè no té pàgina web
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d7375971-Reviews-Can_Pipa-Granollers_Catalonia.html"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantMarisc_3:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938794769"));
                startActivity(viewIntent);
                break;
        }
    }

    @Override
    public void onRestaurantVegetariaLayoutCreated(View v) {
        //TODO: Ja han clicat al botó del fragment, ara què cal fer?
        switch (v.getId()) {
            case R.id.websiteRestaurantVegetaria_1:
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://vinyam.es/"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantVegetaria_1:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:930232899"));
                startActivity(viewIntent);
                break;
            case R.id.websiteRestaurantVegetaria_2:
                //La pàgina és TripAdvisor perquè no té pàgina web
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d8779106-Reviews-L_Anima_De_Granollers-Granollers_Catalonia.html"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantVegetaria_2:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938704291"));
                startActivity(viewIntent);
                break;
            case R.id.websiteRestaurantVegetaria_3:
                //La pàgina és TripAdvisor perquè no té pàgina web
                viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d4040778-Reviews-Restaurante_DO-Granollers_Catalonia.html"));
                startActivity(viewIntent);
                break;
            case R.id.telefonRestaurantVegetaria_3:
                viewIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:938418580"));
                startActivity(viewIntent);
                break;
        }
    }
}