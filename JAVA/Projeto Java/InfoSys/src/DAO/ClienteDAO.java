/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Cliente;

/**
 *
 * @author aluno
 */
public class ClienteDAO implements Persistencia<Cliente> {
    
    private static ClienteDAO dao = null;

    @Override
    public int create(Cliente c){
        int id = 0;
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "INSERT INTO Cliente (Nome,CPF,Fone,Celular,Email) VALUES (?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
            pst.setString(1,c.getNome());
            pst.setString(2,c.getCPF());
            pst.setString(3,c.getTelefone());
            pst.setString(4,c.getCelular());
            pst.setString(5,c.getEmail());
            pst.execute();
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            
        } catch (SQLException ex) {
            id = 0;
        } finally {
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return id;
    }
    
    public static ClienteDAO getInstance(){
        if(dao == null) dao = new ClienteDAO();
        return dao;
    }

    
    @Override
    public List<Cliente> read() {
        Connection con = ConnectionFactory.getConection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM Cliente ORDER BY Nome";
        List lista = new ArrayList<Cliente>();
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()){
                int codigo = rs.getInt("Codigo");
                String nome = rs.getString("Nome");
                String cpf = rs.getString("CPF");
                String telefone = rs.getString("Fone");
                String celular = rs.getString("Celular");
                String email = rs.getString("Email");
                lista.add(new Cliente(codigo, nome, cpf, telefone, celular, email));
            }
        } catch (SQLException ex){
            throw new RuntimeException("Erro no Select"); //To change body of generated methods, choose Tools | Templates.

        }finally{
            ConnectionFactory.closeConnection(con, pst, rs);
        }
        return lista;
    }
    
    

    @Override
    public boolean update(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente findByCodigo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
