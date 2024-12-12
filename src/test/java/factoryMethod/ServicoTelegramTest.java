package factoryMethod;

import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoTelegramTest {
        @Test
        void deveRetornarJoeleMarcos() {
            Aplicativo servico = ServicoFactory.obterServico("Telegram", 100.0f, 3);
            Parametros.getInstance().setNomeUser("Joel");
            Parametros.getInstance().setNomePessoaMensagem("Marcos");

            assertEquals("Mensagem do Telegram do user Joel enviada para Marcos com sucesso!", servico.executar());
        }
        @Test
        void deveCalcularValorComUrgenciaAlta() {
            Aplicativo servico = ServicoFactory.obterServico("Telegram", 100.0f, 3);
            Urgencia Urgencia = new Alta();
            servico.setUrgencia(Urgencia);
            assertEquals(130.0f, servico.calcularValor(), 0.01f);
        }
        @Test
        void deveCalcularValorComUrgenciaIntermediaria() {
            Aplicativo servico = ServicoFactory.obterServico("Telegram", 100.0f, 3);
            Urgencia Urgencia = new Intermediaria();
            servico.setUrgencia(Urgencia);
            assertEquals(115.0f, servico.calcularValor(), 0.01f);
        }
        @Test
        void deveCalcularValorComUrgenciaNormal() {
            Aplicativo servico = ServicoFactory.obterServico("Telegram", 100.0f, 3);
            Urgencia Urgencia = new Normal();
            servico.setUrgencia(Urgencia);
            assertEquals(100.0f, servico.calcularValor(), 0.01f);
        }

    }
