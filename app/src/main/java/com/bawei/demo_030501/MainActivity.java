package com.bawei.demo_030501;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView iv;
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = findViewById(R.id.bt);
        iv = findViewById(R.id.iv);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator translationY = ObjectAnimator.ofFloat(iv, "translationY", 0, 750);
                translationY.setDuration(2000);
                translationY.setInterpolator(new AccelerateDecelerateInterpolator());

                translationY.start();
            }
        });
    }
}
