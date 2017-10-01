package com.maxalva.tareavirtual1;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private Destino[] destinos = new Destino[]{
            new Destino("[Selecciona un Destino]", null, 0.0),
            new Destino("Cuzco", 100.00, 5.0),
            new Destino("Arequipa", 80.00, 10.0),
            new Destino("Iquitos", 75.00, 8.0),
    };

    Destino destino = new Destino();
    EditText dni;
    EditText nombre;
    EditText direccion;
    Button btnVender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner cboDestinos = (Spinner) findViewById(R.id.destinos);
        dni = (EditText) findViewById(R.id.dni);
        nombre = (EditText) findViewById(R.id.nombre);
        direccion = (EditText) findViewById(R.id.direccion);
        btnVender = (Button) findViewById(R.id.vender);

        cboDestinos.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                destino = destinos[i];
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnVender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PrintActivity.class);
                intent.putExtra("dni", dni.getText().toString());
                intent.putExtra("nombre", nombre.getText().toString());
                intent.putExtra("direccion", direccion.getText().toString());
                intent.putExtra("destino", destino.getDestino());
                intent.putExtra("descuento", destino.getDescuento().toString());
                intent.putExtra("precio", destino.getPrecio().toString());
                startActivity(intent);
            }
        });

        DestinosAdapter adapter = new DestinosAdapter(this, destinos);
        cboDestinos.setAdapter(adapter);
    }
}
