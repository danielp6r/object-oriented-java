package veiculoheranca;

/**
 *
 * @author danielp6r
 */
public class Carro extends Veiculo {
    private int numLugares;
    private int hp;
    private boolean AC = false;

    public Carro(String fabricante, String modelo, int ano, String Cor, Proprietario dono) {
        super(fabricante, modelo, ano, Cor, dono);
        this.numLugares = 5;
    }
    
    public void ligarAC(){
        this.AC = true;
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

    public boolean getAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    @Override
    public String toString() {
        return super.toString() + "Lugares: " + numLugares + ", Potência: " + hp + ", Ar Condicionado está ligado? " + AC;
    }

}
