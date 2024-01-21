package principio_responsabilidade_unica.solucao;

public class ProcessaPedidoSRP {

    public void processar(Pedido pedido) {

        if (pedido.isvalid()) {

            DbPostgres dbPostgres = new DbPostgres();
            EnviarConfirmacao enivarConfirmacao = new EnviarConfirmacao();

            dbPostgres.salvar(pedido);

            enivarConfirmacao.enviarEmailComfirmacao(pedido);
        } else {

            System.out.println("pedido com erro");
        }

    }
}
