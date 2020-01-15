package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_Indische_Koffie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe__indische__koffie);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Indische+Koffie/@-7.8822112,110.3317923,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a55ffacd1d581:0xbbf5e754bdd86c78!8m2!3d-7.8822112!4d110.333981?hl=id-ID"));
        startActivity(intent);
    }

}
