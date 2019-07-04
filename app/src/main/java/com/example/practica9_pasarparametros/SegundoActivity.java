package com.example.practica9_pasarparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tv1 = (TextView)findViewById(R.id.tv1);

        //cuando se active el metodo onCreate de nuestro segundo activity se cambiara el texto del TextView como se programo
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola " + dato);
    }

    //Metodo para el boton Regresar
    public void Regresar(View view){
        Intent regresar = new Intent(this, MainActivity.class);
        startActivity(regresar);
    }

}
