package principio_responsabilidade_unica.solucao;

import principio_responsabilidade_unica.violacao.EnviarGmail;

public class EnviarConfirmacao {

    public void enviarEmailComfirmacao(Pedido pedido) {
       EnviarGmail enviarGmail = new EnviarGmail("usuario", "senha");

       String nome = pedido.getNomeCliente();
       String email = pedido.getEmailCliente();

       String html = "Caro cliente".concat(nome).concat("seu pedido").concat(pedido.getId().toString()).concat("foi confirmado!");

       enviarGmail.enviar(html, email);
    }
    
}
