package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_pentingsari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_pentingsari);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Kantor+Desa+Wisata+Pentingsari/@-7.6429913,110.4274673,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5de3a525c159:0xf67c163f17bf42f9!8m2!3d-7.6429913!4d110.429656"));
        startActivity(intent);
    }

}

