package com.example.animation_move;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.text);
        anim= AnimationUtils.loadAnimation(this,R.anim.trans);

        text.setAnimation(anim);

    }
}