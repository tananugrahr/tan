package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_kebun_teh_nglinggo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_kebun_teh_nglinggo);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Kebun+Teh+Nglinggo/@-7.647054,110.1392812,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7af2aa21b914df:0x99633b0e828534dc!8m2!3d-7.647054!4d110.1414699?hl=id-ID"));
        startActivity(intent);
    }

}
