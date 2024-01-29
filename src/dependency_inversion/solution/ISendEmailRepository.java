package dependency_inversion.solution;

import single_responsibility.solucao.Order;

public interface ISendEmailRepository {

    void send(Order order);
}
