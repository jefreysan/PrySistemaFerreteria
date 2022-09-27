/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.Producto;

import DAO.PresentacionDAO;
import DAO.UnidadMedidaDAO;
import DTO.PresentacionTO;
import DTO.UnidadMedidaTO;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JEFREY
 */
public class PresentacionGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form UnidadMedidaGUI
     */
    PresentacionDAO objPresentacionDAO = new PresentacionDAO();
    PresentacionTO objPresentacionTO = new PresentacionTO();

    UnidadMedidaDAO objUnidadMedidaDAO = new UnidadMedidaDAO();
    UnidadMedidaTO objUnidadMedidaTO = new UnidadMedidaTO();
    boolean sw;
    DefaultTableModel objDtm;
    ResultSet rsUnidadMedida, rsPresentacion;
    int xidunidadmedida, xidpresentacion;
    String mensaje;

    public PresentacionGUI() {
        initComponents();
        objDtm = (DefaultTableModel) jtblRegistroPresentacion.getModel();
        ((DefaultTableCellRenderer) jtblRegistroPresentacion.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
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
        jLabelRegistroPresentacion = new javax.swing.JLabel();
        jPanelDatosPresentacion = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelUnidadMedida = new javax.swing.JLabel();
        jtxtCodigoPresentacion = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabelPresentacion = new javax.swing.JLabel();
        jLabelValor = new javax.swing.JLabel();
        jtxtDescripcionPresentacion = new javax.swing.JTextField();
        jLabelDescripcionPresentacion = new javax.swing.JLabel();
        jtxtValor = new javax.swing.JTextField();
        jcomboxUnidadMedida = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroPresentacion = new javax.swing.JTable();
        jPanelBuscar = new javax.swing.JPanel();
        jLabelBuscarPresentacion = new javax.swing.JLabel();
        jtxtBuscarPresentacion = new javax.swing.JTextField();

        jPanelRegistro.setBackground(new java.awt.Color(153, 153, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelRegistroPresentacion.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabelRegistroPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistroPresentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistroPresentacion.setText("REGISTRO PRESENTACION DE PRODUCTO");
        jLabelRegistroPresentacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRegistroPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRegistroPresentacion)
                .addGap(5, 5, 5))
        );

        jPanelDatosPresentacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDatosPresentacion.setOpaque(false);

        jLabelCodigo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCodigo.setText("CODIGO:");

        jLabelUnidadMedida.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelUnidadMedida.setText("UDM:");

        jtxtCodigoPresentacion.setEditable(false);
        jtxtCodigoPresentacion.setBackground(new java.awt.Color(204, 204, 204));
        jtxtCodigoPresentacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCodigoPresentacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodigoPresentacionKeyTyped(evt);
            }
        });

        jPanelBotones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBotones.setOpaque(false);

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

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(10, 10, 10))
        );

        jPanelDatos.setBackground(new java.awt.Color(153, 153, 255));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelPresentacion.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabelPresentacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPresentacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPresentacion.setText("DATOS DE PRESENTACION DE PRODUCTO");
        jLabelPresentacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelPresentacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelPresentacion)
                .addGap(5, 5, 5))
        );

        jLabelValor.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelValor.setText("VALOR:");

        jtxtDescripcionPresentacion.setEditable(false);
        jtxtDescripcionPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDescripcionPresentacionActionPerformed(evt);
            }
        });
        jtxtDescripcionPresentacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDescripcionPresentacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDescripcionPresentacionKeyTyped(evt);
            }
        });

        jLabelDescripcionPresentacion.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelDescripcionPresentacion.setText("DESCRIPCION DE PRESENTACION:");

        jtxtValor.setEditable(false);
        jtxtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtValorActionPerformed(evt);
            }
        });
        jtxtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtValorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtValorKeyTyped(evt);
            }
        });

        jcomboxUnidadMedida.setEnabled(false);
        jcomboxUnidadMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboxUnidadMedidaActionPerformed(evt);
            }
        });
        jcomboxUnidadMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcomboxUnidadMedidaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosPresentacionLayout = new javax.swing.GroupLayout(jPanelDatosPresentacion);
        jPanelDatosPresentacion.setLayout(jPanelDatosPresentacionLayout);
        jPanelDatosPresentacionLayout.setHorizontalGroup(
            jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDatosPresentacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtDescripcionPresentacion)
                    .addGroup(jPanelDatosPresentacionLayout.createSequentialGroup()
                        .addComponent(jLabelDescripcionPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxtValor)
                    .addComponent(jLabelValor, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosPresentacionLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelDatosPresentacionLayout.createSequentialGroup()
                        .addComponent(jLabelCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(jtxtCodigoPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUnidadMedida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboxUnidadMedida, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanelDatosPresentacionLayout.setVerticalGroup(
            jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosPresentacionLayout.createSequentialGroup()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jtxtCodigoPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnidadMedida)
                    .addComponent(jcomboxUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescripcionPresentacion)
                    .addComponent(jLabelValor))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDescripcionPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jtblRegistroPresentacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "UDM", "PRESENTACION", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistroPresentacion.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jtblRegistroPresentacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistroPresentacionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistroPresentacion);
        if (jtblRegistroPresentacion.getColumnModel().getColumnCount() > 0) {
            jtblRegistroPresentacion.getColumnModel().getColumn(0).setMinWidth(70);
            jtblRegistroPresentacion.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblRegistroPresentacion.getColumnModel().getColumn(1).setMinWidth(150);
            jtblRegistroPresentacion.getColumnModel().getColumn(1).setMaxWidth(150);
            jtblRegistroPresentacion.getColumnModel().getColumn(2).setMinWidth(150);
            jtblRegistroPresentacion.getColumnModel().getColumn(2).setMaxWidth(150);
        }

        jPanelBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBuscar.setOpaque(false);

        jLabelBuscarPresentacion.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscarPresentacion.setText("BUSCAR:");

        jtxtBuscarPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarPresentacionActionPerformed(evt);
            }
        });
        jtxtBuscarPresentacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarPresentacionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarLayout = new javax.swing.GroupLayout(jPanelBuscar);
        jPanelBuscar.setLayout(jPanelBuscarLayout);
        jPanelBuscarLayout.setHorizontalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelBuscarPresentacion)
                .addGap(10, 10, 10)
                .addComponent(jtxtBuscarPresentacion)
                .addGap(10, 10, 10))
        );
        jPanelBuscarLayout.setVerticalGroup(
            jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtBuscarPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscarPresentacion))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelDatosPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanelDatosPresentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoPresentacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoPresentacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoPresentacionKeyTyped

    private void jtxtCodigoPresentacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoPresentacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoPresentacionKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int op = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR?", "REGISTRO DE PRESENTACION PRODUCTO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
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

    private void jtxtBuscarPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarPresentacionActionPerformed

    private void jtxtBuscarPresentacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarPresentacionKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarPresentacion.getText().isEmpty()) {
                rsPresentacion = objPresentacionDAO.buscar(jtxtBuscarPresentacion.getText().trim());
                while (rsPresentacion.next()) {
                    Object registro[] = {rsPresentacion.getInt(1), rsPresentacion.getString(2), rsPresentacion.getString(3), rsPresentacion.getString(4)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jtxtBuscarPresentacionKeyReleased

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarControles(true);
        limpiarControles();
        llenarComboUnidad();
        sw = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (jtxtDescripcionPresentacion.getText().trim().length() == 0 || jtxtValor.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "COMPLETAR CAJA DE TEXTO", "FERRETERIA MICKY", JOptionPane.WARNING_MESSAGE);
            } else {
                obtenerIdUnidadMedida();
                objPresentacionTO.setIdudm(xidunidadmedida);
                objPresentacionTO.setDescrpresent(jtxtDescripcionPresentacion.getText().toUpperCase().trim());
                objPresentacionTO.setCantpresent(Double.parseDouble(jtxtValor.getText().trim()));
                if (sw) {
                    objPresentacionDAO.insert(objPresentacionTO);
                    mensaje = "PRESENTACION REGISTRADO";
                } else {
                    objPresentacionTO.setIdpresentacion(Integer.parseInt(jtxtCodigoPresentacion.getText()));
                    objPresentacionDAO.update(objPresentacionTO);
                    mensaje = "PRESENTACION ACTUALIZADO";
                }
                habilitarControles(false);
                JOptionPane.showMessageDialog(null, mensaje, "FERRETERIA MICKY", JOptionPane.INFORMATION_MESSAGE);
                limpiarControles();
                jcomboxUnidadMedida.removeAllItems();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarControles(true);
        llenarComboUnidad();
        sw = false;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtblRegistroPresentacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistroPresentacionMouseClicked
        try {
            xidpresentacion = Integer.parseInt(jtblRegistroPresentacion.getValueAt(jtblRegistroPresentacion.getSelectedRow(), 0).toString());
            rsPresentacion.first();
            do {
                if (xidpresentacion == rsPresentacion.getInt(1)) {
                    jtxtCodigoPresentacion.setText(String.valueOf(rsPresentacion.getInt(1)));
                    jcomboxUnidadMedida.removeAllItems();
                    jcomboxUnidadMedida.addItem(rsPresentacion.getString(2));
                    jtxtDescripcionPresentacion.setText(rsPresentacion.getString(3));
                    jtxtValor.setText(rsPresentacion.getString(4));
                    rsPresentacion.last();
                }
            } while (rsPresentacion.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtblRegistroPresentacionMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarControles(false);
        limpiarControles();
        jcomboxUnidadMedida.removeAllItems();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtxtDescripcionPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDescripcionPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionPresentacionActionPerformed

    private void jtxtDescripcionPresentacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescripcionPresentacionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionPresentacionKeyReleased

    private void jtxtDescripcionPresentacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDescripcionPresentacionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDescripcionPresentacionKeyTyped

    private void jtxtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtValorActionPerformed

    private void jtxtValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtValorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtValorKeyReleased

    private void jtxtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtValorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtValorKeyTyped

    private void jcomboxUnidadMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboxUnidadMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboxUnidadMedidaActionPerformed

    private void jcomboxUnidadMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcomboxUnidadMedidaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboxUnidadMedidaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelBuscarPresentacion;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelDescripcionPresentacion;
    private javax.swing.JLabel jLabelPresentacion;
    private javax.swing.JLabel jLabelRegistroPresentacion;
    private javax.swing.JLabel jLabelUnidadMedida;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelDatosPresentacion;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcomboxUnidadMedida;
    private javax.swing.JTable jtblRegistroPresentacion;
    private javax.swing.JTextField jtxtBuscarPresentacion;
    private javax.swing.JTextField jtxtCodigoPresentacion;
    private javax.swing.JTextField jtxtDescripcionPresentacion;
    private javax.swing.JTextField jtxtValor;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        JTextField[] arrJTexFields = {jtxtDescripcionPresentacion, jtxtValor};
        for (JTextField obJTextField : arrJTexFields) {
            obJTextField.setEditable(b);
        }
        jtxtBuscarPresentacion.setEditable(!b);
        jtxtDescripcionPresentacion.grabFocus();
        btnGuardar.setEnabled(b);
        btnCancelar.setEnabled(b);
        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);
        btnSalir.setEnabled(!b);
        jcomboxUnidadMedida.setEnabled(b);
    }

    private void limpiarControles() {
        limpiarJTable();
        JTextField[] objTextFields = {jtxtCodigoPresentacion, jtxtBuscarPresentacion, jtxtDescripcionPresentacion, jtxtValor};
        for (JTextField objTextField : objTextFields) {
            objTextField.setText(null);
        }
        jcomboxUnidadMedida.removeAllItems();
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void obtenerIdUnidadMedida() {
        try {
            String nombre = jcomboxUnidadMedida.getSelectedItem().toString();
            rsUnidadMedida.first();
            do {
                if (nombre.equals(rsUnidadMedida.getString(2))) {
                    xidunidadmedida = rsUnidadMedida.getInt(1);
                    rsUnidadMedida.last();
                }
            } while (rsUnidadMedida.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void llenarComboUnidad() {
        try {
            rsUnidadMedida = objUnidadMedidaDAO.buscar("%");
            while (rsUnidadMedida.next()) {
                jcomboxUnidadMedida.addItem(rsUnidadMedida.getString(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

}
