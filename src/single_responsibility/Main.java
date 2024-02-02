package single_responsibility;

import single_responsibility.solucao.Order;
import single_responsibility.solucao.ProcessOrderSRP;
import single_responsibility.violacao.ProcessOrder;

public class Main {
    public static void main(String[] args) {
        var processor = new ProcessOrder(); // nao esta seguindo SRP
        var processorSRP = new ProcessOrderSRP(); // esta seguindo SRP
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
