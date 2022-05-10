/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import trabalhopratico2.models.Appointment;
import trabalhopratico2.models.Doctor;
import trabalhopratico2.models.Patient;

/**
 *
 * @author CIANDT\nathaliancg
 */
public class ControllerDoctor {

    private List<Doctor> doctors = new ArrayList<>();


    public ControllerDoctor(List<Patient> patients, List<Doctor> doctors, List<Appointment> appointments) {
        this.doctors = doctors;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public void registerDoctor(String name, Long crm, String observations) {
        if (doctors.stream().anyMatch(doctor -> Objects.equals(doctor.getCRM(), crm))) {
            throw new RuntimeException("Doctor already exists.");
        }
        Doctor newDoctor = new Doctor(name, crm, observations);
        doctors.add(newDoctor);
    }

    public void deleteDoctor(Long crm) {
        doctors.removeIf(doctor -> Objects.equals(doctor.getCRM(), crm));
    }

    public Doctor getDoctor(Long crm) {
        List<Doctor> doctorResult = doctors.stream().filter(doctor -> Objects.equals(doctor.getCRM(), crm)).collect(Collectors.toList());
        if (doctorResult.isEmpty()) {
            throw new RuntimeException("Doctor not found.");
        } else if (doctorResult.size() > 1) {
            throw new RuntimeException("Wrong State: multiple entries found.");
        }
        return doctorResult.get(0);
    }
    
    public void updateDoctor(String name, Long crm, String observations) {
        getDoctor(crm);
        Doctor updatedDoctor = new Doctor(name, crm, observations);
        deleteDoctor(crm);
        doctors.add(updatedDoctor);
    }
}