package org.example;

public class ServicoWhatsapp implements IServico{
    @Override
    public String executar() {
        return "Mensagem de whatsapp enviada com sucesso!";
    }

    @Override
    public String cancelar() {
        return "Mensagem de whatsapp deletada com sucesso!";
    }
}
