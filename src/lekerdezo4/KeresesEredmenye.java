package lekerdezo4;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import static lekerdezo4.SzemelyKereses.elkoveto;

/**
 *
 * @author Berkes
 */
public class KeresesEredmenye extends javax.swing.JFrame {

    public KeresesEredmenye() {
        initComponents();
        behelyettesites();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jAnyja = new javax.swing.JLabel();
        jNev = new javax.swing.JLabel();
        jSzig = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jOssz = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1100, 300));
        setMinimumSize(new java.awt.Dimension(1100, 300));
        setPreferredSize(new java.awt.Dimension(1100, 300));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Elkövető Neve:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 100, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Szig. szám:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 50, 100, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Anyja neve:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 100, 100, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Elkövetés ideje:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(300, 0, 110, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Illetékes Kapitányság:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(440, 0, 150, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Elkövetett cselekmény:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(660, 0, 170, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Együttműködő:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(980, 0, 100, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Büntetőpontok:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(850, 0, 110, 40);

        jAnyja.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jAnyja.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jAnyja);
        jAnyja.setBounds(110, 100, 190, 40);

        jNev.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jNev.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jNev);
        jNev.setBounds(110, 0, 180, 40);

        jSzig.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jSzig.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jSzig);
        jSzig.setBounds(110, 50, 190, 40);

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Bezárás");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 200, 140, 50);

        jOssz.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jOssz.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jOssz);
        jOssz.setBounds(160, 150, 20, 40);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Büntetőpontok összesen:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 150, 160, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //bezárás

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KeresesEredmenye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KeresesEredmenye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KeresesEredmenye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KeresesEredmenye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KeresesEredmenye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnyja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jNev;
    private javax.swing.JLabel jOssz;
    private javax.swing.JLabel jSzig;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JLabel jIdeje;
    private javax.swing.JLabel jIlletekesseg;
    private javax.swing.JLabel jCselekmeny;
    private javax.swing.JLabel jBuntetopont;
    private javax.swing.JLabel jEgyuttmukodo;

    private void behelyettesites() {
        //sql lekérés, sorok létrehozása

        int y = 0;
        int ossz = 0;

        PreparedStatement st;
        ResultSet rs;

        String nev = elkoveto.get(0).elkoveto;

        String query = "SELECT * FROM `szabálysértések` WHERE `Név` = ?";

        try {
            st = kelrConnect.getConnection().prepareStatement(query);

            st.setString(1, nev);

            rs = st.executeQuery();

            while (rs.next()) {
                //alapadatok megadása
                jNev.setText(rs.getString("Név"));
                jSzig.setText(rs.getString("Szig"));
                jAnyja.setText(rs.getString("Anyja"));

                ossz += rs.getInt("Büntetőpont");

                y += 50;
                //Elkövetés ideje Jlabel létrehozása
                jIdeje = new javax.swing.JLabel();
                jIdeje.setFont(new java.awt.Font("Times New Roman", 0, 14));
                jIdeje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jIdeje.setText(rs.getString("Ideje"));
                getContentPane().add(jIdeje);
                jIdeje.setBounds(300, y, 90, 40);

                //Illetékes Kapitányság  Jlabel létrehozása
                jIlletekesseg = new javax.swing.JLabel();
                jIlletekesseg.setFont(new java.awt.Font("Times New Roman", 0, 14));
                jIlletekesseg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jIlletekesseg.setText(rs.getString("Illetékesség"));
                getContentPane().add(jIlletekesseg);
                jIlletekesseg.setBounds(410, y, 200, 40);

                //Cselekmény
                jCselekmeny = new javax.swing.JLabel();
                jCselekmeny.setFont(new java.awt.Font("Times New Roman", 0, 14));
                jCselekmeny.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jCselekmeny.setText(rs.getString("Cselekmény"));
                getContentPane().add(jCselekmeny);
                jCselekmeny.setBounds(630, y, 210, 40);

                //Bünettőpont
                jBuntetopont = new javax.swing.JLabel();
                jBuntetopont.setFont(new java.awt.Font("Times New Roman", 0, 14));
                jBuntetopont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jBuntetopont.setText(String.valueOf(rs.getString("Büntetőpont")));
                getContentPane().add(jBuntetopont);
                jBuntetopont.setBounds(870, y, 50, 40);

                //Együttműködő
                jEgyuttmukodo = new javax.swing.JLabel();
                jEgyuttmukodo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
                jEgyuttmukodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jEgyuttmukodo.setText(rs.getString("Együttműködő"));
                getContentPane().add(jEgyuttmukodo);
                jEgyuttmukodo.setBounds(1000, y, 50, 40);

            }

            jOssz.setText(String.valueOf(ossz));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hibás adatok megadása Keresés eredménye oldal!", "Hibás kód!", JOptionPane.ERROR_MESSAGE);
        }

        elkoveto.clear();
    }
}
