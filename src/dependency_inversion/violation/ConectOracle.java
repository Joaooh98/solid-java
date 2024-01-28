package dependency_inversion.violation;

import single_responsibility.solucao.Order;

public class ConectOracle {

    public ConectOracle(String string) {
       
    }

    public void salvar(Order order) {
        System.out.println("Pedido persitido no ORACLE");
    }
    
}
