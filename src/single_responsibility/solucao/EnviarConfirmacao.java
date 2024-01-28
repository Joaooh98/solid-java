package single_responsibility.solucao;

import single_responsibility.violacao.EnviarGmail;

public class EnviarConfirmacao {

    public void enviarEmailComfirmacao(Order pedido) {
       EnviarGmail enviarGmail = new EnviarGmail("usuario", "senha");

       String nome = pedido.getClientName();
       String email = pedido.getCustomerEmail();

       String html = "Caro cliente".concat(nome).concat("seu pedido").concat(pedido.getId().toString()).concat("foi confirmado!");

       enviarGmail.enviar(html, email);
    }
    
}
