package single_responsibility.solucao;

import single_responsibility.violacao.SendGmail;

public class SendConfitmation {

    public void enviarEmailComfirmacao(Order order) {
       SendGmail enviarGmail = new SendGmail("usuario", "senha");

       String name = order.getClientName();
       String email = order.getCustomerEmail();

       String html = "Caro cliente".concat(name).concat("seu pedido").concat(order.getId().toString()).concat("foi confirmado!");

       enviarGmail.send(html, email);
    }
    
}
