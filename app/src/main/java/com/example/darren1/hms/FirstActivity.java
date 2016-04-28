package com.example.darren1.hms;
import android.view.View;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;



public class FirstActivity extends AppCompatActivity {

    private Button loginButton;
    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        loginButton = (Button) findViewById(R.id.login);
        user = (EditText) findViewById(R.id.un);
        pass = (EditText) findViewById(R.id.pw);

        loginButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                String username = user.getText().toString();
                String password = pass.getText().toString();


                if (username.isEmpty()) {
                    user.setBackgroundColor(Color.RED);
                    return;
                } else if (password.isEmpty()) {
                    pass.setBackgroundColor(Color.RED);

                    return;
                }

                startActivity(new Intent(getApplicationContext(), MainActivity.class));

            }
        });

    }

}