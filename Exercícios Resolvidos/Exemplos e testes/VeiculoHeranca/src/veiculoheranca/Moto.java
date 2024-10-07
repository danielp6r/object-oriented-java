package veiculoheranca;

/**
 *
 * @author danielp6r
 */
public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String fabricante, String modelo, int ano, String Cor, Proprietario dono) {
        super(fabricante, modelo, ano, Cor, dono);
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

    @Override
    public String toString() {
        return super.toString() + "cilindradas: " + cilindradas + ".";
    }
    
}
