package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_bahari_yogyakarta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_bahari_yogyakarta);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Museum+Bahari+-+Jogja/@-7.8011973,110.3471076,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a57f48f265911:0x4373216e201026a8!8m2!3d-7.8011973!4d110.3492963?hl=id-ID"));
        startActivity(intent);
    }

}
