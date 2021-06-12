/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Palavra;
import model.PalavraService;

/**
 *
 * @author Cliente
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        lbCabeca = new javax.swing.JLabel();
        lbBracoDireito = new javax.swing.JLabel();
        lbForca = new javax.swing.JLabel();
        lbBracoEsquerdo = new javax.swing.JLabel();
        lbPernaEsquerda = new javax.swing.JLabel();
        lbPernaDireita = new javax.swing.JLabel();
        lbCorpo = new javax.swing.JLabel();
        lbPalavra = new javax.swing.JLabel();
        btTentar = new javax.swing.JButton();
        tfPalavra = new javax.swing.JTextField();
        pnErros = new javax.swing.JPanel();
        lbErros = new javax.swing.JLabel();
        pnBackground = new javax.swing.JPanel();
        lbVoltar = new javax.swing.JLabel();
        lbDicaTitulo = new javax.swing.JLabel();
        lbDica = new javax.swing.JLabel();
        txtDica = new javax.swing.JLabel();
        lbBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCabeca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cabeçaStick.png"))); // NOI18N
        getContentPane().add(lbCabeca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 110, 90));

        lbBracoDireito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/braçoDireito.png"))); // NOI18N
        getContentPane().add(lbBracoDireito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 40, -1));

        lbForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/forca.png"))); // NOI18N
        getContentPane().add(lbForca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 280, 360));

        lbBracoEsquerdo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/braçoEsquerdo.png"))); // NOI18N
        getContentPane().add(lbBracoEsquerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 80, 50));

        lbPernaEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pernaEsqueda.png"))); // NOI18N
        getContentPane().add(lbPernaEsquerda, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 50, -1));

        lbPernaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pernaDireita.png"))); // NOI18N
        getContentPane().add(lbPernaDireita, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 60, 60));

        lbCorpo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/corpoStick.png"))); // NOI18N
        getContentPane().add(lbCorpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 90, 80));

        lbPalavra.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbPalavra.setForeground(new java.awt.Color(255, 255, 255));
        lbPalavra.setText("_ _ _ _ _ _ _");
        getContentPane().add(lbPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 240, 50));

        btTentar.setFont(new java.awt.Font("HP Simplified", 1, 14)); // NOI18N
        btTentar.setText("TENTAR");
        btTentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTentarActionPerformed(evt);
            }
        });
        getContentPane().add(btTentar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 100, 30));

        tfPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPalavraActionPerformed(evt);
            }
        });
        getContentPane().add(tfPalavra, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 80, 40));

        pnErros.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 102, 102), new java.awt.Color(0, 0, 0)));

        lbErros.setFont(new java.awt.Font("HP Simplified", 0, 18)); // NOI18N
        lbErros.setForeground(new java.awt.Color(204, 0, 0));
        lbErros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbErros.setText("ERROS");

        javax.swing.GroupLayout pnErrosLayout = new javax.swing.GroupLayout(pnErros);
        pnErros.setLayout(pnErrosLayout);
        pnErrosLayout.setHorizontalGroup(
            pnErrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbErros, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
        );
        pnErrosLayout.setVerticalGroup(
            pnErrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnErrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbErros)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(pnErros, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 320, -1));

        pnBackground.setLayout(null);

        lbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/iconVoltar.png"))); // NOI18N
        pnBackground.add(lbVoltar);
        lbVoltar.setBounds(0, 0, 90, 70);

        lbDicaTitulo.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        lbDicaTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbDicaTitulo.setText("DICAS");
        pnBackground.add(lbDicaTitulo);
        lbDicaTitulo.setBounds(560, 60, 60, 20);

        lbDica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Dica.png"))); // NOI18N
        pnBackground.add(lbDica);
        lbDica.setBounds(550, 0, 80, 70);

        txtDica.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtDica.setForeground(new java.awt.Color(255, 255, 255));
        txtDica.setText("0 / 3");
        pnBackground.add(txtDica);
        txtDica.setBounds(630, 20, 70, 40);

        lbBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        pnBackground.add(lbBackground);
        lbBackground.setBounds(-10, -10, 720, 540);

        getContentPane().add(pnBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPalavraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPalavraActionPerformed

    private void btTentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTentarActionPerformed
        // TODO add your handling code here:
        PalavraService ps = new PalavraService();
        ps.iniciar();
    }//GEN-LAST:event_btTentarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btTentar;
    private javax.swing.JLabel lbBackground;
    private javax.swing.JLabel lbBracoDireito;
    private javax.swing.JLabel lbBracoEsquerdo;
    private javax.swing.JLabel lbCabeca;
    private javax.swing.JLabel lbCorpo;
    private javax.swing.JLabel lbDica;
    private javax.swing.JLabel lbDicaTitulo;
    private javax.swing.JLabel lbErros;
    private javax.swing.JLabel lbForca;
    private javax.swing.JLabel lbPalavra;
    private javax.swing.JLabel lbPernaDireita;
    private javax.swing.JLabel lbPernaEsquerda;
    private javax.swing.JLabel lbVoltar;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnErros;
    private javax.swing.JTextField tfPalavra;
    private javax.swing.JLabel txtDica;
    // End of variables declaration//GEN-END:variables
}
