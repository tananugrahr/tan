package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_kaki_langit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_kaki_langit);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Desa+Wisata+Kaki+Langit/@-7.9317375,110.4198249,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a549c2170afef:0xfc9f151d8c9d6e87!8m2!3d-7.9317375!4d110.4220136"));
        startActivity(intent);
    }
}
