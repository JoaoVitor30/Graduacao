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
public class Calculadora {
    
    public static double soma (double n1, double n2){
        double result = n1 + n2;
        return result;
    }
    
    public static double subtração (double n1, double n2){
        double result = n1 - n2;
        return result;
    }
    
    public static double multiplicação (double n1, double n2){
        double result = n1 * n2;
        return result;
    }
    
    public static double divisão (double n1, double n2){
        double result = 0;
            if (n2 != 0){
                result = n1 / n2;
            }
            else throw new ArithmeticException ("Divisão por zero não permitida!!");
            return result;
    }
}
