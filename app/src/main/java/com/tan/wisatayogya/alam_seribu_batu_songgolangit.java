package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_seribu_batu_songgolangit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_seribu_batu_songgolangit);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Seribu+Batu+Songgo+Langit/@-7.9305444,110.4278973,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a531be5da247f:0x51f131c4dc279d01!8m2!3d-7.9305444!4d110.430086?hl=id-ID"));
        startActivity(intent);
    }

}
