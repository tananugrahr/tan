package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class museum_affandi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_affandi);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/dir//Affandi+Museum,+Jl.+Laksda+Adisucipto+No.167,+Papringan,+Caturtunggal,+Kec.+Depok,+Kabupaten+Sleman,+Daerah+Istimewa+Yogyakarta+55281/@-7.7827116,110.3613772,13z/data=!4m8!4m7!1m0!1m5!1m1!1s0x2e7a59c49f681dbd:0x3e9d55bf26695d4a!2m2!1d110.396397!2d-7.782713?hl=id-ID"));
        startActivity(intent);
    }

}
