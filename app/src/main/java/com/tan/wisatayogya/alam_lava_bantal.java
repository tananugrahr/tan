package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_lava_bantal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_lava_bantal);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Lava+bantal/@-7.8081518,110.4573296,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a51b96c72a851:0xf454bd5877f00a2e!8m2!3d-7.8081518!4d110.4595183?hl=id-ID"));
        startActivity(intent);
    }

}
