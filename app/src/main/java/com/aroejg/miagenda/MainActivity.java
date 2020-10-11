package com.aroejg.miagenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    DatePicker dpFecha;
    Button  btnSiguiente;
    EditText tieNombre;
    EditText tieTelefono;
    EditText tieEmail;
    EditText tieDescripcion;
    EditText tiefecha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //inciando Datepicker, botones y valores
    dpFecha = (DatePicker) findViewById(R.id.dpFecha);
    btnSiguiente = (Button) findViewById(R.id.btnSigiuiente);
    tieNombre = (EditText) findViewById(R.id.tieNombre);
    tieTelefono = (EditText) findViewById(R.id.tieTelefono);
    tieEmail = (EditText) findViewById(R.id.tieEmail);
    tieDescripcion = (EditText) findViewById(R.id.tieDescripcion);




    //apretar boton Siguiente para ir al otro activity

    btnSiguiente.setOnClickListener(new AdapterView.OnClickListener() {
        @Override
        public void onClick(View v) {

            String dia = " "+dpFecha.getDayOfMonth();
            String mes = " "+(dpFecha.getMonth()+1);
            String anio = " "+dpFecha.getYear();
            String date = dia + "/" + mes + "/" + anio;

            Intent intent = new Intent(MainActivity.this, AgendaDetalle.class);

            intent.putExtra(getResources().getString(R.string.pnombre), tieNombre.getText().toString());
            intent.putExtra(getResources().getString(R.string.pfecha), date);
            intent.putExtra(getResources().getString(R.string.ptelefono), tieTelefono.getText().toString());
            intent.putExtra(getResources().getString(R.string.pemail), tieEmail.getText().toString());
            intent.putExtra(getResources().getString(R.string.pdescripcion), tieDescripcion.getText().toString());
            startActivity(intent);


        }
    });




    }



}