package org.example;

public class ServicoTelegram extends Aplicativo {

    public ServicoTelegram(float valorBase, int numMensagens) {
        super(valorBase, numMensagens);
    }

    @Override
    public String executar() {
        Parametros parametros = Parametros.getInstance();
        return "Mensagem do Telegram do user " + parametros.getNomeUser() +
                " enviada para " + parametros.getNomePessoaMensagem() +
                " com sucesso!";
    }


    public float calcularValor() {
        return this.valorBase * (1 + this.urgencia.percentualAumento());
    }
}