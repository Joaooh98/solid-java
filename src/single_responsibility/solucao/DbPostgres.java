package single_responsibility.solucao;

import single_responsibility.violacao.ConectPostgres;

public class DbPostgres {

    public boolean save(Order order) {
        ConectPostgres dbConexao = new ConectPostgres("database.url");
        try {
            dbConexao.salvar(order);
        } catch (Exception e) {
           // log
           return false;
        }
        return true;
    }
    
}
