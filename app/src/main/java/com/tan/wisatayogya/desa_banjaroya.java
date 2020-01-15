package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_banjaroya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_banjaroya);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Banjaroyo,+Kec.+Kalibawang,+Kabupaten+Kulon+Progo,+Daerah+Istimewa+Yogyakarta/@-7.659695,110.2011624,13z/data=!3m1!4b1!4m5!3m4!1s0x2e7af49fe791ab0b:0x20b601e798312785!8m2!3d-7.6639202!4d110.2296078"));
        startActivity(intent);
    }

}
