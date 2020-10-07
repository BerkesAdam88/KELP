package lekerdezo4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static lekerdezo4.FoAblak.bejelentkezve;

/**
 *
 * @author Berkes
 */
public class UjRogzitese extends javax.swing.JFrame {

    public UjRogzitese() {
        initComponents();

        //jobb felső sarok: bejelentkezve
        jLabel13.setText(bejelentkezve.get(0).felhasznalo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        igen = new javax.swing.JRadioButton();
        nem = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 900));
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Programozás\\Szakdolgozat\\SQL\\Lekerdezo4\\Image\\Hungary_Police.svg.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(305, 50, 190, 240);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Kijelentkezés");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 780, 140, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Vissza");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(610, 780, 140, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Új szabálysértés rögzítése");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 300, 240, 60);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Ekövető neve:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(218, 370, 120, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Személyi igazolvány száma:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 420, 220, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Anyja neve:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(236, 470, 100, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Elkövetés ideje:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(217, 520, 120, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Illetékes Rendőrkapitányság:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(102, 570, 250, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Elkövetett Szabálysértés:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(140, 620, 200, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Büntetőpont:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(227, 670, 110, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Együttműködő:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(214, 720, 120, 40);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(400, 370, 200, 40);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField2);
        jTextField2.setBounds(400, 420, 200, 40);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField3);
        jTextField3.setBounds(400, 470, 200, 40);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField4);
        jTextField4.setBounds(400, 520, 200, 40);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(400, 570, 200, 40);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        getContentPane().add(jTextField6);
        jTextField6.setBounds(400, 620, 200, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("(Pl.: 2020-01-01)");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(620, 520, 110, 40);

        buttonGroup2.add(igen);
        igen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        igen.setText("Igen");
        igen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        igen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igenActionPerformed(evt);
            }
        });
        getContentPane().add(igen);
        igen.setBounds(420, 720, 60, 40);

        buttonGroup2.add(nem);
        nem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nem.setText("Nem");
        getContentPane().add(nem);
        nem.setBounds(520, 720, 60, 40);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setMaximumRowCount(9);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(470, 680, 56, 30);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(209, 0, 25));
        jButton3.setText("Rögzítés");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 780, 140, 50);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Bejelentkezve:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(480, 10, 110, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setText("név");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(590, 10, 210, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //kijelentkezés

        bejelentkezve.clear();
        dispose();
        FoAblak fAblak = new FoAblak();
        fAblak.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //vissza

        dispose();
        ValasztoAblak vAblak = new ValasztoAblak();
        vAblak.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //rögzítés gomb

        String elkovetoNeve = jTextField1.getText();
        String szigSzam = jTextField2.getText();
        String anyjaNeve = jTextField3.getText();
        String elkovetesIdeje = jTextField4.getText();
        String illKap = jTextField5.getText();
        String elkovetettCs = jTextField6.getText();
        int pont = jComboBox1.getSelectedIndex();
        String egyuttmukodo;

        if (igen.isSelected()) {
            egyuttmukodo = "Igen";
        } else if (nem.isSelected()) {
            egyuttmukodo = "Nem";
        } else {
            egyuttmukodo = "";
        }

        boolean kitoltes = false;

        if (!(elkovetoNeve.contentEquals("") || szigSzam.contentEquals("") || anyjaNeve.contentEquals("") || elkovetesIdeje.contentEquals("")
                || illKap.contentEquals("") || elkovetettCs.contentEquals("") || egyuttmukodo.contentEquals(""))) {
            kitoltes = true;
        } else {
            JOptionPane.showMessageDialog(null, "Minden mező kitöltése kötelező!", "Rögzítései hiba!", JOptionPane.ERROR_MESSAGE);
        }

        if (kitoltes) {

            String sqlInsert = "INSERT INTO Szabálysértések (Név, Szig, Anyja, Ideje, Illetékesség, Cselekmény, Büntetőpont, Együttműködő) VALUES\n"
                    + "(?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement st;
            ResultSet rs;

            try {
                st = kelrConnect.getConnection().prepareStatement(sqlInsert);

                st.setString(1, elkovetoNeve);
                st.setString(2, szigSzam);
                st.setString(3, anyjaNeve);
                st.setString(4, elkovetesIdeje);
                st.setString(5, illKap);
                st.setString(6, elkovetettCs);
                st.setInt(7, pont);
                st.setString(8, egyuttmukodo);

                st.execute();

                JOptionPane.showMessageDialog(null, "Sikeres rögzítés!", "Adatbázis", JOptionPane.INFORMATION_MESSAGE);

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hibás adatok megadása új szemly rögzítése rögzítés gomb!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void igenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_igenActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UjRogzitese().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton igen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private static javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JRadioButton nem;
    // End of variables declaration//GEN-END:variables
}
