package com.example.test.minigamespear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import java.util.Random;

public class GallowsActivity extends AppCompatActivity {

    private final String word=wordChoose();
    private int lifes=8;

    private final String tag="tagGallows";
    String[] data = {"Й", "Ц", "У", "К", "Е", "Н", "Г", "Ш", "Щ", "З", "Х",
                     "Ф", "Ы", "В", "А", "П", "Р", "О", "Л", "Д", "Ж", "Э",
                     "Я", "Ч", "С", "М", "И", "Т", "Ь", "Б", "Ю", "Ъ", "Ё"};
    boolean[] statusarr=new boolean[word.length()];
    GridView gvMain;
    String letter=new String();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "created");
        setContentView(R.layout.activity_gallows);
        Button button2 = (Button) findViewById(R.id.buttonMenu);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GallowsActivity.this, MainActivity.class);
                //intent.putExtra(data_id,0);
                startActivity(intent);
            }
        };
        button2.setOnClickListener(listener2);

        final TextView textView = (TextView) findViewById(R.id.textViewWord);
        String vspom = new String();
        for (int i = 0; i < word.length(); i++) {
            vspom += "_ ";
        }
        textView.setText(vspom);
        final TextView textView1= (TextView) findViewById(R.id.textViewLifes);
        textView1.setText(lifes+ " lifes");


        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();

        gvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setVisibility(View.INVISIBLE);
                letter = data[position];
                Log.d(tag, letter);
                if (word.contains(letter)) {
                    TextView textView = (TextView) findViewById(R.id.textViewWord);
                    String vspom = new String();
                    for (int i = 0; i < word.length(); i++)
                        if (word.substring(i, i + 1).equals(letter))
                            statusarr[i] = true;
                    for (int i=0; i<word.length(); i++)
                        if (statusarr[i])
                            vspom+= word.substring(i, i + 1)+" ";
                        else
                            vspom+= "_ ";
                    textView.setText(vspom);
                }
                else{
                    lifes--;
                    textView1.setText(lifes+ " lifes");
                }
                boolean uslovie=true;
                for (boolean vspom1: statusarr)
                    if (uslovie)
                        uslovie=vspom1;
                if (uslovie) {
                    textView1.setText("Вы выиграли!");
                    gvMain.setVisibility(View.INVISIBLE);
                }
                if (lifes==0){
                    textView1.setText("Вы проиграли!");
                    gvMain.setVisibility(View.INVISIBLE);
                    String word1=new String();
                    for (int i=0; i<word.length(); i++)
                        word1+=word.substring(i,i+1)+" ";

                    textView.setText(word1);
                }
            }
        });
    }

    private void adjustGridView() {
        gvMain.setNumColumns(GridView.AUTO_FIT);
        gvMain.setColumnWidth(90);
        gvMain.setVerticalSpacing(5);
        gvMain.setHorizontalSpacing(5);
        gvMain.setStretchMode(GridView.STRETCH_SPACING_UNIFORM);
    }

    private static String wordChoose(){
        Random rnd = new Random(System.currentTimeMillis());
        int min=1;
        int max=3;
        int number = min + rnd.nextInt(max - min + 1);
        return "ВУВУЗЕЛА";
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