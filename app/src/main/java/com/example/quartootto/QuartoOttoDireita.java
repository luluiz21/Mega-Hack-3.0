package com.example.quartootto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

public class QuartoOttoDireita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarto_otto_direita);
        View chao = findViewById(R.id.chaoView);
        chao.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        quartoOttoCentralPelaDireita();
    }
    public void quartoOttoCentralPelaDireita(){
        Button esquerda = findViewById(R.id.botaoParaOQuartoCentralPeloQuartoDireito);
        esquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuartoOttoDireita.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });


    }
}