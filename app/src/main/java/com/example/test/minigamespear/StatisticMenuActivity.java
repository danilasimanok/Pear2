package com.example.test.minigamespear;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 6/21/17.
 */

public class StatisticMenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistic_menu_for_eyc);
        TextView textView=(TextView)findViewById(R.id.editText);
        int[]stats=EvolvingView.player.getStats();
        String s="Мой размер="+stats[0]+"\n"+"Мои очки "+stats[1]+"/"+stats[2];
        textView.setText(s);
    }
}