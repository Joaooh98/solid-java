package open_closed_principle.solution;

import single_responsibility.solucao.Order;
import single_responsibility.solucao.ProcessaPedidoSRP;

public class ProcessaPedidoWithValidate extends ProcessaPedidoSRP{
    
    public void processar(Order pedido){
        if (!pedido.isPossuiItens()) {
            throw new RuntimeException("Pedido sem itens!");
        }

        super.processar(pedido);

        if (!pedido.isvalid()) {
            throw new RuntimeException("Pedido sem o ID!");
        }
    }
    
}
