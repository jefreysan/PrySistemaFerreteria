/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import DAO.CreditoDAO;
import DAO.DetalleCreditoDAO;
import DAO.DetalleEntradaDAO;
import DAO.EntradaDAO;
import DTO.DetalleCreditoTO;
import Library.ValidarClass;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEFREY
 */
public class CreditoClienteGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarProductoGUI
     */
    EntradaDAO objEntradaDAO = new EntradaDAO();
    DetalleEntradaDAO objDetalleEntradaDAO = new DetalleEntradaDAO();
    CreditoDAO objCreditoDAO = new CreditoDAO();
    DetalleCreditoDAO objDetalleCreditoDAO = new DetalleCreditoDAO();

    JRootPane rootPane;
    ResultSet rsTipoPago, rsCredito;

    boolean sw;
    int xidcliente, xidtipopago, xidcredito;
    static double total;

    static double xmontopagar, xtotaldeuda, xdeudaactual;
    ValidarClass objValidarClass = new ValidarClass();
    DefaultTableModel objDtm;

    public CreditoClienteGUI() {
        initComponents();
        setVisible(true);
        setSize(916, 528);
        objDtm = (DefaultTableModel) jtblCreditoCliente.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblCreditoCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jlabelnombreProveedor1 = new javax.swing.JLabel();
        jlabelnombreProveedor = new javax.swing.JLabel();
        btnBuscarCredito = new javax.swing.JButton();
        jtxtcodigoCliente = new javax.swing.JTextField();
        btnbuscarCliente = new javax.swing.JButton();
        jtxtnombreCliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jlabelnombreProveedor2 = new javax.swing.JLabel();
        jtxtTotalDeuda = new javax.swing.JTextField();
        jlabelnombreProveedor3 = new javax.swing.JLabel();
        jtxtabonoPagar = new javax.swing.JTextField();
        jlabelnombreProveedor4 = new javax.swing.JLabel();
        jtxtDeudaActual = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jtxtTotalGeneral = new javax.swing.JTextField();
        jlabelnombreProveedor6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelTitulo.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO DE PAGOS-CLIENTES");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitulo)
                    .addComponent(jButton1))
                .addGap(5, 5, 5))
        );

        jtblCreditoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "FECHA", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblCreditoCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblCreditoClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblCreditoCliente);
        if (jtblCreditoCliente.getColumnModel().getColumnCount() > 0) {
            jtblCreditoCliente.getColumnModel().getColumn(0).setResizable(false);
            jtblCreditoCliente.getColumnModel().getColumn(1).setResizable(false);
            jtblCreditoCliente.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlabelnombreProveedor1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelnombreProveedor1.setText("BUSCAR CLIENTE:");

        jlabelnombreProveedor.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelnombreProveedor.setText("CODIGO:");

        btnBuscarCredito.setText("ENVIAR");
        btnBuscarCredito.setEnabled(false);
        btnBuscarCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCreditoActionPerformed(evt);
            }
        });

        jtxtcodigoCliente.setEditable(false);
        jtxtcodigoCliente.setBackground(new java.awt.Color(204, 204, 204));
        jtxtcodigoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtcodigoClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtcodigoClienteKeyTyped(evt);
            }
        });

        btnbuscarCliente.setText("BUSCAR");
        btnbuscarCliente.setEnabled(false);
        btnbuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarClienteActionPerformed(evt);
            }
        });

        jtxtnombreCliente.setEditable(false);
        jtxtnombreCliente.setBackground(new java.awt.Color(204, 204, 204));
        jtxtnombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombreClienteActionPerformed(evt);
            }
        });
        jtxtnombreCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtnombreClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtnombreClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlabelnombreProveedor)
                    .addComponent(jlabelnombreProveedor1)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jtxtcodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnbuscarCliente))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnBuscarCredito)
                        .addComponent(jtxtnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabelnombreProveedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtcodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelnombreProveedor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtnombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnBuscarCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlabelnombreProveedor2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelnombreProveedor2.setText("TOTAL DEUDA:");

        jtxtTotalDeuda.setEditable(false);
        jtxtTotalDeuda.setBackground(new java.awt.Color(204, 204, 204));
        jtxtTotalDeuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalDeudaActionPerformed(evt);
            }
        });
        jtxtTotalDeuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtTotalDeudaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtTotalDeudaKeyTyped(evt);
            }
        });

        jlabelnombreProveedor3.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelnombreProveedor3.setText("ABONAR:");

        jtxtabonoPagar.setEditable(false);
        jtxtabonoPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtabonoPagarActionPerformed(evt);
            }
        });
        jtxtabonoPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtabonoPagarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtabonoPagarKeyTyped(evt);
            }
        });

        jlabelnombreProveedor4.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelnombreProveedor4.setText("DEUDA ACTUAL:");

        jtxtDeudaActual.setEditable(false);
        jtxtDeudaActual.setBackground(new java.awt.Color(255, 255, 102));
        jtxtDeudaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDeudaActualActionPerformed(evt);
            }
        });
        jtxtDeudaActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDeudaActualKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDeudaActualKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jlabelnombreProveedor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtTotalDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jlabelnombreProveedor4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtDeudaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jlabelnombreProveedor3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtabonoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTotalDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelnombreProveedor2))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelnombreProveedor3)
                    .addComponent(jtxtabonoPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDeudaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelnombreProveedor4))
                .addGap(10, 10, 10))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtxtTotalGeneral.setEditable(false);
        jtxtTotalGeneral.setBackground(new java.awt.Color(204, 204, 204));
        jtxtTotalGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTotalGeneralActionPerformed(evt);
            }
        });
        jtxtTotalGeneral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtTotalGeneralKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtTotalGeneralKeyTyped(evt);
            }
        });

        jlabelnombreProveedor6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelnombreProveedor6.setText("TOTAL GENERAL:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlabelnombreProveedor6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTotalGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelnombreProveedor6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            /*CREDITO*/
            xidcredito = objCreditoDAO.obternerIDCredito();
            /*DETALLE CREDITO*/
            DetalleCreditoTO objDetalleCreditoTO = new DetalleCreditoTO();
            objDetalleCreditoTO.setIdcredito(xidcredito);
            objDetalleCreditoTO.setAbonodet(Double.parseDouble(jtxtabonoPagar.getText().trim()));
            objDetalleCreditoDAO.insert(objDetalleCreditoTO);
            habilitarControles(false);
            JOptionPane.showMessageDialog(rootPane, "CREDITO GRABADO");
            limpiarControles();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

//    public void agregarProducto() {
//        if (importe == 0) {
//            JOptionPane.showMessageDialog(rootPane, "REGISTRAR LOS PRODUCTOS");
//        } else {
//            sw = false;
//            int cont = 0;
//            int idproducto = Integer.parseInt(jtxtcodigoProducto.getText());
//            Object registro[] = {jtxtcodigoProducto.getText(), jtxtnombreProducto.getText(), precio,
//                cantidad, importe};
//            if (objDtm.getRowCount() == 0) {
//                objDtm.addRow(registro);
//                limpiarProducto();
//            } else {
//                while (cont < objDtm.getRowCount()) {
//                    if (idproducto == Integer.parseInt(objDtm.getValueAt(cont, 0).toString())) {
//                        JOptionPane.showMessageDialog(rootPane, "REGISTRO YA EXISTE");
//                        sw = true;
//                    }
//                    cont++;
//                }
//                if (!sw) {
//                    objDtm.addRow(registro);
//                }
//            }
//            limpiarProducto();
//        }
//        calcularTotales();
//    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarControles(true);
        limpiarControles();
        sw = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jtxtcodigoClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoClienteKeyReleased

    private void jtxtcodigoClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoClienteKeyTyped

    private void jtxtTotalDeudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalDeudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalDeudaActionPerformed

    private void jtxtTotalDeudaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTotalDeudaKeyReleased

    }//GEN-LAST:event_jtxtTotalDeudaKeyReleased

    private void jtxtTotalDeudaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTotalDeudaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalDeudaKeyTyped

    private void btnbuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarClienteActionPerformed
        BuscarClienteCreditoGUI objBuscarClienteCreditoGUI = new BuscarClienteCreditoGUI();
        MenuGUI.desktopPane.add(objBuscarClienteCreditoGUI);
        objBuscarClienteCreditoGUI.setVisible(true);
        objBuscarClienteCreditoGUI.setLocation(400, 100);
        objBuscarClienteCreditoGUI.setSize(568, 341);
        objBuscarClienteCreditoGUI.toFront();
    }//GEN-LAST:event_btnbuscarClienteActionPerformed

    private void jtblCreditoClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblCreditoClienteMouseClicked
        try {
            xidcredito = Integer.parseInt(jtblCreditoCliente.getValueAt(jtblCreditoCliente.getSelectedRow(), 0).toString());
            rsCredito.first();
            do {
                if (xidcredito == rsCredito.getInt(1)) {
                                        jtxtTotalDeuda.setText(rsCredito.getString(4));
                    rsCredito.last();
                }
            } while (rsCredito.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jtblCreditoClienteMouseClicked

    private void btnBuscarCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCreditoActionPerformed
        try {
            limpiarJTable();
            xidcliente = Integer.parseInt(jtxtcodigoCliente.getText().trim());
            rsCredito = objCreditoDAO.buscarCreditoCliente(xidcliente, xidtipopago);
            while (rsCredito.next()) {
                Object[] registro = {rsCredito.getInt(1), rsCredito.getString(2), rsCredito.getDouble(4)};
                objDtm.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        calcularTotalGeneral();
    }//GEN-LAST:event_btnBuscarCreditoActionPerformed

    private void jtxtnombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreClienteActionPerformed

    private void jtxtnombreClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombreClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreClienteKeyReleased

    private void jtxtnombreClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombreClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreClienteKeyTyped

    private void jtxtabonoPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtabonoPagarActionPerformed
        xtotaldeuda = Double.parseDouble(jtxtTotalDeuda.getText().trim());
        xmontopagar = Double.parseDouble(jtxtabonoPagar.getText().trim());
        xdeudaactual = xtotaldeuda - xmontopagar;
        jtxtDeudaActual.setText(String.format("%.2f", xdeudaactual));
    }//GEN-LAST:event_jtxtabonoPagarActionPerformed

    private void jtxtabonoPagarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtabonoPagarKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtabonoPagarKeyReleased

    private void jtxtabonoPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtabonoPagarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtabonoPagarKeyTyped

    private void jtxtDeudaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDeudaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDeudaActualActionPerformed

    private void jtxtDeudaActualKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDeudaActualKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDeudaActualKeyReleased

    private void jtxtDeudaActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDeudaActualKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDeudaActualKeyTyped

    private void jtxtTotalGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTotalGeneralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalGeneralActionPerformed

    private void jtxtTotalGeneralKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTotalGeneralKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalGeneralKeyReleased

    private void jtxtTotalGeneralKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtTotalGeneralKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTotalGeneralKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCredito;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnbuscarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabelnombreProveedor;
    private javax.swing.JLabel jlabelnombreProveedor1;
    private javax.swing.JLabel jlabelnombreProveedor2;
    private javax.swing.JLabel jlabelnombreProveedor3;
    private javax.swing.JLabel jlabelnombreProveedor4;
    private javax.swing.JLabel jlabelnombreProveedor6;
    private javax.swing.JTable jtblCreditoCliente;
    public static javax.swing.JTextField jtxtDeudaActual;
    public static javax.swing.JTextField jtxtTotalDeuda;
    public static javax.swing.JTextField jtxtTotalGeneral;
    public static javax.swing.JTextField jtxtabonoPagar;
    public static javax.swing.JTextField jtxtcodigoCliente;
    public static javax.swing.JTextField jtxtnombreCliente;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        JTextField[] arrJTexFields = {jtxtabonoPagar,jtxtnombreCliente};
        for (JTextField obJTextField : arrJTexFields) {
            obJTextField.setEditable(b);
        }
        btnGuardar.setEnabled(b);
        btnCancelar.setEnabled(b);
        btnNuevo.setEnabled(!b);
        btnbuscarCliente.setEnabled(b);
        btnBuscarCredito.setEnabled(b);
//        btnEliminarProducto.setEnabled(b);
    }

    private void limpiarControles() {
        limpiarJTable();
        JTextField[] objTextFields = {jtxtcodigoCliente, jtxtTotalDeuda};
        for (JTextField objTextField : objTextFields) {
            objTextField.setText(null);
        }

    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }
    private void calcularTotalGeneral() {
        total = 0;
        int filas = objDtm.getRowCount();
        int cont = 0;
        while (cont < filas) {
            total = total + Double.parseDouble(objDtm.getValueAt(cont, 2).toString());
            cont++;
        }
        jtxtTotalGeneral.setText(String.format("%.2f", total));
    }
}
