package ex02automoveis;

/**
 *
 * @author daniel
 */
public class Automovel {
    private String placa;  
    private String fabricante;
    private String modelo;
    private int ano;
    private String Cor;
    private String proprietário;
    private boolean pago = false;
    private boolean documentado = false;   

    public Automovel(String fabricante, String modelo, int ano, String Cor) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.Cor = Cor;
    }
    
    
    
    public void comprar(){
        this.pago = true;
    }
    
    public void pagarDoc(){
        this.documentado = true;
    }

    public String status() {
        return "Automovel{" + "placa= " + placa + ", Cor= " + Cor + ", modelo= " + modelo + ", fabricante= " + fabricante +
                ", ano= " + ano + ", propriet\u00e1rio= " + proprietário + ", pago= " + pago + ", documentado= " + documentado + '}';
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProprietário() {
        return proprietário;
    }

    public void setProprietário(String proprietário) {
        this.proprietário = proprietário;
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
     
}
