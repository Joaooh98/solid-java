package single_responsibility.solucao;

public class ProcessaPedidoSRP {

    public void processar(Order pedido) {

        DbPostgres dbPostgres = new DbPostgres();
        EnviarConfirmacao enivarConfirmacao = new EnviarConfirmacao();

        dbPostgres.salvar(pedido);

        enivarConfirmacao.enviarEmailComfirmacao(pedido);

    }
}
