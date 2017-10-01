package com.maxalva.tareavirtual1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class PrintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_print);

        Bundle extras = getIntent().getExtras();

        TextView dni = (TextView) findViewById(R.id.dni);
        TextView nombre = (TextView) findViewById(R.id.nombre);
        TextView direccion = (TextView) findViewById(R.id.direccion);
        TextView destino = (TextView) findViewById(R.id.destino);
        TextView txtPrecio = (TextView) findViewById(R.id.precio);
        TextView txtDescuento = (TextView) findViewById(R.id.descuento);
        TextView total = (TextView) findViewById(R.id.total);

        Double precio = Double.valueOf(getIntent().getExtras().getString("precio"));
        Double descuento = Double.valueOf(getIntent().getExtras().getString("descuento"));

        descuento = precio * descuento / 100;

        dni.setText(getIntent().getExtras().getString("dni"));
        nombre.setText(getIntent().getExtras().getString("nombre"));
        direccion.setText(getIntent().getExtras().getString("direccion"));
        destino.setText(getIntent().getExtras().getString("destino"));
        txtPrecio.setText(String.valueOf(precio));
        txtDescuento.setText(String.valueOf(descuento));
        total.setText(String.valueOf(precio - descuento));


    }
}
