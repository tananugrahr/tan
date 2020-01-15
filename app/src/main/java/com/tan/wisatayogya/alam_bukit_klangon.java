package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class alam_bukit_klangon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam_bukit_klangon);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Wisata+Bukit+Klangon+Merapi/@-7.5768498,110.4527721,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a67fc12ab2699:0x7c55eb14240460f9!8m2!3d-7.5768498!4d110.4549608?hl=id-ID"));
        startActivity(intent);
    }

}
