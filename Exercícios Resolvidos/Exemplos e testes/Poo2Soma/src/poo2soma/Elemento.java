package poo2soma;

/**
 *
 * @author danielp6r
 */
public class Elemento {
public float valor;

public float getValor(){
    return valor;
    
}
    public Elemento(float valor) {
        this.valor = valor;
    }
    
    public static float somarValores(Elemento[] elementos) {
        float soma = 0.0f;
        for (Elemento i : elementos){
            soma += i.getValor();
        }
    return soma;
    }

}
