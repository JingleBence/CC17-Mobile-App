package com.example.trabawhodashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Favorites extends AppCompatActivity {
    ImageView homeFav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);

        homeFav = findViewById(R.id.favoritesHome);


        homeFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent favor = new Intent(Favorites.this, MainActivity.class);
                startActivity(favor);
            }
        });
    }
}