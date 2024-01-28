package open_closed_principle.violacaopratica;

public class Pagamento {
    public void realizarPagamento(double valor) {
        // Lógica para pagamento em dinheiro
        System.out.println("Pagamento em dinheiro no valor de " + valor + " realizado.");
    }

    public void realizarPagamento(double valor, String tipo) {
        if (tipo.equals("dinheiro")) {
            // Lógica para pagamento em dinheiro
            System.out.println("Pagamento em dinheiro no valor de " + valor + " realizado.");
        } else if (tipo.equals("cartao")) {
            // Lógica para pagamento com cartão de crédito
            System.out.println("Pagamento com cartão de crédito no valor de " + valor + " realizado.");
        }
    }
}