package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_bong_kopitiam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_bong_kopitiam);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Bong+Kopitown/@-7.7811498,110.3752394,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5834ab93b82b:0x6963eb30cf34c4d6!8m2!3d-7.7811498!4d110.3774281?hl=id-ID"));
        startActivity(intent);
    }

}
