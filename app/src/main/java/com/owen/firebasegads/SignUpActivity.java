package com.owen.firebasegads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private EditText etPassword,etEmail;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Ids method
        fetchIds();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Register to firebase.
            }
        });

    }

    //create method to collect IDs
    public void fetchIds()
    {
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPass);
        btnSignUp = findViewById(R.id.btnCreate);
    }
}