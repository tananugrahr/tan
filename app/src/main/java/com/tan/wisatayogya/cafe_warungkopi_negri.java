package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_warungkopi_negri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_warungkopi_negri);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/KOPI+NEGRI/@-7.8174869,110.3274569,13z/data=!4m8!1m2!2m1!1swarung+kopi+negri+jogja!3m4!1s0x2e7a598ed3af3297:0xb1acfa6a4919ff58!8m2!3d-7.7780127!4d110.3816397?hl=id-ID"));
        startActivity(intent);
    }

}
