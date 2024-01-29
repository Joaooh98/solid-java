package dependency_inversion.solution;

import single_responsibility.solucao.Order;

public interface IBankDateRepository {

    boolean save(Order order);
}
