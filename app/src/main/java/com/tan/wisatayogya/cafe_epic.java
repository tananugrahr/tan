package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_epic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_epic);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Epic+Coffee+%26+Epilog+Furniture/@-7.7341836,110.3754673,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a58e00b86d721:0x2cddd06b9ddb4231!8m2!3d-7.7341836!4d110.377656?hl=id-ID"));
        startActivity(intent);
    }

}
