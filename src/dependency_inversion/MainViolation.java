package dependency_inversion;

import dependency_inversion.violation.ProcessOrder;
import single_responsibility.solucao.Order;

public class MainViolation {

    public static void main(String[] args) {
        ProcessOrder processOrder = new ProcessOrder();

        processOrder.process(new Order(),true);  // oracle
        System.out.println("\n####################################\n");   
        processOrder.process(new Order(),false); // postgres
    }
}
