package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_rs_mata_dryap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_rs_mata_dryap);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/dir//Museum+RS+Mata+Dr+Yap,+Jl.+Cik+Di+Tiro+No.5,+Terban,+Kec.+Gondokusuman,+Kota+Yogyakarta,+Daerah+Istimewa+Yogyakarta+55223/@-7.7801396,110.33912,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x2e7a58347546a195:0xb23a9506daaa0489!2m2!1d110.3741398!2d-7.780141?hl=id-ID"));
        startActivity(intent);
    }

}
