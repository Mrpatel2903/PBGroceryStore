package com.example.pbgrocerystore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private EditText emailID, passwordID;
    private TextView forgetID, NewAccountID;
    private Button LoginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);

        emailID= findViewById(R.id.emailID);
        passwordID = findViewById(R.id.passwordID);
        forgetID = findViewById(R.id.forgetID);
        NewAccountID = findViewById(R.id.NewAccountID);
        LoginBtn = findViewById(R.id.LoginBtn);

        NewAccountID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, RegisterUserActivity.class));
            }
        });

       forgetID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, ForgetPasswordActivity.class));
            }
        });
    }
}