package pessoacomposicao;

/**
 *
 * @author danielp6r
 */
public class Motorista {
    private Pessoa pessoa;
    private String numCNH;
    private String vencCNH;

    public Motorista(Pessoa pessoa, String numCNH, String vencCNH) {
        this.pessoa = pessoa;
        this.numCNH = numCNH;
        this.vencCNH = vencCNH;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
        return pessoa.toString() + "\nNúmero da CNH: " + numCNH + "\nVencimento: " + vencCNH;
    }

}
