/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniportalApp.control;

import UniportalApp.model.ConnectionDao;
import UniportalApp.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author tgomes
 */
public class UsuarioDao {
     private Connection conn;//Cria uma variável do tipo Connection para receber a conexão.

    public UsuarioDao() {//Construtor com argumeto.
        this.conn = new ConnectionDao().getConectar();//Ao criar um novo LoginDao ele cria uma conexão.
    }
    
    public boolean Logar(String login, String senha) {
       // boolean autenticado = false;
        String sql;
        try {
            
            sql = "SELECT * FROM usuario WHERE nome=? and senha=?;";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                 Usuario u = new Usuario();
                 u.setId(rs.getInt("id"));
                 u.setNome(rs.getString("nome"));
                 u.setSenha(rs.getString("senha"));
                 u.setEmail(rs.getString("email"));
                 u.setTipo_usuario(rs.getInt("tipo_usuario"));
                 u.setDt_atualizacao(rs.getTime("dt_atualizacao"));
                 u.setDt_registro(rs.getTime("dt_registro"));
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
    public int Tipo_Usuario(String login, String senha) {
       // boolean autenticado = false;
        String sql;
        try {
            
            sql = "SELECT * FROM usuario WHERE nome=? and senha=?;";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                 Usuario u = new Usuario();
                 u.setId(rs.getInt("id"));
                 u.setNome(rs.getString("nome"));
                 u.setSenha(rs.getString("senha"));
                 u.setEmail(rs.getString("email"));
                 u.setTipo_usuario(rs.getInt("tipo_usuario"));
                 u.setDt_atualizacao(rs.getTime("dt_atualizacao"));
                 u.setDt_registro(rs.getTime("dt_registro"));
                 return u.getTipo_usuario();
                 
            } else {
                ps.close();
                return 5;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 5;
             }
     public int Id_Usuario(String login, String senha) {
       // boolean autenticado = false;
        String sql;
        try {
            
            sql = "SELECT * FROM usuario WHERE nome=? and senha=?;";
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                 Usuario u = new Usuario();
                 u.setId(rs.getInt("id"));
                 u.setNome(rs.getString("nome"));
                 u.setSenha(rs.getString("senha"));
                 u.setEmail(rs.getString("email"));
                 u.setTipo_usuario(rs.getInt("tipo_usuario"));
                 u.setDt_atualizacao(rs.getTime("dt_atualizacao"));
                 u.setDt_registro(rs.getTime("dt_registro"));
                 return u.getId();
                 
            } else {
                ps.close();
                return 5;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return 5;
             }
    
    
}
