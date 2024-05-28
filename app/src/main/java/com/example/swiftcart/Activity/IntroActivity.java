package com.example.swiftcart.Activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.swiftcart.R;

public class IntroActivity extends AppCompatActivity {
    IntroActivity intro;
    Button buttonLogin, buttonSignup;

    private static IntroActivity inflate(LayoutInflater layoutInflater) {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        intro = IntroActivity.inflate(getLayoutInflater());
        setContentView(R.layout.activity_intro);

        buttonLogin = (Button) findViewById(R.id.loginBtn);
        buttonSignup = (Button) findViewById(R.id.signupBtn);


        setVariable();
    }

    private void setVariable() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        buttonSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
