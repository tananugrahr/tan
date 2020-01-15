package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_jungwok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_jungwok);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Jungwok/@-8.1980306,110.7102276,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7bc0a9d67c5ee7:0x653b2d4177a1d43d!8m2!3d-8.197822!4d110.7123397?hl=id-ID"));
        startActivity(intent);
    }

}
