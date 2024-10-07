package veiculocomposicao;

/**
 *
 * @author danielp6r
 */
public class Moto {
    private Veiculo veiculo;
    private Proprietario proprietario;
    private int cilindradas;

    public Moto(Veiculo veiculo, Proprietario proprietario, int cilindradas) {
        this.veiculo = veiculo;
        this.proprietario = proprietario;
        this.cilindradas = cilindradas;
    }
    
    public void fugirDoCaramelo(){
        if (this.cilindradas < 125){
            System.out.println("Fracassou, o caramelo te alcançou... ");
        } else{
            System.out.println("Parabéns, você sobreviveu... ");
        }
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" + "veiculo=" + veiculo + ", cilindradas=" + cilindradas + '}';
    }

}
