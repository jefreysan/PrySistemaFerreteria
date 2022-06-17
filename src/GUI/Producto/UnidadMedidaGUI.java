/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.Producto;

import DAO.UnidadMedidaDAO;
import DTO.UnidadMedidaTO;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEFREY
 */
public class UnidadMedidaGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form UnidadMedidaGUI
     */
    UnidadMedidaDAO objUnidadMedidaDAO = new UnidadMedidaDAO();
    UnidadMedidaTO objUnidadMedidaTO = new UnidadMedidaTO();

    JRootPane rootPane;
    boolean sw;
    DefaultTableModel objDtm;
    ResultSet rsUnidadMedida;
    int xidunidadmedida;
    String mensaje;

    public UnidadMedidaGUI() {
        initComponents();
        setVisible(true);
        setSize(828, 351);
        this.getContentPane().setBackground(Color.white);
        objDtm = (DefaultTableModel) jtblRegistroUDM.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistroUDM = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jtxtDescripcionUDM = new javax.swing.JTextField();
        jLabelDescripcionUDM = new javax.swing.JLabel();
        jtxtCodigoUDM = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroUDM = new javax.swing.JTable();
        jPanelBuscar = new javax.swing.JPanel();
        jLabelBuscarUDM = new javax.swing.JLabel();
        jtxtBuscarUDM = new javax.swing.JTextField();

        jPanelRegistro.setBackground(new java.awt.Color(153, 153, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelRegistroUDM.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabelRegistroUDM.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistroUDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistroUDM.setText("REGISTRO DE UNIDAD DE MEDIDA");
        jLabelRegistroUDM.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRegistroUDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRegistroUDM)
                .addGap(5, 5, 5))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setOpaque(false);

        jLabelCodigo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCodigo.setText("CODIGO:");

        jtxtDescripcionUDM.setEditable(false);
        jtxtDescripcionUDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDescripcionUDMActionPerformed(evt);
            }
        });
        jtxtDescripcionUDM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDescripcionUDMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDescripcionUDMKeyTyped(evt);
            }
        });

        jLabelDescripcionUDM.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelDescripcionUDM.setText("DESCRIPCION UNIDAD MEDIDA:");

        jtxtCodigoUDM.setEditable(false);
        jtxtCodigoUDM.setBackground(new java.awt.Color(204, 204, 204));
        jtxtCodigoUDM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCodigoUDMKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodigoUDMKeyTyped(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);

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

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatos.setBackground(new java.awt.Color(153, 153, 255));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATOS DE UNIDAD DE MEDIDA");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescripcionUDM)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtxtCodigoUDM, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtxtDescripcionUDM))
                .addGap(10, 10, 10))
            .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jtxtCodigoUDM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabelDescripcionUDM)
                .addGap(10, 10, 10)
                .addComponent(jtxtDescripcionUDM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jtblRegistroUDM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "UDM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistroUDM.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jtblRegistroUDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistroUDMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistroUDM);
        if (jtblRegistroUDM.getColumnModel().getColumnCount() > 0) {
            jtblRegistroUDM.getColumnModel().getColumn(0).setMinWidth(70);
            jtblRegistroUDM.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblRegistroUDM.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanelBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBuscar.setOpaque(false);

        jLabelBuscarUDM.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscarUDM.setText("BUSCAR:");

        jtxtBuscarUDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarUDMActionPerformed(evt);
            }
        });
        jtxtBuscarUDM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarUDMKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelBuscarUDM)
                .addGap(10, 10, 10)
                .addComponent(jtxtBuscarUDM)
                .addGap(10, 10, 10))
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBuscarUDM, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscarUDM))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(jPanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoUDMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoUDMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoUDMKeyTyped

    private void jtxtCodigoUDMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoUDMKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoUDMKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int op = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR?", "REGISTRO UNIDAD DE MEDIDA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                objUnidadMedidaTO.setIdunidadmedida(xidunidadmedida);
                objUnidadMedidaDAO.delete(objUnidadMedidaTO);
                limpiarControles();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtxtDescripcionUDMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescripcionUDMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionUDMKeyTyped

    private void jtxtDescripcionUDMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescripcionUDMKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionUDMKeyReleased

    private void jtxtDescripcionUDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDescripcionUDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionUDMActionPerformed

    private void jtxtBuscarUDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarUDMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarUDMActionPerformed

    private void jtxtBuscarUDMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarUDMKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarUDM.getText().isEmpty()) {
                rsUnidadMedida = objUnidadMedidaDAO.buscar(jtxtBuscarUDM.getText().trim());
                while (rsUnidadMedida.next()) {
                    Object registro[] = {rsUnidadMedida.getInt(1), rsUnidadMedida.getString(2)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jtxtBuscarUDMKeyReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarControles(true);
        limpiarControles();
        sw = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (jtxtDescripcionUDM.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "COMPLETAR CAJA DE TEXTO", "FERRETERIA MICKY", JOptionPane.WARNING_MESSAGE);
            } else {
                objUnidadMedidaTO.setDescrunid(jtxtDescripcionUDM.getText().toUpperCase().trim());
                if (sw) {
                    objUnidadMedidaDAO.insert(objUnidadMedidaTO);
                    mensaje = "UNIDAD REGISTRADO";
                } else {
                    objUnidadMedidaTO.setIdunidadmedida(Integer.parseInt(jtxtCodigoUDM.getText()));
                    objUnidadMedidaDAO.update(objUnidadMedidaTO);
                    mensaje = "UNIDAD ACTUALIZADO";
                }
                habilitarControles(false);
                JOptionPane.showMessageDialog(null, mensaje, "FERRETERIA MICKY", JOptionPane.INFORMATION_MESSAGE);
                limpiarControles();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarControles(true);
        sw = false;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtblRegistroUDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistroUDMMouseClicked
        try {
            xidunidadmedida = Integer.parseInt(jtblRegistroUDM.getValueAt(jtblRegistroUDM.getSelectedRow(), 0).toString());
            rsUnidadMedida.first();
            do {
                if (xidunidadmedida == rsUnidadMedida.getInt(1)) {
                    jtxtCodigoUDM.setText(String.valueOf(rsUnidadMedida.getInt(1)));
                    jtxtDescripcionUDM.setText(rsUnidadMedida.getString(2));
                    rsUnidadMedida.last();
                }
            } while (rsUnidadMedida.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jtblRegistroUDMMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBuscarUDM;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescripcionUDM;
    private javax.swing.JLabel jLabelRegistroUDM;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtblRegistroUDM;
    private javax.swing.JTextField jtxtBuscarUDM;
    private javax.swing.JTextField jtxtCodigoUDM;
    private javax.swing.JTextField jtxtDescripcionUDM;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        JTextField[] arrJTexFields = {jtxtDescripcionUDM};
        for (JTextField obJTextField : arrJTexFields) {
            obJTextField.setEditable(b);
        }
        jtxtBuscarUDM.setEditable(!b);
        jtxtDescripcionUDM.grabFocus();
        btnGuardar.setEnabled(b);
        btnCancelar.setEnabled(b);
        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);
        btnSalir.setEnabled(!b);
    }

    private void limpiarControles() {
        limpiarJTable();
        JTextField[] objTextFields = {jtxtCodigoUDM, jtxtBuscarUDM, jtxtDescripcionUDM};
        for (JTextField objTextField : objTextFields) {
            objTextField.setText(null);
        }
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }

    }
}