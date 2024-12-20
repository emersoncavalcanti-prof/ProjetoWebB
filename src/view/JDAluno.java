/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Repositorio.RepAluno;
import javax.swing.JOptionPane;
import model.Aluno;
/**
 *
 * @author ESCOLA
 */
public class JDAluno extends javax.swing.JDialog {

    /**
     * Creates new form JDAluno
     */
    public JDAluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jTextFieldId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
        getContentPane().add(jTextFieldId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 70, -1));

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 270, -1));
        getContentPane().add(jTextFieldCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, -1));

        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel4.setText("Telefone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));
        getContentPane().add(jTextFieldTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, -1));
        getContentPane().add(jTextFieldEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 210, -1));

        jLabel5.setText("Endereço");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 140, -1));

        jLabel6.setText("Bairro");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));
        getContentPane().add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 140, -1));

        jLabel7.setText("Número");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        getContentPane().add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jLabel8.setText("Cidade");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        // TODO add your handling code here:
        Aluno aluno = new Aluno();
        
        if(!jTextFieldId.getText().equals("")){
        aluno.setId(Integer.parseInt(jTextFieldId.getText()));
        }
        
        aluno.setNome(jTextFieldNome.getText());
        aluno.setCpf(jTextFieldCpf.getText());
        aluno.setTelefone(jTextFieldTelefone.getText());
        aluno.setEndereco(jTextFieldEndereco.getText());
        aluno.setBairro(jTextFieldBairro.getText());
        aluno.setNumero(jTextFieldNumero.getText());
        aluno.setCidade(jTextFieldCidade.getText());
        
        RepAluno repAluno = new RepAluno();
        repAluno.inserir(aluno);
        JOptionPane.showMessageDialog(null, 
                "Cadastrado com sucesso.");
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAluno dialog = new JDAluno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
