package pessoaheranca;

/**
 *
 * @author danielp6r
 */
public class Motorista extends Pessoa{
    private String numCNH;
    private String vencCNH;

    public Motorista(String cpf, String nome, String email, String telefone, String numCNH, String vencCNH) {
        super(cpf, nome, email, telefone);
        this.numCNH = numCNH;
        this.vencCNH = vencCNH;
    }

    public String getNumCNH() {
        return numCNH;
    }

    public void setNumCNH(String numCNH) {
        this.numCNH = numCNH;
    }

    public String getVencCNH() {
        return vencCNH;
    }

    public void setVencCNH(String vencCNH) {
        this.vencCNH = vencCNH;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nNúmero da CNH: " + numCNH + "\nVencimento: " + vencCNH;
    }

}
