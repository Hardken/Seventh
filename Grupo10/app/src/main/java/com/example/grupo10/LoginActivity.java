package com.example.grupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_login, btn_registro;
    private EditText edt_usuario, edt_contrasena;
    private String usuario, contrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        btn_registro = findViewById(R.id.btn_registro);
        edt_usuario = findViewById(R.id.edt_usuario);
        edt_contrasena = findViewById(R.id.edt_contrasena);
        btn_login.setOnClickListener(this);
        btn_registro.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                usuario = edt_usuario.getText().toString();
                contrasena = edt_contrasena.getText().toString();
                if (usuario.equals("admin@admin.com") && contrasena.equals("admin")) {
                    Intent intent = new Intent(LoginActivity.this, MenuActivity.class);
                    Toast.makeText(this, "INICIANDO SESION", Toast.LENGTH_SHORT).show();
                    intent.putExtra("usuario", usuario);
                    intent.putExtra("contrasena", contrasena);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, "ERROR INICIANDO SESION", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.btn_registro:
                Intent intent = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(intent);
                break;
        }
    }
}