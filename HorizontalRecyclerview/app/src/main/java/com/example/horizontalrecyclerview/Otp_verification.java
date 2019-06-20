package com.example.horizontalrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Otp_verification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_verification);
    }

    public void Verify(View view) {
        Intent Home=new Intent(this,MainActivity.class);
        startActivity(Home);
    }
}
