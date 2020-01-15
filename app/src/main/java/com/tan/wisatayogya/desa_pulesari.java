package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_pulesari extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_pulesari);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Desa+Wisata+Pulesari/@-7.6258806,110.3695093,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a607be3e2fd29:0x1bf37c8ecf4f712d!8m2!3d-7.6258806!4d110.371698"));
        startActivity(intent);
    }
}
