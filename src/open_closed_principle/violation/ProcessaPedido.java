package open_closed_principle.violation;

import single_responsibility.solucao.DbPostgres;
import single_responsibility.solucao.SendConfitmation;
import single_responsibility.solucao.Order;

public class ProcessaPedido {
    public void processar(Order pedido) {
        if (!pedido.isPossuiItens()) {
            throw new RuntimeException("Nao e possivel continuar! Pedido sem itens.");
        }

        DbPostgres dbPostgres = new DbPostgres();
        SendConfitmation enivarConfirmacao = new SendConfitmation();

        dbPostgres.save(pedido);

        enivarConfirmacao.enviarEmailComfirmacao(pedido);

        if (!pedido.isvalid()) {
            throw new RuntimeException("Nao foi possivel continuar! pedido sem id!");
        }
    }

}
