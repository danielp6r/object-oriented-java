package pessoacomposicao;

/**
 *
 * @author danielp6r
 */
public class Vendedor {
    private Pessoa pessoa;
    private float comissao;
    private String areaDeVendas;

    public Vendedor(Pessoa pessoa, float comissao, String areaDeVendas) {
        this.pessoa = pessoa;
        this.comissao = comissao;
        this.areaDeVendas = areaDeVendas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
        return pessoa.toString() + "\nComissao: " + comissao + "\nÁrea de Vendas: " + areaDeVendas;
    }
    
}
