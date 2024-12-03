package org.example;

public class ServicoWhatsapp implements IServico{
    @Override
    public String executar() {
        return "Mensagem de Whatsapp enviada com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Mensagem de Whatsapp deletada com sucesso!";
    }
}
