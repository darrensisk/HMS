package com.example.darren1.hms;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class CCTVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cctv);

        findAllViewsById();

    }



    private void findAllViewsById(){

        Button back = (Button) findViewById(R.id.backButton);
        final Button test = (Button) findViewById(R.id.testAlarmButton);
        back.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                Intent intent = new Intent(CCTVActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        test.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                test.setBackgroundColor(0xFF00FF00);
                test.setText("Sent");

                new runCam().execute();
            }
        });
    }



    private class runCam extends AsyncTask<Void, Void, Void> {



        @Override
        protected Void doInBackground(Void... params) {
            String URL = "192.168.43.237";
            HttpURLConnection con;
            StringBuffer sb = new StringBuffer();


            try {
                con = (HttpURLConnection) new URL("http://" + URL + "/?query=camera").openConnection();
                con.setRequestMethod("GET");

                BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String nextLine = "";

                while ((nextLine = reader.readLine()) != null){
                    sb.append(nextLine);
                }


            } catch (MalformedURLException e){
                Log.e("ERROR", "MALFORMED URL EXCEPTION OCCURRED ON: " + e.toString());
            } catch (IOException e){
                Log.e("ERROR", "IO EXCEPTION OCCURRED ON: " + e.toString());
            }

            return null;
        }


    }
}
