package com.example.pbgrocerystore;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ForgetPasswordActivity extends AppCompatActivity {

    private ImageButton backBtn;
    private EditText emailID;
    private Button recoverBtn;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        backBtn = findViewById(R.id.backBtn);
        emailID = findViewById(R.id.emailID);
        recoverBtn = findViewById(R.id.recoverBtn);

        backBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



    }
}