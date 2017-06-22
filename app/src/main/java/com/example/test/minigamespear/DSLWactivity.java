package com.example.test.minigamespear;
// test 2
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by user on 6/20/17.
 */

public class DSLWactivity extends AppCompatActivity {

    private int c = 0;
    private int cold = 0;
    private final String tag = "dslw";
    private String word;
    int[] array = new int[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dslw_activity);

        for(int i=0;i<100;i++){
            array[i] = i;
        }


        Random rnd = new Random();
        for(int i=array.length-1;i>0;i--){
            int index = rnd.nextInt(i+1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }


        Resources res = getResources();
        final TypedArray words = res.obtainTypedArray(R.array.words);
        final Chronometer chrono = (Chronometer)findViewById(R.id.chrono);
        Button dSLW =(Button)findViewById(R.id.DSLW);
        Button menu = (Button)findViewById(R.id.menu);
        final TextView textView = (TextView) findViewById(R.id.textView);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DSLWactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        dSLW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long elapsedMillis = SystemClock.elapsedRealtime()
                        - chrono.getBase();
                if (c == 0){
                    chrono.setBase(SystemClock.elapsedRealtime());
                    chrono.start();
                }
                if (c == 100 | elapsedMillis > 60000 ) {
                    chrono.stop();
                    if (cold != 0) {
                        textView.setText("Ход следующей команды, ваш счёт: " + c + ", ваше время: " + (int) (elapsedMillis / 1000) + " секунд(ы), счёт предыдущей команды: "+cold);
                    }
                    else {
                        textView.setText("Ход следующей команды, ваш счёт: " + c + ", ваше время: " + (int) (elapsedMillis / 1000) + " секунд(ы)");
                    }

                    cold = c;
                    c = 0;

                }

                else {
                    Log.d(tag, "clicked");
                    word = words.getString(array[c]);
                    textView.setText(word);
                    c++;
                }
            }


        });
    }
}
