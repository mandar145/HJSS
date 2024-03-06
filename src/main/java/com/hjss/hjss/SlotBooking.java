/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hjss.hjss;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author Madar
 */
public class SlotBooking extends javax.swing.JFrame {

    private HashMap<String, String> slotBookings;
    private HashMap<String, String> coachAssignments;
    private HashMap<String, Integer> learningCapacity;
    private HashMap<String, Integer> slotGradeLevels;
    private int studentLevel;
    private int studentID;

    /**
     * Creates new form SlotBooking
     */
    public SlotBooking(int level, int ID) {
        initComponents();
        this.studentLevel = level;
        jLabelCurrentLvl.setText("Learner Level: " + String.valueOf(level));
        this.studentID = ID;
        infoLabel.setVisible(false);
        initialize();
    }
    
    
    public void initialize() {
        
        //initialize all HashMap
        slotBookings = new HashMap<>();
        coachAssignments = new HashMap<>();
        learningCapacity = new HashMap<>();
        slotGradeLevels = new HashMap<>();
        
        //initialize all methods
        initializeCoaches();
        initializeLearningCapacity();
        initializeSlotGradeLevels();
    }

    
    
    
// "Monday 4pm-5pm", "Wednesday 5pm-6pm", "Friday 6pm-7pm", "Saturday 7pm-8pm"
    private void initializeSlotGradeLevels() {
        slotGradeLevels.put("Monday 4pm-5pm", 1);
        slotGradeLevels.put("Wednesday 5pm-6pm", 2);
        slotGradeLevels.put("Friday 6pm-7pm", 3);
        slotGradeLevels.put("Saturday 7pm-8pm", 4);
    }

    private void initializeLearningCapacity() {
        learningCapacity.put("Monday 4pm-5pm", 0);
        learningCapacity.put("Wednesday 5pm-6pm", 0);
        learningCapacity.put("Friday 6pm-7pm", 0);
        learningCapacity.put("Saturday 7pm-8pm", 0);
    }

    private void initializeCoaches() {
        coachAssignments.put("Monday 4pm-5pm", "Coach A");
        coachAssignments.put("Wednesday 5pm-6pm", "Coach B");
        coachAssignments.put("Friday 6pm-7pm", "Coach C");
        coachAssignments.put("Saturday 7pm-8pm", "Coach D");
    }

    private void bookSlot(String slot) {

        Integer gradeLevel = slotGradeLevels.get(slot); //slot value is 1,2,3 according to the chosen slot
        Integer currentCapacity = learningCapacity.get(slot); //slot value is 0 initially

        if (gradeLevel == null || currentCapacity == null) {
            infoLabel.setForeground(Color.red);
            infoLabel.setText("Error: Invalid slot.");
            infoLabel.setVisible(true);
            return;
        }

        else if ( gradeLevel > studentLevel + 1  )
        { 
            infoLabel.setForeground(Color.red);
            infoLabel.setText("Error: Cannot book a lesson more than one grade higher.");
            infoLabel.setVisible(true);
            return;
        }
        

        else if (currentCapacity >= 4) {
            infoLabel.setText("This slot is fully booked.");
            infoLabel.setForeground(Color.red);
            infoLabel.setVisible(true);
            return;
        }

        learningCapacity.put(slot, currentCapacity + 1);
        slotBookings.put(slot + "-" + studentID, "Booked");

        String coach = coachAssignments.get(slot);
        String message = "Booked " + slot + " with " + (coach != null ? coach : "no coach available.");
        infoLabel.setText(message);
        //Also increase level of learner
         studentLevel= studentLevel +1;
        jLabelCurrentLvl.setText("Learner Level: " + String.valueOf(studentLevel));
        infoLabel.setForeground(Color.green);
        infoLabel.setVisible(true);
        System.out.println("Max Capacity is 4 and Currently Occupied Capacity: " + currentCapacity + "for slot: " + slot );

    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        slotComboBox = new javax.swing.JComboBox<>();
        infoLabel = new javax.swing.JLabel();
        jButtonBookSlot = new javax.swing.JButton();
        jLabelCurrentLvl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Slot Booking");

        slotComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday 4pm-5pm", "Wednesday 5pm-6pm", "Friday 6pm-7pm", "Saturday 7pm-8pm" }));

        infoLabel.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        infoLabel.setForeground(new java.awt.Color(0, 153, 51));
        infoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoLabel.setText("Book a Slot");

        jButtonBookSlot.setText("Book Slot");
        jButtonBookSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookSlotActionPerformed(evt);
            }
        });

        jLabelCurrentLvl.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabelCurrentLvl.setText("Current Level");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCurrentLvl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slotComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBookSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(129, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCurrentLvl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(slotComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButtonBookSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(infoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBookSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookSlotActionPerformed
        // Get the selected item from the slotComboBox
        String selectedSlot = (String) slotComboBox.getSelectedItem();
        // Call the bookSlot method with the selected slot
        bookSlot(selectedSlot);
    }//GEN-LAST:event_jButtonBookSlotActionPerformed

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
            java.util.logging.Logger.getLogger(SlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlotBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlotBooking(123, 123).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel infoLabel;
    private javax.swing.JButton jButtonBookSlot;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCurrentLvl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> slotComboBox;
    // End of variables declaration//GEN-END:variables

}
