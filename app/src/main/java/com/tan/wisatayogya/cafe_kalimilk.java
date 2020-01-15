package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_kalimilk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_kalimilk);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Kalimilk+Jogja/@-7.7629702,110.3777577,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a59ace576eb8d:0x511658c2e8cc2953!8m2!3d-7.7629702!4d110.3799464?hl=id-ID"));
        startActivity(intent);
    }

}
