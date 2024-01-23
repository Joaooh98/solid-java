package principio_responsabilidade_unica.solucao;

public class Pedido {

    private Integer id;

    private String nomeCliente;

    private String emailCliente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public boolean isvalid() {
       return true;
    }

    public boolean isPossuiItens() {
        return true;
    }
}
