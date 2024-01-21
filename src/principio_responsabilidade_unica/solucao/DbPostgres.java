package principio_responsabilidade_unica.solucao;

import principio_responsabilidade_unica.violacao.ConexaoPostgres;

public class DbPostgres {

    public boolean salvar(Pedido pedido) {
        ConexaoPostgres dbConexao = new ConexaoPostgres("database.url");
        try {
            dbConexao.salvar(pedido);
        } catch (Exception e) {
           // log
           return false;
        }
        return true;
    }
    
}
