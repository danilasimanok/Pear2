package com.example.test.minigamespear;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;


public class EvolvingActivity extends AppCompatActivity implements MyEventsListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evolving);

        PauseActivity.listeners.add(this);

        EvolvingView ev=(EvolvingView)findViewById(R.id.evolvingView);
        ev.addListener(this);

        Button pauseButton =(Button)findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EvolvingActivity.this, PauseActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void update(String myEventMessage){
            /*AlertDialog.Builder builder = new AlertDialog.Builder(EvolvingActivity.this);
            builder.setTitle("You win!")
                    .setMessage("Congratulations!")
                    .setIcon(R.mipmap.crab)
                    .setCancelable(false)
                    .setNegativeButton("ОК",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
            AlertDialog alert = builder.create();
            alert.show();*/
        finish();
    }
}
