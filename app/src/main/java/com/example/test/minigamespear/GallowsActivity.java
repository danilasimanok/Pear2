package com.example.test.minigamespear;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class GallowsActivity extends AppCompatActivity {

    private String word;
    private int numberword;
    private String theme;
    private int lifes = 7;

    private static final String tag = "tagGallows";
    String[] data = {"Й", "Ц", "У", "К", "Е", "Н", "Г", "Ш", "Щ", "З", "Х",
            "Ф", "Ы", "В", "А", "П", "Р", "О", "Л", "Д", "Ж", "Э",
            "Я", "Ч", "С", "М", "И", "Т", "Ь", "Б", "Ю", "Ъ", "Ё"};
    boolean[] statusarr;
    GridView gvMain;
    String letter = new String();
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

        try {
            word = wordChoose();
            theme = themeChoose(numberword);
            statusarr = new boolean[word.length()];
        } catch (IOException e) {
            e.printStackTrace();
        }
        final TextView textView3 = (TextView) findViewById(R.id.textViewTheme);
        textView3.setText("Тема: "+theme);

        final TextView textView = (TextView) findViewById(R.id.textViewWord);
        String vspom = "";
        for (int i = 0; i < word.length(); i++) {
            vspom += "_ ";
        }
        textView.setText(vspom);
        //final ImageView imageView=(ImageView) findViewById(R.id.imageView3);
        //imageView.setVisibility(View.INVISIBLE);



        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();

        gvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                view.setVisibility(View.INVISIBLE);
                letter = data[position];
                //Log.d(tag, letter);
                if (word.contains(letter)) {
                    TextView textView = (TextView) findViewById(R.id.textViewWord);
                    String vspom = new String();
                    for (int i = 0; i < word.length(); i++)
                        if (word.substring(i, i + 1).equals(letter))
                            statusarr[i] = true;
                    for (int i = 0; i < word.length(); i++)
                        if (statusarr[i])
                            vspom += word.substring(i, i + 1) + " ";
                        else
                            vspom += "_ ";
                    textView.setText(vspom);
                } else {
                    lifes--;
                    final ImageView imageView=(ImageView) findViewById(R.id.imageView3);
                    if (lifes==6)
                        imageView.setImageResource(R.drawable.i2);
                    if (lifes==5)
                        imageView.setImageResource(R.drawable.i3);
                    if (lifes==4)
                        imageView.setImageResource(R.drawable.i4);
                    if (lifes==3)
                        imageView.setImageResource(R.drawable.i5);
                    if (lifes==2)
                        imageView.setImageResource(R.drawable.i6);
                    if (lifes==1)
                        imageView.setImageResource(R.drawable.i7);
                    if (lifes==0)
                        imageView.setImageResource(R.drawable.i8);


                }
                boolean uslovie = true;
                for (boolean vspom1 : statusarr)
                    if (uslovie)
                        uslovie = vspom1;
                if (uslovie) {
                    textView3.setText("Вы выиграли!");
                    gvMain.setVisibility(View.INVISIBLE);
                }
                if (lifes == 0) {
                    textView3.setText("Вы проиграли!");
                    gvMain.setVisibility(View.INVISIBLE);
                    String word1 = new String();
                    for (int i = 0; i < word.length(); i++)
                        word1 += word.substring(i, i + 1) + " ";

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

    private String themeChoose(int number) throws IOException {
        String result = "";
        InputStream inputstream = getResources().openRawResource(R.raw.themes);
        Reader inputStreamReader = new InputStreamReader(inputstream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        result += line+" ";
        while (line != null) {
            line = bufferedReader.readLine();
            if (line != null) {
                result += line+" ";
            }
        }
        inputstream.close();
        result=result.substring(1);
        String[] sarr=result.split(" ");
        Log.d(tag, sarr[number]);
        return sarr[number];
    }
    private String wordChoose() throws IOException {
        Random rnd = new Random();
        String result = "";
        InputStream inputstream = getResources().openRawResource(R.raw.dictionary);
        Reader inputStreamReader = new InputStreamReader(inputstream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        result += line+" ";
        while (line != null) {
            line = bufferedReader.readLine();
            if (line != null) {
                result += line+" ";
            }
        }
        inputstream.close();
        result=result.substring(1);
        String[] sarr=result.split(" ");
        int number = rnd.nextInt(sarr.length);
        //Log.d(tag, result);
        Log.d(tag, sarr[number]);
        numberword=number;
        return sarr[number];
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