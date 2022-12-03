package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioRegistrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_registrado);
    }
    public void pedir_online(View v) {

        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void misPedidos (View v){
        Intent intent = new Intent(this, Pedidos.class);
        startActivity(intent);

    }
    public void misDirreciones (View v){
        Intent intent = new Intent(this, Direccion.class);
        startActivity(intent);
    }
}