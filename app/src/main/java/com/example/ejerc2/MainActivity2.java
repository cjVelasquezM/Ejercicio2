package com.example.ejerc2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtNombre,txtApellido,txtEdad,txtCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtApellido = (TextView) findViewById(R.id.txtApellido);
        txtEdad = (TextView) findViewById(R.id.txtEdad);
        txtCorreo = (TextView) findViewById(R.id.txtCorreo);

        Intent in=getIntent();
        txtNombre.setText(in.getStringExtra("nombre")) ;
        txtApellido.setText(in.getStringExtra("apellido"));
        txtEdad.setText(in.getStringExtra("edad")) ;
        txtCorreo.setText(in.getStringExtra("correoE"));

        //Bundle result = getIntent().getExtras();
        //txtDatos.setText(result.getString("nombre" + "apellido"));
    }
}