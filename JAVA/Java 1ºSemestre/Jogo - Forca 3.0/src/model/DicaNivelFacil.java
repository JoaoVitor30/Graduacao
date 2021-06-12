/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cliente
 */
public class DicaNivelFacil{
    
    private ArrayList<String> dataDicaFacil = new ArrayList<String>();
    //private Map<String,String> dataDicaFacil = new HashMap<String, String>();
    //private HashMap[] dataDicaFacil = new HashMap[4];
    
    public DicaNivelFacil(ArrayList<String> array){
        this.preencherDataDica(array);
    }
    
    private void preencherDataDica( ArrayList<String> array){
        for (int i = 0; i <= 3; i++) {
          this.dataDicaFacil.add("DicaFacil" + (i+1));
        }
    }
    
    public String getDica(int posicao){
        return this.dataDicaFacil.get(posicao);
    }
}   
