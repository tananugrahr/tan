package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_slili extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_slili);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Slili/@-8.1449664,110.6006879,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7bba307708ac97:0x33dc2d30ad1147f1!8m2!3d-8.1449664!4d110.6028766?hl=id-ID"));

        startActivity(intent);
    }

}
