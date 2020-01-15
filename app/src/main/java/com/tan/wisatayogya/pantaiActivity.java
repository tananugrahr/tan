package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class pantaiActivity extends AppCompatActivity {
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantai);
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
                        Intent intent = new Intent(pantaiActivity.this, pantai_seruni.class);
                        startActivity(intent);
                    }else if (finalI == 1) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_watulumbung.class);
                        startActivity(intent);
                    }else if (finalI == 2) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_jungwok.class);
                        startActivity(intent);
                    }else if (finalI == 3) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_slili.class);
                        startActivity(intent);
                    }else if (finalI == 4) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_watugupit.class);
                        startActivity(intent);
                    }else if (finalI == 5) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_parangndok.class);
                        startActivity(intent);
                    }else if (finalI == 6) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_drini.class);
                        startActivity(intent);
                    }else if (finalI == 7) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_krakal.class);
                        startActivity(intent);
                    }else if (finalI == 8) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_sadranan.class);
                        startActivity(intent);
                    }else if (finalI == 9) {
                        Intent intent = new Intent(pantaiActivity.this, pantai_poktunggal.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(pantaiActivity.this, "belum diisi", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }

    }
}
