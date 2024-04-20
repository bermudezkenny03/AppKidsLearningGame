package com.example.appkidslearninggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Seleccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion);

        ImageButton ButtonAnimales = findViewById(R.id.ButtonAnimales);
        ImageButton ButtonNumeros = findViewById(R.id.ButtonNumeros);
        ImageButton ButtonColores = findViewById(R.id.ButtonColores);
        ImageButton ButtonAbecedario = findViewById(R.id.ButtonAbecedario);
        ImageButton ButtonVocales = findViewById(R.id.ButtonVocales);

        ButtonVocales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seleccion.this, Vocales.class);
                startActivity(intent);
            }
        });

        ButtonAbecedario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seleccion.this, Abecedario.class);
                startActivity(intent);
            }
        });

        ButtonColores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten = new Intent(Seleccion.this, Colores.class);
                startActivity(inten);
            }
        });
        ButtonNumeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seleccion.this,Numeros.class);
                startActivity(intent);
            }
        });
        ButtonAnimales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seleccion.this,Animales.class);
                startActivity(intent);
            }
        });
    }
}