package lekerdezo4;

import com.sun.glass.events.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static lekerdezo4.FoAblak.bejelentkezve;

/**
 *
 * @author Berkes
 */
public class SzemelyKereses extends javax.swing.JFrame {

    public static ArrayList<Elkoveto> elkoveto = new ArrayList<>();

    public SzemelyKereses() {
        initComponents();

        //jobb felső sarok: bejelentkezve
        jLabel7.setText(bejelentkezve.get(0).felhasznalo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nevtext = new javax.swing.JTextField();
        szigtext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 900));
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Programozás\\Szakdolgozat\\SQL\\Lekerdezo4\\Image\\Hungary_Police.svg.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(305, 50, 190, 240);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Szabálysértési előélet keresése");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 300, 300, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Név:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 400, 100, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Személyazonosíto igazolvány szám:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 450, 280, 40);

        nevtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        nevtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nevtextKeyPressed(evt);
            }
        });
        getContentPane().add(nevtext);
        nevtext.setBounds(380, 400, 200, 40);

        szigtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        szigtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                szigtextKeyPressed(evt);
            }
        });
        getContentPane().add(szigtext);
        szigtext.setBounds(380, 450, 200, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Adja meg a keresendő személy nevét és személyazonosító igazolvány számát.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 510, 800, 100);

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

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton3.setText("Keresés");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(620, 410, 110, 70);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Bejelentkezve:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 10, 110, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("név");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(590, 10, 210, 40);

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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //keresés gomb

        PreparedStatement st;
        ResultSet rs;

        String nev = nevtext.getText();
        String szig = szigtext.getText();

        String query = "SELECT * FROM `szabálysértések` WHERE `Név` = ? AND `Szig` = ?";

        try {
            st = kelrConnect.getConnection().prepareStatement(query);

            st.setString(1, nev);
            st.setString(2, szig);

            rs = st.executeQuery();

            if (rs.next()) {

                Elkoveto szemely = new Elkoveto(rs.getString("Név"));
                elkoveto.add(szemely);

                KeresesEredmenye kEredmeny = new KeresesEredmenye();
                kEredmeny.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "A megadott adatok alapján nincs találat a rendszerben", "Tájékoztató", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hibás adatok megadása Személy keresése keresés gomb!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nevtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nevtextKeyPressed
        //név mezőre enter
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            PreparedStatement st;
            ResultSet rs;

            String nev = nevtext.getText();
            String szig = szigtext.getText();

            String query = "SELECT * FROM `szabálysértések` WHERE `Név` = ? AND `Szig` = ?";

            try {
                st = kelrConnect.getConnection().prepareStatement(query);

                st.setString(1, nev);
                st.setString(2, szig);

                rs = st.executeQuery();

                if (rs.next()) {

                    Elkoveto szemely = new Elkoveto(rs.getString("Név"));
                    elkoveto.add(szemely);

                    KeresesEredmenye kEredmeny = new KeresesEredmenye();
                    kEredmeny.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "A megadott adatok alapján nincs találat a rendszerben", "Tájékoztató", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hibás adatok megadása Személy keresése név mező!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_nevtextKeyPressed

    private void szigtextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_szigtextKeyPressed
        //szig mezőre enter
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            PreparedStatement st;
            ResultSet rs;

            String nev = nevtext.getText();
            String szig = szigtext.getText();

            String query = "SELECT * FROM `szabálysértések` WHERE `Név` = ? AND `Szig` = ?";

            try {
                st = kelrConnect.getConnection().prepareStatement(query);

                st.setString(1, nev);
                st.setString(2, szig);

                rs = st.executeQuery();

                if (rs.next()) {

                    Elkoveto szemely = new Elkoveto(rs.getString("Név"));
                    elkoveto.add(szemely);

                    KeresesEredmenye kEredmeny = new KeresesEredmenye();
                    kEredmeny.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "A megadott adatok alapján nincs találat a rendszerben", "Tájékoztató", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hibás adatok megadása Személy keresése szig mező!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_szigtextKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SzemelyKereses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private static javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nevtext;
    private javax.swing.JTextField szigtext;
    // End of variables declaration//GEN-END:variables

}
