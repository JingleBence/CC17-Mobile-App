package com.example.trabawhodashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class Profile extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {

    ImageView profilehome;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar navTool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        navTool =  findViewById(R.id.Profiletoolbar);
        profilehome = findViewById(R.id.balay);


        navigationDrawer();

        profilehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent profile = new Intent(Profile.this, MainActivity.class);
                startActivity(profile);
            }
        });


        //Navigation Menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.services:
                        Intent prof = new Intent(Profile.this, Services.class);
                        startActivity(prof);
                        break;

                    case R.id.likes:
                        Intent like = new Intent(Profile.this, Favorites.class);
                        startActivity(like);
                        break;

                    case R.id.aboutus:
                        Intent about = new Intent(Profile.this, AboutUs.class);
                        startActivity(about);
                        break;


                    case R.id.signout:
                        Intent signOUT = new Intent();
                        startActivity(signOUT);
                        finish();
                        System.exit(0);
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
        navigationView.setCheckedItem(R.id.Profile);

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