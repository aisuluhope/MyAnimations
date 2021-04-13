package com.example.myanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.textbutton);
        final TextView txt_animation = findViewById(R.id.textID);
        final ImageView demoImage = findViewById(R.id.demoImage);

        findViewById(R.id.buttonFadeIN).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_in
                ));
            }
        });

        findViewById(R.id.buttonFadeOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.fade_out
                ));
            }
        });





        findViewById(R.id.buttonLeft).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_left
                ));
            }
        });

        findViewById(R.id.buttonRight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_right
                ));
            }
        });


        findViewById(R.id.buttonRotate).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.rotate
                ));
            }
        });


        findViewById(R.id.buttonMove).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                demoImage.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.move
                ));
            }
        });

        findViewById(R.id.textbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_animation.startAnimation(AnimationUtils.loadAnimation(
                        getApplicationContext(),
                        R.anim.slide_right
                ));
            }
        });








    }
}


