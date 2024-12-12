package org.example;

public class ServicoWhatsapp extends Aplicativo{

    public ServicoWhatsapp(float valorBase, int numMensagens) {
        super(valorBase,numMensagens);
    }

    @Override
    public float calcularValor() {
        return (this.valorBase * this.numMensagens);
    }

    @Override
    public String executar() {
        Parametros parametros = Parametros.getInstance();
        return "Mensagem de Whatsapp do user " + parametros.getNomeUser() +
                " enviada para " + parametros.getNomePessoaMensagem() +
                " com sucesso!";
    }
}