/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visual;

import Campo.Campo;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pc
 */
public class Game extends javax.swing.JFrame {

    public int e;
    public Campo campo = new Campo();
    FondoPanel fondo = new FondoPanel();

    public void setE(int e) {
        this.e = e;
    }

    public int getE() {
        return e;
    }

    /**
     * Creates new form GameRemate
     */
    public Game() {
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

        jPanel2 = new javax.swing.JPanel();
        txtScore = new javax.swing.JTextField();
        initiGame = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtIntentos = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cancha = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        estrategia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SCORE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        txtScore.setEditable(false);
        txtScore.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        txtScore.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtScore.setText("0 - 0");
        txtScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtScoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtScore, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 100, -1));

        initiGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/play.png"))); // NOI18N
        initiGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initiGameActionPerformed(evt);
            }
        });
        getContentPane().add(initiGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, -1, 60));

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/stop.png"))); // NOI18N
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });
        getContentPane().add(btnStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 420, 80, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INTENTS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 153, 0))); // NOI18N

        txtIntentos.setEditable(false);
        txtIntentos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIntentos.setText("0");
        txtIntentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIntentos, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtIntentos, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 580, -1, -1));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/exit.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 640, 80, 40));

        jButton1.setText("Mostrar Cancha");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, -1, -1));

        cancha.setMaximumSize(new java.awt.Dimension(546, 351));
        cancha.setMinimumSize(new java.awt.Dimension(546, 351));
        cancha.setPreferredSize(new java.awt.Dimension(546, 351));
        getContentPane().add(cancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jButton2.setText("Mostrar Estrategia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 140, -1));

        estrategia.setEditable(false);
        estrategia.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        estrategia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(estrategia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 140, 70));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void transparentButton() {
        initiGame.setOpaque(false);
        initiGame.setContentAreaFilled(false);
        initiGame.setBorderPainted(false);
        btnStop.setOpaque(false);
        btnStop.setContentAreaFilled(false);
        btnStop.setBorderPainted(false);
        btnExit.setOpaque(false);
        btnExit.setContentAreaFilled(false);
        btnExit.setBorderPainted(false);
    }
    
    private void txtScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtScoreActionPerformed

    private void initiGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initiGameActionPerformed

        try {
            campo.initGame(getE());
            txtScore.setText(campo.getMarcadora() + " - 0");
            txtIntentos.setText(campo.getIntento() + "");
        } catch (IOException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_initiGameActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "El juego ha finalizado");
    }//GEN-LAST:event_btnStopActionPerformed

    private void txtIntentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntentosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntentosActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(null, "Seguro que quiere salir?");
        if (i == 0)
            System.exit(0);//cierra aplicacion
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Icon imgCancha;
        switch(e){
            case 1:
                imgCancha = new ImageIcon (new ImageIcon(getClass().getResource("/imgs/posesion.jpg")).getImage()
                .getScaledInstance(cancha.getWidth(), cancha.getHeight(), 0));
                break;
            case 2:
                imgCancha = new ImageIcon (new ImageIcon(getClass().getResource("/imgs/remate.jpg")).getImage()
                .getScaledInstance(cancha.getWidth(), cancha.getHeight(), 0));
                break;
            case 3:
                imgCancha = new ImageIcon (new ImageIcon(getClass().getResource("/imgs/velocidad.jpg")).getImage()
                .getScaledInstance(cancha.getWidth(), cancha.getHeight(), 0));
                break;
            default:
                imgCancha = new ImageIcon (new ImageIcon(getClass().getResource("/imgs/velocidad.jpg")).getImage()
                .getScaledInstance(cancha.getWidth(), cancha.getHeight(), 0));
                break;
        }
        cancha.setIcon(imgCancha);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        estrategia.setText("HOLAAA");
        switch(e){
            case 1:
                estrategia.setText("POSESION\n" +
                                    "\n" +
                                    "433");
                break;
            case 2:
                estrategia.setText("REMATE\n" +
                                    "\n" +
                                    "442");
                break;
            case 3:
                estrategia.setText("VELOCIDAD\n" +
                                    "\n" +
                                    "343");
                break;
            default:
                estrategia.setText("REMATE\n" +
                                    "\n" +
                                    "442");
                break;
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel cancha;
    private javax.swing.JTextField estrategia;
    private javax.swing.JButton initiGame;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtIntentos;
    private javax.swing.JTextField txtScore;
    // End of variables declaration//GEN-END:variables
    
    class FondoPanel extends JPanel {

        private Image img;

        @Override
        public void paint(Graphics g) {
            img = new ImageIcon(getClass().getResource("/imgs/game.jpg")).getImage();
            g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
