package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoWhatsappTest {
    @Test
    void deveExecutarWhatsapp(){
        IServico servico = ServicoFactory.obterServico("Whatsapp");
        assertEquals("Mensagem de Whatsapp enviada com sucesso!", servico.executar());
    }
    @Test
    void deveCancelarEstacionamento(){
        IServico servico = ServicoFactory.obterServico("Whatsapp");
        assertEquals("Mensagem de Whatsapp deletada com sucesso!", servico.cancelar());
    }
}
