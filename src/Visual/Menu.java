/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class Menu extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();

    public static Game Game = new Game();

    /**
     * Creates new form Menu
     */
    public Menu() {
        FlatDarkLaf.setup();
        this.setContentPane(fondo);
        initComponents();
        transparentButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstrategias = new javax.swing.ButtonGroup();
        btnStart = new javax.swing.JButton();
        rbRemate = new javax.swing.JRadioButton();
        rbVelocidad = new javax.swing.JRadioButton();
        rbPosesión = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/start.png"))); // NOI18N
        btnStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        buttonGroupEstrategias.add(rbRemate);
        rbRemate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRemateActionPerformed(evt);
            }
        });

        buttonGroupEstrategias.add(rbVelocidad);
        rbVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVelocidadActionPerformed(evt);
            }
        });

        buttonGroupEstrategias.add(rbPosesión);
        rbPosesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPosesiónActionPerformed(evt);
            }
        });

        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/play.png"))); // NOI18N
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbVelocidad)
                            .addComponent(rbRemate, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbPosesión, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(178, 178, 178))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(191, 191, 191))))
            .addGroup(layout.createSequentialGroup()
                .addGap(513, 513, 513)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 625, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(rbPosesión)
                .addGap(40, 40, 40)
                .addComponent(rbRemate)
                .addGap(40, 40, 40)
                .addComponent(rbVelocidad)
                .addGap(56, 56, 56)
                .addComponent(btnAceptar)
                .addGap(46, 46, 46)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void transparentButton(){
        btnStart.setOpaque(false);
        btnStart.setContentAreaFilled(false);
        btnStart.setBorderPainted(false);
        btnAceptar.setOpaque(false);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setBorderPainted(false);
    }
    
    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:

        if (rbPosesión.isSelected() == false && rbRemate.isSelected() == false && rbVelocidad.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna estrategia");
        } else {
            Game.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_btnStartActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        if (rbPosesión.isSelected()) {
            JOptionPane.showMessageDialog(null, "¡Jugará con la estrategia de Posesión!");
        }

        if (rbRemate.isSelected()) {
            JOptionPane.showMessageDialog(null, "¡Jugará con la estrategia de Remate!");
        }

        if (rbVelocidad.isSelected()) {
            JOptionPane.showMessageDialog(null, "¡Jugará con la estrategia de Velocidad!");
        }

        if (rbPosesión.isSelected() == false && rbRemate.isSelected() == false && rbVelocidad.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "No seleccionó ninguna estrategia");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void rbPosesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPosesiónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPosesiónActionPerformed

    private void rbRemateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRemateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbRemateActionPerformed

    private void rbVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVelocidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbVelocidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatDarkLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnStart;
    private javax.swing.ButtonGroup buttonGroupEstrategias;
    private javax.swing.JRadioButton rbPosesión;
    private javax.swing.JRadioButton rbRemate;
    private javax.swing.JRadioButton rbVelocidad;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel{
        private Image img;
        @Override
        public void paint(Graphics g){
            img = new ImageIcon(getClass().getResource("/imgs/menu.jpg")).getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
}
