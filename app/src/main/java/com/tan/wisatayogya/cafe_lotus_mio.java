package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_lotus_mio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_lotus_mio);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Lotus+Mio/@-7.8184459,110.3613711,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a57bda6fd4ac3:0xaa769f023baea98c!8m2!3d-7.8184459!4d110.3635598?hl=id-ID"));
        startActivity(intent);
    }

}
