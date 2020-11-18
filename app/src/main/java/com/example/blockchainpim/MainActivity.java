package com.example.blockchainpim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnConsultar;
//    BancoDados db = new BancoDados(this);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tCliente = (TextView) findViewById(R.id.editNome);
        TextView tSaldo = (TextView) findViewById(R.id.campSaldo);
        String editNome = tCliente.getText().toString();
        String campSaldo = tSaldo.getText().toString();
        btnConsultar = (Button) findViewById(R.id.btnConsultar);
        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }
    public void openNewActivity(){
        Intent intent = new Intent(this, ConsultaActivity.class);
        startActivity(intent);
    }

        /* TESTE CRUD */


//    public void setDb(BancoDados db) {
//        this.db = db;
//        db.addCliente(new Cliente("46680171830", "CELSOERON", "200598", "500,00"));
//    }
    }


