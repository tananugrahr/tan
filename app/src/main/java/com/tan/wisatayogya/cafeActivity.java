package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class cafeActivity extends AppCompatActivity {
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe);
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
                            Intent intent = new Intent(cafeActivity.this, cafe_nox.class);
                            startActivity(intent);
                        }else if (finalI == 1) {
                            Intent intent = new Intent(cafeActivity.this, cafe_epic.class);
                            startActivity(intent);
                        }else if (finalI == 2) {
                            Intent intent = new Intent(cafeActivity.this, cafe_kopi_mataram.class);
                            startActivity(intent);
                        }else if (finalI == 3) {
                            Intent intent = new Intent(cafeActivity.this, cafe_Indische_Koffie.class);
                            startActivity(intent);
                        }else if (finalI == 4) {
                            Intent intent = new Intent(cafeActivity.this, cafe_Awor_Gallery_and_Coffee.class);
                            startActivity(intent);
                        }else if (finalI == 5) {
                            Intent intent = new Intent(cafeActivity.this, cafe_raoaster_and_bear.class);
                            startActivity(intent);
                        }else if (finalI == 6) {
                            Intent intent = new Intent(cafeActivity.this, cafe_kalimilk.class);
                            startActivity(intent);
                        }else if (finalI == 7) {
                            Intent intent = new Intent(cafeActivity.this, cafe_six_sense.class);
                            startActivity(intent);
                        }else if (finalI == 8) {
                            Intent intent = new Intent(cafeActivity.this, cafe_le_travail.class);
                            startActivity(intent);
                        }else if (finalI == 9)
                        {
                            Intent intent = new Intent(cafeActivity.this, cafe_lotus_mio.class);
                            startActivity(intent);
                        }else if (finalI == 10)
                        {
                            Intent intent = new Intent(cafeActivity.this, cafe_warungkopi_negri.class);
                            startActivity(intent);
                        }else if (finalI == 11)
                        {
                            Intent intent = new Intent(cafeActivity.this, cafe_kongkalikong.class);
                            startActivity(intent);
                        }else if (finalI == 12)
                        {
                            Intent intent = new Intent(cafeActivity.this, cafe_blanco.class);
                            startActivity(intent);
                        }else if (finalI == 13)
                        {
                            Intent intent = new Intent(cafeActivity.this, cafe_bong_kopitiam.class);
                            startActivity(intent);
                        }else if (finalI == 14)
                        {
                            Intent intent = new Intent(cafeActivity.this, cafe_jogja_vespa.class);
                            startActivity(intent);
                        }else{
                            Toast.makeText(cafeActivity.this, "belum diisi", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
            }

        }
    }

