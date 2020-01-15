package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_suharto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_suharto);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Museum+Soeharto/@-7.7913127,110.2782914,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7af7783582ba21:0xcdf4f45bfffab02d!8m2!3d-7.7913127!4d110.2804801?hl=id-ID"));
        startActivity(intent);
    }
}

