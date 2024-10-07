package aula011;

/**
 *
 * @author daniel
 */
public class Aula011 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); ( Classe abstrata não pode ser instanciada.
        Visitante v1 = new Visitante();
        v1.setNome ("Juvenal");
        v1.setIdade(22);
        v1.setSexo ("M");
        System.out.println(v1.toString());
        System.out.println("--------------");
        Aluno a1 = new Aluno();
        a1.setNome("Cláudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        System.out.println("--------------");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(11112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
        b1.setIdade(17);
        System.out.println(b1.toString());
    }
    
}
