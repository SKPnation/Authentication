package com.example.ayomide.authentication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     TextView bLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String email = getIntent().getStringExtra("Email");

        TextView tv = findViewById(R.id.tvEmail);
        tv.setText(email);

        bLogout = findViewById(R.id.bLogout);

        bLogout.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openActivity();
            }
        });
    }

    public void openActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
