package com.example.ejerc2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etApellido, etEdad, etCorreo;
    Button btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellido = (EditText) findViewById(R.id.etApellido);
        etEdad = (EditText) findViewById(R.id.etEdad);
        etCorreo = (EditText) findViewById(R.id.etCorreo);
        btnInfo = (Button) findViewById(R.id.btnInfo);

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity2.class);

                i.putExtra("nombre",(etNombre.getText().toString()));
                i.putExtra("apellido",(etApellido.getText().toString()));
                i.putExtra("edad",(etEdad.getText().toString()));
                i.putExtra("correoE",(etCorreo.getText().toString()));

                startActivity(i);
            }
        });
    }

}