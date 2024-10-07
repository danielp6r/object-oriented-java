package poo2soma;

/**
 *
 * @author danielp6r
 */
public class Poo2Soma {

    public static void main(String[] args) {
    Elemento e[] = new Elemento[3];
    e[0] = new Banana(1.50f);
    e[1] = new Casa(500000.00f);
    e[2] = new Algoritmo(10.0f);
    System.out.println("Valor da Banana: "+ e[0].getValor());
    System.out.println("Valor da Casa: "+ e[1].getValor());  
    System.out.println("Valor do Algoritmo: "+ e[2].getValor());
    
    float somaTotal = Elemento.somarValores(e);
    System.out.println("Valor total: " + somaTotal) ;
    
    }

}
