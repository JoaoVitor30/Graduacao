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
public class DicaNivelMedio{ 
    
   private ArrayList<String> dataDicaMedio = new ArrayList<String>();
    //private Map<String,String> dataDicaFacil = new HashMap<String, String>();
    //private HashMap[] dataDicaFacil = new HashMap[4];
    
    public DicaNivelMedio(ArrayList<String> array){
        this.preencherDataDica(array);
    }
    
    private void preencherDataDica( ArrayList<String> array){
        for (int i = 0; i <= 3; i++) {
          this.dataDicaMedio.add("DicaMédio" + (i+1));
        }
    }
    
    public String getDica(int posicao){
        return this.dataDicaMedio.get(posicao);
    }
}
