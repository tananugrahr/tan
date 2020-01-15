package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_biologi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_biologi);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Museum+of+Biology/@-7.8017655,110.3722122,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5783c3faddf1:0xc9649eca4dd40f0b!8m2!3d-7.8017655!4d110.3744009?hl=id-ID"));
        startActivity(intent);
    }

}
