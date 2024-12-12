package org.example;

public class Parametros {

    private static Parametros instance;

    private String nomeUser;
    private String nomePessoaMensagem;

    private Parametros() {}

    public static synchronized Parametros getInstance() {
        if (instance == null) {
            instance = new Parametros();
        }
        return instance;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getNomePessoaMensagem() {
        return nomePessoaMensagem;
    }

    public void setNomePessoaMensagem(String nomePessoaMensagem) {
        this.nomePessoaMensagem = nomePessoaMensagem;
    }
}
