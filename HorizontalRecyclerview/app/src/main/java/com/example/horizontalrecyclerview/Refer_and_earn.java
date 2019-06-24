package com.example.horizontalrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class Refer_and_earn extends AppCompatActivity {
    ImageView refer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer_and_earn);

        refer=findViewById(R.id.imageView);
        Picasso.get().load("https://i.imgur.com/FQdtgRo.png").into(refer);

    }

    /**
     * share button in used to share a offer with any sharing method available in the device
     * for example whatsapp,facebook,gmail,etc.
     * @param view
     */


    public void share(View view) {
        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
        whatsappIntent.setType("text/plain");
        whatsappIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
        try {
            startActivity(Intent.createChooser(whatsappIntent,"Share via"));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this,"Whatsapp not installed",Toast.LENGTH_LONG).show(); }
    }
}
