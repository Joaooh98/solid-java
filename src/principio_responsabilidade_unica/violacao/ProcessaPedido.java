package principio_responsabilidade_unica.violacao;

import principio_responsabilidade_unica.solucao.Pedido;

public class ProcessaPedido {
    public Pedido processar(Pedido pedido) {
        boolean persistidoBanco = salvar(pedido);

        if (pedido.isvalid() && persistidoBanco) {
            enviarEmailComfirmacao(pedido);
        }
        return pedido;
    }

    private void enviarEmailComfirmacao(Pedido pedido) {

        EnviarGmail enviarGmail = new EnviarGmail("usuario", "senha");
        String nome = pedido.getNomeCliente();
        String email = pedido.getEmailCliente();

        String html = "Caro cliente".concat(nome).concat("seu pedido").concat(pedido.getId().toString()).concat("foi confirmado!");

        enviarGmail.enviar(html, email);
    }

    private boolean salvar(Pedido pedido) {
        ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");
        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
