package veiculoheranca;

/**
 *
 * @author danielp6r
 */
public class Vendedor extends Proprietario {
    private float comissao;
    private String areaDeVendas;

    public Vendedor(String nome, String cpf, String email, String telefone) {
        super(nome, cpf, email, telefone);
        this.comissao = 11.5f;
        this.areaDeVendas = "Car Dealer";
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public String getAreaDeVendas() {
        return areaDeVendas;
    }

    public void setAreaDeVendas(String areaDeVendas) {
        this.areaDeVendas = areaDeVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "\ncomissao: " + comissao + ", Area de Vendas: " + areaDeVendas;
    }

}
