package single_responsibility.violacao;

import single_responsibility.solucao.Order;

public class ConectPostgres {

    public ConectPostgres(String string) {
        // simulando conexão com postgres
    }

    public void salvar(Order pedido) {
       
        System.out.println("Pedido persitido no POSTGRES");
    }
    
}
