package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_kampung_edukasi_lumbung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_kampung_edukasi_lumbung);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Kawasan+Wisata+Watu+Lumbung/@-7.9924379,110.3155893,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7b006fe7ae8e1d:0x263711d02b36d1b6!8m2!3d-7.9924379!4d110.317778?hl=id-ID"));
        startActivity(intent);
    }

}
