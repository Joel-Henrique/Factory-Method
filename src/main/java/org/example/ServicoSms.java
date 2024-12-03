package org.example;
public class ServicoSms implements IServico{
    @Override
    public String executar() {
        return "Mensagem de Sms enviada com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Mensagem de Sms deletada com sucesso!";
    }
}
