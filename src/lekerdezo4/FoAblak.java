package lekerdezo4;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FoAblak extends javax.swing.JFrame {

    public static ArrayList<Bejelentkezo> bejelentkezve = new ArrayList<>();

    public FoAblak() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        felhasznalonev = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        belepes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jelszo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 255));
        setMinimumSize(new java.awt.Dimension(800, 900));
        getContentPane().setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Programozás\\Szakdolgozat\\SQL\\Lekerdezo4\\Image\\Hungary_Police.svg.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(305, 50, 190, 240);

        felhasznalonev.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        felhasznalonev.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        felhasznalonev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                felhasznalonevActionPerformed(evt);
            }
        });
        felhasznalonev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                felhasznalonevKeyPressed(evt);
            }
        });
        getContentPane().add(felhasznalonev);
        felhasznalonev.setBounds(285, 430, 230, 60);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jelszó");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(285, 510, 230, 20);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Felhasználónév");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(285, 410, 230, 20);

        belepes.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        belepes.setText("Belépés");
        belepes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        belepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belepesActionPerformed(evt);
            }
        });
        getContentPane().add(belepes);
        belepes.setBounds(330, 620, 140, 50);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Kilépés");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(610, 780, 140, 50);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Központi Elektronikus Lekérdező Rendszer");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(75, 290, 650, 80);

        jelszo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jelszo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jelszo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jelszoKeyPressed(evt);
            }
        });
        getContentPane().add(jelszo);
        jelszo.setBounds(285, 530, 230, 60);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void felhasznalonevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_felhasznalonevActionPerformed


    }//GEN-LAST:event_felhasznalonevActionPerformed

    private void belepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belepesActionPerformed
        //A Belépés gomb
        //Egy sql lekérdezés

        PreparedStatement st;
        ResultSet rs;

        String vezeteknev = felhasznalonev.getText();
        String keresztnev = jelszo.getText();

        //query - lekérdezés ez egy lekérdezés
        String query = "SELECT * FROM `felhasználók` WHERE `felhasználónév` = ? AND `jelszó` = ?";

        try {
            st = kelrConnect.getConnection().prepareStatement(query);

            st.setString(1, vezeteknev);
            st.setString(2, keresztnev);

            rs = st.executeQuery();

            if (rs.next()) {

                Bejelentkezo bj = new Bejelentkezo(rs.getString("TeljesNév"));
                bejelentkezve.add(bj);

                dispose();
                ValasztoAblak vAblak = new ValasztoAblak();
                vAblak.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Hibás felhasználónév vagy jelszó!\nPróbálja újra...", "Hiba!", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hibás kód a FoAblak BELÉPÉS gombnál!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_belepesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //A kilépés gomb
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jelszoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jelszoKeyPressed
        //enter lenyomása után műdödjön
        //u.a. mint a belépés gomb

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            PreparedStatement st;
            ResultSet rs;

            String vezeteknev = felhasznalonev.getText();
            String keresztnev = jelszo.getText();

            //query - lekérdezés ez egy lekérdezés
            String query = "SELECT * FROM `felhasználók` WHERE `felhasználónév` = ? AND `jelszó` = ?";

            try {
                st = kelrConnect.getConnection().prepareStatement(query);

                st.setString(1, vezeteknev);
                st.setString(2, keresztnev);

                rs = st.executeQuery();

                if (rs.next()) {

                    Bejelentkezo bj = new Bejelentkezo(rs.getString("TeljesNév"));
                    bejelentkezve.add(bj);

                    dispose();
                    ValasztoAblak vAblak = new ValasztoAblak();
                    vAblak.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Hibás felhasználónév vagy jelszó!\nPróbálja újra...", "Hiba!", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hibás adatok megadása FoAblak jelszó mező!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jelszoKeyPressed

    private void felhasznalonevKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_felhasznalonevKeyPressed
        //enter lenyomása után műdödjön
        //u.a. mint a belépés gomb

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            PreparedStatement st;
            ResultSet rs;

            String vezeteknev = felhasznalonev.getText();
            String keresztnev = jelszo.getText();

            //query - lekérdezés ez egy lekérdezés
            String query = "SELECT * FROM `felhasználók` WHERE `felhasználónév` = ? AND `jelszó` = ?";

            try {
                st = kelrConnect.getConnection().prepareStatement(query);

                st.setString(1, vezeteknev);
                st.setString(2, keresztnev);

                rs = st.executeQuery();

                if (rs.next()) {

                    Bejelentkezo bj = new Bejelentkezo(rs.getString("TeljesNév"));
                    bejelentkezve.add(bj);

                    dispose();
                    ValasztoAblak vAblak = new ValasztoAblak();
                    vAblak.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Hibás felhasználónév vagy jelszó!\nPróbálja újra...", "Hiba!", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Hibás adatok megadása FoAblak felhasználónév mező!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_felhasznalonevKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoAblak().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton belepes;
    public static javax.swing.JTextField felhasznalonev;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPasswordField jelszo;
    // End of variables declaration//GEN-END:variables
}
