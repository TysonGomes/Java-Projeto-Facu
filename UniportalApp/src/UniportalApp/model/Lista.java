/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniportalApp.model;

import java.util.Date;

/**
 *
 * @author tgomes
 */
public class Lista {
    
    private int id ;
    private String nome;
    private Date dt_registro;
    private Date dt_atualizacao;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the dt_registro
     */
    public Date getDt_registro() {
        return dt_registro;
    }

    /**
     * @param dt_registro the dt_registro to set
     */
    public void setDt_registro(Date dt_registro) {
        this.dt_registro = dt_registro;
    }

    /**
     * @return the dt_atualizacao
     */
    public Date getDt_atualizacao() {
        return dt_atualizacao;
    }

    /**
     * @param dt_atualizacao the dt_atualizacao to set
     */
    public void setDt_atualizacao(Date dt_atualizacao) {
        this.dt_atualizacao = dt_atualizacao;
    }
    
}
