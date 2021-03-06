/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseinterface;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 * @author Veronika
 */
public class WorkerDetailsForm extends javax.swing.JFrame {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true";

    /**
     * Creates new form WorkerDetailsForm
     */
    public WorkerDetailsForm() {
        initComponents();
        DefaultTableModel dm = new DBclass().getData();
        jTableViewWorker.setModel(dm);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        nameW = new javax.swing.JTextField();
        dateW = new javax.swing.JTextField();
        countryW = new javax.swing.JTextField();
        mailW = new javax.swing.JTextField();
        postW = new javax.swing.JTextField();
        surnameW = new javax.swing.JTextField();
        genderW = new javax.swing.JTextField();
        numberW = new javax.swing.JTextField();
        cityW = new javax.swing.JTextField();
        IDW = new javax.swing.JTextField();
        salaryW = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HomeSearchWorker = new javax.swing.JButton();
        LogoutSearchWorker = new javax.swing.JButton();
        SearchBut = new javax.swing.JButton();
        genderWorker = new javax.swing.JComboBox<>();
        ViewWorkers = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewWorker = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        HomeSearchViewWorker = new javax.swing.JButton();
        LogoutViewWorker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        nameW.setEditable(false);
        nameW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameWActionPerformed(evt);
            }
        });
        jPanel1.add(nameW);
        nameW.setBounds(330, 300, 150, 40);

        dateW.setEditable(false);
        dateW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateWActionPerformed(evt);
            }
        });
        jPanel1.add(dateW);
        dateW.setBounds(330, 380, 150, 40);

        countryW.setEditable(false);
        countryW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryWActionPerformed(evt);
            }
        });
        jPanel1.add(countryW);
        countryW.setBounds(330, 460, 150, 40);

        mailW.setEditable(false);
        mailW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailWActionPerformed(evt);
            }
        });
        jPanel1.add(mailW);
        mailW.setBounds(330, 540, 150, 40);

        postW.setEditable(false);
        postW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postWActionPerformed(evt);
            }
        });
        jPanel1.add(postW);
        postW.setBounds(330, 620, 150, 40);

        surnameW.setEditable(false);
        surnameW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surnameWActionPerformed(evt);
            }
        });
        jPanel1.add(surnameW);
        surnameW.setBounds(760, 300, 150, 40);

        genderW.setEditable(false);
        genderW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderWActionPerformed(evt);
            }
        });
        jPanel1.add(genderW);
        genderW.setBounds(760, 380, 150, 40);

        numberW.setEditable(false);
        numberW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberWActionPerformed(evt);
            }
        });
        jPanel1.add(numberW);
        numberW.setBounds(760, 460, 150, 40);

        cityW.setEditable(false);
        cityW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityWActionPerformed(evt);
            }
        });
        jPanel1.add(cityW);
        cityW.setBounds(760, 540, 150, 40);

        IDW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDWActionPerformed(evt);
            }
        });
        jPanel1.add(IDW);
        IDW.setBounds(330, 140, 150, 50);

        salaryW.setEditable(false);
        salaryW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryWActionPerformed(evt);
            }
        });
        jPanel1.add(salaryW);
        salaryW.setBounds(760, 620, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseinterface/assets/SearchWorker.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 1300, 830);

        HomeSearchWorker.setText("jButton1");
        HomeSearchWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeSearchWorkerActionPerformed(evt);
            }
        });
        jPanel1.add(HomeSearchWorker);
        HomeSearchWorker.setBounds(1194, 30, 40, 50);

        LogoutSearchWorker.setText("jButton2");
        LogoutSearchWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutSearchWorkerActionPerformed(evt);
            }
        });
        jPanel1.add(LogoutSearchWorker);
        LogoutSearchWorker.setBounds(1250, 30, 40, 50);

        SearchBut.setText("jButton1");
        SearchBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBut);
        SearchBut.setBounds(540, 140, 170, 50);

        genderWorker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female"}));
        genderWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderWorkerActionPerformed(evt);
            }
        });
        jPanel1.add(genderWorker);
        genderWorker.setBounds(760, 410, 150, 40);

        jTabbedPane1.addTab("Search Worker", jPanel1);

        ViewWorkers.setLayout(null);

        jTableViewWorker.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null, null, null, null, null}
                },
                new String[]{
                        "Name", "Surname", "Age", "Date", "Country", "Email", "Present post", "Gender", "Phone number", "City", "Salary"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableViewWorker);
        if (jTableViewWorker.getColumnModel().getColumnCount() > 0) {
            jTableViewWorker.getColumnModel().getColumn(0).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(1).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(2).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(3).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(4).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(5).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(6).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(7).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(8).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(9).setResizable(false);
            jTableViewWorker.getColumnModel().getColumn(10).setResizable(false);
        }

        ViewWorkers.add(jScrollPane1);
        jScrollPane1.setBounds(0, 160, 1300, 670);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/databaseinterface/assets/ViewWorkers.png"))); // NOI18N
        ViewWorkers.add(jLabel1);
        jLabel1.setBounds(0, 10, 1300, 840);

        HomeSearchViewWorker.setText("jButton1");
        HomeSearchViewWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeSearchViewWorkerActionPerformed(evt);
            }
        });
        ViewWorkers.add(HomeSearchViewWorker);
        HomeSearchViewWorker.setBounds(1194, 30, 40, 50);

        LogoutViewWorker.setText("jButton2");
        LogoutViewWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutViewWorkerActionPerformed(evt);
            }
        });
        ViewWorkers.add(LogoutViewWorker);
        LogoutViewWorker.setBounds(1250, 30, 40, 50);

        jTabbedPane1.addTab("View Workers", ViewWorkers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeSearchWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeSearchWorkerActionPerformed
        // TODO add your handling code here:
        WorkerPortail workerPortail = new WorkerPortail();
        workerPortail.setVisible(true);
        this.hide();
    }//GEN-LAST:event_HomeSearchWorkerActionPerformed

    private void LogoutSearchWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutSearchWorkerActionPerformed
        // TODO add your handling code here:
        Interface interFace = new Interface();
        interFace.setVisible(true);
        this.hide();
    }//GEN-LAST:event_LogoutSearchWorkerActionPerformed

    private void HomeSearchViewWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeSearchViewWorkerActionPerformed
        // TODO add your handling code here:
        WorkerPortail workerPortail = new WorkerPortail();
        workerPortail.setVisible(true);
        this.hide();
    }//GEN-LAST:event_HomeSearchViewWorkerActionPerformed

    private void LogoutViewWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutViewWorkerActionPerformed
        // TODO add your handling code here:
        Interface interFace = new Interface();
        interFace.setVisible(true);
        this.hide();
    }//GEN-LAST:event_LogoutViewWorkerActionPerformed

    private void IDWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDWActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_IDWActionPerformed

    private void nameWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameWActionPerformed

    private void dateWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateWActionPerformed

    private void countryWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryWActionPerformed

    private void mailWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailWActionPerformed

    private void surnameWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surnameWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surnameWActionPerformed

    private void genderWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderWActionPerformed

    private void numberWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberWActionPerformed

    private void cityWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityWActionPerformed

    private void salaryWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryWActionPerformed

    public class Function extends DBclass {


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        public ResultSet find(String s) {
            try {
                conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
                ps = conn.prepareStatement("select * from workers where Id_worker =?");
                ps.setString(1, s);
                rs = ps.executeQuery();
            } catch (Exception e) {
                System.out.println(e);
            }
            return rs;
        }
    }

    private void SearchButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButActionPerformed
        // TODO add your handling code here:
        Function f = new Function();
        ResultSet rs = null;
        String name = "Name";
        String surname = "Surname";
        String date = "Date";
        String country = "Country";
        String email = "Email";
        String presentpost = "Presentpost";
        String gender = "Gender";
        String num = "Phonenumber";
        String city = "City";
        String salary = "Salary";
        rs = f.find(IDW.getText());
        try {
            if (rs.next()) {
                nameW.setText(rs.getString("Name"));
                surnameW.setText(rs.getString("Surname"));
                dateW.setText(rs.getString("Date"));
                countryW.setText(rs.getString("Country"));
                mailW.setText(rs.getString("Email"));
                postW.setText(rs.getString("PresentPost"));
                genderW.setText(rs.getString("Gender"));
                numberW.setText(rs.getString("Phonenumber"));
                cityW.setText(rs.getString("City"));
                salaryW.setText(rs.getString("salary"));

            } else {
                System.out.println("NO DATA");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_SearchButActionPerformed

    private void genderWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderWorkerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderWorkerActionPerformed

    private void postWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postWActionPerformed

    private void ViewWorkers() {

    }

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
            java.util.logging.Logger.getLogger(WorkerDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkerDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkerDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkerDetailsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkerDetailsForm().setVisible(true);
            }
        });


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HomeSearchViewWorker;
    private javax.swing.JButton HomeSearchWorker;
    private javax.swing.JTextField IDW;
    private javax.swing.JButton LogoutSearchWorker;
    private javax.swing.JButton LogoutViewWorker;
    private javax.swing.JButton SearchBut;
    private javax.swing.JPanel ViewWorkers;
    private javax.swing.JTextField cityW;
    private javax.swing.JTextField countryW;
    private javax.swing.JTextField dateW;
    private javax.swing.JTextField genderW;
    private javax.swing.JComboBox<String> genderWorker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableViewWorker;
    private javax.swing.JTextField mailW;
    private javax.swing.JTextField nameW;
    private javax.swing.JTextField numberW;
    private javax.swing.JTextField postW;
    private javax.swing.JTextField salaryW;
    private javax.swing.JTextField surnameW;
    // End of variables declaration//GEN-END:variables
}
