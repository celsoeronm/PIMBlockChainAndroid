package com.example.blockchainpim;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BancoDados extends SQLiteOpenHelper {

    private static final int VERSAO_BANCO = 1;
    private static final String BANCO_CLIENTE = "bd_clientes";

    private static final String TABELA_CLIENTE = "tb_cliente";
    private static final String COLUNA_LOGIN = "login";
    private static final String COLUNA_SENHA = "senha";
    private static final String COLUNA_NOME = "nome";
    private static final String COLUNA_SALDO = "saldo";

    public BancoDados(Context context) { super(context, BANCO_CLIENTE,null, VERSAO_BANCO);}

    @Override
    public void onCreate(SQLiteDatabase db) {

        String QUERY_COLUNA = "CREATE TABLE " + TABELA_CLIENTE + "("
                + COLUNA_LOGIN + "CHAR(11) PRIMARY KEY," + COLUNA_SENHA + "INTEGER,"
                + COLUNA_NOME + "TEXT," + COLUNA_SALDO + "TEXT)";

        db.execSQL(QUERY_COLUNA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    /* CRUD ABAIXO */

    void addCliente(Cliente cliente) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(COLUNA_LOGIN, cliente.getLogin());
        values.put(COLUNA_SENHA, cliente.getSenha());
        values.put(COLUNA_NOME, cliente.getNome());
        values.put(COLUNA_SALDO, cliente.getSaldo());

        db.insert(TABELA_CLIENTE, null, values);
        db.close();
    }

}
