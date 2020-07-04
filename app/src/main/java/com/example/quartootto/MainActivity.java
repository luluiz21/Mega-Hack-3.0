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

public class MainActivity extends AppCompatActivity {
    View chao;
    private SlidrInterface slidr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chao = findViewById(R.id.chaoView);
        chao.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

    }

    public void quartoOttoDireita(View view){
        Intent intent = new Intent(this,QuartoOttoDireita.class);
        startActivity(intent);
    }


}