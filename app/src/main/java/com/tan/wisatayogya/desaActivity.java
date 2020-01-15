package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class desaActivity extends AppCompatActivity {
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desa);
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
                        Intent intent = new Intent(desaActivity.this, desa_sambi.class);
                        startActivity(intent);
                    }else if (finalI == 1) {
                        Intent intent = new Intent(desaActivity.this, desa_tanjung.class);
                        startActivity(intent);
                    }else if (finalI == 2) {
                        Intent intent = new Intent(desaActivity.this, desa_pulesari.class);
                        startActivity(intent);
                    }else if (finalI == 3) {
                        Intent intent = new Intent(desaActivity.this, desa_banjaroya.class);
                        startActivity(intent);
                    }else if (finalI == 4) {
                        Intent intent = new Intent(desaActivity.this, desa_kaki_langit.class);
                        startActivity(intent);
                    }else if (finalI == 5) {
                        Intent intent = new Intent(desaActivity.this, desa_kebonagung.class);
                        startActivity(intent);
                    }else if (finalI == 6) {
                        Intent intent = new Intent(desaActivity.this, desa_kasongan.class);
                        startActivity(intent);
                    }else if (finalI == 7) {
                        Intent intent = new Intent(desaActivity.this, desa_gamplong.class);
                        startActivity(intent);
                    }else if (finalI == 8) {
                        Intent intent = new Intent(desaActivity.this, desa_kelor.class);
                        startActivity(intent);
                    }else if (finalI == 9)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_pentingsari.class);
                        startActivity(intent);
                    }else if (finalI == 10)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_giriloyo.class);
                        startActivity(intent);
                    }else if (finalI == 11)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_tembi.class);
                        startActivity(intent);
                    }else if (finalI == 12)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_krebet.class);
                        startActivity(intent);
                    }else if (finalI == 13)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_nglanggeran.class);
                        startActivity(intent);
                    }else if (finalI == 14)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_manding.class);
                        startActivity(intent);
                    }else if (finalI == 15)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_mojo.class);
                        startActivity(intent);
                    }else if (finalI == 16)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_bobung.class);
                        startActivity(intent);
                    }else if (finalI == 17)
                    {
                        Intent intent = new Intent(desaActivity.this, desa_bejiharjo.class);
                        startActivity(intent);

                    }else{
                        Toast.makeText(desaActivity.this, "belum diisi", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

    }
}
