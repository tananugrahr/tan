package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class activity_museum extends AppCompatActivity {
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);

        gridLayout = (GridLayout)findViewById(R.id.Gridlayout);
        setSingleEvent(gridLayout);
    }

    private void setSingleEvent(GridLayout gridLayout) {
        for (int i = 0 ; i < gridLayout.getChildCount();i++)
        {
            CardView cardView = (CardView)gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0)
                    {
                        Intent intent = new Intent(activity_museum.this, museum_suharto.class);
                        startActivity(intent);
                    }else if (finalI == 1) {
                        Intent intent = new Intent(activity_museum.this, MuseumDigantara.class);
                        startActivity(intent);
                    }else if (finalI == 2) {
                        Intent intent = new Intent(activity_museum.this, museum_biologi.class);
                        startActivity(intent);
                    }else if (finalI == 3) {
                        Intent intent = new Intent(activity_museum.this, museum_benteng_vredeburg.class);
                        startActivity(intent);
                    }else if (finalI == 4) {
                        Intent intent = new Intent(activity_museum.this, museum_bahari_yogyakarta.class);
                        startActivity(intent);
                    }else if (finalI == 5) {
                        Intent intent = new Intent(activity_museum.this, museum_anak_kolong_tangga.class);
                        startActivity(intent);
                    }else if (finalI == 6) {
                        Intent intent = new Intent(activity_museum.this, museum_affandi.class);
                        startActivity(intent);
                    }else if (finalI == 7) {
                        Intent intent = new Intent(activity_museum.this, museum_geoteknologi_upn.class);
                        startActivity(intent);
                    }else if (finalI == 8) {
                        Intent intent = new Intent(activity_museum.this, museum_rs_mata_dryap.class);
                        startActivity(intent);
                    }else if (finalI == 9)
                    {
                        Intent intent = new Intent(activity_museum.this, museum_sonobudoyo_1.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(activity_museum.this, "belum diisi", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

    }
}