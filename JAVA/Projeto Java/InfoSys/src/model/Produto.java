/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author João Vitor
 */
public class Produto {
    private String descricao = null;
    private int estoque;
    private boolean ativo = false;
    private double venda = 0;
    private double custo = 0;
    
    public Produto (String descricao, int estoque, double venda, double custo){
        setDescricao (descricao);
        setEstoque (estoque);
        setVenda (venda);
        setCusto (custo);
        setAtivo(true);
    }
    /**
     * @return Vai retornar a descrição.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao Vai setar a descrição.
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return Vai retornar o estoque.
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque Vai setar o estoque.
     */
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the valor
     */
    public double getVenda() {
        return venda;
    }

    /**
     * @param venda the valor to set
     */
    public void setVenda(double venda) {
        this.venda = venda;
    }

    /**
     * @return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }
    
        @Override
    public String toString() {
        String ret = null;
        if (isAtivo()) ret = "[Ativo] - ";
        else ret = "[Fora de Linha] - ";
        ret = ret + "[Item: " + getDescricao() +
                    "] - [Estoque: " + getEstoque() +
                    "] - [Custo: " + getCusto() +
                    "] - [Preço de Venda: " + getVenda() + "]";
        return ret;
    } 
}
