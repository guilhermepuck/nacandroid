package com.example.logonrm.nac_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    TextView txtNomeTerceira;
    TextView txtEmailTerceira;
    TextView txtNacionalTerceira;
    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        txtNomeTerceira = (TextView) findViewById(R.id.txtNomeTerceira);
        txtEmailTerceira = (TextView) findViewById(R.id.txtEmailTerceira);
        txtNacionalTerceira = (TextView) findViewById(R.id.txtNacionalTerceira);

        String nome = getIntent().getStringExtra("nome_usuario");
        String email = getIntent().getStringExtra("email_usuario");
        String nacionalidade = getIntent().getStringExtra("nacional_usuario");
        txtNomeTerceira.setText(nome);
        txtEmailTerceira.setText(email);
        txtNacionalTerceira.setText(nacionalidade);

        btnVoltar = (Button)findViewById(R.id.btnVolta);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
