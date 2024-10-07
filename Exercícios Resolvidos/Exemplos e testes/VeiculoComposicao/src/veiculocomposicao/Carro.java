package veiculocomposicao;

/**
 *
 * @author danielp6r
 */
public class Carro {
    private Veiculo veiculo;
    private Proprietario proprietario;
    private int numLugares;
    private int hp;
    private boolean AC = false;

    public Carro(Veiculo veiculo, Proprietario proprietario) {
        this.veiculo = veiculo;
        this.proprietario = proprietario;
        this.numLugares = 5;
    }

    

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getNumLugares() {
        return numLugares;
    }

    public void setNumLugares(int numLugares) {
        this.numLugares = numLugares;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return "Carro{" + "veiculo=" + veiculo + ", numLugares=" + numLugares + ", hp=" + hp + ", AC=" + AC + '}';
    }

}
