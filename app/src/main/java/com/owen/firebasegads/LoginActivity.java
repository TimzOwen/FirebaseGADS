package com.owen.firebasegads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

    TextView mTvEmail, mTvPassword;
    Button btnLogin;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

        //method to fetch IDS
        collectIds();

        //set onclick listener to respond to the code instructions
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check validation from firebase
                validateUser();
            }
        });
    }
    public void collectIds()
    {
        mTvEmail = findViewById(R.id.etMail);
        mTvPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    //method to login user
    public void validateUser()
    {
        String email = mTvEmail.getText().toString();
        String pass = mTvPassword.getText().toString();

        mAuth.signInWithEmailAndPassword(email,pass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        //login to admnin
                        if(task.isSuccessful){
                            //start an activity or redirect to home page
                    }
                        else{
                            // Toast to a user to input in the credentials again
                        }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        //toast or set Error dialog
                    }
                });

    }
}
