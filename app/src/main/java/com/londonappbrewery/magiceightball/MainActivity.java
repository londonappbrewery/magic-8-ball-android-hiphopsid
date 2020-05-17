package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askbutton;

        askbutton = (Button) findViewById(R.id.askbutton);
        final ImageView magicBall= (ImageView)findViewById(R.id.magicBall);

        final int[] ballArray={R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        askbutton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Log.d("Ball","The button has been pressed");

                Random randomgenerator=new Random();
                int number=randomgenerator.nextInt(5);

                magicBall.setImageResource(ballArray[number]);

                Log.d("Ball","Decision is"+ number);

            }
        });
    }


}
