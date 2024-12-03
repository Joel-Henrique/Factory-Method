package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ServicoTelegramTest {
    @Test
    void deveExecutarTelegram(){
        IServico servico = ServicoFactory.obterServico("Telegram");
        assertEquals("Mensagem do Telegram enviada com sucesso!", servico.executar());
    }

    @Test
    void deveCancelarFormatura(){
        IServico servico = ServicoFactory.obterServico("Telegram");
        assertEquals("Mensagem do Telegram deletada com sucesso!", servico.cancelar());
    }


}
