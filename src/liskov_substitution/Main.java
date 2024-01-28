package liskov_substitution;

import liskov_substitution.solucao.PinguimS;
import liskov_substitution.violacao.Falcao;
import liskov_substitution.violacao.Pinguim;

public class Main {
    public static void main(String[] args) {
        System.out.println("respeitando os principios");
        var pinguim = new PinguimS();
        var falcao = new Falcao();

        pinguim.voar();  
        falcao.voar(); 

        var pinguimError = new Pinguim();

        falcao.voar(); 
        pinguimError.voar();  

    }
}
