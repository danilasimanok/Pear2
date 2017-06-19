package com.example.test.minigamespear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

public class GallowsActivity extends AppCompatActivity {

    private final String tag="tagGallows";
    String[] data = {"А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й",
                     "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф",
                     "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я"};
    GridView gvMain;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.tvText, data);
        gvMain = (GridView) findViewById(R.id.gvMain);
        gvMain.setAdapter(adapter);
        adjustGridView();
        GridView gridView = (GridView) findViewById(R.id.gvMain);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GridView gridView = (GridView) findViewById(R.id.gvMain);
                gridView.setVisibility(View.INVISIBLE);
            }
        };
        gridView.setOnClickListener(listener1);
    }

    private void adjustGridView() {
        gvMain.setNumColumns(GridView.AUTO_FIT);
        gvMain.setColumnWidth(90);
        gvMain.setVerticalSpacing(5);
        gvMain.setHorizontalSpacing(5);
        gvMain.setStretchMode(GridView.STRETCH_SPACING_UNIFORM);
    }

    //setOnItemClickListener





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