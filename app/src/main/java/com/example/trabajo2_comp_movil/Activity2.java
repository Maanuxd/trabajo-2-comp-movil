package com.example.trabajo2_comp_movil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.trabajo2_comp_movil.models.User;

public class Activity2 extends AppCompatActivity {
    Float seguridadContrasenia;

    Intent mainActivityIntent;
    TextView tvNombreUsuario;
    TextView tvCorreoUsuario;
    TextView tvContrasenia;
    TextView tvTipoUsuario;

    ImageView imageTipoUsuario;

    RatingBar ratingContrasenia;

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
        imageTipoUsuario = findViewById(R.id.imageTipoUsuario);
        ratingContrasenia = findViewById(R.id.ratingContrasenia);

        tvNombreUsuario.setText(registeredUser.name);
        tvCorreoUsuario.setText(registeredUser.email);
        tvContrasenia.setText("Y tu contraseña tiene " + registeredUser.password.length() + " caracteres");
        tvTipoUsuario.setText("Eres un: " + registeredUser.role);

        if(registeredUser.password.length() >= 8) {
            seguridadContrasenia = (float) 8.0;
        } else {
            seguridadContrasenia = (float) registeredUser.password.length();
        }

        ratingContrasenia.setRating(seguridadContrasenia);

        if (registeredUser.role.equals("Administrador")) {
            imageTipoUsuario.setImageResource(R.drawable.admin);
        } else {
            imageTipoUsuario.setImageResource(R.drawable.user);
        }
    }
}