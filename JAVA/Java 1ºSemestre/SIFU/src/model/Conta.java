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
public class Conta {
     
   private String nome;
   protected double saldo = 0;
   
   public Conta(String nome){
       setNome(nome);
   }
   
   public void setNome(String nome){
       if (nome.length() >= 5){
           this.nome = nome;
        }
       else 
           throw new RuntimeException ("Nome muito curto. Deve ter pelo menos 5 caracteres!");
   }
   
   public String getNome(){
       return nome;
   }

    public  boolean sacar(double valor){
        if (valor > saldo){
            return false;
        } else{
            saldo = saldo - valor;
            return true;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public boolean depositar(double valor){
        if (valor > 0){
            this.saldo = saldo + valor;
            return true;
        }
        else
            return false;
    }
    
    public void transferir(){
        
    }
    
  @Override
    public String toString(){
        return("Nome da Conta: " + nome  + " Saldo: " + saldo);
    }

}