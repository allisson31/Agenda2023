package com.example.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view){
        EditText txtNombre = (EditText)findViewById(R.id.txtNombre);
        EditText txtApellido = (EditText)findViewById(R.id.txtApellido);
        RadioButton rbFemenino = (RadioButton) findViewById(R.id.rbFemenino);
String genero;
        if (rbFemenino.isChecked() )
            genero= "Estimada";
        else
            genero= "Estimado";

        Toast.makeText(this.getApplicationContext(),
                "Hola " + genero + " " +
                txtNombre.getText().toString(),
                Toast.LENGTH_LONG).show();


    }
}