package aula02;

/**
 *
 * @author daniel
 */
public class Caneta {
    protected String modelo;
    protected String cor;
    protected float ponta;
    protected int carga;
    protected boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = 100;
        this.tampada = true;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    
    
    void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Uma caneta " + this.getCor());
        System.out.println("Está tampada? " + this.getTampada());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga() + "%");
    }
    
    void rabiscar() {
        if (this.getTampada() == true){
            System.out.println("ERRO! Não posso rabiscar com a caneta tampada.");
        } else {
            System.out.println("Estou rabiscando.");
            this.setCarga(this.getCarga() - 1);
        }
    }
    
    void tampar() {
        this.setTampada(true);
    }
    
    void destampar(){
        this.setTampada(false);
    }
}