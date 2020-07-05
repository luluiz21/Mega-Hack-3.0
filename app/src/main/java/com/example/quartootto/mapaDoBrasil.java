package com.example.quartootto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mapaDoBrasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa_do_brasil);
        regiaoNordeste();

    }
    public void regiaoNordeste(){
        Button nordeste = findViewById(R.id.botaoNordeste);
        nordeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mapaDoBrasil.this,Regiao.class);
                startActivity(intent);
            }
        });

    }
}