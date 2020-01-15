package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_tanjung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_tanjung);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Donoharjo,+Kec.+Ngaglik,+Kabupaten+Sleman,+Daerah+Istimewa+Yogyakarta/@-7.6972791,110.3641804,14z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5eded5d3c429:0x66ce7989e43ca81b!8m2!3d-7.6895825!4d110.3874808"));
        startActivity(intent);
    }
}

