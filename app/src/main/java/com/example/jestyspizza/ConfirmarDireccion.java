package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class ConfirmarDireccion extends AppCompatActivity {

    private int precioTotal;

    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_direccion);

        bundle = getIntent().getExtras();
        this.precioTotal = bundle.getInt("precioTotal");

        TextView precioTotalTemplate = (TextView) findViewById(R.id.totalCompraFinal);
        String strPrecioTotalTemplate = precioTotalTemplate.getText().toString() + " " + formatMoney(String.valueOf(this.precioTotal));
        precioTotalTemplate.setText(strPrecioTotalTemplate);
    }
    public void inicio (View v){
        Intent intent = new Intent(this, ConfirmarPedido.class);
        startActivity(intent);
    }
    public void compra (View v){
        Intent intent = new Intent(this, Compra.class);
        startActivity(intent);
    }

    public String formatMoney(String money) {
        double doubleMoney = Double.parseDouble(money);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String moneyString = formatter.format(doubleMoney);

        System.out.println("retorno "+moneyString);
        return moneyString;
    }
}