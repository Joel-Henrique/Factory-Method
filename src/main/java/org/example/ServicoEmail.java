package org.example;

public class ServicoEmail implements IServico{
    @Override
    public String executar() {
        return "Mensagem de Email enviada com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Mensagem de Email deletada com sucesso!";
    }
}
