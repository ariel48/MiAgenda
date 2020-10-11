package com.aroejg.miagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;

public class AgendaDetalle extends AppCompatActivity {


    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEMail;
    private TextView tvDescripcion;
    Button btnEditarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_detalle);


        Bundle parametros = getIntent().getExtras();
        final String nombre = parametros.getString(getResources().getString(R.string.pnombre));
        final String fecha = parametros.getString(getResources().getString(R.string.pfecha));
        final String telefono = parametros.getString(getResources().getString(R.string.ptelefono));
        final String email = parametros.getString(getResources().getString(R.string.pemail));
        final String descripcion = parametros.getString(getResources().getString(R.string.pdescripcion));

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvFecha = (TextView) findViewById(R.id.tvFecha);
        tvTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvEMail = (TextView) findViewById(R.id.tvEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEMail.setText(email);
        tvDescripcion.setText(descripcion);


        Button btnEditarDatos = (Button) findViewById(R.id.btnEditarDatos);

        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });


    }
}