package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_sadranan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_sadranan);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Sadranan+Beach+,+Gunung+Kidul+Regency,+Special+Region+of+Yogyakarta/@-8.145668,110.6022027,17z/data=!3m1!4b1!4m8!1m2!2m1!1spantai+sadranan!3m4!1s0x2e7bba28b2555555:0xc61f936656e49be7!8m2!3d-8.145668!4d110.6043914?hl=id-ID"));

        startActivity(intent);
    }

}
