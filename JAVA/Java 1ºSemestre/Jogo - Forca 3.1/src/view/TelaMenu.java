/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import model.PalavraService;

/**
 *
 * @author adm-dev
 */
public class TelaMenu extends javax.swing.JFrame {
    private static String nivel;

    /**
     * Creates new form TelaMenu
     */
    public TelaMenu() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static String getNivel() {
        return nivel;
    }

    public static void setNivel(String nivel) {
        TelaMenu.nivel = nivel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMenu = new javax.swing.JPanel();
        lbFacil = new javax.swing.JLabel();
        lbMedio = new javax.swing.JLabel();
        lbDificl = new javax.swing.JLabel();
        btnJogar = new javax.swing.JButton();
        lbBackgroundMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFacil.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbFacil.setForeground(new java.awt.Color(255, 255, 255));
        lbFacil.setText("Fácil");
        lbFacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFacilMouseEntered(evt);
            }
        });
        panMenu.add(lbFacil, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        lbMedio.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbMedio.setForeground(new java.awt.Color(255, 255, 255));
        lbMedio.setText("Médio");
        panMenu.add(lbMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, -1, -1));

        lbDificl.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbDificl.setForeground(new java.awt.Color(255, 255, 255));
        lbDificl.setText("Dícil");
        panMenu.add(lbDificl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, -1, -1));

        btnJogar.setBackground(new java.awt.Color(255, 255, 153));
        btnJogar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnJogar.setForeground(new java.awt.Color(0, 102, 153));
        btnJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/play.png"))); // NOI18N
        btnJogar.setText("PLAY");
        btnJogar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnJogarMouseClicked(evt);
            }
        });
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });
        panMenu.add(btnJogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 160, 60));

        lbBackgroundMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        lbBackgroundMenu.setText("FÁCIL");
        panMenu.add(lbBackgroundMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        // TODO add your handling code here:
        new TelaPrincipal().setVisible(true);
        System.out.println(TelaMenu.getNivel());
        PalavraService ps = new PalavraService();
        ps.iniciar();
    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnJogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogarMouseClicked
        
    }//GEN-LAST:event_btnJogarMouseClicked

    private void lbFacilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFacilMouseEntered
         lbFacil.setForeground(Color.blue);
         
    }//GEN-LAST:event_lbFacilMouseEntered

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JLabel lbBackgroundMenu;
    private javax.swing.JLabel lbDificl;
    private javax.swing.JLabel lbFacil;
    private javax.swing.JLabel lbMedio;
    private javax.swing.JPanel panMenu;
    // End of variables declaration//GEN-END:variables
}
