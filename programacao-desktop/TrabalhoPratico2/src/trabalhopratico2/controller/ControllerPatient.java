/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import trabalhopratico2.models.Patient;

/**
 *
 * @author CIANDT\nathaliancg
 */
public class ControllerPatient {

    private List<Patient> patients = new ArrayList<>();

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ControllerPatient(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void registerPatient(String name, Long cpf, LocalDate birthDate, String phoneNumber, String observations) {
        if (patients.stream().anyMatch(patient -> Objects.equals(patient.getCPF(), cpf))) {
            throw new RuntimeException("Patient already exists.");
        }
        Patient newPatient = new Patient(name, cpf, birthDate, phoneNumber, observations);
        patients.add(newPatient);
    }

    public void deletePatient(Long cpf) {
        patients.removeIf(patient -> Objects.equals(patient.getCPF(), cpf));
    }

    public Patient getPatient(Long cpf) {
        List<Patient> patientResult = patients.stream().filter(patient -> Objects.equals(patient.getCPF(), cpf)).collect(Collectors.toList());
        if (patientResult.isEmpty()) {
            throw new RuntimeException("Patient not found.");
        } else if (patientResult.size() > 1) {
            throw new RuntimeException("Wrong State: multiple entries found.");
        }
        return patientResult.get(0);
    }

    public void updatePatient(String name, Long cpf, String birthDate, String phoneNumber, String observations) {
        getPatient(cpf);
        LocalDate date = LocalDate.parse(birthDate, formatter);
        Patient updatedPatient = new Patient(name, cpf, date, phoneNumber, observations);
        deletePatient(cpf);
        patients.add(updatedPatient);
    }
}