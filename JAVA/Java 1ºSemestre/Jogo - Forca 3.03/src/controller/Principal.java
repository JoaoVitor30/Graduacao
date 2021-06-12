/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Random;
import java.util.Scanner;
import view.TelaInicial;

/**
 *
 * @author aluno
 */
public class Principal {
    
    public static void main(String[] args) {
        new TelaInicial().setVisible(true);
        
       /* Scanner teclado = new Scanner(System.in);

        String[] palavras = {"desmatamento", "reciclagem", "lago", "fogo"}; //array de palavras
        Random aleatorio = new Random();
        int index = new Random().nextInt(5);
        System.out.println(index);
        String palavraSelecionada = palavras[index];

        char[] traco = new char[palavraSelecionada.length()];
        for (int i = 0; i < palavraSelecionada.length(); i++) { //traço _ _ _
            traco[i] = '_';
        }

        int palavraString = palavras[index].length();
        int tentativas = 6;

        while (palavraString > 0 && tentativas > 0) {
            System.out.println();
            for (int i = 0; i < palavraSelecionada.length(); i++) { // quantos traço irá aparecer
                System.out.print(" " + traco[i] + " ");
            }
            System.out.println();

            System.out.println("Você tem " + tentativas + " chances de adivinhar");
            System.out.println("A palavra tem " + palavraString + " letras restantes");
            System.out.println("Digite uma letra: ");
            //teclado.nextLine();
            char letras = teclado.next().charAt(0);
            boolean iscorrect = false;
            for (int i = 0; i < traco.length; i++) {

                if (palavras[index].charAt(i) == letras) {
                    traco[i] = letras;
                    palavraString--;
                    iscorrect = true;
                }
            }

            if (!iscorrect) {
                tentativas--;
            }
        }

        if (palavraString == 0) {
            System.out.println("PARABENS!Você ACERTOU! :)");
        } else {
            System.out.println("Infelizmente Você Perdeu :(");
            System.out.println("A palavra era " + palavraSelecionada);
        }
        */
    }
}
