package liskov_substitution.solucao;

public class Canario extends Passaro {

    @Override
    public void bicar() {
        System.out.println("bicar");
    }

    @Override
    public void voar() {
       System.out.println("voar");
    }
    
}
