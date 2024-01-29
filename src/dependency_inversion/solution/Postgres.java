package dependency_inversion.solution;

import single_responsibility.solucao.Order;
import single_responsibility.violacao.ConectPostgres;

public class Postgres implements IBankDateRepository {

    @Override
    public boolean save(Order order) {

        ConectPostgres conect = new ConectPostgres("database.url");
        try {
            conect.salvar(order);
        } catch (Exception e) {
            // log de erro
            return false;
        }
        return true;

    }

}
