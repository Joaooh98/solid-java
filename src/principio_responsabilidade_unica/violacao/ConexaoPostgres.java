package principio_responsabilidade_unica.violacao;

import principio_responsabilidade_unica.solucao.Pedido;

public class ConexaoPostgres {

    public ConexaoPostgres(String string) {
        // simulando conexão com postgres
    }

    public void salvar(Pedido pedido) {
       
        System.out.println("Pedido persitido no POSTGRES");
    }
    
}
