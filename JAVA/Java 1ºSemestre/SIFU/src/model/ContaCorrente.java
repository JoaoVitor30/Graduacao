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
public class ContaCorrente extends Banco{
    
    private double limite;
    
    public ContaCorrente(String nome, String ag, int num, double limite){
        super (nome, ag, num);
        setLimite(limite);
    }
    
    @Override
    public boolean sacar (double valor){
        if ((valor > 0) && (valor <= this.saldo + this.getLimite())){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
        
    }
    public boolean setLimite(double valor){
        if (limite >= 0){
            this.limite = valor;
            return true;
        }
   else{
        throw new RuntimeException("Limite deve ser entre 0 e 10000");
        }   
    }
    
    public double getLimite(){
        return limite;
    }
}