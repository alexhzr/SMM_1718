/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p14;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import java.awt.BorderLayout;

/**
 *
 * @author CArlos
 */
public class VentanaInternaCamara extends VentanaInternaSM {
    
    private Webcam camara = null;

    private VentanaInternaCamara() {
        initComponents();
        camara = Webcam.getDefault();
        
        if (camara != null) {
            WebcamPanel areaVisual = new WebcamPanel(camara);
            if (areaVisual != null) {
                getContentPane().add(areaVisual, BorderLayout.CENTER);
                pack();
            }
        }
    }

    public static VentanaInternaCamara getInstance() {
        VentanaInternaCamara v = new VentanaInternaCamara();
        return (v.camara != null ? v : null);
    }

    public void close() {
        if (camara != null) {
            try {
                camara.close();
            } catch (Exception e) {
                System.err.println("Error en cámara: ");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        VentanaInternaCamara vi = VentanaInternaCamara.getInstance();
        this.close();
    }//GEN-LAST:event_formInternalFrameClosing

    @Override
    public Webcam getCamara(){
        return this.camara;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
