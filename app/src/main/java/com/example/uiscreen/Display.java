package com.example.uiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Display extends AppCompatActivity {
public static final String USERNAME = "NAME";
    public static final String EMAIL = "MAIL";
    private TextView username,email;
    private String name;
    private String mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        username = findViewById(R.id.uname);
        email = findViewById(R.id.mail);
        Intent i= getIntent();
        name = i.getStringExtra(USERNAME);
        mail = i.getStringExtra(EMAIL);

        username.setText("HELLO!!!   "+name);
        email.setText("YOUR MAIL ID IS  " +mail);
    }
}