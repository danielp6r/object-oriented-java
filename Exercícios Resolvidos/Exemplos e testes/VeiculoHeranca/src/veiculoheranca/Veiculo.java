package veiculoheranca;

/**
 *
 * @author danielp6r
 */
public class Veiculo {
    private String placa;  
    private String fabricante;
    private String modelo;
    private int ano;
    private String cor;
    private Proprietario dono;
    private boolean pago = false;
    private boolean documentado = false;   

    public Veiculo(String fabricante, String modelo, int ano, String Cor, Proprietario dono) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = Cor;
        this.dono = dono;
    }
    
    public void comprar(Proprietario dono){
        this.pago = true;
        this.dono = dono;
    }
    
    public void pagarDoc(){
        this.documentado = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String Cor) {
        this.cor = cor;
    }

    public Proprietario getDono() {
        return dono;
    }

    public void setDono(Proprietario dono) {
        this.dono = dono;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isDocumentado() {
        return documentado;
    }

    public void setDocumentado(boolean documentado) {
        this.documentado = documentado;
    }

    @Override
    public String toString() {
        return "Veiculo:" + "\nPlaca: " + placa + ", Fabricante: " + fabricante + ", Modelo: " + modelo + ", Ano: " + ano + ", Cor: " + cor + ".\nProprietário:" + dono + ".\nPago: " + pago + ", Documentado: " + documentado + ".\n";
    }

}
