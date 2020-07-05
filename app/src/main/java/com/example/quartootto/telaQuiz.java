package com.example.quartootto;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class telaQuiz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_quiz);
        voltarQuarto();
        botaoErrado1();
        botaoCerto1();
        botaoErrado2();
        botaoCerto2();
    }

    private void botaoCerto2() {
        Button certo = findViewById(R.id.opcao4);
        certo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proximaPergunta();
            }
        });
    }

    private void botaoErrado2() {
        Button errado = findViewById(R.id.opcao3);
        errado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desejaContinuar();
            }
        });
    }

    private void botaoCerto1() {
        Button certo = findViewById(R.id.opcao2);
        certo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proximaPergunta();
            }
        });
    }

    private void proximaPergunta() {
        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Você Acertou! :)");
        msgBox.setMessage("Deseja continuar, com outra pergunta?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(telaQuiz.this,"Boa Sorte!",Toast.LENGTH_SHORT).show();
                Button pergunta = findViewById(R.id.pergunta);
                Button opcao1 = findViewById(R.id.opcao1);
                Button opcao2 = findViewById(R.id.opcao2);
                Button opcao3 = findViewById(R.id.opcao3);
                Button opcao4 = findViewById(R.id.opcao4);
                pergunta.setText("Quem é o chefe dos Capitães da Areia?");
                opcao1.setText("Almiro");
                opcao2.setText("Pirulito");
                opcao3.setText("Gato");
                opcao4.setText("Pedro-Bala");

            }
        });
        msgBox.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(telaQuiz.this,"Aguardo seu retorno!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(telaQuiz.this, MainActivity.class);
                startActivity(intent);
            }
        });
        msgBox.show();
    }

    private void voltarQuarto(){
        FloatingActionButton botaoVoltar = findViewById(R.id.botaoVoltarTelaInicial);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(telaQuiz.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void botaoErrado1(){
        Button errado = findViewById(R.id.opcao1);
        errado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                desejaContinuar();
            }
        });
    }

    private void desejaContinuar() {
        AlertDialog.Builder msgBox = new AlertDialog.Builder(this);
        msgBox.setTitle("Você errou! :(");
        msgBox.setMessage("Deseja tentar mais uma vez?");
        msgBox.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(telaQuiz.this,"Boa Sorte!",Toast.LENGTH_SHORT).show();
            }
        });
        msgBox.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(telaQuiz.this,"Boa sorte da próxima!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(telaQuiz.this, MainActivity.class);
                startActivity(intent);
            }
        });
        msgBox.show();
    }
}