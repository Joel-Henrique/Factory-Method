package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoEmailTest {
    @Test
    void deveExecutarEmail(){
        IServico servico = ServicoFactory.obterServico("Email");
        assertEquals("Mensagem de Email enviada com sucesso!", servico.executar());
    }
    @Test
    void deveCancelarEmail(){
        IServico servico = ServicoFactory.obterServico("Email");
        assertEquals("Mensagem de Email deletada com sucesso!", servico.cancelar());
    }
}
