/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.unicolombo.pb.proaula.views;

import co.edu.unicolombo.pb.proaula.conceptos.ItemVenta;
import co.edu.unicolombo.pb.proaula.conceptos.Producto;
import co.edu.unicolombo.pb.proaula.conceptos.Venta;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaVenta extends javax.swing.JDialog {

    /**
     * Creates new form VistaPlato
     */ 
    VentanaVenta vistaplato;
    float cantidad = 0;
    float subtotal = 0;
    Producto producto;
    
    public VentanaVenta(Producto producto) {
        initComponents();
        plato.setText(producto.nombre);
        primerIngrediente.setText(producto.ingredientes[0]);
        segundoIngrediente.setText(producto.ingredientes[1]);
        tercerIngrediente.setText(producto.ingredientes[2]);
        SetImageLabel(jLabel1,"src/imagenes/fondo_cuenta.jpg");
        etiPrecio.setText("$"+producto.precio);
        subtotal = producto.precio;
        this.producto = producto;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plato = new javax.swing.JLabel();
        etiCantidad = new javax.swing.JLabel();
        cantidadProducto = new javax.swing.JComboBox<>();
        primerIngrediente = new javax.swing.JCheckBox();
        segundoIngrediente = new javax.swing.JCheckBox();
        tercerIngrediente = new javax.swing.JCheckBox();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        etiPrecio = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        plato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        getContentPane().add(plato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 240, 24));

        etiCantidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        etiCantidad.setText("¿Cuantas desea?");
        getContentPane().add(etiCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 120, -1));

        cantidadProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        cantidadProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 45, -1));

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
        getContentPane().add(primerIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        segundoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundoIngredienteActionPerformed(evt);
            }
        });
        getContentPane().add(segundoIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        getContentPane().add(tercerIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        btnAceptar.setBackground(new java.awt.Color(153, 255, 153));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(255, 102, 102));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));
        getContentPane().add(etiPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 90, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Precio:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 50, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Selecione el ingrediente que desea remover\n(Por cada ingrediente que remueva se le \ndescuenta $2000 al precio total).");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 330, 90));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

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
        
        if(cantidad==0){
            JOptionPane.showMessageDialog(null, "La cantidad no puede ser 0");
        
        }else{
            if(primerIngrediente.isSelected()){
            subtotal = subtotal - 2000;
        }
        if(segundoIngrediente.isSelected()){
            subtotal = subtotal - 2000;
        }
        if(tercerIngrediente.isSelected()){
               subtotal = subtotal - 2000;
        }
            ItemVenta item = new ItemVenta();
            item.producto = producto;
            item.candidad = cantidad;
            item.calcularSubtotal();
            VentanaPrincipal.gestionVenta.agregarItem(item);

            JOptionPane.showMessageDialog(null, "Subtotal: $"+item.subtotal);
        this.dispose();
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void primerIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primerIngredienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_primerIngredienteActionPerformed

    private void primerIngredienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_primerIngredienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_primerIngredienteMouseClicked
        
    public void SetImageLabel(JLabel nombrelabel, String root){
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
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaVenta dialog = new VentanaVenta(null);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public static javax.swing.JLabel plato;
    private javax.swing.JCheckBox primerIngrediente;
    private javax.swing.JCheckBox segundoIngrediente;
    private javax.swing.JCheckBox tercerIngrediente;
    // End of variables declaration//GEN-END:variables
}
