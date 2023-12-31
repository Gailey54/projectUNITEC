package proyectostratego;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
public class TableroOriginal extends javax.swing.JFrame {
public TableroOriginal() {
        initComponents();
        this.setSize(900, 920);
        this.setLocationRelativeTo(null);
        this.setTitle("Tablero");

        ArrayList<Object> coordenadasProhibidas = new ArrayList<>();
        coordenadasProhibidas.add(new Point(2, 5));
        coordenadasProhibidas.add(new Point(2, 4));
        coordenadasProhibidas.add(new Point(3, 4));
        coordenadasProhibidas.add(new Point(3, 5));
        coordenadasProhibidas.add(new Point(6, 5));
        coordenadasProhibidas.add(new Point(6, 4));
        coordenadasProhibidas.add(new Point(7, 4));
        coordenadasProhibidas.add(new Point(7, 5));

        for (Component component : jPanel1.getComponents()) {
            if (component instanceof JButton) {
                JButton button = (JButton) component;
                button.addActionListener((ActionEvent e) -> {
                    int x1 = getXCoordinate(button);
                    int y1 = getYCoordinate(button);
                    Point currentCoordinate = new Point(x1, y1);
                    // Verifica si la celda actual está en la lista de coordenadas prohibidas
                    if (coordenadasProhibidas.contains(currentCoordinate)) {
                        // No permite el movimiento hacia celdas prohibidas
                        JOptionPane.showMessageDialog(this, "Movimiento no permitido");
                    }
                });
            }
        }
    }
private int getXCoordinate(JButton button) {
return (button.getX() - jPanel1.getX()) / button.getWidth();
}
private int getYCoordinate(JButton button) {
return (button.getY() - jPanel1.getY()) / button.getHeight();
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(10, 10));

        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton1);

        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton3);

        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton11);

        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton10);

        jButton21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton21);

        jButton27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton27);

        jButton31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton31);

        jButton33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton33);

        jButton49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton49);

        jButton41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton41);

        jButton61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton61);

        jButton60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton60);

        jButton66.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton66);

        jButton65.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton65);

        jButton76.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton76);

        jButton75.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton75);

        jButton92.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton92);

        jButton91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Beast.jpg"))); // NOI18N
        jButton91.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton91);

        jButton95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/planeta (1).jpg"))); // NOI18N
        jButton95.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton95);

        jButton94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/sent (1).png"))); // NOI18N
        jButton94.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton94);

        jButton93.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton93);

        jButton87.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton87);

        jButton86.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton86);

        jButton83.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton83);

        jButton58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton58);

        jButton54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton54);

        jButton53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton53);

        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Blado.jpg"))); // NOI18N
        jButton52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton52);

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Juggernaut.jpg"))); // NOI18N
        jButton47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton47);

        jButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Kingp.jpg"))); // NOI18N
        jButton69.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton69);

        jButton88.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton88);

        jButton81.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton81);

        jButton84.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton84);

        jButton85.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton85);

        jButton80.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton80);

        jButton82.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton82);

        jButton79.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton79);

        jButton78.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton78);

        jButton77.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton77);

        jButton89.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton89);

        jButton68.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton68);

        jButton67.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton67);

        jButton74.setBackground(new java.awt.Color(255, 255, 51));
        jButton74.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton74);

        jButton73.setBackground(new java.awt.Color(255, 255, 51));
        jButton73.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton73);

        jButton72.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton72);

        jButton40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton40);

        jButton59.setBackground(new java.awt.Color(204, 51, 255));
        jButton59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton59);

        jButton64.setBackground(new java.awt.Color(204, 51, 255));
        jButton64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton64);

        jButton63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton63);

        jButton71.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton71);

        jButton70.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton70);

        jButton62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton62);

        jButton45.setBackground(new java.awt.Color(255, 255, 51));
        jButton45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton45);

        jButton57.setBackground(new java.awt.Color(255, 255, 51));
        jButton57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton57);

        jButton56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton56);

        jButton55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton55);

        jButton51.setBackground(new java.awt.Color(204, 51, 255));
        jButton51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton51);

        jButton50.setBackground(new java.awt.Color(204, 0, 255));
        jButton50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton50);

        jButton44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton44);

        jButton48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton48);

        jButton43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton43);

        jButton42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton42);

        jButton46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton46);

        jButton39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton39);

        jButton38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton38);

        jButton37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton37);

        jButton36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton36);

        jButton35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton35);

        jButton34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton34);

        jButton30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton30);

        jButton32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton32);

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Gambito2.jpg"))); // NOI18N
        jButton29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton29);

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Thor.jpg"))); // NOI18N
        jButton28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton28);

        jButton20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton20);

        jButton26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton26);

        jButton25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton25);

        jButton24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton24);

        jButton23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton23);

        jButton22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton22);

        jButton19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton19);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Black Cat (1) (1).png"))); // NOI18N
        jButton18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton18);

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Black Widow (1).png"))); // NOI18N
        jButton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton17);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Capitan American.jpg"))); // NOI18N
        jButton16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton16);

        jButton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton15);

        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton14);

        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton13);

        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton12);

        jButton125.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton125);

        jButton124.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton124);

        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton9);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/Spider girl (1).png"))); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton8);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectostratego/planeta (1).jpg"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton4);

        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton5);

        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton6);

        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton7);

        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton2);

        jButton90.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton90);

        jButton126.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton126);

        jButton127.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton127);

        jButton128.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton128);

        jMenu1.setText("Restart");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton50ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableroOriginal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    //</editor-fold>
    
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableroOriginal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    public static javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton11;
    public static javax.swing.JButton jButton12;
    public static javax.swing.JButton jButton124;
    public static javax.swing.JButton jButton125;
    public static javax.swing.JButton jButton126;
    public static javax.swing.JButton jButton127;
    public static javax.swing.JButton jButton128;
    public static javax.swing.JButton jButton13;
    public static javax.swing.JButton jButton14;
    public static javax.swing.JButton jButton15;
    public static javax.swing.JButton jButton16;
    public static javax.swing.JButton jButton17;
    public static javax.swing.JButton jButton18;
    public static javax.swing.JButton jButton19;
    public static javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton20;
    public static javax.swing.JButton jButton21;
    public static javax.swing.JButton jButton22;
    public static javax.swing.JButton jButton23;
    public static javax.swing.JButton jButton24;
    public static javax.swing.JButton jButton25;
    public static javax.swing.JButton jButton26;
    public static javax.swing.JButton jButton27;
    public static javax.swing.JButton jButton28;
    public static javax.swing.JButton jButton29;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton30;
    public static javax.swing.JButton jButton31;
    public static javax.swing.JButton jButton32;
    public static javax.swing.JButton jButton33;
    public static javax.swing.JButton jButton34;
    public static javax.swing.JButton jButton35;
    public static javax.swing.JButton jButton36;
    public static javax.swing.JButton jButton37;
    public static javax.swing.JButton jButton38;
    public static javax.swing.JButton jButton39;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton40;
    public static javax.swing.JButton jButton41;
    public static javax.swing.JButton jButton42;
    public static javax.swing.JButton jButton43;
    public static javax.swing.JButton jButton44;
    public static javax.swing.JButton jButton45;
    public static javax.swing.JButton jButton46;
    public static javax.swing.JButton jButton47;
    public static javax.swing.JButton jButton48;
    public static javax.swing.JButton jButton49;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton50;
    public static javax.swing.JButton jButton51;
    public static javax.swing.JButton jButton52;
    public static javax.swing.JButton jButton53;
    public static javax.swing.JButton jButton54;
    public static javax.swing.JButton jButton55;
    public static javax.swing.JButton jButton56;
    public static javax.swing.JButton jButton57;
    public static javax.swing.JButton jButton58;
    public static javax.swing.JButton jButton59;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton60;
    public static javax.swing.JButton jButton61;
    public static javax.swing.JButton jButton62;
    public static javax.swing.JButton jButton63;
    public static javax.swing.JButton jButton64;
    public static javax.swing.JButton jButton65;
    public static javax.swing.JButton jButton66;
    public static javax.swing.JButton jButton67;
    public static javax.swing.JButton jButton68;
    public static javax.swing.JButton jButton69;
    public static javax.swing.JButton jButton7;
    public static javax.swing.JButton jButton70;
    public static javax.swing.JButton jButton71;
    public static javax.swing.JButton jButton72;
    public static javax.swing.JButton jButton73;
    public static javax.swing.JButton jButton74;
    public static javax.swing.JButton jButton75;
    public static javax.swing.JButton jButton76;
    public static javax.swing.JButton jButton77;
    public static javax.swing.JButton jButton78;
    public static javax.swing.JButton jButton79;
    public static javax.swing.JButton jButton8;
    public static javax.swing.JButton jButton80;
    public static javax.swing.JButton jButton81;
    public static javax.swing.JButton jButton82;
    public static javax.swing.JButton jButton83;
    public static javax.swing.JButton jButton84;
    public static javax.swing.JButton jButton85;
    public static javax.swing.JButton jButton86;
    public static javax.swing.JButton jButton87;
    public static javax.swing.JButton jButton88;
    public static javax.swing.JButton jButton89;
    public static javax.swing.JButton jButton9;
    public static javax.swing.JButton jButton90;
    public static javax.swing.JButton jButton91;
    public static javax.swing.JButton jButton92;
    public static javax.swing.JButton jButton93;
    public static javax.swing.JButton jButton94;
    public static javax.swing.JButton jButton95;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}