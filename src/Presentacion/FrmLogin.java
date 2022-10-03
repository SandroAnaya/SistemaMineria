package Presentacion;

import Negocio.UsuarioControl;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmLogin extends javax.swing.JFrame {

    private final UsuarioControl CONTROL;

    public FrmLogin() {
        initComponents();
        this.CONTROL = new UsuarioControl();
        this.setLocationRelativeTo(null);
        this.limpiar();
        this.setTitle("Modulo de Login");
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/IconModulos/ModuleLogin.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblChangePassword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setIconImage(getIconImage());

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Usuario");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Contraseña");

        lblChangePassword.setText("¿Olvidastes tu contraseña?");
        lblChangePassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChangePasswordMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login (1).png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntrar))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblChangePassword)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        if (!txtUsuario.getText().equals("")) {
            if (!txtPassword.getText().equals("")) {
                String mensaje = CONTROL.LoginControl(txtUsuario.getText(), txtPassword.getText());
                if (mensaje.equals("Ok")) {
                    this.dispose();
                    FrmDashboard frm = new FrmDashboard();
                    frm.setVisible(true);

                } else {
                    this.AlertaWarning("Usuario y clave no indentificados");
                }
            } else {
                this.AlertaWarning("No debe haber datos vacios");
            }
        } else {
            this.AlertaWarning("No debe haber datos vacios");
        }


    }//GEN-LAST:event_btnEntrarActionPerformed
    private void limpiar() {
        txtUsuario.setText("");
        txtPassword.setText("");
    }
    private void lblChangePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChangePasswordMouseClicked
        FrmResetPassword frmpass = new FrmResetPassword();
        frmpass.setVisible(true);
    }//GEN-LAST:event_lblChangePasswordMouseClicked

    private void AlertUpdate() {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertUpdate.png");
        Object[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "¿Estas seguro en Actualizar al usuario?" + "\nUsuario : Sandro Anaya" + "\nRuc : 9854789855445", "Alerta de Actualizar", JOptionPane.DEFAULT_OPTION, HEIGHT, iconobtn, options, options[0]);
        System.out.println("codigo : " + x);
    }
    private void AlertaEliminar() {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertDelete.png");
        Object[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "¿Estas seguro en eliminar al usuario?" + "\nUsuario : Sandro Anaya" + "\nRuc : 9854789855445", "Alerta de Eliminar", JOptionPane.DEFAULT_OPTION, HEIGHT, iconobtn, options, options[0]);
        System.out.println("codigo : " + x);
    }
    private void AlertAdd() {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertAdd.png");
        Object[] options = {"Si", "No"};
        int x = JOptionPane.showOptionDialog(null, "¿Estas seguro en insertar al usuario?" + "\nUsuario : Sandro Anaya" + "\nRuc : 9854789855445", "Alerta de Registro", JOptionPane.DEFAULT_OPTION, HEIGHT, iconobtn, options, options[0]);
        System.out.println("codigo : " + x);
    }
    private void AlertaInfo() {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertInfo.png");
        JOptionPane.showMessageDialog(null, "Inserccion exitosamente", "Alerta de Info", HEIGHT, iconobtn);
    }
    private void AlertaWarning(String texto) {
        ImageIcon iconobtn = new ImageIcon("src/Imagenes/IconAlert/IconAlertWarning.png");
        JOptionPane.showMessageDialog(null, texto, "Alerta de Errores", HEIGHT, iconobtn);
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblChangePassword;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
