package veiculocomposicao;

/**
 *
 * @author danielp6r
 */
public class Vendedor {
    private Proprietario proprietario;
    private float comissao;
    private String areaDeVendas;

    public Vendedor(Proprietario proprietario, float comissao, String areaDeVendas) {
        this.proprietario = proprietario;
        this.comissao = 11.5f;
        this.areaDeVendas = "Car Dealer";
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
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
        return "Vendedor{" + "proprietario=" + proprietario + ", comissao=" + comissao + ", areaDeVendas=" + areaDeVendas + '}';
    }

}
