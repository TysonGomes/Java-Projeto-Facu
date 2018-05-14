/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniportalApp.control;

import UniportalApp.model.ConnectionDao;
import java.sql.Connection;

/**
 *
 * @author internet
 */
public class AtividadeDao {
     private Connection conn;//Cria uma variável do tipo Connection para receber a conexão.
    
    
    public AtividadeDao() {//Construtor com argumeto.
        this.conn = new ConnectionDao().getConectar();//Ao criar um novo LoginDao ele cria uma conexão.
    }
    
    
    
}
