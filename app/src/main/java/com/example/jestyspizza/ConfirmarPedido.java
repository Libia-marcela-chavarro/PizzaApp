package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class ConfirmarPedido extends AppCompatActivity {

    private int subtotal;
    private int domicilio;
    private int precioTotal;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_pedido);
        this.domicilio = 5000;
        bundle = getIntent().getExtras();
        this.subtotal = bundle.getInt("precioTotal");
        this.precioTotal = subtotal + domicilio;

        TextView subtotalTextView = (TextView) findViewById(R.id.subTotal);
        subtotalTextView.setText(String.valueOf(formatMoney(String.valueOf(subtotal))));

        TextView subtotalConcat = (TextView) findViewById(R.id.subTotalConcat);

        subtotalConcat.setText(formatMoney(String.valueOf(this.subtotal)));

        TextView precioTotalTextView = (TextView) findViewById(R.id.totalCompra);

        precioTotalTextView.setText(String.valueOf(formatMoney(this.precioTotal+"")));
    }
    public void inicio (View v){
        Intent intent = new Intent(this, MenuProducto.class);
        startActivity(intent);
    }
    public void ComfirmarDirrecion (View v){
        Intent intent = new Intent(this, ConfirmarDireccion.class);
        intent.putExtra("precioTotal", this.precioTotal);
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