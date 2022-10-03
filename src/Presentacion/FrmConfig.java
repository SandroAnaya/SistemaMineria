
package Presentacion;


public class FrmConfig extends javax.swing.JInternalFrame {

  
    public FrmConfig() {
        initComponents();
        this.setTitle("Modulo de Configuracion");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Módulo de Configuración");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconReport.png"))); // NOI18N

        jPanel1.setLayout(null);

        jLabel1.setText("Nombre :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 70, 16);

        jLabel2.setText("Apellidos :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 40, 70, 16);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 10, 240, 22);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(90, 40, 240, 22);

        jLabel3.setText("RUC :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 29, 16);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(90, 70, 240, 22);

        jLabel4.setText("Dni : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 100, 27, 16);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(90, 100, 240, 22);

        jButton1.setText("Restaurar Datos ");
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 160, 240, 22);

        jLabel5.setText("Correo :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 130, 70, 16);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(90, 130, 240, 22);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
