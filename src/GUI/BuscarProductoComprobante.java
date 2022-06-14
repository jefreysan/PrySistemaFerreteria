/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import DAO.ProductoDAO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEFREY
 */
public class BuscarProductoComprobante extends javax.swing.JInternalFrame {

    DefaultTableModel objDtm;
    ResultSet rsProducto;
    JRootPane rootPane;
    ProductoDAO objProductComprobanteDAO = new ProductoDAO();

    public BuscarProductoComprobante() {
        initComponents();
        objDtm = (DefaultTableModel) jtblBuscarProductoComprobante.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblBuscarProductoComprobante = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtxtBuscarProducto = new javax.swing.JTextField();
        jbtnAgregarFactura = new javax.swing.JButton();

        jtblBuscarProductoComprobante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "DESCRIPCION", "STOCK", "PVENTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblBuscarProductoComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtblBuscarProductoComprobanteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtblBuscarProductoComprobante);
        if (jtblBuscarProductoComprobante.getColumnModel().getColumnCount() > 0) {
            jtblBuscarProductoComprobante.getColumnModel().getColumn(0).setMinWidth(70);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(1).setMinWidth(350);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(1).setPreferredWidth(350);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(1).setMaxWidth(350);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(2).setMinWidth(70);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(2).setPreferredWidth(70);
            jtblBuscarProductoComprobante.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BUSCAR PRODUCTO");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(4, 4, 4))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setText("PRODUCTO:");

        jtxtBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarProductoActionPerformed(evt);
            }
        });
        jtxtBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarProductoKeyReleased(evt);
            }
        });

        jbtnAgregarFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/agregar_buscar.png"))); // NOI18N
        jbtnAgregarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAgregarFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxtBuscarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnAgregarFactura)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAgregarFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarProductoActionPerformed

    private void jtxtBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarProductoKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarProducto.getText().isEmpty()) {
                rsProducto = objProductComprobanteDAO.buscar(jtxtBuscarProducto.getText().trim());
                while (rsProducto.next()) {
                    Object registro[] = {rsProducto.getInt(1), rsProducto.getString(4), rsProducto.getInt(7), rsProducto.getDouble(6)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jtxtBuscarProductoKeyReleased

    private void jtblBuscarProductoComprobanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtblBuscarProductoComprobanteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblBuscarProductoComprobanteKeyReleased

    private void jbtnAgregarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAgregarFacturaActionPerformed
        try {
            ComprobanteGUI.jtxtcodigoProducto.setText(jtblBuscarProductoComprobante.getValueAt(jtblBuscarProductoComprobante.getSelectedRow(), 0).toString());
            ComprobanteGUI.jtxtnombreProducto.setText(jtblBuscarProductoComprobante.getValueAt(jtblBuscarProductoComprobante.getSelectedRow(), 1).toString());
            ComprobanteGUI.jtxtStock.setText(jtblBuscarProductoComprobante.getValueAt(jtblBuscarProductoComprobante.getSelectedRow(), 2).toString());
            ComprobanteGUI.jtxtPrecioProducto.setText(jtblBuscarProductoComprobante.getValueAt(jtblBuscarProductoComprobante.getSelectedRow(), 3).toString());
            ComprobanteGUI.jtxtcantidad.grabFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jbtnAgregarFacturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAgregarFactura;
    private javax.swing.JTable jtblBuscarProductoComprobante;
    private javax.swing.JTextField jtxtBuscarProducto;
    // End of variables declaration//GEN-END:variables

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

}