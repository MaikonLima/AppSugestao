package com.maik.org.appsugestao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            this.getSupportActionBar().hide();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Button btIdentificador = findViewById(R.id.btSugestaoON);
        Button btIdentificadorOFF = findViewById(R.id.btSugestaoOFF);
        btIdentificador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextPageLogin = new Intent(MainActivity.this, LoginUsuario.class);
                startActivity(nextPageLogin);
            }
        });

        btIdentificadorOFF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextPage = new Intent(MainActivity.this, PainelSugestao.class);
                startActivity(nextPage);
            }
        });
    }
}