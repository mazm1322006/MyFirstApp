package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TextView texto;
    SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto=(TextView)findViewById(R.id.textView);

    }

    public String getfechaActual(){
        Date fechaActual = Calendar.getInstance().getTime();
        return formato.format(fechaActual);
    }

    public void botonListener(View v) {
        texto.setText("Botón presionado: " + getfechaActual());
    }


}
