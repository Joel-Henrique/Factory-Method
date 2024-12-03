package factoryMethod;

import org.example.IServico;
import org.example.ServicoFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ServicoFactoryTest {
    @Test
    void deveRetornarExcecaoParaServicoInexistente(){
        try{
            IServico servico = ServicoFactory.obterServico("Slack");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Servico inexistente", e.getMessage());
        }
    }
    @Test
    void deveRetornarExcecaoParaServicoInvalido(){
        try{
            IServico servico = ServicoFactory.obterServico("Discord");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Servico invalido", e.getMessage());
        }
    }
}
