package com.project.sharewheels;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private Button rider, pooler ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        ImageView logo = findViewById(R.id.logo);
        rider = (Button) findViewById(R.id.rider) ;
        pooler = (Button) findViewById(R.id.pooler) ;
        rider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Rider_login.class);
                startActivity(intent);
                finish();
                return;

            }
        });

        pooler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , Companion_login.class);
                startActivity(intent);
                finish();
                return;

            }
        });

        Glide.with(getBaseContext())
                .load(R.drawable.car1)
                .into(logo);


    }
}