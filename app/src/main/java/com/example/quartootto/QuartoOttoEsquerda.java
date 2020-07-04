package com.example.quartootto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuartoOttoEsquerda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        View chao = findViewById(R.id.chaoView);
        chao.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        quartoOttoCentralPelaEsquerda();
        camaTestButton();
    }
    public void quartoOttoCentralPelaEsquerda(){
        Button direita = findViewById(R.id.botaoParaOQuartoCentralPeloQuartoEsquerdo);
        direita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuartoOttoEsquerda.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

    }

    private void camaTestButton(){
        ImageView cama = findViewById(R.id.cama);
        cama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuartoOttoEsquerda.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}