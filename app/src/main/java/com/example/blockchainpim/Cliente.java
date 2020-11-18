package com.example.blockchainpim;

public class Cliente {

    String login;
    String nome;
    String senha;
    String saldo;

    public Cliente() {

    }

    public Cliente(String _login, String _nome, String _senha, String _saldo) {
        this.login = _login;
        this.nome = _nome;
        this.senha = _senha;
        this.saldo = _saldo;
    }

    public String getLogin() { return login; }
    public String getNome() { return nome; }
    public String getSenha() { return senha; }
    public String getSaldo() { return saldo; }
}
