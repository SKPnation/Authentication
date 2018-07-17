package com.example.ayomide.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    Button bSignup;
    EditText etUsername, etEmail, etPassword;
    TextView tvLoginLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        etUsername = findViewById(R.id.etUsername);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        bSignup = findViewById(R.id.bSignup);
        tvLoginLink = findViewById(R.id.tvLoginLink);

        bSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity();
            }
        });

        tvLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });

    }
        public void openActivity(){
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        public void openActivity2(){
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }

}
