package com.example.trabajo2_comp_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton1;
    Intent intent;

    EditText nombre;
    EditText email;
    EditText contrasenia;

    String stringNombre;
    String stringCorreo;
    String stringContrasenia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.etName);
        email = findViewById(R.id.etEmail);
        contrasenia = findViewById(R.id.etPassword);
        boton1 = findViewById(R.id.btnNext);
        intent = new Intent(MainActivity.this, Activity2.class);

//        boton1.setOnClickListener(view -> startActivity(intent)); //funcion lambda
        boton1.setOnClickListener(view -> {
            stringNombre = nombre.getText().toString();
            stringCorreo = email.getText().toString();
            stringContrasenia = contrasenia.getText().toString();

            if(stringNombre.isEmpty() || stringCorreo.isEmpty() || stringContrasenia.isEmpty()){
                Toast.makeText(MainActivity.this, "Faltan datos", Toast.LENGTH_LONG).show();
            }
            else{
                startActivity(intent);
            }

        });
    }
}