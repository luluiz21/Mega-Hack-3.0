package com.example.quartootto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.scwang.wave.MultiWaveHeader;

public class Regiao extends AppCompatActivity {
    MultiWaveHeader waveHeader, sandHeader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiao);

        waveHeader = findViewById(R.id.wave_header);
        sandHeader = findViewById(R.id.sand_header);



    }
}