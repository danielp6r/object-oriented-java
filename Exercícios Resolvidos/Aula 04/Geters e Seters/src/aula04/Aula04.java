package aula04;

/**
 *
 * @author daniel
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f);
        c1.setPonta(0.5f);
        //c1.ponta = 0.5f; Não pode, pois é protegido.
        c1.status();
        
        Caneta c2 = new Caneta("Marca2", "Vermelha", 1.0f);
        c2.status(); 
    }
    
}
