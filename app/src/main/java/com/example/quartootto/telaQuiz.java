package com.example.quartootto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class telaQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_quiz);
        iniciarQuiz();
    }
    private void iniciarQuiz(){
        FloatingActionButton botaoVoltar = findViewById(R.id.botaoVoltarTelaInicial);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaQuiz.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}