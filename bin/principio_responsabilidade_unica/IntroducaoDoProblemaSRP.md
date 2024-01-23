SRP - Single Responsibility Principle

    Principio da responsabilidade unica

    - Esse princípio diz que uma classe deve ter apenas uma razão para ser modificada, ou seja, ela deve ter apenas uma responsabilidade no sistema.

    exemplo com erro:

    ```java
            public class ProcessaPedido {
            public Pedido processar(Pedido pedido) {
                boolean persistidoBanco = salvar(pedido);

                if (pedido.isvalid() && persistidoBanco) {
                    enviarEmailComfirmacao(pedido);
                }
                return pedido;
            }

            private void enviarEmailComfirmacao(Pedido pedido) {
                EnviarGmail enviarGmail = new EnviarGmail("usuario", "senha");
                String nome = pedido.getNomeCliente();
                String email = pedido.getEmailCliente();

                String html = "Caro cliente".concat(nome).concat("seu pedido").concat(pedido.getId().toString()).concat("foi confirmado!");

                enviarGmail.enviar(html, email);
            }

            private boolean salvar(Pedido pedido) {
                ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");
                try {
                    dbConnection.salvar(pedido);
                } catch (Exception e) {
                    return false;
                }
                return true;
            }
        }
    ```

    Responsabilidades Múltiplas:

A classe ProcessaPedido tem a responsabilidade de processar o pedido, salvar no banco de dados e enviar um e-mail de confirmação. Isso viola o SRP, pois a classe está lidando com mais de uma responsabilidade.

    Dependências Acopladas:

A classe ProcessaPedido cria instâncias de outras classes (EnviarGmail e ConexaoPostgres) dentro de seus métodos. Isso torna a classe dependente dessas implementações específicas, o que pode dificultar a manutenção e a extensão do código.

    Solucao:

         Para melhor o código, vou reformular a classe para separar suas responsabilidades. Por exemplo, cria classes específicas para lidar com a persistência no banco de dados e outra somente para envio de e-mails, isso torna o código mais modular e legível, com facilidade para dar manutenção.
