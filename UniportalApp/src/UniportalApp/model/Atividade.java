/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UniportalApp.model;

import java.util.Date;

/**
 *
 * @author internet
 */
public class Atividade {
    
    private int id ;
    private String titulo;
    private Date dt_registro;
    private Date dt_atualizacao;
    private float pontuacao;
    private String obs;
    private int id_lista;

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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    /**
     * @return the pontuacao
     */
    public float getPontuacao() {
        return pontuacao;
    }

    /**
     * @param pontuacao the pontuacao to set
     */
    public void setPontuacao(float pontuacao) {
        this.pontuacao = pontuacao;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the id_lista
     */
    public int getId_lista() {
        return id_lista;
    }

    /**
     * @param id_lista the id_lista to set
     */
    public void setId_lista(int id_lista) {
        this.id_lista = id_lista;
    }
    
}
