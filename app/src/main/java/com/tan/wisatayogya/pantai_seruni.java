package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_seruni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_seruni);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Seruni/@-8.159907,110.6293865,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7bb971287c32d9:0x4f99694dab76fabd!8m2!3d-8.159907!4d110.6315752?hl=id-ID"));

        startActivity(intent);
    }

}
