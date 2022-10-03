package Presentacion;

import Datos.VariablesGlobales;

import Negocio.DashboardControl;

public class FrmDashboard extends javax.swing.JFrame {

    private final DashboardControl CONTROL;

    public FrmDashboard() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.CONTROL = new DashboardControl();
        this.actualizarDashboard();
        this.setTitle("Modulo de Dashboard");
        lblsaludo.setText("Hola, " + VariablesGlobales.nombre + " " + VariablesGlobales.apellidos + ", Bienvenido al sistema");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        lblTotaldePedidos = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        lblTotaldeServicios = new javax.swing.JLabel();
        lblsaludo = new javax.swing.JLabel();
        lblSession = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        lblTotaldeUsuarios = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblTotaldeClientes = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        MenuItemConfigUser = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MenuItemExit = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        cutMenuItem1 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        MenuItemUsuario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        contentMenuItem4 = new javax.swing.JMenuItem();
        helpMenu1 = new javax.swing.JMenu();
        MenuItemInventario = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        contentMenuItem5 = new javax.swing.JMenuItem();
        helpMenu2 = new javax.swing.JMenu();
        MenuItemServicio = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        contentMenuItem6 = new javax.swing.JMenuItem();
        helpMenu3 = new javax.swing.JMenu();
        MenuItemPedido = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        contentMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1300, 506));

        escritorio.setToolTipText("Menu Principal");

        jLabel6.setText("Pedidos Realizados");

        jButton2.setText("Visualizar Reporte");

        lblTotaldePedidos.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(lblTotaldePedidos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotaldePedidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        escritorio.add(jPanel3);
        jPanel3.setBounds(200, 220, 180, 110);

        jLabel9.setText("Servicios Disponibles");

        jButton3.setText("Visualizar Reporte");

        lblTotaldeServicios.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(lblTotaldeServicios)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotaldeServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        escritorio.add(jPanel4);
        jPanel4.setBounds(20, 220, 170, 110);

        lblsaludo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblsaludo.setForeground(new java.awt.Color(255, 255, 255));
        lblsaludo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblsaludo.setText("Su ultima Sesion fue el dia /");
        lblsaludo.setToolTipText("");
        escritorio.add(lblsaludo);
        lblsaludo.setBounds(20, 10, 490, 30);

        lblSession.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSession.setForeground(new java.awt.Color(255, 255, 255));
        lblSession.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSession.setText("Su ultima Sesion fue el dia /");
        lblSession.setToolTipText("");
        escritorio.add(lblSession);
        lblSession.setBounds(50, 40, 490, 30);

        jLabel12.setText("Usuarios Registrados");

        jButton4.setText("Visualizar Reporte");

        lblTotaldeUsuarios.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(lblTotaldeUsuarios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(lblTotaldeUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        escritorio.add(jPanel5);
        jPanel5.setBounds(200, 90, 178, 116);

        jLabel1.setText("Clientes Registrados");

        jButton1.setText("Visualizar Reporte");

        lblTotaldeClientes.setText("15");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblTotaldeClientes))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTotaldeClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        escritorio.add(jPanel1);
        jPanel1.setBounds(20, 90, 170, 116);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconInicio.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        MenuItemConfigUser.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemConfigUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/iconConfig.png"))); // NOI18N
        MenuItemConfigUser.setMnemonic('o');
        MenuItemConfigUser.setText("Configurar Usuario");
        MenuItemConfigUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemConfigUserActionPerformed(evt);
            }
        });
        fileMenu.add(MenuItemConfigUser);
        fileMenu.add(jSeparator2);

        MenuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/iconExit.png"))); // NOI18N
        MenuItemExit.setMnemonic('s');
        MenuItemExit.setText("Cerrar Sesion");
        MenuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemExitActionPerformed(evt);
            }
        });
        fileMenu.add(MenuItemExit);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/iconClients.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Clientes");

        MenuItemCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconCustomer.png"))); // NOI18N
        MenuItemCliente.setMnemonic('t');
        MenuItemCliente.setText("Módulo de clientes");
        MenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemClienteActionPerformed(evt);
            }
        });
        editMenu.add(MenuItemCliente);
        editMenu.add(jSeparator1);

        cutMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        cutMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconReport.png"))); // NOI18N
        cutMenuItem1.setMnemonic('t');
        cutMenuItem1.setText("Reporte de Clientes");
        editMenu.add(cutMenuItem1);

        menuBar.add(editMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/iconUsers.png"))); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Usuarios");

        MenuItemUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemUsuario.setMnemonic('c');
        MenuItemUsuario.setText("Módulo de usuarios");
        MenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemUsuarioActionPerformed(evt);
            }
        });
        helpMenu.add(MenuItemUsuario);
        helpMenu.add(jSeparator3);

        contentMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconReport.png"))); // NOI18N
        contentMenuItem4.setMnemonic('c');
        contentMenuItem4.setText("Reporte de Usuarios");
        helpMenu.add(contentMenuItem4);

        menuBar.add(helpMenu);

        helpMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconInventory.png"))); // NOI18N
        helpMenu1.setMnemonic('h');
        helpMenu1.setText("Inventario");

        MenuItemInventario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemInventario.setMnemonic('c');
        MenuItemInventario.setText("Módulo de inventario");
        MenuItemInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemInventarioActionPerformed(evt);
            }
        });
        helpMenu1.add(MenuItemInventario);
        helpMenu1.add(jSeparator4);

        contentMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconReport.png"))); // NOI18N
        contentMenuItem5.setMnemonic('c');
        contentMenuItem5.setText("Reporte del inventario");
        helpMenu1.add(contentMenuItem5);

        menuBar.add(helpMenu1);

        helpMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/iconServices.png"))); // NOI18N
        helpMenu2.setMnemonic('h');
        helpMenu2.setText("Servicios");

        MenuItemServicio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemServicio.setMnemonic('c');
        MenuItemServicio.setText("Modulo de Servicios");
        MenuItemServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemServicioActionPerformed(evt);
            }
        });
        helpMenu2.add(MenuItemServicio);
        helpMenu2.add(jSeparator5);

        contentMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconReport.png"))); // NOI18N
        contentMenuItem6.setMnemonic('c');
        contentMenuItem6.setText("Reporte de Servicios");
        helpMenu2.add(contentMenuItem6);

        menuBar.add(helpMenu2);

        helpMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/iconPedidos.png"))); // NOI18N
        helpMenu3.setMnemonic('h');
        helpMenu3.setText("Pedidos");

        MenuItemPedido.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MenuItemPedido.setMnemonic('c');
        MenuItemPedido.setText("Módulo de pedidos");
        MenuItemPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPedidoActionPerformed(evt);
            }
        });
        helpMenu3.add(MenuItemPedido);
        helpMenu3.add(jSeparator6);

        contentMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        contentMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconMenu/IconReport.png"))); // NOI18N
        contentMenuItem7.setMnemonic('c');
        contentMenuItem7.setText("Reporte de pedidos");
        helpMenu3.add(contentMenuItem7);

        menuBar.add(helpMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemConfigUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemConfigUserActionPerformed

    }//GEN-LAST:event_MenuItemConfigUserActionPerformed

    private void MenuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemExitActionPerformed
        this.dispose();
        FrmLogin frmlogin = new FrmLogin();
        frmlogin.setVisible(true);
    }//GEN-LAST:event_MenuItemExitActionPerformed

    private void MenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemClienteActionPerformed
        FrmClientes frm1 = new FrmClientes();
        escritorio.add(frm1);
        frm1.setVisible(true);
    }//GEN-LAST:event_MenuItemClienteActionPerformed

    private void MenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemUsuarioActionPerformed
        FrmUsuarios frm2 = new FrmUsuarios();
        escritorio.add(frm2);
        frm2.setVisible(true);
    }//GEN-LAST:event_MenuItemUsuarioActionPerformed

    private void MenuItemInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemInventarioActionPerformed
        FrmInventario frm3 = new FrmInventario();
        escritorio.add(frm3);
        frm3.setVisible(true);
    }//GEN-LAST:event_MenuItemInventarioActionPerformed

    private void MenuItemServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemServicioActionPerformed
        FrmServicios frm4 = new FrmServicios();
        escritorio.add(frm4);
        frm4.setVisible(true);
    }//GEN-LAST:event_MenuItemServicioActionPerformed

    private void MenuItemPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPedidoActionPerformed
        FrmPedidos frm5 = new FrmPedidos();
        escritorio.add(frm5);
        frm5.setVisible(true);
    }//GEN-LAST:event_MenuItemPedidoActionPerformed

    private void actualizarDashboard() {
        lblTotaldeClientes.setText("" + this.CONTROL.TotalDeClientes());
        lblTotaldeUsuarios.setText("" + this.CONTROL.TotalDeUsuarios());
        lblTotaldeServicios.setText("" + this.CONTROL.TotalDeServicios());
        lblTotaldePedidos.setText("" + this.CONTROL.TotalDePedidos());
    }

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
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemConfigUser;
    private javax.swing.JMenuItem MenuItemExit;
    private javax.swing.JMenuItem MenuItemInventario;
    private javax.swing.JMenuItem MenuItemPedido;
    private javax.swing.JMenuItem MenuItemServicio;
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JMenuItem contentMenuItem4;
    private javax.swing.JMenuItem contentMenuItem5;
    private javax.swing.JMenuItem contentMenuItem6;
    private javax.swing.JMenuItem contentMenuItem7;
    private javax.swing.JMenuItem cutMenuItem1;
    private javax.swing.JMenu editMenu;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JMenu helpMenu2;
    private javax.swing.JMenu helpMenu3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JLabel lblSession;
    private javax.swing.JLabel lblTotaldeClientes;
    private javax.swing.JLabel lblTotaldePedidos;
    private javax.swing.JLabel lblTotaldeServicios;
    private javax.swing.JLabel lblTotaldeUsuarios;
    private javax.swing.JLabel lblsaludo;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
