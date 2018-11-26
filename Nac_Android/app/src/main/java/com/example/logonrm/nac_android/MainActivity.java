package com.example.logonrm.nac_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    EditText edtName;
    EditText edtEmail;
    EditText edtNacional;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText)findViewById(R.id.edtName);
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtNacional = (EditText)findViewById(R.id.edtNacional);
        btnOK = (Button)findViewById(R.id.btnOK);

        edtName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(edtName.getText().length()<1){
                    edtName.setError("Insira o nome");
                }
            }
        });

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if(!validateEmail(edtEmail.getText().toString())) {
                //    edtEmail.setError("Email Inválido");
                //    edtEmail.requestFocus();
                //}
                //else{
                    //message_text = (EditText) findViewById(R.id.edtEmail);
                    //Toast.makeText(MainActivity.this, "Login realizado com Sucesso", Toast.LENGTH_SHORT).show();
                    Intent segundaTela = new Intent(MainActivity.this, SegundaActivity.class);
                    String nome = edtName.getText().toString();
                    String email = edtEmail.getText().toString();
                    String nacionalidade = edtNacional.getText().toString();

                    segundaTela.putExtra("nome_usuario",nome);
                    segundaTela.putExtra("email_usuario",email);
                    segundaTela.putExtra("nacional_usuario",nacionalidade);

                    startActivity(segundaTela);
                //}
            }
        });

    }
}
