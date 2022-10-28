package com.example.trabawhodashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    ImageView homeProfile;
    ImageView messages;
    ImageView nofication;
    ImageView favorites;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar navTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView)  ;
        navTool =  findViewById(R.id.Hometoolbar);
        homeProfile = findViewById(R.id.HomeProfile);
        messages = findViewById(R.id.Messages);
        nofication = findViewById(R.id.homeNotification);
        favorites = findViewById(R.id.homeFavorites);

        navigationDrawer();




        homeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent profile = new Intent(MainActivity.this, Profile.class);
                startActivity(profile);
            }
        });

        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent message = new Intent(MainActivity.this, Messages.class);
                startActivity(message);
            }
        });

        nofication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent notifs = new Intent(MainActivity.this, Notifications.class);
                startActivity(notifs);
            }
        });

        favorites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent favor = new Intent(MainActivity.this, Favorites.class);
                startActivity(favor);
            }
        });


        //Navigation Menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.Profile:
                        Intent prof = new Intent(MainActivity.this, Profile.class);
                        startActivity(prof);
                        break;

                    case R.id.services:
                        Intent services = new Intent(MainActivity.this, Services.class);
                        startActivity(services);
                        break;

                    case R.id.likes:
                        Intent like = new Intent(MainActivity.this, Favorites.class);
                        startActivity(like);
                        break;

                    case R.id.aboutus:
                        Intent about = new Intent(MainActivity.this, AboutUs.class);
                        startActivity(about);
                        break;

                    case R.id.signout:
                        Intent out = new Intent(MainActivity.this, Login.class);
                        startActivity(out);
                        break;
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }

    private void navigationDrawer() {
        //Navigation Drawer
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.Home);

        navTool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);

                else drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
    @Override
    public void onBackPressed() {

        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
    }
}

