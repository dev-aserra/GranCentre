package com.example.grancentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] buttonIDs = new int[] {R.id.bRestarurant, R.id.bHotel, R.id.bCartellera, R.id.bParking };
        for (int buttonID : buttonIDs) {
            ImageButton b = (ImageButton) findViewById(buttonID);
            b.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        ImageButton b = (ImageButton)v;
        Intent intent;
        switch (b.getId()) {
            case R.id.bRestarurant:
                intent = new Intent(this, ActivityRestaurant.class);
                startActivity(intent);
                break;
            case R.id.bHotel:
                intent = new Intent(this, ActivityHotel.class);
                startActivity(intent);
                break;
            case R.id.bCartellera:
                intent = new Intent(this, ActivityCartellera.class);
                startActivity(intent);
                break;
            case R.id.bParking:
                intent = new Intent(this, ActivityParking.class);
                startActivity(intent);
                break;
        }
    }
}