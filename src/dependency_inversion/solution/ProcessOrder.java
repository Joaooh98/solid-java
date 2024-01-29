package dependency_inversion.solution;

import single_responsibility.solucao.Order;

public class ProcessOrder {
    
    private IBankDateRepository bankDateRepository;

    private ISendEmailRepository iSendEmailRepository;

    public ProcessOrder(IBankDateRepository bankDateRepository, ISendEmailRepository iSendEmailRepository) {
        this.bankDateRepository = bankDateRepository;
        this.iSendEmailRepository = iSendEmailRepository;
    }

    public void process(Order order){

        order.setClientName("john");
        order.setCustomerEmail("john@gmail.com");
        order.setId(1);

        bankDateRepository.save(order);
        iSendEmailRepository.send(order);
    }
}
