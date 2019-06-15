package com.example.horizontalrecyclerview;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WELCOME extends FragmentActivity {
    Button sign_in,skip_to_browse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        sign_in=findViewById(R.id.signin);
        skip_to_browse=findViewById(R.id.skip_to_browse);
        sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sign_in=new Intent(WELCOME.this,LoginActivity.class);
                startActivity(sign_in);
            }
        });
        skip_to_browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skip_to_browse=new Intent(WELCOME.this,MainActivity.class);
                startActivity(skip_to_browse);
            }
        });
    }
}
