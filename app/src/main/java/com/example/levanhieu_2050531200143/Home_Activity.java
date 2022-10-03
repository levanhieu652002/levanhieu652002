package com.example.levanhieu_2050531200143;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navigationView = findViewById(R.id.button_nav);
        navigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case    R.id.action_home:
                        Intent myintent = new Intent(Home_Activity.this,MainActivity.class);
                        startActivity(myintent);
                        Toast.makeText(Home_Activity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case    R.id.action_Favorite:
                        Intent intent = new Intent(Home_Activity.this,MainActivity2.class);
                        startActivity(intent);
                        Toast.makeText(Home_Activity.this, "Favorite", Toast.LENGTH_SHORT).show();
                        break;
                    case    R.id.action_my_page:
                        Intent hieu = new Intent(Home_Activity.this, Profile_Activity.class);
                        startActivity(hieu);
                        Toast.makeText(Home_Activity.this, "my_page", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }
}