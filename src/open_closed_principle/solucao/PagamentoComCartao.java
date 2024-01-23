package open_closed_principle.solucao;

public class PagamentoComCartao implements MetodoPagamento{

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("realizado o pagamento com cartao R$ "+valor);    
    }
    
}
