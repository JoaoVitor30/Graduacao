/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ContasControl;
import static controller.ContasControl.listaContaCorrente;
import java.awt.Color;

/**
 *
 * @author Aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCadastro = new javax.swing.JPanel();
        lbContaCorrente = new javax.swing.JLabel();
        lbPoupança = new javax.swing.JLabel();
        lbCarteira = new javax.swing.JLabel();
        pnListagem = new javax.swing.JPanel();
        lbListaContaCorrente = new javax.swing.JLabel();
        lbListaPoupança = new javax.swing.JLabel();
        lbListaCarteira = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnTitulo.setBackground(new java.awt.Color(179, 46, 47));

        lbTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Sistemas de Contas");
        lbTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(lbTitulo)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbTitulo)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pnCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)), "Cadastros")));

        lbContaCorrente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbContaCorrente.setText("Conta Corrente");
        lbContaCorrente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbContaCorrenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbContaCorrenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbContaCorrenteMouseExited(evt);
            }
        });

        lbPoupança.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbPoupança.setText("Poupança");
        lbPoupança.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPoupançaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPoupançaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPoupançaMouseExited(evt);
            }
        });

        lbCarteira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbCarteira.setText("Carteira");
        lbCarteira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCarteiraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCarteiraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCarteiraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnCadastroLayout = new javax.swing.GroupLayout(pnCadastro);
        pnCadastro.setLayout(pnCadastroLayout);
        pnCadastroLayout.setHorizontalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbContaCorrente)
                    .addComponent(lbPoupança)
                    .addComponent(lbCarteira))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        pnCadastroLayout.setVerticalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbContaCorrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPoupança)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbCarteira)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnListagem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP)), "Listagem"), "Listagem", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));
        pnListagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lbListaContaCorrente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbListaContaCorrente.setText("Conta Corrente");
        lbListaContaCorrente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaContaCorrenteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbListaContaCorrenteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbListaContaCorrenteMouseExited(evt);
            }
        });

        lbListaPoupança.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbListaPoupança.setText("Poupança");
        lbListaPoupança.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaPoupançaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbListaPoupançaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbListaPoupançaMouseExited(evt);
            }
        });

        lbListaCarteira.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbListaCarteira.setText("Carteira");
        lbListaCarteira.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListaCarteiraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbListaCarteiraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbListaCarteiraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnListagemLayout = new javax.swing.GroupLayout(pnListagem);
        pnListagem.setLayout(pnListagemLayout);
        pnListagemLayout.setHorizontalGroup(
            pnListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbListaContaCorrente)
                    .addComponent(lbListaPoupança)
                    .addComponent(lbListaCarteira))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        pnListagemLayout.setVerticalGroup(
            pnListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbListaContaCorrente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbListaPoupança)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbListaCarteira)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbContaCorrenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbContaCorrenteMouseClicked
        TelaContaCorrente tela = new TelaContaCorrente();
        tela.setVisible(true);        
    }//GEN-LAST:event_lbContaCorrenteMouseClicked

    private void lbContaCorrenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbContaCorrenteMouseEntered
        lbContaCorrente.setForeground(Color.blue);
    }//GEN-LAST:event_lbContaCorrenteMouseEntered

    private void lbContaCorrenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbContaCorrenteMouseExited
        lbContaCorrente.setForeground(Color.black);
    }//GEN-LAST:event_lbContaCorrenteMouseExited

    private void lbListaContaCorrenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaContaCorrenteMouseClicked
        ContasControl.listaContaCorrente();
    }//GEN-LAST:event_lbListaContaCorrenteMouseClicked

    private void lbListaContaCorrenteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaContaCorrenteMouseEntered
        lbListaContaCorrente.setForeground(Color.blue);
    }//GEN-LAST:event_lbListaContaCorrenteMouseEntered

    private void lbListaContaCorrenteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaContaCorrenteMouseExited
        lbListaContaCorrente.setForeground(Color.black);
    }//GEN-LAST:event_lbListaContaCorrenteMouseExited

    private void lbPoupançaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPoupançaMouseClicked
        TelaPoupanca tela = new TelaPoupanca();
        tela.setVisible(true);
    }//GEN-LAST:event_lbPoupançaMouseClicked

    private void lbPoupançaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPoupançaMouseEntered
        lbPoupança.setForeground(Color.blue);
    }//GEN-LAST:event_lbPoupançaMouseEntered

    private void lbPoupançaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPoupançaMouseExited
        lbPoupança.setForeground(Color.black);
    }//GEN-LAST:event_lbPoupançaMouseExited

    private void lbListaPoupançaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaPoupançaMouseClicked
        ContasControl.listaPoupanca();
    }//GEN-LAST:event_lbListaPoupançaMouseClicked

    private void lbListaPoupançaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaPoupançaMouseEntered
        lbListaPoupança.setForeground(Color.blue);
    }//GEN-LAST:event_lbListaPoupançaMouseEntered

    private void lbListaPoupançaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaPoupançaMouseExited
        lbListaPoupança.setForeground(Color.black);
    }//GEN-LAST:event_lbListaPoupançaMouseExited

    private void lbCarteiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCarteiraMouseClicked
        TelaCarteira tela = new TelaCarteira();
        tela.setVisible(true);
    }//GEN-LAST:event_lbCarteiraMouseClicked

    private void lbCarteiraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCarteiraMouseEntered
        lbCarteira.setForeground(Color.blue);
    }//GEN-LAST:event_lbCarteiraMouseEntered

    private void lbCarteiraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCarteiraMouseExited
        lbCarteira.setForeground(Color.black);
    }//GEN-LAST:event_lbCarteiraMouseExited

    private void lbListaCarteiraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaCarteiraMouseClicked
        ContasControl.listaCarteira();
    }//GEN-LAST:event_lbListaCarteiraMouseClicked

    private void lbListaCarteiraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaCarteiraMouseEntered
        lbListaCarteira.setForeground(Color.blue);
    }//GEN-LAST:event_lbListaCarteiraMouseEntered

    private void lbListaCarteiraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListaCarteiraMouseExited
        lbListaCarteira.setForeground(Color.black);
    }//GEN-LAST:event_lbListaCarteiraMouseExited

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
    private javax.swing.JLabel lbCarteira;
    private javax.swing.JLabel lbContaCorrente;
    private javax.swing.JLabel lbListaCarteira;
    private javax.swing.JLabel lbListaContaCorrente;
    private javax.swing.JLabel lbListaPoupança;
    private javax.swing.JLabel lbPoupança;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnCadastro;
    private javax.swing.JPanel pnListagem;
    private javax.swing.JPanel pnTitulo;
    // End of variables declaration//GEN-END:variables
}
