package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_parangndok extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_parangndok);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Parangendog/@-8.0299995,110.3266571,14z/data=!3m1!4b1!4m5!3m4!1s0x2e7baa11ecec97ed:0x5dbd7de709ccd30e!8m2!3d-8.03!4d110.3441667?hl=id-ID"));

        startActivity(intent);
    }

}
