package com.example.grupo10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    private CheckBox chb_terminos;
    private Button btn_registro_usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        chb_terminos = findViewById(R.id.chb_terminos);
        btn_registro_usuario = findViewById(R.id.btn_registro_usuario);
        btn_registro_usuario.setEnabled(false);

        /*chb_terminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chb_terminos.isChecked()){
                    btn_registro_usuario.setEnabled(true);
                }else {
                    btn_registro_usuario.setEnabled(false);
                }
            }
        });*/

        chb_terminos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                btn_registro_usuario.setEnabled(isChecked);
            }
        });
    }
}