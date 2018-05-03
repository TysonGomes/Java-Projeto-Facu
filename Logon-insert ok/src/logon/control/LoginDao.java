/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logon.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import logon.model.ConnectionDao;
import logon.model.Login;

/**
 *
 * @author tgomes
 */
public class LoginDao  {
    
    
     private Connection conn;//Cria uma variável do tipo Connection para receber a conexão.

    public LoginDao() {//Construtor com argumeto.
        this.conn = new ConnectionDao().getConectar();//Ao criar um novo LoginDao ele cria uma conexão.
    }
    
    public boolean Logar(String login, String senha) {
       // boolean autenticado = false;
        String sql;
        try {
            
            sql = "SELECT * FROM login WHERE nome=? and senha=?;";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                
                 return true;
            } else {
                ps.close();
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
             }
    
    public DefaultListModel listar(){
        try {
            
            DefaultListModel DML = new DefaultListModel();
            List<Login> logins = new ArrayList<Login>();
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM login");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Login l = new Login();
                //l.setUser(rs.getString("nome));
                String name=rs.getString("nome");
                DML.addElement(name);
                //logins.add(l);               
            }
            rs.close();
            ps.close();
            conn.close();
            return DML;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    
    
    
    
    
    
    
    
    
    
    
}
    public boolean Inserir(String login, String senha) {
       // boolean autenticado = false;
        String sql;
        try {
            
            sql = "Insert Into  login (nome,senha) values(?,?);";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            //ResultSet rs;
             ps.executeUpdate();
            //if (rs.next()) {
                
                 return true;
            //} else {
              //  ps.close();
                //return false;
            //}
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return false;
             }
    
}
    
    

