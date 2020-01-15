package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_kelor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_kelor);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Desa+Wisata+Kelor/@-7.6410258,110.3600907,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5fdcdf4da0af:0xa4e182adcb39c2a6!8m2!3d-7.6410258!4d110.3622794"));
        startActivity(intent);
    }

}
