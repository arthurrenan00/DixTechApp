package com.example.dixtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FormCadastro extends AppCompatActivity {

    private TextView txttelalogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarComponentes();

        EditText editTextCpf = findViewById(R.id.editcpf);
        EditText editTextFone = findViewById(R.id.edittelefone);
        EditText editTextDataN = findViewById(R.id.editdatanasc);

        txttelalogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(FormCadastro.this,FormLogin.class);
                startActivity(log);
            }
        });

        editTextCpf.addTextChangedListener(MaskEditUtil.mask(editTextCpf, MaskEditUtil.FORMAT_CPF));
        editTextFone.addTextChangedListener(MaskEditUtil.mask(editTextFone, MaskEditUtil.FORMAT_FONE));
        editTextDataN.addTextChangedListener(MaskEditUtil.mask(editTextDataN, MaskEditUtil.FORMAT_DATE));
    }

    private void IniciarComponentes(){
        txttelalogin = findViewById(R.id.txttelalogin);
    }
}