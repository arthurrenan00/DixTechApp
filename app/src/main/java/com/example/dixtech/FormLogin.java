package com.example.dixtech;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView txttelacadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();

            txttelacadastro.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent cad = new Intent(FormLogin.this,FormCadastro.class);
                    startActivity(cad);
                }
            });

    }

    private void IniciarComponentes(){
        txttelacadastro = findViewById(R.id.txttelacadastro);

    }

}