package com.example.trabajo2_comp_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.trabajo2_comp_movil.models.User;

public class Activity2 extends AppCompatActivity {
    Intent mainActivityIntent;
    TextView tvNombreUsuario;
    TextView tvCorreoUsuario;
    TextView tvContrasenia;
    TextView tvTipoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        mainActivityIntent = getIntent();
        User registeredUser = (User)mainActivityIntent.getSerializableExtra("user");
        tvNombreUsuario = findViewById(R.id.tvNombre);
        tvCorreoUsuario = findViewById(R.id.tvCorreoUsuario);
        tvContrasenia = findViewById(R.id.tvContrasenia);
        tvTipoUsuario = findViewById(R.id.tvTipoUsuario);

        tvNombreUsuario.setText(registeredUser.name);
        tvCorreoUsuario.setText(registeredUser.email);
        tvContrasenia.setText("Y tu contraseña tiene " + registeredUser.password.length() + " caracteres");
        tvTipoUsuario.setText("Es un: " + registeredUser.role);
    }
}