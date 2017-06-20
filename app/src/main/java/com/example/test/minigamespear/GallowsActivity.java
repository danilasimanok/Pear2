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

public class GallowsActivity extends AppCompatActivity {

    private final String tag="tagGallows";
    private final String word="ВИСЕЛИЦА";
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

        TextView textView = (TextView) findViewById(R.id.textViewWord);
        String vspom = new String();
        for (int i = 0; i < word.length(); i++) {
            vspom += "_";
        }
        textView.setText(vspom);

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
                            vspom+= word.substring(i, i + 1);
                        else
                            vspom+= "_";
                    textView.setText(vspom);
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