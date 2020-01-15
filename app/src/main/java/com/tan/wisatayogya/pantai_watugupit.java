package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_watugupit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_watugupit);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Watugupit/@-8.0299779,110.3421859,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7baa11933e13c1:0x3235744fdc16cfac!8m2!3d-8.0299779!4d110.3443746?hl=id-ID"));

        startActivity(intent);
    }

}
