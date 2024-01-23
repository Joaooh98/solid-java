package open_closed_principle;

import open_closed_principle.solucao.MetodoPagamento;
import open_closed_principle.solucao.PagamentoCerto;
import open_closed_principle.solucao.PagamentoComCartao;
import open_closed_principle.solucao.PagamentoEmDinheiro;
import open_closed_principle.violacao.Pagamento;

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
