package aula04;

/**
 *
 * @author daniel
 */
public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    // Método Construtor
    public  Caneta(String modelo, String cor, float ponta) { 
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void status(){
        System.out.println("Sobre a caneta " + this + " :");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta : " + this.getPonta());
        System.out.println("");
    }
    

}