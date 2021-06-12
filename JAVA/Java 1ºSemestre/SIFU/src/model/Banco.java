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
public class Banco extends Conta {
        
    private String agencia;
    private int numero;
    
    public Banco(String nome, String ag, int num){
        super(nome);
        setAgencia(ag);                             //CONSTRUTOR
        setNumero(num);
    }
    
    public void setAgencia (String agencia){
        if (agencia.length() >=3){
            this.agencia = agencia;
        }
        else
            throw new RuntimeException ("Agencia deve ter pelo menos 3 caracteres!!");
    }
    
    public String getAgencia(){
        return agencia;
    }
    
    public boolean setNumero (int numero){
        if (numero > 0){
            this.numero = numero;
            return true;
        }
        else{
            //throw new RuntimeException ("Número da agencia invalido!!");
            return false;
            }
    }
    public int getNumero(){
        return numero;
    }
}
