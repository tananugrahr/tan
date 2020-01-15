package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MuseumDigantara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_digantara);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Museum+Pusat+TNI+AU+Dirgantara+Mandala/@-7.7899338,110.4134901,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5798c3e7637b:0x505f1eb0bb91bcf4!8m2!3d-7.7899338!4d110.4156788?hl=id-ID"));
        startActivity(intent);
    }

}
