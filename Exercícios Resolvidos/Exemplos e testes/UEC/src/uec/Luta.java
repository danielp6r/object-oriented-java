/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uec;

import java.util.Random;

/**
 *
 * @author daniel
 */
public class Luta {
    //ATRIBUTOS
    private Lutador desafiante;
    private Lutador desafiado;
    private int round;
    private boolean aprovada;
    
    //MÉTODOS PÚBLICOS
    public  void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        } else{
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println(" ### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println(" ### DESAFIADO ###");
            this.desafiado.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); //0 1 2 
            System.out.println("===== Resultado da Luta =====");
            switch(vencedor) {
                case 0: // Empate
                    System.out.println("Empatou! ");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // Desafiante vence
                    System.out.println(this.desafiante.getNome() + " Venceu! ");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case 2: //Desafiado vence
                    System.out.println(this.desafiado.getNome() + " Venceu! ");
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
            }
            System.out.println("=========================");
        } else{
            System.out.println("A luta não pode acontecer. ");
        }
    }
    
    //MÉTODOS GETERS E SETERS

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
