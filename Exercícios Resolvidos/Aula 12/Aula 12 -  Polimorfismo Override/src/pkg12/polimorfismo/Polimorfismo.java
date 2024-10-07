package pkg12.polimorfismo;

/**
 *
 * @author daniel
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Animal n = new Animal(); (classe abstrata não pode ser instanciada.)
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();
        
        
        c.locomover();
        k.locomover();
        c.emitirSom();
        k.emitirSom();
    }
    
}
