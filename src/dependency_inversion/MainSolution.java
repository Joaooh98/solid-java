package dependency_inversion;

import dependency_inversion.solution.Oracle;
import dependency_inversion.solution.Postgres;
import dependency_inversion.solution.SendEmailConfirmed;
import dependency_inversion.solution.ProcessOrder;
import single_responsibility.solucao.Order;

public class MainSolution {
    public static void main(String[] args) {

        Postgres postgres = new Postgres();
        Oracle oracle = new Oracle();
        var send = new SendEmailConfirmed();

        var order = new Order();

        ProcessOrder processOrderOracle = new ProcessOrder(oracle, send);
        ProcessOrder processOrderPostgres = new ProcessOrder(postgres, send);

        processOrderOracle.process(order);
        System.out.println("\n####################################\n");
        processOrderPostgres.process(order);

    }
}
