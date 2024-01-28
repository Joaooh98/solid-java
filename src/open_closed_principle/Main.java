package open_closed_principle;

import open_closed_principle.solucaopratica.MetodoPagamento;
import open_closed_principle.solucaopratica.PagamentoCerto;
import open_closed_principle.solucaopratica.PagamentoComCartao;
import open_closed_principle.solucaopratica.PagamentoEmDinheiro;
import open_closed_principle.violacaopratica.Pagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamentoErrado = new Pagamento();
        pagamentoErrado.realizarPagamento(50.0, "dinheiro");
        pagamentoErrado.realizarPagamento(30.0, "cartao");

        System.out.println("-------------");

        // Exemplo Correto
        MetodoPagamento pagamentoDinheiro = new PagamentoEmDinheiro();
        PagamentoCerto pagamentoCorretoDinheiro = new PagamentoCerto(pagamentoDinheiro);
        pagamentoCorretoDinheiro.realizarPagamento(50.0);

        MetodoPagamento pagamentoCartao = new PagamentoComCartao();
        PagamentoCerto pagamentoCorretoCartao = new PagamentoCerto(pagamentoCartao);
        pagamentoCorretoCartao.realizarPagamento(30.0);
    }
}
