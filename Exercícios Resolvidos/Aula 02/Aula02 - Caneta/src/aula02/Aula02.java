package aula02;

/**
 *
 * @author daniel
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Caneta 1: \n");
        
        Caneta c1 = new Caneta("Bic", "Azul", 0.5f);
        c1.destampar();
        c1.rabiscar();
        c1.rabiscar();
        c1.status();
        
        System.out.println("\nCaneta 2: \n");
        
        Caneta c2 = new Caneta("Bic", "Preta", 1.0f);
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
    
        
    
}
