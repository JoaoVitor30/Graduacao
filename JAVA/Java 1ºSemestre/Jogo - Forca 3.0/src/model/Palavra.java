package model;

import java.util.ArrayList;

public class Palavra {
    
    private ArrayList<String> dataForcaFacil = new ArrayList<String>();
    private ArrayList<String> dataForcaMedio = new ArrayList<String>();
    private ArrayList<String> dataForcaDificil = new ArrayList<String>();
    
    public Palavra(){
        this.preencherDataForca();
    }
    
    private void preencherDataForca(){
        
        this.dataForcaFacil.add("RECICLAGEM");
        this.dataForcaFacil.add("DESMATAMENTO");
        this.dataForcaFacil.add("ADUBO");
        this.dataForcaFacil.add("GARRAFA");
        
         this.dataForcaMedio.add("ARVORE");
         this.dataForcaMedio.add("FRUTAS");
         this.dataForcaMedio.add("PLANTA");
         this.dataForcaMedio.add("PLASTICO");
         
        this.dataForcaDificil.add("DNA");
        this.dataForcaDificil.add("RNA");
        this.dataForcaDificil.add("ACBDEF");
        this.dataForcaDificil.add("ZZZZZZZ");
         
    }
    
    public ArrayList<String> getDataForcaFacil(){
         return this.dataForcaFacil;
    }
    
    public ArrayList<String> getDataForcaMedio(){
         return this.dataForcaMedio;
    }
    
    public ArrayList<String> getDataForcaDificil(){
         return this.dataForcaDificil;
    }
    
}
    
