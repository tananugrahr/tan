package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class desa_kebonagung extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_kebonagung);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Kb.+Agung,+Kec.+Imogiri,+Bantul,+Daerah+Istimewa+Yogyakarta/@-7.9320059,110.3610103,15z/data=!3m1!4b1!4m5!3m4!1s0x2e7a551b022eb76d:0xdbb09f265fa3dd45!8m2!3d-7.930994!4d110.3710964"));
        startActivity(intent);
    }
    }



