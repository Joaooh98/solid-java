package dependency_inversion.solution;

import dependency_inversion.violation.ConectOracle;
import single_responsibility.solucao.Order;

public class Oracle implements IBankDateRepository{

    @Override
    public boolean save(Order order) {
        ConectOracle conectOracle = new ConectOracle("database.url");
        try {
            conectOracle.salvar(order);
        } catch (Exception e) {
           // log de erro 
           return false;        
        }
        return true;
    }
    
}
