package dependency_inversion.violation;

import single_responsibility.solucao.Order;

public class SendEmailConfirmed {

    public void sendEmail(Order order) {
        System.out.println("envoy");
    }
    
}
