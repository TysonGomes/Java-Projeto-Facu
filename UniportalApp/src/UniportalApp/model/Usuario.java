package UniportalApp.model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tgomes
 */
public class Usuario {
    
    private int id;
    private String nome;
    private String email;
    private String senha;
    private int tipo_usuario;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipo_usuario
     */
    public int getTipo_usuario() {
        return tipo_usuario;
    }

    /**
     * @param tipo_usuario the tipo_usuario to set
     */
    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

    /**
     * @return the dt_registro
     */
    public Date getDt_registro() {
        return dt_registro;
    }

    /**
     * @param dt_registro the dt_resgistro to set
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
