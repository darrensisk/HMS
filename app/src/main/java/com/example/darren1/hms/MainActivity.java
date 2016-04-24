package com.example.darren1.hms;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.view.View;


public class MainActivity extends Activity implements OnClickListener{

    private ImageButton lightButton, tvButton, heatButton, alarmButton, fireButton, cctvButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findAllViewsById();
        lightButton.setOnClickListener(this);
        heatButton.setOnClickListener(this);
        tvButton.setOnClickListener(this);
        alarmButton.setOnClickListener(this);
        fireButton.setOnClickListener(this);
        cctvButton.setOnClickListener(this);

    }


    public void findAllViewsById(){

        lightButton = (ImageButton) findViewById(R.id.lightButton);
        tvButton = (ImageButton) findViewById(R.id.tvButton);
        heatButton = (ImageButton) findViewById(R.id.thermoButton);
        alarmButton = (ImageButton) findViewById(R.id.alarmButton);
        fireButton = (ImageButton) findViewById(R.id.fireButton);
        cctvButton = (ImageButton) findViewById(R.id.cameraButton);


    }


   /* public void onClick (View v){
                //Toast.makeText(MainActivity.this,"Clicked!", Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this, HeatActivity.class);
                startActivity(intent);
    }*/

    public void onClick(View view)
    {
        switch(view.getId())
        {
            case R.id.lightButton:
                Intent intent = new Intent(MainActivity.this, LightingActivity.class);
                startActivity(intent);

                break;

            case R.id.thermoButton:
                Intent intent2 = new Intent(MainActivity.this, HeatActivity.class);
                startActivity(intent2);
                break;

            case R.id.tvButton:
                Intent intent3 = new Intent(MainActivity.this, TvActivity.class);
                startActivity(intent3);
                break;

            case R.id.alarmButton:
                Intent intent4 = new Intent(MainActivity.this, AlarmActivity.class);
                startActivity(intent4);
                break;

            case R.id.fireButton:
                Intent intent5 = new Intent(MainActivity.this, FireActivity.class);
                startActivity(intent5);
                break;

            case R.id.cameraButton:
                Intent intent6 = new Intent(MainActivity.this, CCTVActivity.class);
                startActivity(intent6);
                break;


        }
    }





}
