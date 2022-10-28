package com.example.trabawhodashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class Messages extends AppCompatActivity {

    ImageView messagehome;
    ImageView messageNotifs;
    ImageView messageFav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);

        messagehome = findViewById(R.id.messagesHome);
        messageNotifs = findViewById(R.id.messageNotif);
        messageFav = findViewById(R.id.messageFavorites);



        messagehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent message =  new Intent(Messages.this, MainActivity.class);
                startActivity(message);
            }
        });

        messageNotifs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent notif =  new Intent(Messages.this, Notifications.class);
                startActivity(notif);
            }
        });

        messageFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent notif =  new Intent(Messages.this, Favorites.class);
                startActivity(notif);
            }
        });
    }
}