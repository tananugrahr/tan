package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class alamActivity extends AppCompatActivity {
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alam);

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
                        Intent intent = new Intent(alamActivity.this, alam_bukit_teletubis.class);
                        startActivity(intent);
                    }else if (finalI == 1) {
                        Intent intent = new Intent(alamActivity.this, alam_bukit_klangon.class);
                        startActivity(intent);
                    }else if (finalI == 2) {
                        Intent intent = new Intent(alamActivity.this, alam_lava_bantal.class);
                        startActivity(intent);
                    }else if (finalI == 3) {
                        Intent intent = new Intent(alamActivity.this, alam_spot_riyadi.class);
                        startActivity(intent);
                    }else if (finalI == 4) {
                        Intent intent = new Intent(alamActivity.this, alam_puncak_suroloyo.class);
                        startActivity(intent);
                    }else if (finalI == 5) {
                        Intent intent = new Intent(alamActivity.this, alam_kebun_teh_nglinggo.class);
                        startActivity(intent);
                    }else if (finalI == 6) {
                        Intent intent = new Intent(alamActivity.this, alam_watulawang.class);
                        startActivity(intent);
                    }else if (finalI == 7) {
                        Intent intent = new Intent(alamActivity.this, alam_kampung_edukasi_lumbung.class);
                        startActivity(intent);
                    }else if (finalI == 8) {
                        Intent intent = new Intent(alamActivity.this, alam_goa_cerme.class);
                        startActivity(intent);
                    }else if (finalI == 9)
                    {
                        Intent intent = new Intent(alamActivity.this, alam_seribu_batu_songgolangit.class);
                        startActivity(intent);
                    }else if (finalI == 10)
                    {
                        Intent intent = new Intent(alamActivity.this, alam_seribu_batu_songgolangit.class);
                        startActivity(intent);
                    }else if (finalI == 11)
                    {
                        Intent intent = new Intent(alamActivity.this, alam_seribu_batu_songgolangit.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(alamActivity.this, "belum diisi", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

    }
}

