package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_Awor_Gallery_and_Coffee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe__awor__gallery_and__coffee);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Awor+Gallery+%26+Coffee/@-7.7804034,110.3712195,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a5833f67657a7:0xf85dfd22517d6263!8m2!3d-7.7804034!4d110.3734082?hl=id-ID"));
        startActivity(intent);
    }

}
