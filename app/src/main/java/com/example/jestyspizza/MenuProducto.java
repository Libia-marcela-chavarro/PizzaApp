package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.text.NumberFormat;

public class MenuProducto extends AppCompatActivity {

    private String tituloIntent;
    private String descIntent;
    private String precioIntent;

    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_producto);
        bundle = getIntent().getExtras();
        String titulo = bundle.getString("titulo");
        String precio = bundle.getString("precio");
        String descripcion = bundle.getString("descripcion");

        EditText tituloTemplate = (EditText) findViewById(R.id.tituloProducto);
        TextView precioTemplate = (TextView) findViewById(R.id.precioProducto);
        TextView descripcionTemplate = (TextView) findViewById(R.id.descripcionProducto);

        tituloIntent = titulo;
        descIntent = descripcion;
        precioIntent = precio;

        tituloTemplate.setText(titulo);
        precioTemplate.setText(precio);
        descripcionTemplate.setText(descripcion);
    }
    public void inicio (View v){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
    public void confirmarPedido (View v){
        String precioIntentFormat = this.precioIntent.replace("$","").replace(".","");
        EditText cant =(EditText)findViewById(R.id.cantPedidoProducto);
        String newCant = cant.getText().toString();
        int precioTotal = Integer.parseInt(newCant);
        precioTotal *= Integer.parseInt(precioIntentFormat);
        Intent intent = new Intent(this, ConfirmarPedido.class);
        intent.putExtra("precioTotal", precioTotal);
        startActivity(intent);
    }

    public void aumentarUnidadProducto(View v) {
        EditText cant =(EditText)findViewById(R.id.cantPedidoProducto);
        String newCant = cant.getText().toString();
        int intNewCant = Integer.parseInt(newCant);
        intNewCant ++;
        cant.setText(intNewCant+"");
    }
    public void disminuirUnidadProducto(View v) {
        EditText cant =(EditText)findViewById(R.id.cantPedidoProducto);
        String newCant = cant.getText().toString();
        int intNewCant = Integer.parseInt(newCant);
        if(intNewCant>0) {
            intNewCant--;
        }
        cant.setText(intNewCant+"");
    }

}