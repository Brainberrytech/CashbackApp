package com.example.horizontalrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WELCOME extends AppCompatActivity {
    TextView login,signup,skiptobrowse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        login=findViewById(R.id.login);
        signup=findViewById(R.id.signUp);
        skiptobrowse = findViewById(R.id.SkipToBrowse);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WELCOME.this, LoginActivity.class);
                startActivity(intent);
                finish();

            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WELCOME.this, SignUp.class);
                startActivity(intent);
                finish();
            }
        });



        skiptobrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WELCOME.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
