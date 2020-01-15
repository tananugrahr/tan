package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_le_travail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_le_travail);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Letravail+Coffee/@-7.7637192,110.4057131,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a59975ca4f7d9:0x275c2aeb683bfb41!8m2!3d-7.7637192!4d110.4079018?hl=id-ID"));
        startActivity(intent);
    }

}
