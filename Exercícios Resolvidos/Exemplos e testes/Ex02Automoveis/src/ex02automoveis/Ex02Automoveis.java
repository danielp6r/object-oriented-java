package ex02automoveis;

/**
 *
 * @author daniel
 */
public class Ex02Automoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro a1 = new Carro("Kia", "Sportage", 2006, "Prata");
        Moto a2 = new Moto("Honda", "Biz", 2024, "Vermelha");
       
        a1.comprar();
        a1.pagarDoc();  
        System.out.println(a1.status());
        
        System.out.println("==================");
        
        a2.setCilindradas(125);
        a2.fugirDoCaramelo();
        System.out.println(a2.status());
    }
    
}
