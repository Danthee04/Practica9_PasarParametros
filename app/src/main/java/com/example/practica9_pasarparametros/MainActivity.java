package com.example.practica9_pasarparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //Crear objeto para el tipo de control que estamos utilizando
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Relacion para comunicar nuestra parte logica con nuestra parte grafica
        et1 = (EditText)findViewById(R.id.et1);
    }

    //Metodo para el boton enviar
    public void Enviar(View view){
        Intent enviar = new Intent(this, SegundoActivity.class);
        enviar.putExtra("dato", et1.getText().toString());
        startActivity(enviar);
    }
}
