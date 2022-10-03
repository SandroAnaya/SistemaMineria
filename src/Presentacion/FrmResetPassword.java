package Presentacion;

import Negocio.UsuarioControl;
import java.awt.Image;
import java.awt.Toolkit;
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmResetPassword extends javax.swing.JFrame {

    private final UsuarioControl CONTROL;

    public FrmResetPassword() {
        initComponents();
        this.CONTROL = new UsuarioControl();
        this.setTitle("Módulo de Cambiar de Contraseña");
        this.setLocationRelativeTo(null);
        this.RestaurarComponentes();

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/IconModulos/ModulePassword.png"));
        return retValue;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoVerificacion = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnChangePassword = new javax.swing.JButton();
        txtNewPassword = new javax.swing.JPasswordField();
        btnEnviarCorreo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());

        jLabel2.setText("Escribir Correo Electronico :");

        jLabel3.setText("Escribir Codigo de verificación");

        jLabel5.setText("Escribir Nueva Contraseña");

        btnChangePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconButones/btnChangePassword.png"))); // NOI18N
        btnChangePassword.setText("Cambiar Contraseña");
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnEnviarCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconButones/btnEnviarCorreo.png"))); // NOI18N
        btnEnviarCorreo.setText("Enviar Correo");
        btnEnviarCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarCorreoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreoElectronico)
                    .addComponent(txtCodigoVerificacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNewPassword)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviarCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviarCorreo))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigoVerificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangePassword)
                .addGap(12, 21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed

        if (!txtCodigoVerificacion.getText().equals("")) {

            if (!txtNewPassword.getText().equals("")) {
                int opcion = this.AlertChangePassword();
                if (opcion == 0) {
                    /*String mensaje = this.CONTROL.UpdateClientControl(
                        txtCorreoElectronico.getText(),
                        txtNewPassword.getText(),
                        txtCodigoVerificacion.getText()
                );
                if (mensaje.equals("Ok")) {
                    this.mensajeOk("Cambio Exitoso");
                    this.limpiar();
                    this.dispose();
                } else {
                    this.mensajeFallida("Error");
                    this.limpiar();
                }*/
                    this.RestaurarComponentes();
                    this.AlertChangePasswordSuccess();
                } else {

                }

            } else {
                this.AlertaWarning("No debe haber Datos vacios");
            }
        } else {
            this.AlertaWarning("No debe haber Datos vacios");
        }

    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void btnEnviarCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCorreoActionPerformed
        if (!txtCorreoElectronico.getText().equals("")) {
            boolean valid = ValidarCorreo(txtCorreoElectronico.getText());
            if (valid) {
                this.AlertaEmail(txtCorreoElectronico.getText());
                txtCorreoElectronico.setEnabled(false);
                txtCodigoVerificacion.setEnabled(true);
                txtNewPassword.setEnabled(true);
                btnChangePassword.setEnabled(true);
                btnEnviarCorreo.setText("Reenviar Correo");
            } else {
                this.AlertaWarning("Debe escribir un Correo valido");
            }
        } else {
            this.AlertaWarning("Debe escribir un Correo electronico");

        }


    }//GEN-LAST:event_btnEnviarCorreoActionPerformed

    private void RestaurarComponentes() {
        txtCorreoElectronico.setText("");
        txtNewPassword.setText("");
        txtCodigoVerificacion.setText("");
        txtCorreoElectronico.setEnabled(true);
        txtNewPassword.setEnabled(false);
        txtCodigoVerificacion.setEnabled(false);
        btnEnviarCorreo.setText("Enviar Correo");
        btnChangePassword.setEnabled(false);
    }

    private static boolean ValidarCorreo(String email) {
        String emailREGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailREGEX);
        if (email == null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }

    private void AlertaEmail(String correo) {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertMail.png");
        JOptionPane.showMessageDialog(null, "Se ha enviado un codigo de verificación a su correo electronico" + "\nRevise su buzon de entrada, por favor :" + "\nCorreo : " + correo, "Alerta de Correo", HEIGHT, iconobtn);
    }

    private void AlertaWarning(String texto) {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertWarning.png");
        JOptionPane.showMessageDialog(null, texto, "Alerta de Errores", HEIGHT, iconobtn);
    }

    private int AlertChangePassword() {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertPassword.png");
        Object[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "¿Estas seguro en Cambiar su Password ?", "Alerta de Cambio de Password", JOptionPane.DEFAULT_OPTION, HEIGHT, iconobtn, options, options[0]);
        return x;
    }

    private void AlertChangePasswordSuccess() {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertPassword.png");
        JOptionPane.showMessageDialog(null, "Su correo ha sido cambiado correctamente", "Alerta de Cambio de Password", JOptionPane.INFORMATION_MESSAGE, iconobtn);
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
            java.util.logging.Logger.getLogger(FrmResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmResetPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmResetPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JButton btnEnviarCorreo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtCodigoVerificacion;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JPasswordField txtNewPassword;
    // End of variables declaration//GEN-END:variables
}
