/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
//import javax.swing.JLabel;
//import javax.swing.JTextField;
/**
 *
 * @author Ailton
 */
public class Tentativas {
    private StringBuilder palavraescondida = new StringBuilder();
    private int acertos = 0;
    private int erros = 0;
    //private JLabel lbErros = new JLabel(); 
    //private JLabel lbPalavraescondida = new JLabel();
    //private JTextField tfPalavra = new JTextField();
    public String palavra = null;
    
    
    int acertosantigo = acertos;
    
    private ArrayList<String> letrastentadas = new ArrayList<String>();
    
 
    
    desenharBoneco (n:0);
    tentativas(letra);
    
     String letra = tfPalavra.getText().toUpperCase();
        
        if (letrastentadas.contains(letra)){
                revelarLetra(letra);
                tfPalavra.setText("");
        }          
    
    public void desenharBoneco (int n){
        
    }
    
    public void revelarLetra (String letra){
        
        
        
        int acertosantigo = acertos;
        
        for (int i=0; i < letras.length; i++){
            if (letra.equals(String.valueOf(letras[i]))){
                palavraescondida.setCharAt(i, letra.charAt(0));
                acertos++;
            }
        
        }
    }
        if (acertosantigo==acertos) {
            erros++;
        }
        desenharBoneco(erros);
        
        if (acertos == letras.length){
            new TelaVenceu(Palavra).setVisible(true);
        }
        
        if (erros == 5){
            new TelaPerdeu(Palavra).setVisible(true);
}
    public void tentativas (String letra){
        
        char[] letras = palavra.toCharArray();
        
        StringBuilder tentativas = new StringBuilder();
        tentativas.append(lbErros.getText());
        tentativas.append(letra);
        lbErros.setText(tentativas.toString());
        letrastentadas.add(letra);
                
    }
    
    
    
    char[] letras = palavra.toCharArray[];
    
    for (int i=0; i < letras.length; i++){
        palavraescondida.append("_");
}   
    
    
    
    
    
    
}
