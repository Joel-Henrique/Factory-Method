package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicoSmsTest {
    @Test
    void deveExecutarQuarto(){
        IServico servico = ServicoFactory.obterServico("Sms");
        assertEquals("Mensagem de Sms enviada com sucesso!", servico.executar());
    }
    @Test
    void deveCancelarQuarto(){
        IServico servico = ServicoFactory.obterServico("Sms");
        assertEquals("Mensagem de Sms deletada com sucesso!", servico.cancelar());
    }

}
