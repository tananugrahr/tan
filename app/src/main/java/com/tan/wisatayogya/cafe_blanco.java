package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_blanco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_blanco);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Blanco+Coffee+and+Books/@-7.7814081,110.362581,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a583a3b875c11:0xe57a6751df67f10d!8m2!3d-7.7814081!4d110.3647697?hl=id-ID"));
        startActivity(intent);
    }

}
