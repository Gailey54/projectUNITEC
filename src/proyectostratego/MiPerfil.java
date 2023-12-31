/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectostratego;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author levir
 */
public class MiPerfil extends javax.swing.JFrame {
    users user;
    LogisticaSesion manage;
    
    /**
     * Creates new form MiPerfil
     */
    public MiPerfil(users user) {
        initComponents();
        this.user=user;
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Perfil = new javax.swing.JTextArea();
        Cuenta = new javax.swing.JButton();
        Password = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(300, 300));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Perfil.setEditable(false);
        Perfil.setBackground(new java.awt.Color(0, 51, 51));
        Perfil.setColumns(20);
        Perfil.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Perfil.setForeground(new java.awt.Color(255, 255, 255));
        Perfil.setLineWrap(true);
        Perfil.setRows(5);
        Perfil.setText("\t\tMi Perfil");
        jScrollPane1.setViewportView(Perfil);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 450, 250));

        Cuenta.setBackground(new java.awt.Color(255, 255, 102));
        Cuenta.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cuenta.setForeground(new java.awt.Color(0, 102, 102));
        Cuenta.setText("ELIMINAR CUENTA");
        Cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuentaActionPerformed(evt);
            }
        });
        jPanel1.add(Cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 330, -1, 50));

        Password.setBackground(new java.awt.Color(255, 255, 102));
        Password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 102, 102));
        Password.setText("CAMBIAR PASSWORD");
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 190, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\levir\\Downloads\\comicPerfil.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuentaActionPerformed
        int a=JOptionPane.showConfirmDialog(rootPane, "¿Esta Seguro?");
        if (a==JOptionPane.YES_OPTION){
        manage.logout();
        new pruebadeImagen2().setVisible(true);
        }
    }//GEN-LAST:event_CuentaActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        new cambioDeContraseña(user).setVisible(true);
    }//GEN-LAST:event_PasswordActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cuenta;
    private javax.swing.JButton Password;
    private javax.swing.JTextArea Perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
