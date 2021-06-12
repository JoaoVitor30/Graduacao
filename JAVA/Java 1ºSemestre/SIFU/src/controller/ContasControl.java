/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Carteira;
import model.Conta;
import model.ContaCorrente;
import model.Poupanca;

/**
 *
 * @author Aluno
 */
public class ContasControl {
    private static ArrayList<Conta> contas = new ArrayList<Conta>();
    
    private static void gravaConta(Conta ct){
        contas.add(ct);
    }
    
    public static void gravaContaCorrente(ContaCorrente cc){
        gravaConta(cc);
    }
    
    public static void gravaPoupanca(Poupanca cp){
        gravaConta(cp);
    }
    
    public static void gravaCarteira(Carteira cr){
        gravaConta(cr);
    }
    
    
    public static void listaContaCorrente() {
        System.out.println("===================================================");
        System.out.println("Nome \t\tAgencia\tNumero\tLimite\tSaldo");
        System.out.println("===================================================");
          for (Conta ct : contas ){
              if (ct instanceof ContaCorrente){
              ContaCorrente cc = (ContaCorrente) ct;
            System.out.println(cc.getNome() + "\t" +
                               cc.getAgencia() + "\t" +
                               cc.getNumero() + "\t" +
                               cc.getLimite() + "\t" +
                               cc.getSaldo());
        }
      }
          System.out.println("===================================================");
          
    }     
          
       public static void listaSaldoAplicacao() {
       double total = 0;  
          for (Conta ct : contas ){
              if (ct instanceof Poupanca){
                  total += ct.getSaldo();
        }
      }
          System.out.println("Saldo Total de Aplicações: " + total);
    }
       
       public static void listaPoupanca() {
        System.out.println("===================================================");
        System.out.println("Nome \t\t\tAgencia\tNumero\tAniversario");
        System.out.println("===================================================");
          for (Conta ct : contas ){
              if (ct instanceof Poupanca){
              Poupanca cc = (Poupanca) ct;
            System.out.println(cc.getNome() + "\t" +
                               cc.getAgencia() + "\t" +
                               cc.getNumero() + "\t" +
                               cc.getAniversario()); 
        }
      }
          System.out.println("===================================================");
          
    }
       
       public static void listaCarteira() {
        System.out.println("===================================================");
        System.out.println("Nome \t\t\t Saldo");
        System.out.println("===================================================");
          for (Conta ct : contas ){
              if (ct instanceof Carteira){
              Carteira cc = (Carteira) ct;
            System.out.println(cc.getNome() + "\t" +
                               cc.getSaldo()); 
        }
      }
          System.out.println("===================================================");
    }    
}
