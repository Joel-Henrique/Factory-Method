package factoryMethod;

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoWhatsappTest {
    @Test
    void deveRetornarJoeleMarcos() {
        Aplicativo servico = ServicoFactory.obterServico("Whatsapp", 100.0f, 3);
        Parametros.getInstance().setNomeUser("Joel");
        Parametros.getInstance().setNomePessoaMensagem("Alfredo");
        assertEquals("Mensagem de Email do user Joel enviada para Alfredo com sucesso!", servico.executar());

    }
    @Test
    void deveCalcularValorComUrgenciaAlta() {
        Aplicativo servico = ServicoFactory.obterServico("Whatsapp", 100.0f, 3);
        Urgencia Urgencia = new Alta();
        servico.setUrgencia(Urgencia);
        assertEquals(300.0f, servico.calcularValor(), 0.01f);
    }
    @Test
    void deveCalcularValorComUrgenciaIntermediaria() {
        Aplicativo servico = ServicoFactory.obterServico("Whatsapp", 100.0f, 3);
        Urgencia Urgencia = new Intermediaria();
        servico.setUrgencia(Urgencia);
        assertEquals(300.0f, servico.calcularValor(), 0.01f);
    }
    @Test
    void deveCalcularValorComUrgenciaNormal() {
        Aplicativo servico = ServicoFactory.obterServico("Whatsapp", 100.0f, 3);
        Urgencia Urgencia = new Normal();
        servico.setUrgencia(Urgencia);
        assertEquals(300.0f, servico.calcularValor(), 0.01f);
    }

}
