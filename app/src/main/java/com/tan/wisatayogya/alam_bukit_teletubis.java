package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_bukit_teletubis extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_bukit_teletubis);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Bukit+Teletubbies/@-7.8181275,110.5095753,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5025125dea7d:0x18dabce7ce0729c4!8m2!3d-7.8181275!4d110.511764?hl=id-ID"));
        startActivity(intent);
    }

}
