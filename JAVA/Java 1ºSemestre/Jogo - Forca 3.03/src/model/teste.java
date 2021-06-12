/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import view.TelaMenu;
import model.PalavraService;
/**
 *
 * @author Ailton
 */
public class teste extends Palavra{
    private StringBuilder palavraescondida = new StringBuilder(); 
    private int acertos = 0;
    private int erros = 0;
    int acertosantigos = acertos;
    String PalavraService;
    String letra = PalavraService;
    int posicaoPalavraSorteada = 0;
    int TamanhoPalavras = dataForcaFacil.length();
    
    private ArrayList<String> letrastentadas = new ArrayList<String>();
    
        if
            
        posicaoPalavraSorteada = this.getPosicao(palavraSorteada,TelaMenu.getNivel());
            for (int i=0; i < letras.length(); i++){
            palavraescondida.append("_");
    }
        else      
    public void tentativas (String letra){
        
        char[] letras = new char [TamanhoPalavras];
        
        StringBuilder tentativas = new StringBuilder();
        tentativas.append(lbErros.getText());
        tentativas.append(letra);
        lbErros.setText(tentativas.toString());
        letrastentadas.add(letra);
    }
    
      public void revelarLetra (String letras){

        int acertosantigo = acertos;
        
        for (int i=0; i < letras.length; i++){
            if (letra.equals(String.valueOf(letras[i]))){
                palavraescondida.setCharAt(i, dataForcaFacil.charAt(0));
                acertos++;
            }
        
        }
   
}

}


