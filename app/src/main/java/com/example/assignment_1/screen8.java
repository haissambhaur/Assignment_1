package com.example.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class screen8 extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen8);
        bottomNavigationView = findViewById(R.id.bottom_navigation_bar);
        bottomNavigationView.setSelectedItemId(R.id.chatItem);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                int id = item.getItemId();
                if(id==R.id.homeItem) {
                    Intent intent = new Intent(screen8.this,screen5.class);
                    startActivity(intent);
                    finish();
                    return true;
                } else if (id==R.id.searchItem) {
                    Intent intent = new Intent(screen8.this,screen6.class);
                    startActivity(intent);
                    finish();
                    return true;
                } else if (id==R.id.addItem) {
                    Intent intent = new Intent(screen8.this,screen12.class);
                    startActivity(intent);
                    finish();
                    return true;

                } else if (id==R.id.chatItem) {
                    Intent intent = new Intent(screen8.this,screen8.class);
                    startActivity(intent);
                    finish();
                    return true;

                } else if (id==R.id.profileItem) {
                    Intent intent = new Intent(screen8.this,screen10.class);
                    startActivity(intent);
                    finish();
                    return true;

                }
                return false;
            }
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.chat_arrw_sc8);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an intent to start the new activity
                Intent intent = new Intent(screen8.this, screen9.class);

                // Start the new activity
                startActivity(intent);
            }
        });
    }
}