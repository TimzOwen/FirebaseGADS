package com.owen.firebasegads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView mTvEmail, mTvPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //method to fetch IDS
        collectIds();

        //set onclick listener to respond to the code instructions
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check validation from firebase
            }
        });
    }
    public void collectIds()
    {
        mTvEmail = findViewById(R.id.etMail);
        mTvPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }
}