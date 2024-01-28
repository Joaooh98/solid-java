package open_closed_principle.solucaopratica;

public class PagamentoEmDinheiro implements MetodoPagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("realizado o pagamento em dinheiro R$ "+valor);    
    }
    
}
