/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author alejandro
 */
@ManagedBean
@RequestScoped
public class principal {
    
    private String url = "profesor/BancoPreguntas.xhtml";
    
    public void irABanco(){
        this.url = "profesor/BancoPreguntas.xhtml";
    }

    /**
     * Creates a new instance of principal
     */
    public principal() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
