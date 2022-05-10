/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopratico2.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
public class ControllerAppointment {

    private List<Appointment> appointments = new ArrayList<>();
    private final ControllerPatient controllerPatient;
    private final ControllerDoctor controllerDoctor;

    public ControllerAppointment(List<Appointment> appointments, ControllerPatient controllerPatient, ControllerDoctor controllerDoctor) {
        this.appointments = appointments;
        this.controllerPatient = controllerPatient;
        this.controllerDoctor = controllerDoctor;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public void makeAppointment(Long patientCpf, Long doctorCrm, LocalDateTime dateTime, String observations, int duration) {
        final Patient patient = controllerPatient.getPatient(patientCpf);
        final Doctor doctor = controllerDoctor.getDoctor(doctorCrm);
        if (appointments.stream()
                .filter(appointment -> Objects.equals(appointment.getDoctor().getCRM(), doctor.getCRM()))
                .anyMatch(appointment -> {
                    final LocalDateTime upper = appointment.getDateTime().plusMinutes(appointment.getDuration());
                    return dateTime.isAfter(appointment.getDateTime()) || dateTime.isEqual(appointment.getDateTime())
                            && dateTime.isBefore(upper) || dateTime.isEqual(upper);
                })) {
            throw new RuntimeException("Time is not available.");
        }
        Appointment newAppointment = new Appointment(patient, doctor, dateTime, observations, duration);
        appointments.add(newAppointment);
    }

    public void deleteAppointment(Doctor doctor, LocalDateTime dateTime) {
        appointments.removeIf(appointment -> Objects.equals(appointment.getDoctor().getCRM(), doctor.getCRM())
                && appointment.getDateTime().isEqual(dateTime));
    }

    public Appointment getAppointment(Patient patient, Doctor doctor, LocalDateTime dateTime) {
        List<Appointment> appointmentResult = appointments.stream()
                .filter(appointment -> {
                    final LocalDateTime upper = appointment.getDateTime().plusMinutes(appointment.getDuration());
                    return Objects.equals(appointment.getDoctor().getCRM(), doctor.getCRM())
                            && dateTime.isAfter(appointment.getDateTime()) || dateTime.isEqual(appointment.getDateTime())
                            && dateTime.isBefore(upper) || dateTime.isEqual(upper);
                }
                ).collect(Collectors.toList());

        if (appointmentResult.isEmpty()) {
            throw new RuntimeException("Appointment not found.");
        } else if (appointmentResult.size() > 1) {
            throw new RuntimeException("Wrong State: multiple entries found.");
        }
        return appointmentResult.get(0);
    }

    public void updateAppointment(Patient patient, Doctor doctor, LocalDateTime dateTime, String observations, int duration) {
        getAppointment(patient, doctor, dateTime);
        Appointment updatedAppointment = new Appointment(patient, doctor, dateTime, observations, duration);
        deleteAppointment(doctor, dateTime);
        appointments.add(updatedAppointment);
    }
}
