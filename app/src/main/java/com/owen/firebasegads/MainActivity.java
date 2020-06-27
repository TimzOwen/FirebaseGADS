package com.owen.firebasegads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private Button btnLogin, btnSignUP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);
        btnSignUP = findViewById(R.id.btnSignUp);
    }

    @Override
    public void onClick(View view) {
        if (view==btnLogin)
        {
            //start Login Activity
            Intent login = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(login);
        }
        if (view == btnSignUP)
        {
            //start SignUP activity
            startActivity(new Intent(MainActivity.this, SignUpActivity.class));
        }
    }
}