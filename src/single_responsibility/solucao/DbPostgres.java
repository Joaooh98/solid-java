package single_responsibility.solucao;

import single_responsibility.violacao.ConectPostgres;

public class DbPostgres {

    public boolean salvar(Order pedido) {
        ConectPostgres dbConexao = new ConectPostgres("database.url");
        try {
            dbConexao.salvar(pedido);
        } catch (Exception e) {
           // log
           return false;
        }
        return true;
    }
    
}
