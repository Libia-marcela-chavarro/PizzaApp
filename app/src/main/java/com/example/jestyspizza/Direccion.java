package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Direccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);
    }
    public void Agregardireccion (View v){
        Intent intent = new Intent(this, FormulacionDireccion.class);
        startActivity(intent);

    }
    public void inicio(View v) {

        Intent intent = new Intent(this, InicioRegistrado.class);
        startActivity(intent);
    }
}