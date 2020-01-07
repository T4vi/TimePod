package com.example.timepod;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Time;
import android.transition.Explode;
import android.transition.Fade;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);

        getWindow().setExitTransition(new Fade());
        getWindow().setEnterTransition(new Explode());


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button button_sawthis = (Button) findViewById(R.id.button1);
        button_sawthis.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TimeViewActivity.class);

                @SuppressWarnings("unchecked")
                ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this);

                ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());

                //                String time = _getTime();
//                Toast.makeText(getApplicationContext(), "Added " + time + " to your list!", Toast.LENGTH_LONG).show();
            }
        });


        Button button_whoknows = (Button) findViewById(R.id.button2);
        button_whoknows.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Cine stie cu adevarat cine esti tu defapt?", Toast.LENGTH_LONG).show();
            }
        });

        Button button_question = (Button) findViewById(R.id.button3);
        button_question.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Suggest more features", Toast.LENGTH_SHORT).show();
            }
        });

        Button button_showme = (Button) findViewById(R.id.button4);
        button_showme.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Suggest content! (Visuals?)", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, ImageView_Activity.class);
                ActivityOptionsCompat activityOptions = ActivityOptionsCompat.makeBasic();
                ActivityCompat.startActivity(MainActivity.this, intent, activityOptions.toBundle());
            }
        });

    }

    private String _getTime() {
        DateFormat df = new SimpleDateFormat("HH:mm");
        String date = df.format(Calendar.getInstance().getTime());
        return date;
    }

}

// TODO sugestii in app zice yoyo
