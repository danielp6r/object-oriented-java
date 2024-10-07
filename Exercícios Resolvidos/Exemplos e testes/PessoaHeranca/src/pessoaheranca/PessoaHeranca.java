package pessoaheranca;

/**
 *
 * @author danielp6r
 */
public class PessoaHeranca {

    public static void main(String[] args) {
    Pessoa p1 = new Pessoa("123.456.789-10", "João", "joao@gmail.com", "991234567");
    Vendedor v1 = new Vendedor(p1.getCpf(), p1.getNome(), p1.getEmail(), p1.getTelefone(), 0.9f, "Móveis");
    Motorista m1 = new Motorista(p1.getCpf(), p1.getNome(), p1.getEmail(), p1.getTelefone(), "12345678910", "01 - 02 - 2025");
    
        System.out.println(v1.toString());
        System.out.println("------------");
        System.out.println(m1.toString());
    }

}
