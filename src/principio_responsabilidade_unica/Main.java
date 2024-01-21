package principio_responsabilidade_unica;

import principio_responsabilidade_unica.solucao.Pedido;
import principio_responsabilidade_unica.solucao.ProcessaPedidoSRP;
import principio_responsabilidade_unica.violacao.ProcessaPedido;

public class Main {
    public static void main(String[] args) {
        var processor = new ProcessaPedido(); // nao esta seguindo SRP
        var processorSRP = new ProcessaPedidoSRP(); // esta seguindo SRP
        var pedido = new Pedido();

        pedido.setNomeCliente("John");
        pedido.setEmailCliente("john@gmail.com");
        pedido.setId(1);

        System.out.println("\n Não está seguindo SRP\n");
        processor.processar(pedido);
        System.out.println("\n está seguindo SRP\n");
        processorSRP.processar(pedido);

        
    }
}
