package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class desa_sambi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa_sambi);
    }

    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Sambi,+Kabupaten+Boyolali,+Jawa+Tengah/@-7.4824959,110.6859117,15z/data=!3m1!4b1!4m5!3m4!1s0x2e7a6d24adbdac1b:0x5027a76e356d1c0!8m2!3d-7.4796725!4d110.6973469"));
        startActivity(intent);
    }
}
