package com.example.darren1.hms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CCTVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cctv);

        findAllViewsById();

    }



    private void findAllViewsById(){

        Button back = (Button) findViewById(R.id.backButton);
        back.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                Intent intent = new Intent(CCTVActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
