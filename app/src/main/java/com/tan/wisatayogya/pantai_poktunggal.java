package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class pantai_poktunggal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai_poktunggal);
    }
    public void ButtonOnClick(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.google.com/maps/place/Pantai+Pok+Tunggal/@-8.1555205,110.6194049,17z/data=!3m1!4b1!4m5!3m4!1s0x2e7bb98022016321:0x8c7991777b596102!8m2!3d-8.1554468!4d110.6217582?hl=id-ID"));

        startActivity(intent);
    }

}
