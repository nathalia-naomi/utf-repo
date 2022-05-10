/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2.models;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author CIANDT\nathaliancg
 */
public class Patient implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private String name;
    private Long cpf;
    private LocalDate birthDate;
    private String phoneNumber;
    private String observations;

    public Patient(String name, Long cpf, LocalDate birthDate, String phoneNumber, String observations) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.observations = observations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCPF() {
        return cpf;
    }

    public void setCPF(Long cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
}
