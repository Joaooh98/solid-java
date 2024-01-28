package dependency_inversion.violation;

import single_responsibility.solucao.Order;

public class ProcessOrder {
    
    public void process(Order order){
        PostgresRepository postgresRepository = new PostgresRepository();
        SendEmailConfirmed send = new SendEmailConfirmed();

        System.out.println("Business rule when processing order");

        order.setClientName("John");
        order.setCustomerEmail("john@gmail.com");
        order.setId(1);

        postgresRepository.salvar(order);
        send.sendoEmail(order);

    }
}
