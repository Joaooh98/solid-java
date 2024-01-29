package dependency_inversion.solution;

import single_responsibility.solucao.Order;
import single_responsibility.violacao.SendGmail;

public class SendEmailConfirmed implements ISendEmailRepository {

    @Override
    public void send(Order order) {
        SendGmail sendGmail = new SendGmail("usuar", "pass");

        String nome = order.getClientName();
        String email = order.getCustomerEmail();

        String html = "Dear customer,".concat(nome).concat("your order").concat(order.getId().toString())
                .concat("has been confirmed!");

        sendGmail.send(html, email);
    }

}
