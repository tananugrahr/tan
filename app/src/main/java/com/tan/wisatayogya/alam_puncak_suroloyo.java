package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_puncak_suroloyo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_puncak_suroloyo);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Puncak+Suroloyo/@-7.6463074,110.1723828,15z/data=!3m1!4b1!4m5!3m4!1s0x2e7af2d144fd0c11:0xb15fc2d3a87b7512!8m2!3d-7.6463076!4d110.1811376?hl=id-ID"));
        startActivity(intent);
    }

}
