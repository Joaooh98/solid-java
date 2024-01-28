package single_responsibility.violacao;

import single_responsibility.solucao.Order;

public class ProcessaPedido {
    public Order processar(Order pedido) {
        boolean persistidoBanco = salvar(pedido);

        if (pedido.isvalid() && persistidoBanco) {
            enviarEmailComfirmacao(pedido);
        }
        return pedido;
    }

    private void enviarEmailComfirmacao(Order pedido) {

        EnviarGmail enviarGmail = new EnviarGmail("usuario", "senha");
        String nome = pedido.getClientName();
        String email = pedido.getCustomerEmail();

        String html = "Caro cliente".concat(nome).concat("seu pedido").concat(pedido.getId().toString()).concat("foi confirmado!");

        enviarGmail.enviar(html, email);
    }

    private boolean salvar(Order pedido) {
        ConectPostgres dbConnection = new ConectPostgres("database.url");
        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
