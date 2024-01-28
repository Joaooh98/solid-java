package dependency_inversion.violation;

import single_responsibility.solucao.Order;

public class OracleRepository {
    public boolean salvar(Order order) {
        ConectOracle conectOracle = new ConectOracle("database.url");
        try {
            conectOracle.salvar(order);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
