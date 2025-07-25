package com.mycompany.gymmanagementproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Tanis
 */
public class AddMemberDetails extends javax.swing.JFrame {
 Singlton conn = Singlton.getInstance();
 int selectedId = -1;
    /**
     * Creates new form AddMemberDetails
     */
    public AddMemberDetails(int id) {
        initComponents();
        this.selectedId = id;
        System.out.println("SeletedId: "+selectedId);
        
        try{
        String getQuery = "SELECT * FROM members WHERE id = ?";
        
        PreparedStatement ps = conn.connection.prepareCall(getQuery);
        ps.setInt(1, selectedId);
        ResultSet result = ps.executeQuery();
        if(result.next()){
           Name.setText(result.getString("Name"));
           Age.setText(result.getString("Age"));
           Number.setText(result.getString("Number"));
           Address.setText(result.getString("Address"));
           StartDate.setText(result.getString("StartDate"));
           EndDate.setText(result.getString("EndDate"));
            Payment.setText(result.getString("Payement"));
                 
        }
        
        }catch(SQLException exception){
            
            System.out.println("Check SIngle Data: "+ exception);
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Age = new javax.swing.JTextField();
        Number = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        StartDate = new javax.swing.JTextField();
        EndDate = new javax.swing.JTextField();
        Payment = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD MEMBER DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("          NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 146, 130, 20));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("AGE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 40, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("MOBILE NUMBER");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("ADDRESS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("START DATE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("END DATE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, 30));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("PAYMENT DETAILS ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, 30));
        jPanel1.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 132, 220, 30));
        jPanel1.add(Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 182, 220, 30));
        jPanel1.add(Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 220, 30));
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 292, 220, 30));

        StartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartDateActionPerformed(evt);
            }
        });
        jPanel1.add(StartDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 220, 30));
        jPanel1.add(EndDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 220, 30));
        jPanel1.add(Payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 220, 30));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, 140, 35));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 570, 110, 35));

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
    }// </editor-fold>//GEN-END:initComponents

    private void StartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartDateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
if(Name.getText().isEmpty()){
    JOptionPane.showMessageDialog(this,"enter the name ")  ;
    
    
}else if (Age.getText().isEmpty() ){
   JOptionPane.showMessageDialog(this,"enter the email");
    
}else if (Number.getText().isEmpty() ){
   JOptionPane.showMessageDialog(this,"enter the email");
    
}else if (Address.getText().isEmpty() ){
   JOptionPane.showMessageDialog(this,"enter the email");
    
}else if (StartDate.getText().isEmpty() ){
   JOptionPane.showMessageDialog(this,"enter the email");
    
}else if (EndDate.getText().isEmpty() ){
   JOptionPane.showMessageDialog(this,"enter the email");
    
}else if (Payment.getText().isEmpty() ){
   JOptionPane.showMessageDialog(this,"enter the email");
    
}else{
   
        
      

      
                   //            lEmail.setText(email.getText());
//            lPassword.setText(password.getText());

               if(selectedId > 0){
                   
               try {

                String Members = "UPDATE  Members SET Name=?,Age=?,Number=?,Address=?,StartDate=?,EndDate=?,Payment=? WHERE id=?";
                PreparedStatement ps = conn.connection.prepareCall(Members);
                ps.setString(1, Name.getText());
                ps.setString(2, Age.getText()); 
                ps.setString(3, Number.getText()); 
                ps.setString(4, Address.getText()); 
                ps.setString(5, StartDate.getText()); 
                ps.setString(6, EndDate.getText()); 
                ps.setString(7, Payment.getText()); 
                ps.setInt(8,selectedId);
                
                
                if(ps.executeUpdate() > 0){
                  System.out.println("Data Updated");
                //  StudentForm std = new StudentForm();
                  //std.setVisible(true);
                 // dispose();   
                }
               } catch (SQLException ex) {
                   System.getLogger(AddMemberDetails.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
               }
               
               
               }else{
   try {

                String Members = "INSERT INTO Members(Name,Age,Number,Address,StartDate,EndDate,Payment)  VALUES(?, ?,?,?,?,?,?)";
                PreparedStatement ps = conn.connection.prepareCall(Members);
                ps.setString(1, Name.getText());
                ps.setString(2, Age.getText()); 
                ps.setString(3, Number.getText()); 
                ps.setString(4, Address.getText()); 
                ps.setString(5, StartDate.getText()); 
                ps.setString(6, EndDate.getText()); 
                ps.setString(7, Payment.getText()); 
                
                
                if(ps.executeUpdate() > 0){
                  System.out.println("Data Inserted");
                //  StudentForm std = new StudentForm();
                  //std.setVisible(true);
                 // dispose();   
                }
               } catch (SQLException ex) {
                   System.getLogger(AddMemberDetails.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
               }
         }
}
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         MembershipRegistrationPage object = new MembershipRegistrationPage();
    object.setVisible(true);
    dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AddMemberDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMemberDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMemberDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMemberDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddMemberDetails().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Age;
    private javax.swing.JTextField EndDate;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Number;
    private javax.swing.JTextField Payment;
    private javax.swing.JTextField StartDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
