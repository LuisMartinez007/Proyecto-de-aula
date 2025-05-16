/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.views;

import co.edu.unicolombo.pb.proaula.conceptos.ItemVenta;
import co.edu.unicolombo.pb.proaula.conceptos.Producto;
import co.edu.unicolombo.pb.proaula.conceptos.Venta;
import co.edu.unicolombo.pb.proaula.crud.GestionVentas;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaVentaComida extends javax.swing.JDialog {

    /**
     * Creates new form VistaPlato
     */
    float cantidad = 0;
    Producto producto;
    GestionVentas gestionVentas;
    
    public VentanaVentaComida(JFrame ventanaMenu, Producto producto) {
         super(ventanaMenu, true);
        gestionVentas = new GestionVentas();
        initComponents();

        lblPlato.setText(producto.nombre);
        primerIngrediente.setText(producto.ingredientes[0]);
        segundoIngrediente.setText(producto.ingredientes[1]);
        tercerIngrediente.setText(producto.ingredientes[2]);
        SetImageLabel(jLabel1, "src/imagenes/fondo_cuenta.jpg");
        etiPrecio.setText("$" + producto.precio);
        this.producto = producto;
        if (primerIngrediente.getText() == null) {
            primerIngrediente.setEnabled(false);
            primerIngrediente.setVisible(false);
        }
        if (segundoIngrediente.getText() == null) {
            segundoIngrediente.setEnabled(false);
            segundoIngrediente.setVisible(false);
        }
        if (tercerIngrediente.getText() == null) {
            tercerIngrediente.setEnabled(false);
            tercerIngrediente.setVisible(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPlato = new javax.swing.JLabel();
        etiCantidad = new javax.swing.JLabel();
        cantidadProducto = new javax.swing.JComboBox<>();
        primerIngrediente = new javax.swing.JCheckBox();
        segundoIngrediente = new javax.swing.JCheckBox();
        tercerIngrediente = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        etiPrecio = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPlato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(lblPlato, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 240, 24));

        etiCantidad.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        etiCantidad.setText("¿Cuantas desea?");
        getContentPane().add(etiCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 120, -1));

        cantidadProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        cantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 45, -1));

        primerIngrediente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                primerIngredienteMouseClicked(evt);
            }
        });
        primerIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primerIngredienteActionPerformed(evt);
            }
        });
        getContentPane().add(primerIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        segundoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoIngredienteActionPerformed(evt);
            }
        });
        getContentPane().add(segundoIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));
        getContentPane().add(tercerIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(153, 255, 153));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        etiPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(etiPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 430, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Ingredientes que desea remover");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadProductoActionPerformed
        // TODO add your handling code here:
        cantidad = cantidadProducto.getSelectedIndex();
    }//GEN-LAST:event_cantidadProductoActionPerformed

    private void segundoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundoIngredienteActionPerformed

    }//GEN-LAST:event_segundoIngredienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if (cantidad == 0) {
            JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0");
            return;
        }
        
        ItemVenta item = new ItemVenta();
        item.producto = producto;
        item.cantidad = cantidad;
        item.calcularSubtotal();
        var venta = gestionVentas.primeraEnCola();
        venta.agregarItem(item);

        JOptionPane.showMessageDialog(null, "El valor por la cantidad selecionada es: $" + item.calcularSubtotal());
        this.dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void primerIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerIngredienteActionPerformed

    private void primerIngredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerIngredienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primerIngredienteMouseClicked

    public void SetImageLabel(JLabel nombrelabel, String root) {
        ImageIcon imagen = new ImageIcon(root);
        Icon icon = new ImageIcon(
                imagen.getImage().getScaledInstance(nombrelabel.getWidth(), nombrelabel.getHeight(), Image.SCALE_DEFAULT));
        nombrelabel.setIcon(icon);
        this.repaint();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentaComida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaVentaComida dialog = new VentanaVentaComida(null, null);
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
    private javax.swing.JLabel etiCantidad;
    private javax.swing.JLabel etiPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    public static javax.swing.JLabel lblPlato;
    private javax.swing.JCheckBox primerIngrediente;
    private javax.swing.JCheckBox segundoIngrediente;
    private javax.swing.JCheckBox tercerIngrediente;
    // End of variables declaration//GEN-END:variables
}
