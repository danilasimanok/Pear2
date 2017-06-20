package com.example.test.minigamespear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    private final String data_id = "data_id";
    private final String tag="tagMain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "created");
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.buttonGal);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GallowsActivity.class);
                //intent.putExtra(data_id,0);dfshdfgh
                startActivity(intent);
            }
        };
        button.setOnClickListener(listener);
    }




    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "destroyed");
    }
}
