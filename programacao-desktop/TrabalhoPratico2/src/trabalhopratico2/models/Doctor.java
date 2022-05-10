/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2.models;

import java.io.Serializable;

/**
 *
 * @author CIANDT\nathaliancg
 */
public class Doctor implements Serializable {
    
    private static final long serialVersionUID = 2L;
    
    private String name;
    private Long crm;
    private String observations;

    
    public Doctor(String name, Long crm, String observations) {
        this.name = name;
        this.crm = crm;
        this.observations = observations;
    }
    
    public String getName() {
        return name;
    }
    
    public Long getCRM() {
        return crm;
    }
    
    public String getObservations() {
        return observations;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setCRM(Long crm) {
        this.crm = crm;
    }
    
    public void setObservations(String observations) {
        this.observations = observations;
    }
    
}
