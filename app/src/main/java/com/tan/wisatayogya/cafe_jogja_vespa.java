package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_jogja_vespa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_jogja_vespa);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Vespa+Cafe+Jogja/@-7.8409906,110.3248464,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7af880efba47b5:0xb69553b0ff84cae2!8m2!3d-7.8409906!4d110.3270351?hl=id-ID"));
        startActivity(intent);
    }

}
