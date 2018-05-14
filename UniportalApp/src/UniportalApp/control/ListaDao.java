/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniportalApp.control;

import UniportalApp.model.ConnectionDao;
import UniportalApp.model.Lista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author tgomes
 */
public class ListaDao {
    private Connection conn;//Cria uma variável do tipo Connection para receber a conexão.
    
    
    public ListaDao() {//Construtor com argumeto.
        this.conn = new ConnectionDao().getConectar();//Ao criar um novo LoginDao ele cria uma conexão.
    }
    
   
    public int Idlista (int  id){
        try {
            int id_lista=0;
            //DefaultListModel DML = new DefaultListModel();
           // List<Lista> listas = new ArrayList<Lista>();
            PreparedStatement ps= this.conn.prepareStatement("SELECT id_lista from usuario_lista where id_usuario= ?");
            ps.setInt(1, id);
            ResultSet rs= ps.executeQuery();
            
            while(rs.next()){
               // Lista l = new Lista();
                //l.setUser(rs.getString("nome));
                 id_lista=rs.getInt("id_lista");
                //DML.addElement(name);
                //logins.add(l);               
            }
            rs.close();
            ps.close();
            //conn.close();
            return id_lista;
            }catch (SQLException e) {
                throw new RuntimeException(e);
                }
    

    }
    
    
    public DefaultListModel listar( int id){
        try {
            int id_lista=Idlista(id);
            DefaultListModel DML = new DefaultListModel();
           // List<Lista> listas = new ArrayList<Lista>();
            
           
            PreparedStatement ps = this.conn.prepareStatement("SELECT * FROM lista where id =?");
            ps.setInt(1, id_lista);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                //Lista l = new Lista();
                //l.setUser(rs.getString("nome));
                String name=rs.getString("nome");
                DML.addElement(name);
                //logins.add(l);               
            }
            rs.close();
            ps.close();
            conn.close();
            return DML;
            }catch (SQLException e) {
                throw new RuntimeException(e);
                }
    

    }       
}