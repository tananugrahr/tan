package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_kongkalikong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_kongkalikong);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/KongKalikong+Dine+%26+Coffee+House/@-7.8046072,110.3759455,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a579d508bde6b:0xe4b7c7ef23a17817!8m2!3d-7.8046072!4d110.3781342?hl=id-ID"));
        startActivity(intent);
    }

}
