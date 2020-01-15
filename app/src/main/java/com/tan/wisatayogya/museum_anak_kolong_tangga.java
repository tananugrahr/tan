package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_anak_kolong_tangga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_anak_kolong_tangga);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/dir//Taman+Pintar,+Jl.+Sriwedani+No.1,+Ngupasan,+Kec.+Gondomanan,+Kota+Yogyakarta,+Daerah+Istimewa+Yogyakarta+55121/@-7.8007318,110.3654067,17z/data=!4m8!4m7!1m0!1m5!1m1!1s0x2e7a578674aa458b:0xddf9748fb93bf24a!2m2!1d110.3675954!2d-7.8007318?hl=id-ID"));
        startActivity(intent);
    }

}
