package com.geektech.secondapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CardView cardView = findViewById(R.id.card_view);
        LinearLayout container = findViewById(R.id.container);

        findViewById(R.id.button1).setOnClickListener(view -> {
            // обработка клика
            if (cardView.getAlpha() == 1){
                cardView.animate().alpha(0);
            }else {
                cardView.animate().alpha(1);
            }
        });

        findViewById(R.id.big_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // обработка клика
                if (container.getVisibility() == View.VISIBLE){
                    container.setVisibility(View.GONE);
                }else {
                    container.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}