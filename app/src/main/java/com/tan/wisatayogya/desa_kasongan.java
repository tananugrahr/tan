package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_kasongan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_kasongan);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Desa+Wisata+Gerabah+Kasongan/@-7.8454939,110.3356555,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a562ec443e609:0xdd8f6df4e1b97dfc!8m2!3d-7.8454939!4d110.3378442"));
        startActivity(intent);
    }
}

