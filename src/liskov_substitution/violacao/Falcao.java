package liskov_substitution.violacao;

public class Falcao extends Passaro {

    @Override
    public void bicar() {
        System.out.println("bicar");
    }

    @Override
    public void voar() {
       System.out.println("voar");
    }
    
}
