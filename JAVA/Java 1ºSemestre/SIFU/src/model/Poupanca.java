/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Poupanca extends Banco {
    
    private int aniversario;
    
    public Poupanca(String nome, String ag, int num, int aniversario){
        super(nome, ag, num);
        setAniversario(aniversario);
    }
    
    @Override
    public boolean sacar (double valor) {
        if((valor > 0) && (valor <= this.saldo)){
            this.saldo -= valor;
            return true;
        }
        else
            return false;
    }
    
    public boolean setAniversario(int aniversario){
        if (aniversario >=1 && aniversario <32){
            this.aniversario = aniversario;
            return true;
        }
    else
        throw new RuntimeException("Data invalida!!");
    }
    
    public int getAniversario(){
        return aniversario;
    }
    
        public void rendimento(){
    
}
    //@Override
   // public String toString(){
        //return ("Aniversário: " + aniversario);
//} 
        
}