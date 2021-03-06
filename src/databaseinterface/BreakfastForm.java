/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseinterface;

/**
 * @author Veronika
 */
public class BreakfastForm extends javax.swing.JFrame {

    /**
     * Creates new form BreakfastForm
     */
    public BreakfastForm() {
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
        LogoutViewbreakFast = new javax.swing.JButton();
        HomeViewbreakFast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1310, 867));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseinterface/assets/breakfast.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1320, 870);

        LogoutViewbreakFast.setText("jButton2");
        LogoutViewbreakFast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutViewbreakFastActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutViewbreakFast);
        LogoutViewbreakFast.setBounds(1250, 50, 40, 49);

        HomeViewbreakFast.setText("jButton1");
        HomeViewbreakFast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeViewbreakFastActionPerformed(evt);
            }
        });
        getContentPane().add(HomeViewbreakFast);
        HomeViewbreakFast.setBounds(1194, 50, 40, 45);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutViewbreakFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutViewbreakFastActionPerformed
        // TODO add your handling code here:
        Interface interFace = new Interface();
        interFace.setVisible(true);
        this.hide();
    }//GEN-LAST:event_LogoutViewbreakFastActionPerformed

    private void HomeViewbreakFastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeViewbreakFastActionPerformed
        // TODO add your handling code here:
        WorkerPortail workerPortail = new WorkerPortail();
        workerPortail.setVisible(true);
        this.hide();
    }//GEN-LAST:event_HomeViewbreakFastActionPerformed

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
            java.util.logging.Logger.getLogger(BreakfastForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BreakfastForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BreakfastForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BreakfastForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BreakfastForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeViewbreakFast;
    private javax.swing.JButton LogoutViewbreakFast;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
