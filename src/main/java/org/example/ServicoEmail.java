package org.example;

public class ServicoEmail implements IServico {

    @Override
    public String executar() {
        Parametros parametros = Parametros.getInstance();
        return "Mensagem de Email do user " + parametros.getNomeUser() +
                " enviada para " + parametros.getNomePessoaMensagem() +
                " com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Mensagem de Email deletada com sucesso!";
    }
}
