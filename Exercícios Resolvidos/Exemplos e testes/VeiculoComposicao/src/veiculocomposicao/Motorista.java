package veiculocomposicao;

/**
 *
 * @author danielp6r
 */
public class Motorista {
    private Proprietario proprietario;
    private String numCNH;
    private String vencCNH;

    public Motorista(Proprietario proprietario, String numCNH, String vencCNH) {
        this.proprietario = proprietario;
        this.numCNH = numCNH;
        this.vencCNH = vencCNH;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
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
        return "Motorista{" + "proprietario=" + proprietario + ", numCNH=" + numCNH + ", vencCNH=" + vencCNH + '}';
    }
    
}
