package com.example.test.minigamespear;

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

        for(int i=0;i<100;i++){
            Log.d(tag,array[i]+"");
        }


        Resources res = getResources();
        final TypedArray words = res.obtainTypedArray(R.array.words);
        final Chronometer chrono = (Chronometer)findViewById(R.id.chrono);
        Button dSLW =(Button)findViewById(R.id.DSLW);
        final TextView textView = (TextView) findViewById(R.id.textView);
        dSLW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long elapsedMillis = SystemClock.elapsedRealtime()
                        - chrono.getBase();
                Log.d(tag,"clicked");
                if (c == 0){
                    chrono.start();
                }
                if (c == 100 | elapsedMillis > 60000 ) {
                    chrono.stop();
                    textView.setText("Ход следующего игрока, ваш счёт: " +c+", ваше время: "+(int)(elapsedMillis/1000) + " секунд(ы)");
                    c = 0;
                    chrono.setBase(SystemClock.elapsedRealtime());
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
