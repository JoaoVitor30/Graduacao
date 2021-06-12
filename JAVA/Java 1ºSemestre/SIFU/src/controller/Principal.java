/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Banco;
import model.Carteira;
import model.Conta;
import model.ContaCorrente;
import model.Poupanca;
import view.TelaPrincipal;

/**
 *
 * @author Aluno
 */
public class Principal {
    
    public static void main(String[] args) {
       
        ContaCorrente cc;
        cc = new ContaCorrente("Banco Itaú", "001-1", 1111, 1000);
        ContasControl.gravaContaCorrente(cc);
        cc = new ContaCorrente("Banco Santander", "002-2", 2222, 2000);
        ContasControl.gravaContaCorrente(cc);
        cc = new ContaCorrente("Banco Bradesco", "003-4", 3333, 3000);
        ContasControl.gravaContaCorrente(cc);
        cc = new ContaCorrente("Banco Nubank", "004-4", 4444, 4000);
        ContasControl.gravaContaCorrente(cc);
        
        Poupanca cp;
        cp = new Poupanca("Poupanca Bradesco", "111-1", 1000, 1);
        ContasControl.gravaPoupanca(cp);
        cp.depositar(1000);
        cp = new Poupanca("Poupanca da Caixa", "222-2", 2000, 2);
        ContasControl.gravaPoupanca(cp);
        cp.depositar(2000);
        cp = new Poupanca("Poupanca Banco do", "333-3", 3000, 3);
        ContasControl.gravaPoupanca(cp);
        cp.depositar(3000);

        Carteira ct;
        ct = new Carteira();
        ContasControl.gravaCarteira(ct);
        ct.depositar(300000);
        
        ContasControl.listaContaCorrente();
        ContasControl.listaSaldoAplicacao();
        ContasControl.listaPoupanca();
        ContasControl.listaCarteira();
        new TelaPrincipal().setVisible(true);
    }
         
}