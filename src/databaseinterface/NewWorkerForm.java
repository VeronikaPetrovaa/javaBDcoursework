/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseinterface;

/**
 *
 * @author Veronika
 */
public class NewWorkerForm extends javax.swing.JFrame {

    /**
     * Creates new form NewWorkerForm
     */
    public NewWorkerForm() {
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

        jLabel1 = new javax.swing.JLabel();
        nextbuttWorker = new javax.swing.JButton();
        LogoutaddWorker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 867));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseinterface/assets/AddWorker.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1300, 890);

        nextbuttWorker.setText("jButton1");
        nextbuttWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbuttWorkerActionPerformed(evt);
            }
        });
        getContentPane().add(nextbuttWorker);
        nextbuttWorker.setBounds(710, 730, 170, 40);

        LogoutaddWorker.setText("jButton2");
        LogoutaddWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutaddWorkerActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutaddWorker);
        LogoutaddWorker.setBounds(1240, 60, 50, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbuttWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbuttWorkerActionPerformed
        // TODO add your handling code here:
         WorkerPortail workerPortail = new WorkerPortail();
        workerPortail.setVisible(true);
        this.hide();
    }//GEN-LAST:event_nextbuttWorkerActionPerformed

    private void LogoutaddWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutaddWorkerActionPerformed
        // TODO add your handling code here:
        Interface interFace = new Interface();
        interFace.setVisible(true);
        this.hide();
    }//GEN-LAST:event_LogoutaddWorkerActionPerformed

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
            java.util.logging.Logger.getLogger(NewWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewWorkerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewWorkerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogoutaddWorker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton nextbuttWorker;
    // End of variables declaration//GEN-END:variables
}