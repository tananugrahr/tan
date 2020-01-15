package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_geoteknologi_upn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_geoteknologi_upn);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/dir//Museum+Geoteknologi+Mineral,+Jl.+Babarsari+No.+2+Caturnunggal+Depok+Sleman+Daerah+Istimewa+Yogyakarta,+Janti,+Caturtunggal,+Kec.+Depok,+Kabupaten+Sleman,+Daerah+Istimewa+Yogyakarta+55281/@-7.7769671,110.400741,14z/data=!4m8!4m7!1m0!1m5!1m1!1s0x2e7a59efe06a3361:0x2e598e0b10017e2b!2m2!1d110.4144969!2d-7.7816503?hl=id-ID"));
        startActivity(intent);
    }

}
