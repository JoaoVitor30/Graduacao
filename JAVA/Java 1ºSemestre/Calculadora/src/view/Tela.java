/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import static model.Calculadora.div;
import static model.Calculadora.mult;
import static model.Calculadora.soma;
import static model.Calculadora.sub;

/**
 *
 * @author Aluno
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
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

        lb_operador1 = new javax.swing.JLabel();
        tf_operador1 = new javax.swing.JTextField();
        lb_operador2 = new javax.swing.JLabel();
        tf_operador2 = new javax.swing.JTextField();
        lb_resultado = new javax.swing.JLabel();
        tf_resultado = new javax.swing.JTextField();
        jp_titulo = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        jp_operação = new javax.swing.JPanel();
        bt_soma = new javax.swing.JButton();
        bt_sub = new javax.swing.JButton();
        bt_div = new javax.swing.JButton();
        bt_mult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        lb_operador1.setText("Operador 1:");

        lb_operador2.setText("Operador 2:");

        tf_operador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_operador2ActionPerformed(evt);
            }
        });

        lb_resultado.setText("Resultado:");

        tf_resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_resultadoActionPerformed(evt);
            }
        });

        jp_titulo.setBackground(new java.awt.Color(255, 102, 51));

        lb_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calculadora.jpg"))); // NOI18N
        lb_titulo.setText("CALCULADORA");
        lb_titulo.setIconTextGap(20);

        javax.swing.GroupLayout jp_tituloLayout = new javax.swing.GroupLayout(jp_titulo);
        jp_titulo.setLayout(jp_tituloLayout);
        jp_tituloLayout.setHorizontalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_tituloLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lb_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_tituloLayout.setVerticalGroup(
            jp_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );

        jp_operação.setBorder(javax.swing.BorderFactory.createTitledBorder("Operação"));

        bt_soma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_soma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soma.jpg"))); // NOI18N
        bt_soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_somaActionPerformed(evt);
            }
        });

        bt_sub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menos.jpg"))); // NOI18N
        bt_sub.setMaximumSize(new java.awt.Dimension(41, 23));
        bt_sub.setMinimumSize(new java.awt.Dimension(41, 23));
        bt_sub.setPreferredSize(new java.awt.Dimension(41, 23));
        bt_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_subActionPerformed(evt);
            }
        });

        bt_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/div.jpg"))); // NOI18N
        bt_div.setPreferredSize(new java.awt.Dimension(41, 23));
        bt_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_divActionPerformed(evt);
            }
        });

        bt_mult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vezes.jpg"))); // NOI18N
        bt_mult.setPreferredSize(new java.awt.Dimension(41, 23));
        bt_mult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_multActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_operaçãoLayout = new javax.swing.GroupLayout(jp_operação);
        jp_operação.setLayout(jp_operaçãoLayout);
        jp_operaçãoLayout.setHorizontalGroup(
            jp_operaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_operaçãoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_operaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_soma, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(bt_div, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jp_operaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_sub, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(bt_mult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jp_operaçãoLayout.setVerticalGroup(
            jp_operaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_operaçãoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jp_operaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_sub, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(bt_soma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jp_operaçãoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_div, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_mult, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_operador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_operador1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_operador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_operador2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_resultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jp_operação, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_operador1)
                            .addComponent(tf_operador1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_operador2)
                            .addComponent(tf_operador2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_resultado)
                            .addComponent(tf_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jp_operação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_somaActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(tf_operador1.getText());
        double n2 = Double.parseDouble(tf_operador2.getText());
        double resposta = soma(n1,n2);
        String resp = String.valueOf(resposta);
        tf_resultado.setText(resp);
    }//GEN-LAST:event_bt_somaActionPerformed

    private void tf_resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_resultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_resultadoActionPerformed

    private void tf_operador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_operador2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_operador2ActionPerformed

    private void bt_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_subActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(tf_operador1.getText());
        double n2 = Double.parseDouble(tf_operador2.getText());
        double resposta = sub(n1,n2);
        String resp = String.valueOf(resposta);
        tf_resultado.setText(resp);
    }//GEN-LAST:event_bt_subActionPerformed

    private void bt_multActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_multActionPerformed
        // TODO add your handling code here:
        double n1 = Double.parseDouble(tf_operador1.getText());
        double n2 = Double.parseDouble(tf_operador2.getText());
        double resposta = mult(n1,n2);
        String resp = String.valueOf(resposta);
        tf_resultado.setText(resp);
    }//GEN-LAST:event_bt_multActionPerformed

    private void bt_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_divActionPerformed
        // TODO add your handling code here:
        double resposta = 0;
        double n1 = Double.parseDouble(tf_operador1.getText());
        double n2 = Double.parseDouble(tf_operador2.getText());
        try 
            {
                resposta = div(n1,n2);
            }
        catch (ArithmeticException e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        String resp = String.valueOf(resposta);
        tf_resultado.setText(resp);
    }//GEN-LAST:event_bt_divActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_div;
    private javax.swing.JButton bt_mult;
    private javax.swing.JButton bt_soma;
    private javax.swing.JButton bt_sub;
    private javax.swing.JPanel jp_operação;
    private javax.swing.JPanel jp_titulo;
    private javax.swing.JLabel lb_operador1;
    private javax.swing.JLabel lb_operador2;
    private javax.swing.JLabel lb_resultado;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JTextField tf_operador1;
    private javax.swing.JTextField tf_operador2;
    private javax.swing.JTextField tf_resultado;
    // End of variables declaration//GEN-END:variables
}
