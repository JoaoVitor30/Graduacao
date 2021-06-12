/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Aluno
 */
public class Calculadora {
    
    public static double soma(double n1, double n2)
    {
        double resposta = n1 + n2;
        return resposta;
    }
    
    public static double sub(double n1, double n2)
    {
        double resposta = n1 - n2;
        return resposta;
    }
    
    public static double mult(double n1, double n2)
    {
        double resposta = n1 * n2;
        return resposta;
    }
    
    public static double div(double n1, double n2)
    {
        double resposta;
        if (n2 != 0)
        {
        resposta = n1 / n2;
        }
        else
            throw new ArithmeticException("Não pode dividir por zero!!");
        return resposta;
    }
    
}
