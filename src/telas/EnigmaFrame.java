/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import classes.Dica;
import classes.Enigma;
import java.awt.Color;

public class EnigmaFrame extends javax.swing.JFrame {

    ArrayList<Enigma> list = null;
    Dica dica = null;

    public EnigmaFrame() {
        initComponents();
        setTitle("ÁREA DE CADASTRO - PROFESSOR");
        list = new ArrayList<>();

        cadastrarEnigma.setEnabled(false);
        subEnigmas.setEnabled(false);
        jcbCod.setEnabled(false);
        msg.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        enunciado = new javax.swing.JTextPane();
        jcb_nivel = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        ctResp = new javax.swing.JTextField();
        inserirDicas = new javax.swing.JButton();
        cadastrarEnigma = new javax.swing.JButton();
        subEnigmas = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        msg = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbCod = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CADASTRO ENIGMAS");

        jLabel2.setText("ENUNCIADO:");

        jScrollPane2.setViewportView(enunciado);

        jcb_nivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NÍVEL", "1 - FÁCIL", "2 - MÉDIO", "3 - DIFÍCIL" }));

        jLabel3.setText("RESPOSTA DO ENIGMA:");

        inserirDicas.setText("INSERIR DICAS");
        inserirDicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirDicasActionPerformed(evt);
            }
        });

        cadastrarEnigma.setText("CADASTRAR");
        cadastrarEnigma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarEnigmaActionPerformed(evt);
            }
        });

        subEnigmas.setText("SUBMETER ENIGMAS");
        subEnigmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subEnigmasActionPerformed(evt);
            }
        });

        jLabel4.setText("DICA:");

        jLabel5.setText("CÓDIGO:");

        jcbCod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcb_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(ctResp))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(subEnigmas, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(cadastrarEnigma, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addComponent(jcbCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(inserirDicas)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_nivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ctResp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(inserirDicas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcbCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(cadastrarEnigma, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subEnigmas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarEnigmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarEnigmaActionPerformed
        dica = new Dica();
        dica.setMensagem(msg.getText());
        dica.setCodigo(jcbCod.getSelectedIndex()+1);
        
        Enigma e = new Enigma();
        e.setEnunciado(enunciado.getText());
        e.setNivel(jcb_nivel.getSelectedIndex());
        e.setResposta(ctResp.getText());
        e.setQtdL_resposta(ctResp.getText().length());
        e.setDica(dica);
        list.add(e);

        int res = JOptionPane.showConfirmDialog(null, "ENIGMA CADASTRADO COM SUCESSO! DESEJA CADASTRAR OUTRO ?", "RESULTADO", JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            cadastrarEnigma.setEnabled(false);
            inserirDicas.setEnabled(true);
        } else {
            inserirDicas.setEnabled(false);
            cadastrarEnigma.setEnabled(false);
            subEnigmas.setEnabled(true);
            subEnigmas.setBackground(new Color(0,255,127));
        }

        limparCampos();
    }//GEN-LAST:event_cadastrarEnigmaActionPerformed

    private void inserirDicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirDicasActionPerformed
        jcbCod.setEnabled(true);
        msg.setEnabled(true);
        
        inserirDicas.setEnabled(false);
        cadastrarEnigma.setEnabled(true);
        cadastrarEnigma.setBackground(new Color(0,255,127));
    }//GEN-LAST:event_inserirDicasActionPerformed

    private void subEnigmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subEnigmasActionPerformed
        new JogoFrame(list).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_subEnigmasActionPerformed

    public void limparCampos() {
        jcbCod.setEnabled(false);
        msg.setEnabled(false);
        
        msg.setText("");
        enunciado.setText("");
        ctResp.setText("");
        jcb_nivel.setSelectedIndex(0);
        jcbCod.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(EnigmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnigmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnigmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnigmaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnigmaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarEnigma;
    private javax.swing.JTextField ctResp;
    private javax.swing.JTextPane enunciado;
    private javax.swing.JButton inserirDicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbCod;
    private javax.swing.JComboBox<String> jcb_nivel;
    private javax.swing.JTextField msg;
    private javax.swing.JButton subEnigmas;
    // End of variables declaration//GEN-END:variables
}
