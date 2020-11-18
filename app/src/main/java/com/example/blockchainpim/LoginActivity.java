package com.example.blockchainpim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends Activity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {

//            public void setDb(BancoDados db) {
//                this.db = db;
//                db.addCliente(new Cliente("46680171830", "CELSOERON", "200598", "500,00"));
//            }

            @Override
            public void onClick(View v) {
                Intent it = new Intent(LoginActivity.this, MainActivity.class);
                TextView  tLogin = (TextView) findViewById(R.id.tLogin);
                TextView  tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if (login.equals("adm")&&senha.equals("adm")) {
                    alert("Login realizado com sucesso !");
                    startActivity(it);
                }else{
                        alert("Credenciais incorretas");
                }
            }
        });
    }




    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
