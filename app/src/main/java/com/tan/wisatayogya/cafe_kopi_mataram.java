package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_kopi_mataram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_kopi_mataram);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Kedai+Kopi+Mataram/@-7.7929027,110.365312,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a58288fcce757:0x9a88a3369ecfb757!8m2!3d-7.7929027!4d110.3675007?hl=id-ID"));
        startActivity(intent);
    }

}
