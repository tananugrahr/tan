package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_gamplong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_gamplong);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Gamplong+Studio+Alam/@-7.8058145,110.2345392,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7af9ff6dd01d45:0x43db2ec637a30b5d!8m2!3d-7.8058145!4d110.2367279"));
        startActivity(intent);
    }
}
