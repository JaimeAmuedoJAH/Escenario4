package com.jah.escenario4;

import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgContenido, rgContenidoIzq, rgContenidoDer;
    RadioButton rbDeportes, rbNombres, rbCiudades, rbMoviles, rbOrdenadores, rbHardware;
    RadioButton rbContenido1, rbContenido2, rbContenido3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rgContenido = findViewById(R.id.rgContenido);
        rgContenidoIzq = findViewById(R.id.rgContenidoIzq);
        rgContenidoDer = findViewById(R.id.rgContenidoDer);
        rbDeportes = findViewById(R.id.rbDeportes);
        rbNombres = findViewById(R.id.rbNombres);
        rbCiudades = findViewById(R.id.rbCiudades);
        rbMoviles = findViewById(R.id.rbMoviles);
        rbOrdenadores = findViewById(R.id.rbOrdenadores);
        rbHardware = findViewById(R.id.rbHardware);
        rbContenido1 = findViewById(R.id.rbContenido1);
        rbContenido2 = findViewById(R.id.rbContenido2);
        rbContenido3 = findViewById(R.id.rbContenido3);

        rgContenidoIzq.setOnCheckedChangeListener((radioGroup, ind) ->  cambiarContenido(1));
        rgContenidoDer.setOnCheckedChangeListener((radioGroup, ind) -> cambiarContenido(2));

    }

    private void limpiarContenido(int i) {
        if (i == 2) {
            rbMoviles.setChecked(false);
            rbOrdenadores.setChecked(false);
            rbHardware.setChecked(false);
        } else {
            rbNombres.setChecked(false);
            rbCiudades.setChecked(false);
            rbDeportes.setChecked(false);

        }
    }

    private void cambiarContenido(int miRadioGroup) {
        
        if (miRadioGroup == 1) {
            if (rbDeportes.isChecked()) {
                limpiarContenido(2);
                rbContenido1.setText(R.string.strDeportes1);
                rbContenido2.setText(R.string.strDeportes2);
                rbContenido3.setText(R.string.strDeportes3);

            } else if (rbCiudades.isChecked()) {
                limpiarContenido(2);
                rbContenido1.setText(R.string.strCiudades1);
                rbContenido2.setText(R.string.strCiudades2);
                rbContenido3.setText(R.string.strCiudades3);


            } else if (rbNombres.isChecked()) {
                limpiarContenido(2);
                rbContenido1.setText(R.string.strNombres1);
                rbContenido2.setText(R.string.strNombres2);
                rbContenido3.setText(R.string.strNombres3);

            }

        } else{
            if (rbMoviles.isChecked()) {
                limpiarContenido(1);
                rbContenido1.setText(R.string.strMoviles1);
                rbContenido2.setText(R.string.strMoviles2);
                rbContenido3.setText(R.string.strMoviles3);

            } else if (rbOrdenadores.isChecked()) {
                limpiarContenido(1);
                rbContenido1.setText(R.string.strOrdenadores1);
                rbContenido2.setText(R.string.strOrdenadores2);
                rbContenido3.setText(R.string.strOrdenadores3);

            } else if (rbHardware.isChecked()) {
                limpiarContenido(1);
                rbContenido1.setText(R.string.strHardware1);
                rbContenido2.setText(R.string.strHardware2);
                rbContenido3.setText(R.string.strHardware3);

            }

        }

    }
}