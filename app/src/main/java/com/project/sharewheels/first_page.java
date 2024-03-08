package com.project.sharewheels;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class first_page extends AppCompatActivity {

    //private final int first_page_display = 10;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.first);

       new Handler().postDelayed(() -> {
                   Intent mainIntent = new Intent(first_page.this , MainActivity.class);
                   first_page.this.startActivity(mainIntent);
                   first_page.this.finish();
               }, 1000 );

   }
}
