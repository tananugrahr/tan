package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_sonobudoyo_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_sonobudoyo_1);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/dir//Museum+Sonobudoyo,+Jalan+Pangurakan,+Ngupasan,+Kota+Yogyakarta,+Daerah+Istimewa+Yogyakarta/@-7.8024485,110.3289357,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x2e7a578f83070a4f:0x9d10431ac43ec5ee!2m2!1d110.3639555!2d-7.8024499?hl=id-ID"));
        startActivity(intent);
    }

}
