package single_responsibility.solucao;

public class Order {

    private Integer id;

    private String clientName;

    private String customerEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String nomeCliente) {
        this.clientName = nomeCliente;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String emailCliente) {
        this.customerEmail = emailCliente;
    }

    public boolean isvalid() {
       return true;
    }

    public boolean isPossuiItens() {
        return true;
    }
}
