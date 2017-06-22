package com.example.test.minigamespear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.LinkedList;

/**
 * Created by user on 6/22/17.
 */

public class PauseActivity extends AppCompatActivity implements MyEventsCreator{
    static LinkedList<MyEventsListener>listeners=new LinkedList<>();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause_activiy);

        Button pointButton =(Button)findViewById(R.id.point_button);
        pointButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PauseActivity.this, StatisticMenuActivity.class);
                /*int[]stats=EvolvingView.player.getStats();
                intent.putExtra("key",stats[0]+" "+stats[1]+" "+stats[2]);*/
                startActivity(intent);
            }
        });

        Button BackToMenuButton =(Button)findViewById(R.id.backToMenuButton);
        BackToMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PauseActivity.this, EYCmenu.class);
                startActivity(intent);

                makeEvent("");

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

    @Override
    public void makeEvent(String myEventMessage) {
        for(MyEventsListener listener:listeners)listener.update(myEventMessage);
    }

    @Override
    public void addListener(MyEventsListener listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(MyEventsListener listener) {
        listeners.remove(listener);
    }
}
