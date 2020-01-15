package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_krakal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_krakal);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Krakal/@-8.1452189,110.5964808,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7bba30b39b1505:0x5df2dd548f736e8f!8m2!3d-8.1452189!4d110.5986695?hl=id-ID"));
        startActivity(intent);
    }

}
