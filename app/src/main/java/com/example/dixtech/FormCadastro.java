package com.example.dixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormCadastro extends AppCompatActivity {

    private TextView txttelalogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarComponentes();

        txttelalogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(FormCadastro.this,FormLogin.class);
                startActivity(log);
            }
        });
    }

    private void IniciarComponentes(){
        txttelalogin = findViewById(R.id.txttelalogin);
    }
}