package com.example.prova;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int jogador1 = 0;
    public int jogador2 = 0;

    public int temp_pontos_jogador1 = 0;
    public int temp_pontos_jogador2  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAcrecentarJ1(View v){
        TextView t = (TextView)findViewById(R.id.j1_text);
        TextView t2 = (TextView)findViewById(R.id.j2_text);
        if(temp_pontos_jogador1 <= 12){
            switch (v.getId()){
                case R.id.j1_1:
                    temp_pontos_jogador1 += 1;
                    break;
                case R.id.j1_3:
                    temp_pontos_jogador1 += 3;
                    break;
                case R.id.j1_6:
                    temp_pontos_jogador1 += 6;
                    break;
                case R.id.j1_9:
                    temp_pontos_jogador1 += 9;
                    break;
                case R.id.j1_12:
                    temp_pontos_jogador1 += 12;
                    break;

            }

            t.setText(temp_pontos_jogador1 + " Pontos");
        } else {

            jogador1 += 1;
            t.setText("0 Pontos");
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Jogador 1");
            builder.setMessage("Jogador 1 Ganhou a Partida");
            builder.create().show();
            t2.setText("0 Pontos");
            temp_pontos_jogador1 = 0;
            temp_pontos_jogador2 = 0;
        }



    }
    public void onAcrecentarJ2(View v){
        TextView t1 = (TextView)findViewById(R.id.j1_text);
        TextView t = (TextView)findViewById(R.id.j2_text);
        if(temp_pontos_jogador2 <= 12){
            switch (v.getId()){
                case R.id.j2_1:
                    temp_pontos_jogador2 += 1;
                    break;
                case R.id.j2_3:
                    temp_pontos_jogador2 += 3;
                    break;
                case R.id.j2_6:
                    temp_pontos_jogador2 += 6;
                    break;
                case R.id.j2_9:
                    temp_pontos_jogador2 += 9;
                    break;
                case R.id.j2_12:
                    temp_pontos_jogador2 += 12;
                    break;

            }

            t.setText(temp_pontos_jogador2 + " Pontos");
        } else {

            jogador2 += 1;
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Jogador 2");
            builder.setMessage("Jogador 2 Ganhou a Partida");
            builder.create().show();

            t.setText("0 Pontos");
            t1.setText("0 Pontos");
            temp_pontos_jogador1 = 0;
            temp_pontos_jogador2 = 0;
        }
    }

    public void onHistorico(View v){

        Intent intent = new Intent(MainActivity.this,HistoricoActivity.class);
        intent.putExtra("jogador1", jogador1);
        intent.putExtra("jogador2", jogador2);
        startActivity(intent);

    }

    public  void onZerar(View v){

        jogador1 = 0;
        jogador2 = 0;
        Toast.makeText(this,"Histórico dos Jogadores Zerados",Toast.LENGTH_LONG).show();
    }

}