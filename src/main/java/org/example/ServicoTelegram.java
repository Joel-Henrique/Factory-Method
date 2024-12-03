package org.example;

public class ServicoTelegram implements IServico{
    @Override
    public String executar() {
        return "Mensagem do Telegram enviada com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Mensagem do Telegram deletada com sucesso!";
    }
}
