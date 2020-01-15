package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_watulumbung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_watulumbung);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Watu+Lumbung/@-8.1825122,110.6909658,15z/data=!4m8!1m2!2m1!1sJalan+Pantai+Watu+Lumbung,+Area+Hutan,+Balong,+Kabupaten+Gunung+Kidul,+Daerah+Istimewa+Yogyakarta!3m4!1s0x2e7bb8b1ffc333c3:0x15c44b48d96babc1!8m2!3d-8.1860206!4d110.700279?hl=id-ID"));

        startActivity(intent);
    }

}
