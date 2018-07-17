package com.example.ayomide.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button bLogin;
    EditText etEmail, etPassword;
    TextView tvRegisterLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        bLogin = findViewById(R.id.bLogin);
        tvRegisterLink = findViewById(R.id.tvRegisterLink);

        bLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (view.getId() == R.id.bLogin){
                    openActivity();
                }
            }
        });

        tvRegisterLink.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openActivity2();
            }
        });
    }

    public void openActivity(){
        EditText a = findViewById(R.id.etEmail);
        String str = a.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("Email", str);
        startActivity(intent);

        Toast.makeText(this, "Welcome back", Toast.LENGTH_LONG).show();
    }

    public void openActivity2(){
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

}
