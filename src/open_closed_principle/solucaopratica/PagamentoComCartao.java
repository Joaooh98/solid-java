package open_closed_principle.solucaopratica;

public class PagamentoComCartao implements MetodoPagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("realizado o pagamento com cartao R$ "+valor);    
    }
    
}
