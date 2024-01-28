package liskov_substitution.violacao;

public class Pinguim extends Passaro {

    @Override
    public void bicar() {
        System.out.println("bicar");
    }

    @Override
    public void voar() {
        throw new RuntimeException("Principio da LSP, indo para o espaço");
    }
    
    
}
