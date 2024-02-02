OCP - Open Closed Principle

    Principio do aberto/fechado

        - Você deve ser capaz de estender um comportamento de uma classe sem a necessidade de modificá-lo, ou seja, as entidades de software como classes, módulos, funções, etc, devem estar abertas para extensão, porém fechadas para modificação.

        -Surgiu uma nova demanda para modificar a classe e inserir novas validacoes 

    problema: deve ser inserido mais meios de pamentos:

    ```java
    public class ProcessaPedido {
        public void processar(Order pedido) {
            if (!pedido.isPossuiItens()) {
                throw new RuntimeException("Nao e possivel continuar! Pedido sem itens.");
            }

            DbPostgres dbPostgres = new DbPostgres();
            EnviarConfirmacao enivarConfirmacao = new EnviarConfirmacao();

            dbPostgres.salvar(pedido);

            enivarConfirmacao.enviarEmailComfirmacao(pedido);

            if (!pedido.isvalid()) {
                throw new RuntimeException("Nao foi possivel continuar! pedido sem id!");
            }
        }
    }

    ```

         