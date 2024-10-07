package ex02automoveis;

/**
 *
 * @author daniel
 */
public class Moto extends Automovel{
    private int cilindradas;

    public Moto(String fabricante, String modelo, int ano, String Cor) {
        super(fabricante, modelo, ano, Cor);
    }
    
    public void fugirDoCaramelo(){
        if (this.cilindradas < 125){
            System.out.println("Fracassou, o caramelo te alcançou... ");
        } else{
            System.out.println("Parabéns, você sobreviveu... ");
        }
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
