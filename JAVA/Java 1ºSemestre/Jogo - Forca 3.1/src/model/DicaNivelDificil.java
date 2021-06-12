/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Cliente
 */
public class DicaNivelDificil{
    private ArrayList<String> dataNivelDificil = new ArrayList<String>();
    //private Map<String,String> dataDicaFacil = new HashMap<String, String>();
    //private HashMap[] dataDicaFacil = new HashMap[4];
    
    public DicaNivelDificil(ArrayList<String> array){
        this.preencherDataDica(array);
    }
    
    private void preencherDataDica( ArrayList<String> array){
        for (int i = 0; i <= 3; i++) {
          this.dataNivelDificil.add("Dica Dificil" + (i+1));
        }
    }
    
    public String getDica(int posicao){
        return this.dataNivelDificil.get(posicao);
    }
}
