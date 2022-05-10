/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2.models;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author CIANDT\nathaliancg
 */
public class Appointment implements Serializable {

    private static final long serialVersionUID = 3L;
    
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;
    private String observations;
    private int duration;

    public Appointment(Patient patient, Doctor doctor, LocalDateTime dateTime, String observations, int duration) {
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
        this.observations = observations;
        this.duration = duration;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
