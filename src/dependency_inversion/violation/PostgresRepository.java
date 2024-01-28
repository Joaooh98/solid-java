package dependency_inversion.violation;

import single_responsibility.solucao.Order;
import single_responsibility.violacao.ConectPostgres;

public class PostgresRepository {

    public boolean salvar(Order order) {
        ConectPostgres conectPostgres = new ConectPostgres("database.url");
        try {
            conectPostgres.salvar(order);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
