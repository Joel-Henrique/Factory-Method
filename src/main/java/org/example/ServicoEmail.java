package org.example;

public class ServicoEmail extends Aplicativo {
    public ServicoEmail(float valorBase, int numMensagens) {
        super(valorBase,numMensagens);
    }

    @Override
    public float calcularValor() {
        return this.valorBase * this.numMensagens * (1 + this.urgencia.percentualAumento());
    }

    @Override
    public String executar() {
        Parametros parametros = Parametros.getInstance();
        return "Mensagem de Email do user " + parametros.getNomeUser() +
                " enviada para " + parametros.getNomePessoaMensagem() +
                " com sucesso!";
    }


}
