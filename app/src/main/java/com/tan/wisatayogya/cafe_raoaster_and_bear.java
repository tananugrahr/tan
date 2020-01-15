package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class cafe_raoaster_and_bear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_raoaster_and_bear);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Roaster+And+Bear/@-7.7845725,110.3649817,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7a58307c389477:0x7bc5bc779883ab1b!8m2!3d-7.7845725!4d110.3671704?hl=id-ID"));
        startActivity(intent);
    }

}
