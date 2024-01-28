package single_responsibility;

import single_responsibility.solucao.Order;
import single_responsibility.solucao.ProcessaPedidoSRP;
import single_responsibility.violacao.ProcessaPedido;

public class Main {
    public static void main(String[] args) {
        var processor = new ProcessaPedido(); // nao esta seguindo SRP
        var processorSRP = new ProcessaPedidoSRP(); // esta seguindo SRP
        var pedido = new Order();

        pedido.setClientName("John");
        pedido.setCustomerEmail("john@gmail.com");
        pedido.setId(1);

        System.out.println("\n Não está seguindo SRP\n");
        processor.processar(pedido);
        System.out.println("\n está seguindo SRP\n");
        processorSRP.processar(pedido);

        
    }
}
