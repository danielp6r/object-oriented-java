package pessoaheranca;

/**
 *
 * @author danielp6r
 */
public class Vendedor extends Pessoa{
    private float comissao;
    private String areaDeVendas;

    public Vendedor(String cpf, String nome, String email, String telefone, float comissao, String areaDeVendas) {
        super(cpf, nome, email, telefone);
        this.comissao = comissao;
        this.areaDeVendas = areaDeVendas;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public String getareaDeVendas() {
        return areaDeVendas;
    }

    public void setareaDeVendas(String AreaDeVendas) {
        this.areaDeVendas = areaDeVendas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComissao: " + comissao + "\nÁrea de Vendas: " + areaDeVendas;
    }
    
}
