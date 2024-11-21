package co.edu.unicolombo.pb.proaula.views;

import co.edu.unicolombo.pb.proaula.conceptos.Cliente;
import co.edu.unicolombo.pb.proaula.crud.GestionCliente;
import co.edu.unicolombo.pb.proaula.crud.GestionVentas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class VentanaRegistro extends javax.swing.JFrame {

    public static GestionVentas gestionVenta;
    public static GestionCliente gestionCliente;

    public VentanaRegistro() {

        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int x = (int) ((screenSize.getWidth() - this.getWidth()) / 2);
        int y = (int) ((screenSize.getHeight() - this.getHeight()) / 2);

        this.setLocation(x, y);
        etiTitulo.setVisible(false);
        etiDocumento.setVisible(false);
        documentoText.setVisible(false);
        jSeparator1.setVisible(false);
        etiUsuario.setVisible(false);
        usuarioText.setVisible(false);
        jSeparator2.setVisible(false);
        etiGuardar.setVisible(false);
        
        gestionCliente = new GestionCliente();
        gestionVenta = new GestionVentas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        etiTitulo = new javax.swing.JLabel();
        etiUsuario = new javax.swing.JLabel();
        documentoText = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        etiDocumento = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        usuarioText = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        etiImagen = new javax.swing.JLabel();
        etiSalir = new javax.swing.JLabel();
        etiIniciarSesion = new javax.swing.JLabel();
        etiRegistrarse = new javax.swing.JLabel();
        etiGuardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bambino");
        setPreferredSize(new java.awt.Dimension(780, 500));
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiTitulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        etiTitulo.setForeground(new java.awt.Color(51, 51, 51));
        etiTitulo.setText("Registro");
        etiTitulo.setAlignmentX(0.5F);
        fondo.add(etiTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 270, -1));

        etiUsuario.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        etiUsuario.setForeground(new java.awt.Color(51, 51, 51));
        etiUsuario.setText("USUARIO");
        fondo.add(etiUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 140, 24));

        documentoText.setBackground(new java.awt.Color(255, 255, 255));
        documentoText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        documentoText.setForeground(new java.awt.Color(102, 102, 102));
        documentoText.setText("Ingrese su número de documento");
        documentoText.setBorder(null);
        documentoText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                documentoTextFocusGained(evt);
            }
        });
        documentoText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                documentoTextMousePressed(evt);
            }
        });
        documentoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoTextActionPerformed(evt);
            }
        });
        fondo.add(documentoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 370, 30));
        fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 370, -1));

        etiDocumento.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        etiDocumento.setForeground(new java.awt.Color(51, 51, 51));
        etiDocumento.setText("DOCUMENTO");
        fondo.add(etiDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 140, 24));
        fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 370, -1));

        usuarioText.setBackground(new java.awt.Color(255, 255, 255));
        usuarioText.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usuarioText.setForeground(new java.awt.Color(102, 102, 102));
        usuarioText.setText("Ingrese su nombre de usuario");
        usuarioText.setBorder(null);
        usuarioText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioTextFocusGained(evt);
            }
        });
        usuarioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioTextMousePressed(evt);
            }
        });
        usuarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioTextActionPerformed(evt);
            }
        });
        fondo.add(usuarioText, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 370, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-male-user-100.png"))); // NOI18N
        jPanel1.add(etiImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 280, 100));

        etiSalir.setBackground(new java.awt.Color(0, 153, 204));
        etiSalir.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        etiSalir.setForeground(new java.awt.Color(255, 255, 255));
        etiSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-salida-50.png"))); // NOI18N
        etiSalir.setText(" Salir");
        etiSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etiSalir.setOpaque(true);
        etiSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiSalirMouseExited(evt);
            }
        });
        jPanel1.add(etiSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 280, 60));

        etiIniciarSesion.setBackground(new java.awt.Color(0, 153, 204));
        etiIniciarSesion.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        etiIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        etiIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-accede-redondeado-derecho-50.png"))); // NOI18N
        etiIniciarSesion.setText(" Iniciar sesión");
        etiIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etiIniciarSesion.setOpaque(true);
        etiIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiIniciarSesionMouseExited(evt);
            }
        });
        jPanel1.add(etiIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 280, 60));

        etiRegistrarse.setBackground(new java.awt.Color(0, 153, 204));
        etiRegistrarse.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        etiRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        etiRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-registro-50.png"))); // NOI18N
        etiRegistrarse.setText(" Registrarse");
        etiRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etiRegistrarse.setOpaque(true);
        etiRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiRegistrarseMouseExited(evt);
            }
        });
        jPanel1.add(etiRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 280, 60));

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        etiGuardar.setBackground(new java.awt.Color(255, 255, 255));
        etiGuardar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        etiGuardar.setForeground(new java.awt.Color(51, 51, 51));
        etiGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiGuardar.setText("Guardar");
        etiGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        etiGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        etiGuardar.setOpaque(true);
        etiGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                etiGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiGuardarMouseExited(evt);
            }
        });
        fondo.add(etiGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void documentoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoTextActionPerformed
        
    }//GEN-LAST:event_documentoTextActionPerformed

    private void usuarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioTextActionPerformed

    private void etiSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiSalirMouseEntered
        etiSalir.setBackground(new Color(58,167,203));
    }//GEN-LAST:event_etiSalirMouseEntered

    private void etiSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiSalirMouseExited
        etiSalir.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_etiSalirMouseExited

    private void etiIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiIniciarSesionMouseEntered
        etiIniciarSesion.setBackground(new Color(58,167,203));
    }//GEN-LAST:event_etiIniciarSesionMouseEntered

    private void etiIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiIniciarSesionMouseExited
        etiIniciarSesion.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_etiIniciarSesionMouseExited

    private void etiRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiRegistrarseMouseEntered
        etiRegistrarse.setBackground(new Color(58,167,203));
    }//GEN-LAST:event_etiRegistrarseMouseEntered

    private void etiRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiRegistrarseMouseExited
        etiRegistrarse.setBackground(new Color(0,153,204));
    }//GEN-LAST:event_etiRegistrarseMouseExited

    private void etiGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiGuardarMouseEntered
        etiGuardar.setBackground(new Color(205,205,205));
    }//GEN-LAST:event_etiGuardarMouseEntered

    private void etiGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiGuardarMouseExited
        etiGuardar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_etiGuardarMouseExited

    private void etiGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiGuardarMouseClicked
        
        String nombre = usuarioText.getText();
        String documento = documentoText.getText();
        if(usuarioText.isVisible()){
            if (nombre.isEmpty() || !validarCaracteres(nombre) || nombre.charAt(0) == ' ') {
            JOptionPane.showMessageDialog(null, "Nombre de usuario invalido.");
            return;
            }
        }
        if (!validarNumeros(documento) || documento.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Número de documento invalido.");
            return;
        }
        Cliente cliente = new Cliente(nombre,documento);
        gestionVenta.setCliente(cliente);
        if(etiGuardar.getText().equals("Guardar")){
            if(gestionCliente.buscarCliente(documento) == null){
            gestionCliente.guardarCliente(cliente);
            siguienteVentana();
            }else{JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese documento");}
        } else {
            if(gestionCliente.buscarCliente(documento) == null){
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            } else{siguienteVentana();}
        }
        
    }//GEN-LAST:event_etiGuardarMouseClicked

    private void etiSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiSalirMouseClicked
        dispose();
    }//GEN-LAST:event_etiSalirMouseClicked

    private void etiIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiIniciarSesionMouseClicked
        etiTitulo.setVisible(true);
        etiTitulo.setText("Inicio de sesión");
        etiDocumento.setVisible(true);
        documentoText.setVisible(true);
        jSeparator1.setVisible(true);
        etiUsuario.setVisible(false);
        usuarioText.setVisible(false);
        jSeparator2.setVisible(false);
        etiGuardar.setVisible(true);
        etiGuardar.setText("Entrar");
    }//GEN-LAST:event_etiIniciarSesionMouseClicked

    private void etiRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiRegistrarseMouseClicked
        etiTitulo.setVisible(true);
        etiTitulo.setText("Registro");
        etiDocumento.setVisible(true);
        documentoText.setVisible(true);
        jSeparator1.setVisible(true);
        etiUsuario.setVisible(true);
        usuarioText.setVisible(true);
        jSeparator2.setVisible(true);
        etiGuardar.setVisible(true);
        etiGuardar.setText("Guardar");
    }//GEN-LAST:event_etiRegistrarseMouseClicked

    private void documentoTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_documentoTextMousePressed
        
    }//GEN-LAST:event_documentoTextMousePressed

    private void usuarioTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioTextMousePressed
        
    }//GEN-LAST:event_usuarioTextMousePressed

    private void usuarioTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioTextFocusGained
        if(usuarioText.getText().equals("Ingrese su nombre de usuario")){
            usuarioText.setText("");
            usuarioText.setForeground(new Color(51,51,51));
        }
        if(documentoText.getText().isEmpty()){
            documentoText.setText("Ingrese su número de documento");
            documentoText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_usuarioTextFocusGained

    private void documentoTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_documentoTextFocusGained
        if(documentoText.getText().equals("Ingrese su número de documento")){
            documentoText.setText("");
            documentoText.setForeground(new Color(51,51,51));
        }
        if(usuarioText.getText().isEmpty()){
            usuarioText.setText("Ingrese su nombre de usuario");
            usuarioText.setForeground(Color.gray);
        }
    }//GEN-LAST:event_documentoTextFocusGained

    
    public static boolean validarCaracteres(String datos) {
        return datos.matches("[a-z A-Z]*");
    }

    public static boolean validarNumeros(String datos) {
        return datos.matches("[0-9]*");
    }
    
    private void siguienteVentana(){
        VentanaMenu menu = new VentanaMenu(); 
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        this.dispose();
        JOptionPane.showMessageDialog(null, "Para seleccionar un plato presione su nombre");
    }

// Agrega un ComponentListener a tu JFrame para detectar cambios de tamaño
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
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField documentoText;
    private javax.swing.JLabel etiDocumento;
    private javax.swing.JLabel etiGuardar;
    private javax.swing.JLabel etiImagen;
    private javax.swing.JLabel etiIniciarSesion;
    private javax.swing.JLabel etiRegistrarse;
    private javax.swing.JLabel etiSalir;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JLabel etiUsuario;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
