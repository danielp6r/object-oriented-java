package pessoacomposicao;

/**
 *
 * @author danielp6r
 */
public class PessoaComposicao {

    public static void main(String[] args) {
    Pessoa p1 = new Pessoa("123.456.789-10", "Maria", "maria@gmail.com", "991234567");
    Vendedor v1 = new Vendedor(p1, 0.9f, "Decoração");
    Motorista m1 = new Motorista(p1, "123456789", "01-02-2025");
    
        System.out.println(v1.toString());
        System.out.println("-------------------------");
        System.out.println(m1.toString());
    }

}
