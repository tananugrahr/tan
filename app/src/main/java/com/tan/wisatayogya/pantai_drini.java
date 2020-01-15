package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_drini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_drini);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Drini/@-8.138087,110.5764707,18z/data=!3m1!4b1!4m5!3m4!1s0x2e7bba5dc5962655:0xea3d86bf61e8a749!8m2!3d-8.1384509!4d110.577522?hl=id-ID"));
        startActivity(intent);
    }

}
