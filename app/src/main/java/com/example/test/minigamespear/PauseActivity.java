package com.example.test.minigamespear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 6/22/17.
 */

public class PauseActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause_activiy);

        Button playButton =(Button)findViewById(R.id.button556);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PauseActivity.this, StatisticMenuActivity.class);
                startActivity(intent);
            }
        });

        Button BackToMenuButton =(Button)findViewById(R.id.backToMenuButton);
        BackToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PauseActivity.this, EYCmenu.class);
                startActivity(intent);
                finish();
            }
        });

        Button continueButton =(Button)findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PauseActivity.this, EvolvingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
