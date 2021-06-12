/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author aluno
 */
public class Tecnico {
    private String nome = null;
    private double salario;
    private double valor;
    
    public Tecnico (String nome, double salario, double valor){
        setNome(nome);
        setSalario(salario);
        setValor(valor);
    }
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String toString() {
        String ret = null;
        ret = "Tecnico......: [" + getNome() + "]\n" +
              "Salario......: [" + getSalario() + "]\n" +
              "Valor de Hora: [" + getValor() +"]\n";        
        return ret;
    }
}
