package com.example.test.minigamespear;

import android.content.ClipData;
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
import android.widget.Toast;

public class GallowsActivity extends AppCompatActivity {

    private final String tag="tagGallows";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(tag, "created");
        setContentView(R.layout.activity_gallows);

        final String[] s = new String[1];

        Button button1 = (Button) findViewById(R.id.button1);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button1= (Button) findViewById(R.id.button1);
                button1.setVisibility(View.INVISIBLE);
                s[0] ="a";
            }
        };
        Button button2 = (Button) findViewById(R.id.button2);
        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button2= (Button) findViewById(R.id.button2);
                button2.setVisibility(View.INVISIBLE);
            }
        };
        Button button3 = (Button) findViewById(R.id.button3);
        View.OnClickListener listener3 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button3= (Button) findViewById(R.id.button3);
                button3.setVisibility(View.INVISIBLE);
            }
        };
        Button button4 = (Button) findViewById(R.id.button4);
        View.OnClickListener listener4= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button4= (Button) findViewById(R.id.button4);
                button4.setVisibility(View.INVISIBLE);
            }
        };
        Button button5 = (Button) findViewById(R.id.button5);
        View.OnClickListener listener5 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button5= (Button) findViewById(R.id.button5);
                button5.setVisibility(View.INVISIBLE);
            }
        };
        Button button6 = (Button) findViewById(R.id.button6);
        View.OnClickListener listener6 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button6= (Button) findViewById(R.id.button6);
                button6.setVisibility(View.INVISIBLE);
            }
        };
        Button button7 = (Button) findViewById(R.id.button7);
        View.OnClickListener listener7 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button7= (Button) findViewById(R.id.button7);
                button7.setVisibility(View.INVISIBLE);
            }
        };
        Button button8 = (Button) findViewById(R.id.button8);
        View.OnClickListener listener8 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button8= (Button) findViewById(R.id.button8);
                button8.setVisibility(View.INVISIBLE);
            }
        };
        Button button9 = (Button) findViewById(R.id.button9);
        View.OnClickListener listener9 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button9= (Button) findViewById(R.id.button9);
                button9.setVisibility(View.INVISIBLE);
            }
        };
        Button button10 = (Button) findViewById(R.id.button10);
        View.OnClickListener listener10 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button10= (Button) findViewById(R.id.button10);
                button10.setVisibility(View.INVISIBLE);
            }
        };
        Button button11 = (Button) findViewById(R.id.button11);
        View.OnClickListener listener11 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button11= (Button) findViewById(R.id.button11);
                button11.setVisibility(View.INVISIBLE);
            }
        };
        Button button12 = (Button) findViewById(R.id.button12);
        View.OnClickListener listener12 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button12= (Button) findViewById(R.id.button12);
                button12.setVisibility(View.INVISIBLE);
            }
        };
        Button button13 = (Button) findViewById(R.id.button13);
        View.OnClickListener listener13 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button13= (Button) findViewById(R.id.button13);
                button13.setVisibility(View.INVISIBLE);
            }
        };
        Button button14 = (Button) findViewById(R.id.button14);
        View.OnClickListener listener14 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button14= (Button) findViewById(R.id.button14);
                button14.setVisibility(View.INVISIBLE);
            }
        };
        Button button15 = (Button) findViewById(R.id.button15);
        View.OnClickListener listener15 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button15= (Button) findViewById(R.id.button15);
                button15.setVisibility(View.INVISIBLE);
            }
        };
        Button button16 = (Button) findViewById(R.id.button16);
        View.OnClickListener listener16 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button16= (Button) findViewById(R.id.button16);
                button16.setVisibility(View.INVISIBLE);
            }
        };
        Button button17 = (Button) findViewById(R.id.button17);
        View.OnClickListener listener17 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button17= (Button) findViewById(R.id.button17);
                button17.setVisibility(View.INVISIBLE);
            }
        };
        Button button18 = (Button) findViewById(R.id.button18);
        View.OnClickListener listener18 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button18= (Button) findViewById(R.id.button18);
                button18.setVisibility(View.INVISIBLE);
            }
        };
        Button button19 = (Button) findViewById(R.id.button19);
        View.OnClickListener listener19 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button19= (Button) findViewById(R.id.button19);
                button19.setVisibility(View.INVISIBLE);
            }
        };
        Button button20 = (Button) findViewById(R.id.button20);
        View.OnClickListener listener20 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button20=(Button) findViewById(R.id.button20);
                button20.setVisibility(View.INVISIBLE);
            }
        };
        Button button21 = (Button) findViewById(R.id.button21);
        View.OnClickListener listener21 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button21= (Button) findViewById(R.id.button21);
                button21.setVisibility(View.INVISIBLE);
            }
        };
        Button button22 = (Button) findViewById(R.id.button22);
        View.OnClickListener listener22 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button22= (Button) findViewById(R.id.button22);
                button22.setVisibility(View.INVISIBLE);
            }
        };
        Button button23 = (Button) findViewById(R.id.button23);
        View.OnClickListener listener23 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button23= (Button) findViewById(R.id.button23);
                button23.setVisibility(View.INVISIBLE);
            }
        };
        Button button24 = (Button) findViewById(R.id.button24);
        View.OnClickListener listener24 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button24= (Button) findViewById(R.id.button24);
                button24.setVisibility(View.INVISIBLE);
            }
        };
        Button button25 = (Button) findViewById(R.id.button25);
        View.OnClickListener listener25 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button25= (Button) findViewById(R.id.button25);
                button25.setVisibility(View.INVISIBLE);
            }
        };
        Button button26 = (Button) findViewById(R.id.button26);
        View.OnClickListener listener26 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button26= (Button) findViewById(R.id.button26);
                button26.setVisibility(View.INVISIBLE);
            }
        };
        Button button27 = (Button) findViewById(R.id.button27);
        View.OnClickListener listener27 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button27= (Button) findViewById(R.id.button27);
                button27.setVisibility(View.INVISIBLE);
            }
        };
        Button button28 = (Button) findViewById(R.id.button28);
        View.OnClickListener listener28 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button28= (Button) findViewById(R.id.button28);
                button28.setVisibility(View.INVISIBLE);
            }
        };
        Button button29 = (Button) findViewById(R.id.button29);
        View.OnClickListener listener29 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button29= (Button) findViewById(R.id.button29);
                button29.setVisibility(View.INVISIBLE);
            }
        };
        Button button30 = (Button) findViewById(R.id.button30);
        View.OnClickListener listener30 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button30= (Button) findViewById(R.id.button30);
                button30.setVisibility(View.INVISIBLE);
            }
        };
        Button button31 = (Button) findViewById(R.id.button31);
        View.OnClickListener listener31 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button31= (Button) findViewById(R.id.button31);
                button31.setVisibility(View.INVISIBLE);
            }
        };
        Button button32 = (Button) findViewById(R.id.button32);
        View.OnClickListener listener32 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button32= (Button) findViewById(R.id.button32);
                button32.setVisibility(View.INVISIBLE);
            }
        };
        Button button33 = (Button) findViewById(R.id.button33);
        View.OnClickListener listener33 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button33= (Button) findViewById(R.id.button33);
                button33.setVisibility(View.INVISIBLE);
            }
        };
        button1.setOnClickListener(listener1);
        button2.setOnClickListener(listener2);
        button3.setOnClickListener(listener3);
        button4.setOnClickListener(listener4);
        button5.setOnClickListener(listener5);
        button6.setOnClickListener(listener6);
        button7.setOnClickListener(listener7);
        button8.setOnClickListener(listener8);
        button9.setOnClickListener(listener9);
        button10.setOnClickListener(listener10);
        button11.setOnClickListener(listener11);
        button12.setOnClickListener(listener12);
        button13.setOnClickListener(listener13);
        button14.setOnClickListener(listener14);
        button15.setOnClickListener(listener15);
        button16.setOnClickListener(listener16);
        button17.setOnClickListener(listener17);
        button18.setOnClickListener(listener18);
        button19.setOnClickListener(listener19);
        button20.setOnClickListener(listener20);
        button21.setOnClickListener(listener21);
        button22.setOnClickListener(listener22);
        button23.setOnClickListener(listener23);
        button24.setOnClickListener(listener24);
        button25.setOnClickListener(listener25);
        button26.setOnClickListener(listener26);
        button27.setOnClickListener(listener27);
        button28.setOnClickListener(listener28);
        button29.setOnClickListener(listener29);
        button30.setOnClickListener(listener30);
        button31.setOnClickListener(listener31);
        button32.setOnClickListener(listener32);
        button33.setOnClickListener(listener33);



        Button buttonn = (Button) findViewById(R.id.buttonMenu);
        View.OnClickListener listenerr = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GallowsActivity.this, MainActivity.class);
                //intent.putExtra(data_id,0);
                startActivity(intent);
            }
        };
        buttonn.setOnClickListener(listenerr);


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