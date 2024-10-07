package veiculoheranca;

/**
 *
 * @author danielp6r
 */
public class VeiculoHeranca {

    public static void main(String[] args) {
        Vendedor v1 = new Vendedor("João","123456789","joao@sales.com", "9912335480");
        Motorista m1 = new Motorista("Maria", "1234567789", "maria@email.com", "99887766","123456789", "01/01/2030");
        
        Carro c1 = new Carro("Kia", "Sportage", 2006, "Prata", v1);
        c1.setPlaca("AAA1122 ");
        c1.setHp(222);
        System.out.println(v1.getNome() + " está vendendo " + c1.getModelo());
        System.out.println(c1.toString());
        System.out.println("----------------------------");
        
        c1.comprar(m1);
        System.out.println(m1.getNome() + " Comprou " + c1.getModelo());
        c1.pagarDoc();
        c1.ligarAC();
        System.out.println(c1.toString());
        
    }

}
