package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_goa_cerme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_goa_cerme);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Goa+Cerme/@-7.9794413,110.3781227,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7bab2040c07aff:0x43e34e65c58257b5!8m2!3d-7.9794413!4d110.3803114?hl=id-ID"));
        startActivity(intent);
    }

}
