package com.example.trabawhodashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Notifications extends AppCompatActivity {

    ImageView notifHome;
    ImageView Notifmessages;
    ImageView NotifFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);

        notifHome = findViewById(R.id.notificationHome);
        Notifmessages = findViewById(R.id.notifMessages);
        NotifFav = findViewById(R.id.notifFavorites);

        notifHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent notif = new Intent(Notifications.this, MainActivity.class);
                startActivity(notif);
            }
        });
        Notifmessages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent notif = new Intent(Notifications.this, Messages.class);
                startActivity(notif);
            }
        });

        NotifFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent fav = new Intent(Notifications.this, Favorites.class);
                startActivity(fav);
            }
        });


    }
}