package Presentacion;

import Negocio.ClienteControl;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.TableRowSorter;

public class FrmClientes extends javax.swing.JInternalFrame {

    private final ClienteControl CONTROL;
    private int idActualizar;

    public FrmClientes() {
        initComponents();
        this.CONTROL = new ClienteControl();
        this.limpiar();
        this.ListarNuevamente();
        this.listar();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPopupMenu();
        opcionActualizar = new javax.swing.JMenuItem();
        opcionEliminar = new javax.swing.JMenuItem();
        opcionEstado = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeloTabla = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();

        opcionActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PopMenuUpdate.png"))); // NOI18N
        opcionActualizar.setText("Actualizar");
        opcionActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionActualizarActionPerformed(evt);
            }
        });
        menu.add(opcionActualizar);

        opcionEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PorMenuDelete.png"))); // NOI18N
        opcionEliminar.setText("Eliminar");
        opcionEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionEliminarActionPerformed(evt);
            }
        });
        menu.add(opcionEliminar);

        opcionEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PopMenuDardebaja.png"))); // NOI18N
        opcionEstado.setText("Manipular Estado");
        menu.add(opcionEstado);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Módulo de Clientes");

        jLabel1.setText("Nombres : ");

        jLabel2.setText("Apellidos :");

        jLabel3.setText("Dirección : ");

        jLabel4.setText("Ruc :");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        modeloTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        modeloTabla.setComponentPopupMenu(menu);
        jScrollPane1.setViewportView(modeloTabla);

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnAgregar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnLimpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel6.setText("Celular :");

        jLabel7.setText("Busqueda Rapida :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(txtNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                    .addComponent(txtDni)
                                    .addComponent(txtCelular))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegistrar)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed

    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (btnRegistrar.getText().equals("Actualizar")) {
            String resp = this.CONTROL.actualizarCliente(
                    idActualizar,
                    txtNombre.getText(),
                    txtApellido.getText(),
                    txtDireccion.getText(),
                    txtDni.getText(),
                    txtCelular.getText());
            if (resp.equals("OK")) {
                this.limpiar();
                this.ListarNuevamente();
                this.mensajeOk("Actualizado correctamente");
                btnRegistrar.setText("Registrar");
            } else {
                this.limpiar();
                this.ListarNuevamente();
                btnRegistrar.setText("Registrar");
                this.mensajeFallida("Error en la actualizacion");
            }

        } else {
            String resp = this.CONTROL.insertarCliente(txtNombre.getText(),
                    txtApellido.getText(),
                    txtDireccion.getText(),
                    txtDni.getText(),
                    txtCelular.getText());
            if (resp.equals("OK")) {
                this.limpiar();
                this.ListarNuevamente();
                this.mensajeOk("Registrado correctamente");
            } else {
                this.limpiar();
                this.ListarNuevamente();
                this.mensajeFallida("Error en el registro");
            }
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
       modeloTabla.setModel(this.CONTROL.listar(txtBuscar.getText()));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void opcionActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionActualizarActionPerformed
        if (modeloTabla.getSelectedRowCount() == 1) {

            idActualizar = Integer.parseInt(String.valueOf(modeloTabla.getValueAt(modeloTabla.getSelectedRow(), 0)));
            String nombre = String.valueOf(modeloTabla.getValueAt(modeloTabla.getSelectedRow(), 1));
            String apellido = String.valueOf(modeloTabla.getValueAt(modeloTabla.getSelectedRow(), 2));
            String direccion = String.valueOf(modeloTabla.getValueAt(modeloTabla.getSelectedRow(), 3));
            String dni = String.valueOf(modeloTabla.getValueAt(modeloTabla.getSelectedRow(), 4));
            String celular = String.valueOf(modeloTabla.getValueAt(modeloTabla.getSelectedRow(), 5));

            txtNombre.setText(nombre);
            txtApellido.setText(apellido);
            txtDireccion.setText(direccion);
            txtDni.setText(dni);
            txtCelular.setText(celular);

            btnRegistrar.setText("Actualizar");

            //JOptionPane.showMessageDialog(null, "id para actualizar : " + idActualizar);
        }
    }//GEN-LAST:event_opcionActualizarActionPerformed

    private void opcionEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionEliminarActionPerformed
        if (modeloTabla.getSelectedRowCount() == 1) {
            String id = String.valueOf(modeloTabla.getValueAt(modeloTabla.getSelectedRow(), 0));
            String resp = this.CONTROL.AnularCliente(Integer.parseInt(id));
            if (resp.equals("OK")) {
                this.mensajeOk("Eliminado correctamente");
            } else {
                this.mensajeFallida("Error en la Eliminacion");
            }
        }
    }//GEN-LAST:event_opcionEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiar();
        this.ListarNuevamente();
        btnRegistrar.setText("Registrar");
    }//GEN-LAST:event_btnNuevoActionPerformed
    private void limpiar() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDireccion.setText("");
        txtCelular.setText("");
        txtDni.setText("");
    }

    private void listar() {
        TableRowSorter orden = new TableRowSorter(modeloTabla.getModel());
        modeloTabla.setRowSorter(orden);
    }

    private void mensajeOk(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Aviso del sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mensajeFallida(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Aviso del sistema", JOptionPane.ERROR_MESSAGE);
    }

    private void ListarNuevamente() {
        modeloTabla.setModel(this.CONTROL.listar(""));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu menu;
    private javax.swing.JTable modeloTabla;
    private javax.swing.JMenuItem opcionActualizar;
    private javax.swing.JMenuItem opcionEliminar;
    private javax.swing.JMenuItem opcionEstado;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
