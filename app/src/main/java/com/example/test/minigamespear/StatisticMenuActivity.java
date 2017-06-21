package com.example.test.minigamespear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 6/21/17.
 */

public class StatisticMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistic_menu_for_eyc);

        Button eYC =(Button)findViewById(R.id.button1);
        eYC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button= (Button) v;
                button.setText("Your size="+Player.size);
            }
        });
    }
}