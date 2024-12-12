package org.example;

public class Email extends Aplicativo {
    private int numMensagens;
    public Email(float valorBase, int numMensagens) {
        super(valorBase, numMensagens);
    }
    public void setNumMensagens(int numMensagens) {
        this.numMensagens = numMensagens;
    }
    public float calcularValor() {
        return this.valorBase * this.numMensagens * (1 + this.urgencia.percentualAumento());
    }
}