package com.tan.wisatayogya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout mainGrid = (GridLayout)findViewById(R.id.mainGrid);
        setSingleEvent(mainGrid);
    }

    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0 ; i < mainGrid.getChildCount();i++)
        {
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (finalI == 0)
                    {
                        Intent intent = new Intent(MainActivity.this, activity_museum.class);
                        startActivity(intent);
                    }else if (finalI == 1)
                    {
                        Intent intent = new Intent(MainActivity.this, pantaiActivity.class);
                        startActivity(intent);
                    }else if (finalI == 2)
                    {
                        Intent intent = new Intent(MainActivity.this, desaActivity.class);
                        startActivity(intent);
                    }else if (finalI == 3)
                    {
                        Intent intent = new Intent(MainActivity.this, alamActivity.class);
                        startActivity(intent);
                    }else if (finalI == 4)
                    {
                        Intent intent = new Intent(MainActivity.this, oleh2Activity.class);
                        startActivity(intent);
                    }else if (finalI == 5)
                    {
                        Intent intent = new Intent(MainActivity.this, cafeActivity.class);
                        startActivity(intent);
                    }else{
                        Toast.makeText(MainActivity.this, "belum diisi", Toast.LENGTH_SHORT).show();
                    }


                }
            });
        }
    }
}
