package aula05;
/**
 *
 * @author daniel
 */
public class ContaBanco {
    
    //Atributos:
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Personalizados:
    
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta : " + this.getNumConta());
        System.out.println("Tipo : " + this.getTipo());
        System.out.println("Dono : " + this.getDono());
        System.out.println("Saldo : " + this.getSaldo());
        System.out.println("Status : " + this.getStatus());
        System.out.println("----------------------------");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
            
        } else if ("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso. ");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque tem dinheiro. ");  
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito não pode ser fechada. ");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso. ");
        }
    }
    
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else{
            System.out.println("Impossível depositar em conta fechada. ");
        }
    }
    
    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente. ");
            }
        } else {
            System.out.println("Impossível realizar saque de conta fechada. ");
        }        
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;          
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada. ");
        }
    }
    
    //Métodos Especiais:
    
    public void ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
