package single_responsibility.solucao;

public class ProcessOrderSRP {

    public void processar(Order pedido) {

        DbPostgres dbPostgres = new DbPostgres();
        SendConfitmation enivarConfirmacao = new SendConfitmation();

        dbPostgres.save(pedido);

        enivarConfirmacao.enviarEmailComfirmacao(pedido);

    }
}
