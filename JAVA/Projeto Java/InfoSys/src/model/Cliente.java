/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import DAO.ClienteDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class Cliente {
    private int codigo = 0;
    private String nome = null;
    private String cpf = null;
    private String telefone = null;
    private String celular = null;
    private String email = null;
    
    /**Método Construtor recebendo os parâmetros nome, cpf, telefone, celular
         * e email do tipo String e chamando os métodos set´s dos mesmos
         */
    public Cliente (int codigo,String nome, String cpf, String telefone, String celular, String email){
        setCodigo(codigo);
        setNome(nome);
        setCPF(cpf);
        setTelefone(telefone);
        setCelular(celular);
        setEmail(email);
        gravar();
    }
    
     public Cliente (String nome, String cpf, String telefone, String celular, String email){
        setNome(nome);
        setCPF(cpf);
        setTelefone(telefone);
        setCelular(celular);
        setEmail(email);
        gravar();
    }
 
    /**Método para retorno do nome do funcionário
         * @return String - Nome do Funcionario
         */
    public String getNome() {
        return nome;
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String CPF) {
        this.cpf = CPF;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String Telefone) {
        this.telefone = Telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String Celular) {
        this.celular = Celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }
    
    public static DefaultTableModel getTableModel(){
        List<Cliente> lista = ClienteDAO.getInstance().read();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nome");
        modelo.addColumn("Telefone");
        modelo.addColumn("Celular");
        modelo.addColumn("Email");
        for (Cliente c: lista){
            String[] reg = {c.getNome(), c.getTelefone(), c.getCelular(), c.getEmail()};
            modelo.addRow(reg);
        }
        return modelo;
    }
    
    @Override
    public String toString() {
        String ret = null;
        ret = "Cliente.: [" + getNome() + "]\n" +
              "CPF.....: [" + getCPF() + "]\n" +
              "Telefone: [" + getTelefone() + "]\n" +
              "Celular.: [" + getCelular() + "]\n" +
              "Email...: [" + getEmail() + "]\n";
                
        return ret;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private void gravar() {
        ClienteDAO dao = new ClienteDAO();
        int codigo = dao.create(this);
        if (codigo > 0) setCodigo(codigo);
    }
}
