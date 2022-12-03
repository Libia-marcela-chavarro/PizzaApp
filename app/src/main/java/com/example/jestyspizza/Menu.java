package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.sql.Array;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void productos(View v) {
        String[] pizza = new String[3];
        String titulo = "";
        switch (v.getId()) {
            case R.id.btnPeperoni:
                pizza[0] = "Peperoni";
                pizza[1] = "Pizza de peperoni con queso extra, acompañada de trocitos de tomate y cebolla, una delicia para tu paladar";
                pizza[2] = "$28.000";
                break;
            case R.id.btnHawaino:
                pizza[0] = "Hawaino";
                pizza[1] = "Pizza hawaiana con queso extra, extra piña  acompañada de trocitos de tocineta y jamon";
                pizza[2] = "$30.000";
                break;
            case R.id.btnSalami:
                pizza[0] = "Salami";
                pizza[1] = "Pizza de Salami acompañada de queso azul y cebolla ";
                pizza[2] = "$25.000";
                break;
            case R.id.btnTocineta:
                pizza[0] = "Tocineta";
                pizza[1] = "Pizza de tocineta con queso extra ,viene acompañada de salsa napolitana y jamon ";
                pizza[2] = "$27.000";
                break;
            case R.id.btnNapolitana:
                pizza[0] = "Napolitana";
                pizza[1] = "Deliciosa pizza napolitana, que endulzara tu paladar con tomate asado y tocineta ";
                pizza[2] = "$33.000";
                break;
            case R.id.btnChampiñones:
                pizza[0] = "Champiñones";
                pizza[1] = "Pizza de champiñones con una combinacion perfecta de queso azul y champiñones , agregandole a esa dupla perfecta salsa napolitana ";
                pizza[2] = "$30.000";
                break;
        }

        Intent intent = new Intent(this, MenuProducto.class);
        intent.putExtra("titulo", pizza[0]);
        intent.putExtra("descripcion", pizza[1]);
        intent.putExtra("precio", pizza[2]);
        startActivity(intent);
    }
    public void inicio(View v) {
        Intent intent = new Intent(this, InicioRegistrado.class);
        startActivity(intent);
    }
}