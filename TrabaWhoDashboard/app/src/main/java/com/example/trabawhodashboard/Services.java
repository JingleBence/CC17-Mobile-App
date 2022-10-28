package com.example.trabawhodashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.navigation.NavigationView;

public class Services extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageView servicehome;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar navTool;

    CardView appliance;
    CardView carpentry;
    CardView electrical;
    CardView plumbing;
    CardView welding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        //hooks
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        navTool =  findViewById(R.id.Profiletoolbar);
        servicehome = findViewById(R.id.servicesHome);

        appliance = findViewById(R.id.Apliance);
        carpentry = findViewById(R.id.Carpentry);
        electrical = findViewById(R.id.Electrical);
        plumbing = findViewById(R.id.Plumbing);
        welding = findViewById(R.id.Welding);


        navigationDrawer();

        servicehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent service = new Intent(Services.this, MainActivity.class);
                startActivity(service);
            }
        });


        //SERVICES
        appliance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent serviceAppliance = new Intent(Services.this, ApplianceRepair.class);
                startActivity(serviceAppliance);
            }
        });

        carpentry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent serviceCarpentry = new Intent(Services.this, Carpentry.class);
                startActivity(serviceCarpentry);
            }
        });

        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent serviceElectrical = new Intent(Services.this, Electrical.class);
                startActivity(serviceElectrical);
            }
        });

        plumbing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent servicePlumbing = new Intent(Services.this, Plumbing.class);
                startActivity(servicePlumbing);
            }
        });

        welding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent serviceWelding = new Intent(Services.this, Welding.class);
                startActivity(serviceWelding);
            }
        });

        //Navigation Menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {


                    case R.id.Home:
                        Intent bahay = new Intent(Services.this, MainActivity.class);
                        startActivity(bahay);
                        break;

                    case R.id.Profile:
                        Intent prof = new Intent(Services.this, Profile.class);
                        startActivity(prof);
                        break;

                    case R.id.likes:
                        Intent like = new Intent(Services.this, Favorites.class);
                        startActivity(like);
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
        navigationView.setCheckedItem(R.id.services);

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