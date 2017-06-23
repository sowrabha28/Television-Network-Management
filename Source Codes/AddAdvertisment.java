
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class AddAdvertisment extends javax.swing.JFrame {

    /**
     * Creates new form AddAdvertisment
     */
    public AddAdvertisment() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AdIdtext = new javax.swing.JTextField();
        AddButtonAd = new javax.swing.JButton();
        CancelAdButt = new javax.swing.JButton();
        BrandNameText = new javax.swing.JTextField();
        ProdNameCombo = new javax.swing.JComboBox<>();
        DurationText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Advertisment Id *");

        jLabel2.setText("Brand Name :");

        jLabel3.setText("Product Type :");

        jLabel4.setText("Duration :");

        AddButtonAd.setText("Add");
        AddButtonAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonAdActionPerformed(evt);
            }
        });

        CancelAdButt.setText("Cancel");
        CancelAdButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelAdButtActionPerformed(evt);
            }
        });

        ProdNameCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detergent Powder", "Detergent Bar", "Toothpaste", "Website", "Education Body", "Soap", "Beverage", "Phone", "Telecommunication", "Noodle" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButtonAd)
                        .addGap(95, 95, 95)
                        .addComponent(CancelAdButt))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AdIdtext)
                            .addComponent(BrandNameText)
                            .addComponent(ProdNameCombo, 0, 131, Short.MAX_VALUE)
                            .addComponent(DurationText))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BrandNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(ProdNameCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(DurationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButtonAd)
                    .addComponent(CancelAdButt))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonAdActionPerformed
        // TODO add your handling code here:
        String AdId, AdName, AdType, ADdur;
        Integer ADuration;
        AdId = AdIdtext.getText();
        AdName = BrandNameText.getText();
        AdType = (String) ProdNameCombo.getSelectedItem();
       ADdur = DurationText.getText();
       ADuration = Integer.parseInt(ADdur);
       
       try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tv", "root", "1234567");
            Statement st = con.createStatement();
            //String s = "select channel_name from channel";
            st.executeUpdate("insert into advertisments values('"+AdId+"','"+AdName+"','"+AdType+"','"+Global.chID+"','"+ADuration+"')");
            JOptionPane.showMessageDialog(null,"Successfully Added");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        SecondPage scpg = null;
        try {
            scpg = new SecondPage();
        } catch (SQLException ex) {
            Logger.getLogger(AddAdvertisment.class.getName()).log(Level.SEVERE, null, ex);
        }
        scpg.setVisible(true);
        this.setVisible(false);
       
       
        
    }//GEN-LAST:event_AddButtonAdActionPerformed

    private void CancelAdButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelAdButtActionPerformed
        // TODO add your handling code here:
        SecondPage scpg = null;
        try {
            scpg = new SecondPage();
        } catch (SQLException ex) {
            Logger.getLogger(AddAdvertisment.class.getName()).log(Level.SEVERE, null, ex);
        }

        scpg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CancelAdButtActionPerformed

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
            java.util.logging.Logger.getLogger(AddAdvertisment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAdvertisment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAdvertisment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAdvertisment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdvertisment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdIdtext;
    private javax.swing.JButton AddButtonAd;
    private javax.swing.JTextField BrandNameText;
    private javax.swing.JButton CancelAdButt;
    private javax.swing.JTextField DurationText;
    private javax.swing.JComboBox<String> ProdNameCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
