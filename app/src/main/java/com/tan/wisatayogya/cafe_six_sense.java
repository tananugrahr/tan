package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_six_sense extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_six_sense);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Six+Senses+Restaurant/@-7.8174884,110.3602879,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5796389f04d3:0xb60b3b41a3127b2d!8m2!3d-7.8174884!4d110.3624766?hl=id-ID"));
        startActivity(intent);
    }

}
