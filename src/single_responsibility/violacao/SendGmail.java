package single_responsibility.violacao;

public class SendGmail {

    public SendGmail(String string, String string2) {
       // confg. conexa com conta.
    }

    public void send(String html, String email) {
        System.out.println("E-mail enviado");
    }
    
}
