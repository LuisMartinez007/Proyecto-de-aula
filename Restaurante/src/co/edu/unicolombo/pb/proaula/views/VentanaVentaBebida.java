/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.views;

import co.edu.unicolombo.pb.proaula.conceptos.ItemVenta;
import co.edu.unicolombo.pb.proaula.conceptos.Producto;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class VentanaVentaBebida extends javax.swing.JDialog {

    /**
     * Creates new form VentanaVentaBebida
     */
    float cantidad = 0;
    Producto producto;
    
    public VentanaVentaBebida(Producto producto) {
        
        initComponents();
        SetImageLabel(etiFondo,"src/imagenes/fondo_cuenta.jpg");
        etiBebida.setText(producto.nombre);
        etiPrecio.setText("$"+producto.precio);
        
        this.producto = producto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiBebida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cantidadProducto = new javax.swing.JComboBox<>();
        etiPrecio = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        etiFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiBebida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        etiBebida.setToolTipText("");
        etiBebida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiBebidaMouseClicked(evt);
            }
        });
        getContentPane().add(etiBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 220, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Precio:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("¿Cuantas desea?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        cantidadProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }));
        cantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 40, -1));

        etiPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(etiPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 80, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, -1));

        btnAceptar.setBackground(new java.awt.Color(153, 255, 153));
        btnAceptar.setText("Aceptar ");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));
        getContentPane().add(etiFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etiBebidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiBebidaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_etiBebidaMouseClicked

    private void cantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductoActionPerformed
        // TODO add your handling code here:
        cantidad = cantidadProducto.getSelectedIndex();
    }//GEN-LAST:event_cantidadProductoActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:if(cantidad==0){
           if(cantidad==0){
            JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0");
        
        }else{
            
            ItemVenta item = new ItemVenta();
            item.producto = producto;
            item.candidad = cantidad;
            item.calcularSubtotal();
            VentanaPrincipal.gestionVenta.agregarItem(item);

            JOptionPane.showMessageDialog(null, "Subtotal: $"+item.subtotal);
        this.dispose();
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void SetImageLabel(JLabel nombrelabel, String root){
        ImageIcon imagen = new ImageIcon(root); 
        Icon icon = new ImageIcon(
                imagen.getImage().getScaledInstance(nombrelabel.getWidth(), nombrelabel.getHeight(), Image.SCALE_DEFAULT));
        nombrelabel.setIcon(icon);
        this.repaint();
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
            java.util.logging.Logger.getLogger(VentanaVentaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaBebida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaVentaBebida dialog = new VentanaVentaBebida(null);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cantidadProducto;
    private javax.swing.JLabel etiBebida;
    private javax.swing.JLabel etiFondo;
    private javax.swing.JLabel etiPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
