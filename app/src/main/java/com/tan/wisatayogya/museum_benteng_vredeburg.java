package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_benteng_vredeburg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_benteng_vredeburg);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Museum+Benteng+Vredeburg+Yogyakarta/@-7.8002713,110.3641111,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5788c0b3eecf:0xb9611ce0232a9ff8!8m2!3d-7.8002713!4d110.3662998?hl=id-ID"));
        startActivity(intent);
    }

}
