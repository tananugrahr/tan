package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_watulawang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_watulawang);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Wisata+Alam+Watu+Lawang/@-7.9378555,110.4160094,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a54a2771fcf29:0xe0ef7ca1d783f19e!8m2!3d-7.9378555!4d110.4181981?hl=id-ID"));
        startActivity(intent);
    }

}
