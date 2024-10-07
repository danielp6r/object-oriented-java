package ex02automoveis;

/**
 *
 * @author daniel
 */
public class Carro extends Automovel{
    private int numLugares;
    private int hp;
    private boolean AC = false;

    public Carro(String fabricante, String modelo, int ano, String Cor) {
        super(fabricante, modelo, ano, Cor);
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
      
}
