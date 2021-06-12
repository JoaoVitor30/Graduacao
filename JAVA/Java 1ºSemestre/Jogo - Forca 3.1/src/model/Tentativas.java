/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

//import java.util.ArrayList;
//import model.PalavraService;
//import view.TelaMenu;
/**
 *
 * @author Ailton
 */
/*public class Tentativas extends Palavra{
    private StringBuilder palavraescondida = new StringBuilder(); 
    private String palavra = null;
    int tamanhoDificil = palavra.length();
    int tamanhoFacil = palavra.length();
    int tamanhoMedio = palavra.length();
    
    //String letra = PalavraService;

    
    
    private ArrayList<String> letrastentadas = new ArrayList<String>();

    
    public void Tentar (String letra) {
        StringBuilder tentativas = new StringBuilder();
    
        if (TelaMenu.getNivel() == "F"){
            //ARRAY DAS PALAVRAS SORTEADAS
            char[] letrasf = new char [tamanhoFacil];
            for (int i=0; i < tamanhoFacil; i++){
            palavraescondida.append("_");
            }   
        }else if (TelaMenu.getNivel() == "M"){
            char[] letrasm = new char [tamanhoMedio];
            for (int i=0; i < tamanhoMedio; i++){
            palavraescondida.append("_");
            }
            
        }else if (TelaMenu.getNivel() == "D"){
            char[] letrasd = new char [tamanhoDificil];        
            for (int i=0; i < tamanhoDificil; i++){
            palavraescondida.append("_");    
            }
            
        }
    }
}
    
