package dependency_inversion.violation;

import single_responsibility.solucao.Order;

public class ProcessOrder {
    
    public void process(Order order, boolean isOracle){
        OracleRepository oracleRepository = new OracleRepository();
        PostgresRepository postgresRepository = new PostgresRepository();
        SendEmailConfirmed send = new SendEmailConfirmed();

        System.out.println("Business rule when processing order");

        order.setClientName("John");
        order.setCustomerEmail("john@gmail.com");
        order.setId(1);

        if (isOracle) {
            oracleRepository.salvar(order);
        }else{

            postgresRepository.salvar(order);
        }

        send.sendEmail(order);

    }
}
