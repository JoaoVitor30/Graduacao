/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rdrud
 */
public class CalculadoraFinanceira {
    
    public double calcValorVista(double vp, double i, int n) {
        double valor;
        valor = vp * ((1 - Math.pow(1+i,-n)) / i);
        valor = Math.round(valor*100) / 100.;       
        return valor;
    }
 
    public double calcValorParcela(double vv, double i, int n) {
        double valor;
        valor = vv /  ((1 - Math.pow(1+i,-n)) / i);
        valor = Math.round(valor*100) / 100.;        
        return valor;
    }

    public double calcTaxa(double vv, double vp, int n) {
        double melhorVV = 0;
        double vvAtual;
        double melhorTaxa = 0;
        double taxaAtual;
        for (int i=1 ; i<=100; i++)  {
            taxaAtual = i/1000.0;
            vvAtual = calcValorVista(vp,taxaAtual,n);
            if ((Math.abs(vvAtual - vv)) < Math.abs(melhorVV - vv)) {
                melhorVV = vvAtual;
                melhorTaxa = taxaAtual;
            }
        }
        melhorTaxa = Math.round(melhorTaxa*1000) / 1000.;
        return melhorTaxa;
    }
    
    public int calcPeriodo(double vv, double vp, double i) {
        int n;
        n = (int) Math.round(Math.log((vp/(vp-(vv*i)))) / Math.log(1+i));
        return n;
    }
        
}
