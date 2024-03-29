/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI.Reportes;

import Conexion.ConMySql;
import DAO.EntradaDAO;
import DTO.EntradaTO;
import GUI.MenuGUI;
import Library.Numero_Letras;
import java.awt.Color;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author JEFREY
 */
public class REPEntrada extends javax.swing.JInternalFrame {

    /**
     * Creates new form REPEntrada
     */
    boolean sw;
    DefaultTableModel objDtm;
    ResultSet rsEntrada, rsTipoPago;
    int xidentrada, xidtipopago;
    String op, data;
    EntradaDAO objEntradaDAO = new EntradaDAO();
    Numero_Letras objNumeroLetras = new Numero_Letras();

    SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    ButtonGroup objButtonGroup = new ButtonGroup();

    public REPEntrada() {
        initComponents();
        setVisible(true);
        setSize(939, 529);
        this.getContentPane().setBackground(Color.white);
        objDtm = (DefaultTableModel) jtblReporteEntrada.getModel();
        objButtonGroup.add(jradContado);
        objButtonGroup.add(jradCredito);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenuEntradas = new javax.swing.JPopupMenu();
        jMenuItemImprimir = new javax.swing.JMenuItem();
        jMenuItemAnular = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jradContado = new javax.swing.JRadioButton();
        jradCredito = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jdateFechaInicio = new com.toedter.calendar.JDateChooser();
        jdateFechaFin = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblReporteEntrada = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jtxtcodigoProveedor = new javax.swing.JTextField();
        jtxtnombreProveedor = new javax.swing.JTextField();
        jlabelcodigoProducto = new javax.swing.JLabel();
        jlabelnombreProveedor1 = new javax.swing.JLabel();
        btnbuscarProveedor = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btn_BReporteEntrada1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btn_BReporteEntrada = new javax.swing.JButton();
        btnImprimir1 = new javax.swing.JButton();

        jMenuItemImprimir.setText("Imprimir");
        jMenuItemImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImprimirActionPerformed(evt);
            }
        });
        jPopupMenuEntradas.add(jMenuItemImprimir);

        jMenuItemAnular.setText("Anular");
        jMenuItemAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnularActionPerformed(evt);
            }
        });
        jPopupMenuEntradas.add(jMenuItemAnular);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTES DE ENTRADAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(5, 5, 5))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setText("FECHA INICIO:");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel11.setText("FECHA FIN:");

        jradContado.setText("CONTADO");

        jradCredito.setText("CREDITO");
        jradCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradCreditoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel12.setText("TIPO DE PAGO:");

        jdateFechaInicio.setOpaque(false);

        jdateFechaFin.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel11))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jdateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jradContado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jradCredito))
                    .addComponent(jLabel12))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jradCredito, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jradContado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jdateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jdateFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        jtblReporteEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COD", "FECHA", "SERIE", "PROVEEDOR", "ENCARGADO", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblReporteEntrada.setComponentPopupMenu(jPopupMenuEntradas);
        jtblReporteEntrada.setGridColor(new java.awt.Color(51, 51, 255));
        jtblReporteEntrada.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jtblReporteEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblReporteEntradaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblReporteEntrada);
        if (jtblReporteEntrada.getColumnModel().getColumnCount() > 0) {
            jtblReporteEntrada.getColumnModel().getColumn(0).setMinWidth(60);
            jtblReporteEntrada.getColumnModel().getColumn(0).setPreferredWidth(60);
            jtblReporteEntrada.getColumnModel().getColumn(0).setMaxWidth(60);
            jtblReporteEntrada.getColumnModel().getColumn(1).setMinWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(1).setMaxWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(2).setMinWidth(80);
            jtblReporteEntrada.getColumnModel().getColumn(2).setPreferredWidth(80);
            jtblReporteEntrada.getColumnModel().getColumn(2).setMaxWidth(80);
            jtblReporteEntrada.getColumnModel().getColumn(3).setPreferredWidth(300);
            jtblReporteEntrada.getColumnModel().getColumn(4).setPreferredWidth(300);
            jtblReporteEntrada.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setOpaque(false);

        jtxtcodigoProveedor.setEditable(false);
        jtxtcodigoProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jtxtcodigoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtcodigoProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtcodigoProveedorKeyTyped(evt);
            }
        });

        jtxtnombreProveedor.setEditable(false);
        jtxtnombreProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jtxtnombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombreProveedorActionPerformed(evt);
            }
        });
        jtxtnombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtnombreProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtnombreProveedorKeyTyped(evt);
            }
        });

        jlabelcodigoProducto.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelcodigoProducto.setText("CODIGO:");

        jlabelnombreProveedor1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jlabelnombreProveedor1.setText("DESCRIPCION PROVEEDOR:");

        btnbuscarProveedor.setText("BUSCAR");
        btnbuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtcodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelcodigoProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jlabelnombreProveedor1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jtxtnombreProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbuscarProveedor)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelcodigoProducto)
                    .addComponent(jlabelnombreProveedor1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtcodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtnombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel13.setText("BUSCAR POR PROVEEDOR:");

        btn_BReporteEntrada1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btn_BReporteEntrada1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BReporteEntrada1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel14.setText("BUSCAR POR TIPO DE PAGO: ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendario.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salida.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/borrador.png"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/impresora.png"))); // NOI18N
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btn_BReporteEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        btn_BReporteEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BReporteEntradaActionPerformed(evt);
            }
        });

        btnImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/impresora.png"))); // NOI18N
        btnImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_BReporteEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_BReporteEntrada1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_BReporteEntrada)
                            .addComponent(btnImprimir)
                            .addComponent(jButton1)
                            .addComponent(btnSalir)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_BReporteEntrada1)
                            .addComponent(btnImprimir1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImprimirActionPerformed
        generarREPEntrada();
    }//GEN-LAST:event_jMenuItemImprimirActionPerformed

    private void jMenuItemAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnularActionPerformed
        try {
            String serie = String.valueOf(objDtm.getValueAt(jtblReporteEntrada.getSelectedRow(), 2));
            int opcion = JOptionPane.showConfirmDialog(null, "¿ANULAR ENTRADA " + serie + " ?", "REPORTE DE ENTRADA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (opcion == JOptionPane.YES_OPTION) {
                EntradaTO objEntradaTO = new EntradaTO();
                String dato = String.valueOf(objDtm.getValueAt(jtblReporteEntrada.getSelectedRow(), 0));
                int xidprov = Integer.parseInt(dato);
                objEntradaTO.setIdentrada(xidprov);
                objEntradaDAO.delete(objEntradaTO);
                limpiarControles();
                JOptionPane.showMessageDialog(null, "ENTRADA ANULADA");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jMenuItemAnularActionPerformed

    private void jtblReporteEntradaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblReporteEntradaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblReporteEntradaMouseClicked

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        generarREPGeneral_Pago();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        generarREPGeneral();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jradCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jradCreditoActionPerformed

    private void jtxtcodigoProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoProveedorKeyReleased

    private void jtxtcodigoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcodigoProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtcodigoProveedorKeyTyped

    private void jtxtnombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreProveedorActionPerformed

    private void jtxtnombreProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombreProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreProveedorKeyReleased

    private void jtxtnombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombreProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombreProveedorKeyTyped

    private void btn_BReporteEntrada1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BReporteEntrada1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_BReporteEntrada1ActionPerformed

    private void btn_BReporteEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BReporteEntradaActionPerformed
        try {
            limpiarJTable();
            String fechaIncio = objSimpleDateFormat.format(jdateFechaInicio.getDate());
            String fechaFinal = objSimpleDateFormat.format(jdateFechaFin.getDate());
            jcheckSelecionar();
            rsEntrada = objEntradaDAO.buscarPorFecha(fechaIncio, fechaFinal, op);
            while (rsEntrada.next()) {
                Object[] registro = {rsEntrada.getInt(1), rsEntrada.getDate(2),
                    rsEntrada.getString(3), rsEntrada.getString(8),
                    rsEntrada.getString(6), rsEntrada.getString(9)};
                objDtm.addRow(registro);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btn_BReporteEntradaActionPerformed

    private void btnbuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarProveedorActionPerformed
        BPV_REPEntrada pv = new BPV_REPEntrada();
        MenuGUI.desktopPane.add(pv);
        pv.setVisible(true);
        pv.setLocation(500, 150);
        pv.setSize(530, 310);
        pv.toFront();
    }//GEN-LAST:event_btnbuscarProveedorActionPerformed

    private void btnImprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImprimir1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnImprimir1;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btn_BReporteEntrada;
    private javax.swing.JButton btn_BReporteEntrada1;
    private javax.swing.JButton btnbuscarProveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JMenuItem jMenuItemAnular;
    private javax.swing.JMenuItem jMenuItemImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu jPopupMenuEntradas;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdateFechaFin;
    public static com.toedter.calendar.JDateChooser jdateFechaInicio;
    private javax.swing.JLabel jlabelcodigoProducto;
    private javax.swing.JLabel jlabelnombreProveedor1;
    private javax.swing.JRadioButton jradContado;
    private javax.swing.JRadioButton jradCredito;
    private javax.swing.JTable jtblReporteEntrada;
    public static javax.swing.JTextField jtxtcodigoProveedor;
    public static javax.swing.JTextField jtxtnombreProveedor;
    // End of variables declaration//GEN-END:variables

    public void generarREPEntrada() {
        int xid = Integer.parseInt(jtblReporteEntrada.getValueAt(jtblReporteEntrada.getSelectedRow(), 0).toString());
        data = String.valueOf(jtblReporteEntrada.getValueAt(jtblReporteEntrada.getSelectedRow(), 5).toString());
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String direccion = System.getProperty("user.dir") + "\\src\\Reportes\\REP_Entrada_Inv.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            Map parametros = new HashMap();
            parametros.put("parameter_entrada", xid);
            parametros.put("parameter_total", objNumeroLetras.Convertir(data, true));
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametros, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle("REPORTE DE ENTRADA");
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void generarREPGeneral() {
        try {
            String fechaInicio = objSimpleDateFormat.format(jdateFechaInicio.getDate());
            String fechaFinal = objSimpleDateFormat.format(jdateFechaFin.getDate());
            Connection cn = ConMySql.getInstance().getConection();
            String direccion = System.getProperty("user.dir") + "\\src\\Reportes\\REP_Entrada_General.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fechaInicio", fechaInicio);
            map.put("fechaFin", fechaFinal);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, map, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle("REPORTE GENERAL DE ENTRADAS");
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void generarREPGeneral_Pago() {
        try {
            String fechaInicio = objSimpleDateFormat.format(jdateFechaInicio.getDate());
            String fechaFinal = objSimpleDateFormat.format(jdateFechaFin.getDate());
            jcheckSelecionar();
            Connection cn = ConMySql.getInstance().getConection();
            String direccion = System.getProperty("user.dir") + "\\src\\Reportes\\REP_Entrada_Pago.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("fechaInicio", fechaInicio);
            map.put("fechaFin", fechaFinal);
            map.put("tipopago", op);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, map, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle("REPORTE GENERAL DE ENTRADAS");
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private void limpiarControles() {
        jdateFechaInicio.setCalendar(null);
        jdateFechaFin.setCalendar(null);
        objButtonGroup.clearSelection();
        jtxtcodigoProveedor.setText(null);
        jtxtnombreProveedor.setText(null);
        limpiarJTable();
    }

    public String jcheckSelecionar() {
        if (jradContado.isSelected()) {
            op = "CONTADO";
        } else {
            op = "CREDITO";
        }
        return op;
    }
}
