OCP - Open Closed Principle

    Principio do aberto/fechado

        - Você deve ser capaz de estender um comportamento de uma classe sem a necessidade de modificá-lo, ou seja, as entidades de software como classes, módulos, funções, etc, devem estar abertas para extensão, porém fechadas para modificação.

        -Surgiu uma nova demanda para modificar a classe e inserir novas validacoes 

    problema: deve ser inserido mais meios de pamentos:

    ```java
    public class Pagamento {
        public void realizarPagamento(double valor) {
            // Lógica para pagamento em dinheiro
            System.out.println("Pagamento em dinheiro no valor de " + valor + " realizado.");
        }
    }

            // erro cometido 
    public class Pagamento {
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

    ```
        Solucao: criar uma interface MetodoPagamento e, em seguida, e criar classes para cada metodo de pagamento aberta para extensao

         