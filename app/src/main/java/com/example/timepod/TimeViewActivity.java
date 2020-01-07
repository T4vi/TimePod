package com.example.timepod;


import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.transition.Explode;
import android.transition.Fade;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class TimeViewActivity extends AppCompatActivity implements Animation.AnimationListener {

    Animation moveRight, moveLeft, fadeInGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        getWindow().setEnterTransition(new Fade());
        getWindow().setExitTransition(new Explode());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeview);



        String[] strings = getTimeStrings();

        TextView tv1 = findViewById(R.id.textView_times1);
        TextView tv2 = findViewById(R.id.textView_times2);
        TextView tv3 = findViewById(R.id.textView_times3);
        TextView tv4 = findViewById(R.id.textView_times4);
        TextView tv5 = findViewById(R.id.textView_times5);
        TextView tv6 = findViewById(R.id.textView_times6);
        TextView tv7 = findViewById(R.id.textView_times7);
        TextView tv8 = findViewById(R.id.textView_times8);
        TextView tv9 = findViewById(R.id.textView_times9);
        TextView tv10 = findViewById(R.id.textView_times10);
        TextView tv11 = findViewById(R.id.textView_times11);
        TextView tv12 = findViewById(R.id.textView_times12);
        TextView tv13 = findViewById(R.id.textView_times13);
        TextView tv14 = findViewById(R.id.textView_times14);
        TextView tv15 = findViewById(R.id.textView_times15);
        TextView tv16 = findViewById(R.id.textView_times16);
        TextView tv17 = findViewById(R.id.textView_times17);

        tv1.setText(strings[0]);
        tv2.setText(strings[1]);
        tv3.setText(strings[2]);
        tv4.setText(strings[3]);
        tv5.setText(strings[4]);
        tv6.setText(strings[5]);
        tv7.setText(strings[6]);
        tv8.setText(strings[7]);
        tv9.setText(strings[8]);
        tv10.setText(strings[9]);
        tv11.setText(strings[10]);
        tv12.setText(strings[11]);
        tv13.setText(strings[12]);
        tv14.setText(strings[13]);
        tv15.setText(strings[14]);
        tv16.setText(strings[15]);
        tv17.setText(strings[16]);


        moveRight = AnimationUtils.loadAnimation(this, R.anim.moveright);
        moveRight.setAnimationListener(this);
        moveLeft = AnimationUtils.loadAnimation(this, R.anim.moveleft);
        moveLeft.setAnimationListener(this);
        fadeInGreen = AnimationUtils.loadAnimation(this, R.anim.fadeingreen);
        fadeInGreen.setAnimationListener(this);


        tv1.startAnimation(moveRight);
        tv2.startAnimation(moveRight);
        tv3.startAnimation(moveRight);
        tv4.startAnimation(moveLeft);
        tv5.startAnimation(fadeInGreen);
        tv6.startAnimation(moveLeft);
        tv7.startAnimation(moveRight);
        tv8.startAnimation(moveRight);
        tv9.startAnimation(moveRight);
        tv10.startAnimation(moveLeft);
        tv11.startAnimation(moveLeft);
        tv12.startAnimation(moveLeft);
        tv13.startAnimation(moveLeft);
        tv14.startAnimation(moveLeft);
        tv15.startAnimation(moveLeft);
        tv16.startAnimation(moveRight);
        tv17.startAnimation(moveRight);

    }




    private String[]getTimeStrings() {
        String[] strings = new String[17];

        DateFormat df = new SimpleDateFormat("HH:mm");

        Calendar now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -91);
        strings[0] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -90);
        strings[1] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -89);
        strings[2] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -1);
        strings[3] = df.format(now.getTime());

        now = Calendar.getInstance();
        strings[4] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 1);
        strings[5] = df.format(now.getTime());


        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 89);
        strings[6] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 90);
        strings[7] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 91);
        strings[8] = df.format(now.getTime());


        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -181);
        strings[9] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -180);
        strings[10] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -179);
        strings[11] = df.format(now.getTime());


        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 179);
        strings[12] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 180);
        strings[13] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 181);
        strings[14] = df.format(now.getTime());


        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, -210);
        strings[15] = df.format(now.getTime());

        now = Calendar.getInstance();
        now.add(Calendar.MINUTE, 210);
        strings[16] = df.format(now.getTime());

        return strings;
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation

        // check for fade in animation
        if (animation == moveRight) {
            Handler handler = new Handler();

            handler.postDelayed(new Runnable() {
                public void run() {
                    finish();
                }
            }, 2500);

        }


    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub
    }
}
