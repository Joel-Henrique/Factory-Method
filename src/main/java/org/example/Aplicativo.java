package org.example;

public abstract class Aplicativo {

    public String executar() {
        return null;
    }
    protected Urgencia urgencia;

    protected float valorBase;
    protected int numMensagens;

    public Aplicativo(float valorBase, int numMensagens) {
        this.valorBase = valorBase;
        this.numMensagens = numMensagens;
    }

    public void setUrgencia(Urgencia urgencia) {
        this.urgencia = urgencia;
    }

    public void setValorBase(float valorBase) {
        this.valorBase = valorBase;
    }

    public abstract float calcularValor();

}