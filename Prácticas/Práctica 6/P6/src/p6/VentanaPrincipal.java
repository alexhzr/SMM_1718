/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author CArlos
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        GraphicsEnvironment ge;
        ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String []fuentesSistema = ge.getAvailableFontFamilyNames();
        listafuentes = new javax.swing.JComboBox<>(fuentesSistema);
        jCheckBox3 = new javax.swing.JCheckBox();
        lienzo1 = new p6.Lienzo();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jCheckBox2.setText("Editar");
        jCheckBox2.setFocusable(false);
        jCheckBox2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jCheckBox2);

        jCheckBox1.setText("Relleno");
        jCheckBox1.setFocusable(false);
        jCheckBox1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jCheckBox1);

        jButton1.setText("Linea");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("Rectángulo");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton2);

        listafuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listafuentesActionPerformed(evt);
            }
        });
        jToolBar1.add(listafuentes);

        jCheckBox3.setText("Efecto Ventana");
        jCheckBox3.setFocusable(false);
        jCheckBox3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jCheckBox3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jCheckBox3);

        getContentPane().add(jToolBar1, java.awt.BorderLayout.PAGE_START);

        lienzo1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout lienzo1Layout = new javax.swing.GroupLayout(lienzo1);
        lienzo1.setLayout(lienzo1Layout);
        lienzo1Layout.setHorizontalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        lienzo1Layout.setVerticalGroup(
            lienzo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        getContentPane().add(lienzo1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (lienzo1.getEdicion()){
            lienzo1.setEdicion(false);
        } else 
            lienzo1.setEdicion(true);   
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        lienzo1.setForma(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        lienzo1.setForma(1);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void listafuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listafuentesActionPerformed
        //Fuente
        String selected =(String) listafuentes.getSelectedItem();
        lienzo1.setTipoFuente(selected);
        
        lienzo1.repaint();
    }//GEN-LAST:event_listafuentesActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        if(lienzo1.getVentanaClipActiva()){
            lienzo1.setVentanaClipActiva(false);
        }else
            lienzo1.setVentanaClipActiva(true);
        
        lienzo1.repaint();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JToolBar jToolBar1;
    private p6.Lienzo lienzo1;
    private javax.swing.JComboBox<String> listafuentes;
    // End of variables declaration//GEN-END:variables

}
