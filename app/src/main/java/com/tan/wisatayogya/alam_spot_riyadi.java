package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_spot_riyadi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_spot_riyadi);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Spot+Riyadi/@-7.7692135,110.4999099,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5abf67942d41:0xe1c4e22341138f03!8m2!3d-7.7692135!4d110.5020986?hl=id-ID"));
        startActivity(intent);
    }

}
