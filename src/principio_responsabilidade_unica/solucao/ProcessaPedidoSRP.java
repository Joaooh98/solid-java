package principio_responsabilidade_unica.solucao;

public class ProcessaPedidoSRP {

    public void processar(Pedido pedido) {

        DbPostgres dbPostgres = new DbPostgres();
        EnviarConfirmacao enivarConfirmacao = new EnviarConfirmacao();

        dbPostgres.salvar(pedido);

        enivarConfirmacao.enviarEmailComfirmacao(pedido);

    }
}
