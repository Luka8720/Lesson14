
import javax.swing.JOptionPane;

public class ERGUI extends javax.swing.JFrame {
LinkedPriorityQueue ER = new LinkedPriorityQueue(3);
    public ERGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnschedule = new javax.swing.JButton();
        btntreatnext = new javax.swing.JButton();
        btntreatall = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtoutput = new javax.swing.JTextArea();
        optfair = new javax.swing.JRadioButton();
        optserious = new javax.swing.JRadioButton();
        optcritical = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emergency Room");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Patient Name:");

        txtname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnschedule.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnschedule.setText("Schedule");
        btnschedule.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscheduleActionPerformed(evt);
            }
        });

        btntreatnext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btntreatnext.setText("Treat Next");
        btntreatnext.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btntreatnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatnextActionPerformed(evt);
            }
        });

        btntreatall.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btntreatall.setText("Treat All");
        btntreatall.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btntreatall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatallActionPerformed(evt);
            }
        });

        txtoutput.setColumns(20);
        txtoutput.setRows(5);
        jScrollPane1.setViewportView(txtoutput);

        buttonGroup1.add(optfair);
        optfair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optfair.setText("Fair Condition");
        optfair.setActionCommand("Fair");
        optfair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optfairActionPerformed(evt);
            }
        });

        buttonGroup1.add(optserious);
        optserious.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optserious.setText("Serious Condition");
        optserious.setActionCommand("Serious ");

        buttonGroup1.add(optcritical);
        optcritical.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        optcritical.setText("Critical Condition");
        optcritical.setActionCommand("Critical ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optserious)
                                    .addComponent(optcritical))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optfair)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnschedule, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btntreatall, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btntreatnext, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(optfair))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnschedule)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optserious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optcritical)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btntreatnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btntreatall)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optfairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optfairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optfairActionPerformed

    private void btnscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscheduleActionPerformed
        String n = txtname.getText();
        String c;
        int level = 0;
        if(optfair.isSelected()){
            c = optfair.getActionCommand();
            level = 2;
        }
        else if(optserious.isSelected()){
            c = optserious.getActionCommand();
            level = 1;
        }
        else if(optcritical.isSelected()){
            c = optcritical.getActionCommand();
            level = 0;
        }
        else{
            JOptionPane.showMessageDialog(this, "ERROR - No Condition Chosen");
            return;
        }
        Patient p = new Patient(n,c);
        ER.enqueue(txtname.getText(), level);
        txtname.setText("");
        buttonGroup1.clearSelection();
        txtoutput.append(p.toString()+"\tWaiting....");
        
    }//GEN-LAST:event_btnscheduleActionPerformed

    private void btntreatnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatnextActionPerformed
        txtoutput.append("\n" + ER.dequeue() + " has been treated.");
        
    }//GEN-LAST:event_btntreatnextActionPerformed

    private void btntreatallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatallActionPerformed
        while(ER.size()>0){
            txtoutput.append("\n" + ER.dequeue() + " has been treated.");
        }
    }//GEN-LAST:event_btntreatallActionPerformed

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
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ERGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ERGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnschedule;
    private javax.swing.JButton btntreatall;
    private javax.swing.JButton btntreatnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton optcritical;
    private javax.swing.JRadioButton optfair;
    private javax.swing.JRadioButton optserious;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtoutput;
    // End of variables declaration//GEN-END:variables
}
