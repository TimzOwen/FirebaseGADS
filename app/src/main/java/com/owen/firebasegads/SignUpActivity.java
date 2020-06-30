package com.owen.firebasegads;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUpActivity extends AppCompatActivity {

    private EditText etPassword,etEmail;
    private Button btnSignUp;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //initialize firebase authentication
        mAuth = FirebaseAuth.getInstance();

        //Ids method
        fetchIds();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Register to firebase.
                userRegistration();
            }
        });

    }

    //create method to collect IDs
    public void fetchIds()
    {
        // TODO  Collect ids
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPass);
        btnSignUp = findViewById(R.id.btnCreate);
    }

    //create a method to validate user registration to the database
    public void userRegistration()
    {
        //collect the Email and password inputs
        String email = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        //now push the data to the database by signing up new users
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful())
                        {
                            //put data to db
                        }
                        else
                        {
                            //toast try again
                        }
                    }
                })
        .addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                //Toast Error and catch execption
            }
        });
        
    }
}