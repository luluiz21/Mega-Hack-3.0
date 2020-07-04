package com.example.quartootto;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.r0adkll.slidr.Slidr;
import com.r0adkll.slidr.model.SlidrInterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    View chao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chao = findViewById(R.id.chaoView);
        chao.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));
        quartoOttoDireita();
        quartoOttoEsquerda();
        iniciarQuiz();
    }

    private void quartoOttoDireita() {
        Button direita = findViewById(R.id.botaoParaOQuartoDireita);
        direita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuartoOttoDireita.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }



    public void quartoOttoEsquerda(){

        Button esquerda = findViewById(R.id.botaoParaOQuartoEsquerda);
        esquerda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,QuartoOttoEsquerda.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            }
        });


    }

    private void iniciarQuiz(){
        ImageView criadoMudo = findViewById(R.id.criado_mudo);
        criadoMudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, telaQuiz.class);
                startActivity(intent);
            }
        });
    }


}