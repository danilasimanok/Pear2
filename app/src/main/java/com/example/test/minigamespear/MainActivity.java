package com.example.test.minigamespear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button eYC =(Button)findViewById(R.id.EYC);
        eYC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EYCmenu.class);
                startActivity(intent);
            }
        });

        Button dSLW =(Button)findViewById(R.id.DSLW);
        dSLW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, DSLWactivity.class);
                startActivity(intent2);
            }
        });

        Button gall =(Button)findViewById(R.id.Gallows);
        gall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, GallowsActivity.class);
                startActivity(intent3);
            }
        });
    }
}




