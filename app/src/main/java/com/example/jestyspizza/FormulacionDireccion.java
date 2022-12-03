package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FormulacionDireccion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulacion_direccion);
    }
    public void GuardarDireccion(View v) {
        Toast.makeText(this, "La direccion se ha guardado correctamente", Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, InicioRegistrado.class);
        startActivity(intent);

    }
    public void inicio(View v) {

        Intent intent = new Intent(this, InicioRegistrado.class);
        startActivity(intent);
        Toast.makeText(this, "Error: Usuario y contraseña incorrectos", Toast.LENGTH_LONG).show();

    }
}