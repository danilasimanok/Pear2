package com.example.test.minigamespear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 6/21/17.
 */

public class EYCmenu extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eyc_menu);

        Button playButton =(Button)findViewById(R.id.button55);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EYCmenu.this, EvolvingActivity.class);
                startActivity(intent);
            }
        });

        Button BackTomainMenuButton =(Button)findViewById(R.id.backToMainMenuButton);
        BackTomainMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EYCmenu.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
