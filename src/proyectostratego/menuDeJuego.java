/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectostratego;
import javax.swing.*;

/**
 *
 * @author levir
 */
public class menuDeJuego extends javax.swing.JFrame {
    LogisticaSesion manage;
    users usuarios;
    /**
     * Creates new form menuDeJuego
     */
    public menuDeJuego(LogisticaSesion manage) {
        initComponents();
        this.manage=manage;
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
        STRATEGO = new javax.swing.JButton();
        perfil = new javax.swing.JButton();
        universo = new javax.swing.JButton();
        config = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        STRATEGO.setBackground(new java.awt.Color(51, 0, 51));
        STRATEGO.setFont(new java.awt.Font("Broadway", 2, 18)); // NOI18N
        STRATEGO.setForeground(new java.awt.Color(255, 255, 0));
        STRATEGO.setText("JUEGA STRATEGO");
        STRATEGO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        STRATEGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STRATEGOActionPerformed(evt);
            }
        });
        jPanel1.add(STRATEGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 260, 80));

        perfil.setBackground(new java.awt.Color(51, 0, 51));
        perfil.setFont(new java.awt.Font("Broadway", 2, 18)); // NOI18N
        perfil.setForeground(new java.awt.Color(255, 255, 0));
        perfil.setText("MI PERFIL");
        perfil.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilActionPerformed(evt);
            }
        });
        jPanel1.add(perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 260, 80));

        universo.setBackground(new java.awt.Color(51, 0, 51));
        universo.setFont(new java.awt.Font("Broadway", 2, 18)); // NOI18N
        universo.setForeground(new java.awt.Color(255, 255, 0));
        universo.setText("UNIVERSO MARVEL");
        universo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        universo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universoActionPerformed(evt);
            }
        });
        jPanel1.add(universo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 260, 80));

        config.setBackground(new java.awt.Color(51, 0, 51));
        config.setFont(new java.awt.Font("Broadway", 2, 18)); // NOI18N
        config.setForeground(new java.awt.Color(255, 255, 0));
        config.setText("CONFIGURACIÓN");
        config.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configActionPerformed(evt);
            }
        });
        jPanel1.add(config, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 260, 80));

        logout.setBackground(new java.awt.Color(51, 0, 51));
        logout.setFont(new java.awt.Font("Broadway", 2, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 0));
        logout.setText("CERRAR SESION");
        logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 680, 240, 90));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\levir\\Downloads\\MenuJuego.jpg")); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, 861));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STRATEGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STRATEGOActionPerformed
        JOptionPane cuadro=new JOptionPane();
        String[] usuarioDisponibles=manage.getUsuarioTotales();
        JComboBox<String> personas=new JComboBox<String>(usuarioDisponibles);
        
        if (usuarioDisponibles.length==1){
            JOptionPane.showMessageDialog(rootPane, "Necesita al menos 2 jugadores para poder jugar este juego");
        }else{
            JOptionPane.showMessageDialog(rootPane, personas);
            int lugar=personas.getSelectedIndex();
            this.dispose();
            new TableroOriginal().setVisible(true);
        }
    }//GEN-LAST:event_STRATEGOActionPerformed

    private void universoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_universoActionPerformed

    private void configActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_configActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int a=JOptionPane.showConfirmDialog(rootPane, "¿Esta seguro de que quiere cerrar sesión?");
        if (a==JOptionPane.NO_OPTION || a==JOptionPane.CANCEL_OPTION){
            JOptionPane.showMessageDialog(rootPane, "A JUGAR SE HA DICHO ENTONCES");
        }else{
            manage.logout();
            Login ini=new Login();
            ini.setManage(manage);
            this.dispose();
            new pruebadeImagen2().setVisible(true);
        } 
        
    }//GEN-LAST:event_logoutActionPerformed

    private void perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilActionPerformed
        new MiPerfil(usuarios,manage).setVisible(true);
    }//GEN-LAST:event_perfilActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton STRATEGO;
    private javax.swing.JButton config;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton perfil;
    private javax.swing.JButton universo;
    // End of variables declaration//GEN-END:variables
}
