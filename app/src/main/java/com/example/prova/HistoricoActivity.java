package com.example.prova;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HistoricoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.historico_activity);

        int jogador_1 = (int) getIntent().getSerializableExtra("jogador1");
        int jogador_2 = (int) getIntent().getSerializableExtra("jogador2");


        TextView t1 = (TextView)findViewById(R.id.hj1_text);
        TextView t2 = (TextView)findViewById(R.id.hj2_text);

        t1.setText(jogador_1 + " Partidas Ganhas");
        t2.setText(jogador_2 + " Partidas Ganhas");
    }


}