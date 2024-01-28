package open_closed_principle.solucaopratica;

public class PagamentoCerto {
    private MetodoPagamento metodoPagamento;

    public PagamentoCerto(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    };

    public void realizarPagamento(double valor){
        this.metodoPagamento.realizarPagamento(valor);
        
    }
}
