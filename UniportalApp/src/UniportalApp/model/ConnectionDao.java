/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniportalApp.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author tgomes
 */
public class ConnectionDao {
   public static String status;
 //Método Construtor da Classe//
 
        public ConnectionDao() {
 
    }
 
  
 
//Método de Conexão//
 
public static java.sql.Connection getConectar() {
 
        Connection conn = null;          //atributo do tipo Connection
        
  
 
try {
 
// Carregando o JDBC Driver padrão do mysql
 
String driverName = "com.mysql.jdbc.Driver";                        
 
Class.forName(driverName);
 
  
 
// Configurando a nossa conexão com um banco de dados//
 
            String servidor = "localhost";    //caminho do servidor do BD
 
            String  bancoDados="teste01";        //nome do seu banco de dados
 
            String url = "jdbc:mysql://" + servidor + "/" + bancoDados;
 
            String username = "nigga";        //nome de um usuário de seu BD      
 
            String password = "9886";      //sua senha de acesso
 
            conn = DriverManager.getConnection(url, username, password);
 
  
 
            //Testa sua conexão//  
 
            if (conn != null) {
 
                status = ("Conectado com sucesso!");
 
            } else {
 
                status = ("Não foi possivel realizar conexão");
 
                 }
 
  
 
            return conn;
 
  
 
        } catch (ClassNotFoundException e) {  //Driver não encontrado
 
  
 
            System.out.println("O driver expecificado nao foi encontrado.");
 
            return null;
 
        } catch (SQLException e) {
 
//Não conseguindo se conectar ao banco
 
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
 
            return null;
 
        }
 
  
 
    }
 
  
 
    //Método que retorna o status da sua conexão//
 
    public static String statusConection() {
            
 
        return status;
 
    }
 
   
 
   //Método que fecha sua conexão//
 
    public static boolean FecharConexao() {
 
        try {
 
            ConnectionDao.getConectar().close();
 
            return true;
 
        } catch (SQLException e) {
 
            return false;
 
        }
 
  
 
    }
 
   
 
   //Método que reinicia sua conexão//
 
    
}




