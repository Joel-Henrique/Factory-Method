package org.example;

public class ServicoFactory {
    public static Aplicativo obterServico(String servico, float ValorBase, int numMensagens) {
        Class classe = null;
        Object objeto = null;
        try{
            classe = Class.forName("org.example.Servico" + servico);
            objeto = classe.getConstructor(float.class, int.class).newInstance(ValorBase, numMensagens);
        } catch(Exception ex){
            throw new IllegalArgumentException("Servico inexistente");
        }
        if(!(objeto instanceof Aplicativo)){
            throw new IllegalArgumentException("Servico invalido");
        }
        return (Aplicativo) objeto;
    }
}
