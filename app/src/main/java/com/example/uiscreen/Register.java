package com.example.uiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
private EditText username,email;
private Button button;
private String name;
private String mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        username = findViewById(R.id.inputUsername);
        email = findViewById(R.id.inputEmail);
        button = findViewById(R.id.btnRegister);
        TextView btn=findViewById(R.id.alreadyhaveAccount);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Register();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Register.this,Loginactivity.class));
            }
        });
    }
    public void Register()
    {
        name = username.getText().toString().trim();
        mail = email.getText().toString().trim();
        Intent i= new Intent(Register.this,Display.class);
        i.putExtra(Display.USERNAME,name);
        i.putExtra(Display.EMAIL,mail);
        startActivity(i);
    }
}
