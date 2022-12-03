package com.example.jestyspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class IniciarSesion extends AppCompatActivity {
    public static final String USER = "marcela";
    public static final String PASS = "marcela123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }

        public boolean validateCredentials(String pUser, String pPass) {

            if (pUser.equals(USER) && pPass.equals(PASS)){
                return true;
            } else {
                return false;
            }
        }
    public void transfer(){
        Intent intent = new Intent(this, InicioRegistrado.class);
        startActivity(intent);
    }
    public void signIn(View v){

        EditText valUser = findViewById(R.id.passUser);
        EditText valPass = findViewById(R.id.password);

        String valUserStr = valUser.getText().toString();
        String valPassStr = valPass.getText().toString();
        boolean valSuccess = validateCredentials(valUserStr+"", valPassStr+"");
        System.out.println(valSuccess);

        if (valSuccess) {
            transfer();
        } else {
            Toast.makeText(this, "Error: Usuario y contraseña incorrectos", Toast.LENGTH_LONG).show();
        }
    }
    public void inicio (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}