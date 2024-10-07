package veiculocomposicao;

/**
 *
 * @author danielp6r
 */
public class VeiculoComposicao {

    public static void main(String[] args) {
    Proprietario p1 = new Proprietario("123.456.789-10", "João", "joao@sales.com","999887766");
    Proprietario p2 = new Proprietario("321,654,987-01", "Maria", "maria@mail.com","998877665");
    
    
    Vendedor v1 = new Vendedor(p1,10.1f,"Vendedor de Carros");
    Motorista m1 = new Motorista(p2,"123456789", "01/01/2099");
    
    Veiculo v = new Veiculo("Honda", "Biz", 2024, "Vermelha", p1);
    System.out.println(p1.getNome() + " está vendendo " + v.getFabricante() + " " + v.getModelo() + " " + v.getAno());
    System.out.println(v.toString());
    System.out.println("-------------------------------------");
    
    System.out.println(p2.getNome() + " comprou " + v.getModelo());
    v.comprar(p2); //Veículo deve ser comprado aqui, pois as Classes Carro e Moto não possuem os métodos por não ter herança.
    v.pagarDoc(); // Documento deve ser pago aqui também. (Os métodos podem ser copiados, oque é péssimo para o reúso...)
    v.setPlaca("ABC1234"); //Conclusão: Se tratando de reutilizar métodos, herança wins...
    
    Moto moto = new Moto(v,p2,125);
    System.out.println(moto.toString());
    System.out.println("-------------------------------------");
    
    moto.fugirDoCaramelo();
    }

}
