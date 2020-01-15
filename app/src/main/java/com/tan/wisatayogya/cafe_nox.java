package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_nox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_nox);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/NOX+Coffee+Boutique/@-7.7577636,110.3794285,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a59ac81dc03ad:0xda74fcc432ca15c1!8m2!3d-7.7577636!4d110.3816172?hl=id-ID"));
        startActivity(intent);
    }

}
