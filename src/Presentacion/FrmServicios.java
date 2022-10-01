package Presentacion;

import Negocio.ServicioControl;
import javax.swing.JOptionPane;

import javax.swing.table.TableRowSorter;

public class FrmServicios extends javax.swing.JInternalFrame {

    private final ServicioControl CONTROL;
    private int idActualizar;

    public FrmServicios() {
        initComponents();
        this.CONTROL = new ServicioControl();
        this.ListarNuevamente();
        this.OrdenarTabla();
        this.limpiar();
        this.ListarNuevamente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuServicios = new javax.swing.JPopupMenu();
        MenuItemActualizar = new javax.swing.JMenuItem();
        MenuItemEliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtNombreServicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaprueba = new javax.swing.JTable();

        MenuItemActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PopMenuUpdate.png"))); // NOI18N
        MenuItemActualizar.setText("Actulizar");
        MenuItemActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemActualizarActionPerformed(evt);
            }
        });
        MenuServicios.add(MenuItemActualizar);

        MenuItemEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PorMenuDelete.png"))); // NOI18N
        MenuItemEliminar.setText("Eliminar");
        MenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemEliminarActionPerformed(evt);
            }
        });
        MenuServicios.add(MenuItemEliminar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Módulo de Servicios");

        jLabel1.setText("Nombre de servicio :");

        jLabel3.setText("Caracteristicas : ");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

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

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btnNuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        tablaprueba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaprueba.setComponentPopupMenu(MenuServicios);
        jScrollPane2.setViewportView(tablaprueba);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreServicio)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombreServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (btnRegistrar.getText().equals("Actualizar")) {
            String resp = this.CONTROL.ActualizarServicioControl(idActualizar, txtNombreServicio.getText(), txtArea.getText());
            if (resp.equals("OK")) {
                this.limpiar();
                tablaprueba.setModel(this.CONTROL.listarServicios(""));
                this.mensajeOk("Actualizado correctamente");
                btnRegistrar.setText("Registrar");
            } else {
                this.limpiar();
                tablaprueba.setModel(this.CONTROL.listarServicios(""));
                this.mensajeOk("ERROR correctamente");
                btnRegistrar.setText("Registrar");
            }
        } else {
            String resp = this.CONTROL.InsertarServicioControl(txtNombreServicio.getText(), txtArea.getText());
            if (resp.equals("OK")) {
                this.limpiar();
                tablaprueba.setModel(this.CONTROL.listarServicios(""));
                this.mensajeOk("Registrado correctamente");
            } else {
                this.limpiar();
                tablaprueba.setModel(this.CONTROL.listarServicios(""));
                this.mensajeOk("ERROR correctamente");
            }
        }
        this.ListarNuevamente();

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void MenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemEliminarActionPerformed
        if (tablaprueba.getSelectedRowCount() == 1) {
            String id = String.valueOf(tablaprueba.getValueAt(tablaprueba.getSelectedRow(), 0));
            String resp = this.CONTROL.AnularServicio(Integer.parseInt(id));
            if (resp.equals("OK")) {
                tablaprueba.setModel(this.CONTROL.listarServicios(""));
                this.mensajeOk("Eliminado correctamente");
            } else {
                tablaprueba.setModel(this.CONTROL.listarServicios(""));
                this.mensajeFallida("Error en la Eliminacion");

            }
        }
        this.ListarNuevamente();
    }//GEN-LAST:event_MenuItemEliminarActionPerformed

    private void MenuItemActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemActualizarActionPerformed
        if (tablaprueba.getSelectedRowCount() == 1) {

            idActualizar = Integer.parseInt(String.valueOf(tablaprueba.getValueAt(tablaprueba.getSelectedRow(), 0)));
            String ServicioNombre = String.valueOf(tablaprueba.getValueAt(tablaprueba.getSelectedRow(), 1));
            String ServicioCaracteristicas = String.valueOf(tablaprueba.getValueAt(tablaprueba.getSelectedRow(), 2));

            txtNombreServicio.setText(ServicioNombre);
            txtArea.setText(ServicioCaracteristicas);
            tablaprueba.setModel(this.CONTROL.listarServicios(""));
            btnRegistrar.setText("Actualizar");
            this.ListarNuevamente();
            //JOptionPane.showMessageDialog(null, "id para actualizar : " + idActualizar);
        }
    }//GEN-LAST:event_MenuItemActualizarActionPerformed

    private void limpiar() {
        txtArea.setText("");
  
        txtNombreServicio.setText("");
        btnRegistrar.setText("Registrar");
        this.ListarNuevamente();
    }

    private void mensajeOk(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Aviso del sistema", JOptionPane.INFORMATION_MESSAGE);
    }

    private void mensajeFallida(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Aviso del sistema", JOptionPane.ERROR_MESSAGE);
    }

    private void OrdenarTabla() {
        TableRowSorter orden = new TableRowSorter(tablaprueba.getModel());
        tablaprueba.setRowSorter(orden);
    }

    private void ListarNuevamente() {
        tablaprueba.setModel(this.CONTROL.listarServicios(""));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemActualizar;
    private javax.swing.JMenuItem MenuItemEliminar;
    private javax.swing.JPopupMenu MenuServicios;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaprueba;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtNombreServicio;
    // End of variables declaration//GEN-END:variables
}
