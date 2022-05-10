/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalhopratico2.views;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import trabalhopratico2.controller.ControllerAppointment;
import trabalhopratico2.controller.ControllerDoctor;
import trabalhopratico2.controller.ControllerPatient;
import trabalhopratico2.models.Doctor;
import trabalhopratico2.models.Patient;

/**
 *
 * @author CIANDT\nathaliancg
 */
public class AppointmentView extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentView
     */
    private final ControllerAppointment controllerAppointment = null;
    private final ControllerPatient controllerPatient = null;
    private final ControllerDoctor controllerDoctor = null;
    private final DoctorView doctorView = null;
    private final PatientView patientView = null;

    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Patient patient;
    private Long patientCpf;
    private Doctor doctor;
    private Long crm;
    private LocalDateTime dateTime;
    private String observations;
    private int duration;

    public AppointmentView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        appointmentDateField = new javax.swing.JFormattedTextField();
        appointmentDurationField = new javax.swing.JFormattedTextField();
        appointmentCrmField = new javax.swing.JFormattedTextField();
        appointmentObservationsField = new javax.swing.JTextField();
        saveAppointmentButton = new javax.swing.JButton();
        searchAppointmentButton = new javax.swing.JButton();
        deleteAppointmentButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        appointmentCpfField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel3.setText("CRM do Médico");

        jLabel4.setText("Data da Consulta");

        jLabel5.setText("Duração");

        jLabel6.setText("Observações");

        appointmentDateField.setPreferredSize(new java.awt.Dimension(130, 24));
        appointmentDateField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentDateFieldActionPerformed(evt);
            }
        });

        appointmentDurationField.setPreferredSize(new java.awt.Dimension(130, 24));
        appointmentDurationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentDurationFieldActionPerformed(evt);
            }
        });

        appointmentCrmField.setPreferredSize(new java.awt.Dimension(130, 24));
        appointmentCrmField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentCrmFieldActionPerformed(evt);
            }
        });

        appointmentObservationsField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentObservationsFieldActionPerformed(evt);
            }
        });

        saveAppointmentButton.setText("Salvar");
        saveAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAppointmentButtonActionPerformed(evt);
            }
        });

        searchAppointmentButton.setText("Procurar");
        searchAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAppointmentButtonActionPerformed(evt);
            }
        });

        deleteAppointmentButton.setText("Deletar");
        deleteAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAppointmentButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("CPF do Paciente");

        appointmentCpfField.setPreferredSize(new java.awt.Dimension(130, 24));
        appointmentCpfField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentCpfFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(appointmentObservationsField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(appointmentCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(appointmentCrmField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(appointmentDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(appointmentDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchAppointmentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteAppointmentButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveAppointmentButton)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentCpfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointmentCrmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointmentObservationsField, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveAppointmentButton)
                    .addComponent(searchAppointmentButton)
                    .addComponent(deleteAppointmentButton))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void appointmentDateFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentDateFieldActionPerformed
        dateTime = LocalDateTime.parse(appointmentDateField.getText(), formatter);
    }//GEN-LAST:event_appointmentDateFieldActionPerformed

    private void appointmentCrmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentCrmFieldActionPerformed
        crm = doctorView.formatCrm(appointmentCrmField.getText());
    }//GEN-LAST:event_appointmentCrmFieldActionPerformed

    private void searchAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAppointmentButtonActionPerformed
        patient = controllerPatient.getPatient(patientCpf);
        doctor = controllerDoctor.getDoctor(crm);
        controllerAppointment.getAppointment(patient, doctor, dateTime);
    }//GEN-LAST:event_searchAppointmentButtonActionPerformed

    private void appointmentCpfFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentCpfFieldActionPerformed
        patientCpf = patientView.formatCpf(appointmentCpfField.getText());
    }//GEN-LAST:event_appointmentCpfFieldActionPerformed

    private void appointmentObservationsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentObservationsFieldActionPerformed
        observations = appointmentObservationsField.getText();
    }//GEN-LAST:event_appointmentObservationsFieldActionPerformed

    private void appointmentDurationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentDurationFieldActionPerformed
        duration = Integer.parseInt(appointmentDurationField.getText());
    }//GEN-LAST:event_appointmentDurationFieldActionPerformed

    private void deleteAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAppointmentButtonActionPerformed
        doctor = controllerDoctor.getDoctor(crm);
        controllerAppointment.deleteAppointment(doctor, dateTime);
    }//GEN-LAST:event_deleteAppointmentButtonActionPerformed

    private void saveAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAppointmentButtonActionPerformed
        controllerAppointment.makeAppointment(patientCpf, crm, dateTime, observations, duration);
    }//GEN-LAST:event_saveAppointmentButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField appointmentCpfField;
    private javax.swing.JFormattedTextField appointmentCrmField;
    private javax.swing.JFormattedTextField appointmentDateField;
    private javax.swing.JFormattedTextField appointmentDurationField;
    private javax.swing.JTextField appointmentObservationsField;
    private javax.swing.JButton deleteAppointmentButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton saveAppointmentButton;
    private javax.swing.JButton searchAppointmentButton;
    // End of variables declaration//GEN-END:variables
}