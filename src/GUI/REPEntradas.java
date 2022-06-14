/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package GUI;

import Conexion.ConMySql;
import DAO.EntradaDAO;
import DAO.TipoPagoDAO;
import DTO.EntradaTO;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
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
public class REPEntradas extends javax.swing.JInternalFrame {

    /**
     * Creates new form REPEntrada
     */
    JRootPane rootPane;
    boolean sw;
    DefaultTableModel objDtm;
    TipoPagoDAO objTipoPagoDAO = new TipoPagoDAO();
    ResultSet rsEntrada,rsTipoPago;
    int xidentrada,xidtipopago;
    EntradaDAO objEntradaDAO = new EntradaDAO();
    SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public REPEntradas() {
        initComponents();
        setVisible(true);
        setSize(998, 400);
        llenarComboTipoPago();
        objDtm = (DefaultTableModel) jtblReporteEntrada.getModel();
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
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jdateFechaInicio = new com.toedter.calendar.JDateChooser();
        jdateFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jcomboxPago = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblReporteEntrada = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REPORTES DE ENTRADAS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("X");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(1, 1, 1))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel10.setText("FECHA INICIO:");

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel11.setText("FECHA FIN:");

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel12.setText("ESTADO:");

        jcomboxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomboxPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jdateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcomboxPago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(34, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(125, 125, 125))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomboxPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        jtblReporteEntrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblReporteEntradaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblReporteEntrada);
        if (jtblReporteEntrada.getColumnModel().getColumnCount() > 0) {
            jtblReporteEntrada.getColumnModel().getColumn(0).setMinWidth(70);
            jtblReporteEntrada.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtblReporteEntrada.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblReporteEntrada.getColumnModel().getColumn(1).setMinWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(1).setPreferredWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(1).setMaxWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(2).setMinWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(2).setPreferredWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(2).setMaxWidth(150);
            jtblReporteEntrada.getColumnModel().getColumn(3).setMinWidth(250);
            jtblReporteEntrada.getColumnModel().getColumn(3).setPreferredWidth(250);
            jtblReporteEntrada.getColumnModel().getColumn(3).setMaxWidth(250);
            jtblReporteEntrada.getColumnModel().getColumn(4).setMinWidth(250);
            jtblReporteEntrada.getColumnModel().getColumn(4).setPreferredWidth(250);
            jtblReporteEntrada.getColumnModel().getColumn(4).setMaxWidth(250);
            jtblReporteEntrada.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/impresora.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            limpiarJTable();
            String fechaIncio = objSimpleDateFormat.format(jdateFechaInicio.getDate());
            String fechaFinal = objSimpleDateFormat.format(jdateFechaFin.getDate());
            String estado = jcomboxPago.getSelectedItem().toString();
            if (estado.equals("CONTADO")) {
                rsEntrada = objEntradaDAO.buscarPorFecha(fechaIncio, fechaFinal,estado);
                while (rsEntrada.next()) {
                    Object[] registro = {rsEntrada.getInt(1), rsEntrada.getString(2), rsEntrada.getString(6),rsEntrada.getString(5),rsEntrada.getString(4),
                        rsEntrada.getDouble(7)};
                    objDtm.addRow(registro);
                }
            }else{
               rsEntrada = objEntradaDAO.buscarPorFecha(fechaIncio, fechaFinal,estado);
                while (rsEntrada.next()) {
                    Object[] registro = {rsEntrada.getInt(1), rsEntrada.getString(2), rsEntrada.getString(6),rsEntrada.getString(5),rsEntrada.getString(4),
                        rsEntrada.getDouble(7)};
                    objDtm.addRow(registro);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItemImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImprimirActionPerformed
        grabarEntrada();
    }//GEN-LAST:event_jMenuItemImprimirActionPerformed

    private void jMenuItemAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnularActionPerformed
        try {
            String serie = String.valueOf(objDtm.getValueAt(jtblReporteEntrada.getSelectedRow(), 2));
            int op = JOptionPane.showConfirmDialog(null, "¿ANULAR ENTRADA " + serie + " ?", "REPORTE DE ENTRADA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
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

    private void jcomboxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomboxPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcomboxPagoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void grabarEntrada() {
       int  xid = Integer.parseInt(jtblReporteEntrada.getValueAt(jtblReporteEntrada.getSelectedRow(), 0).toString());
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String direccion = System.getProperty("user.dir") + "\\src\\Reportes\\REPEntrada.jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            Map parametros = new HashMap();
            parametros.put("parameter_entrada", xid);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, parametros, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle("REPORTE DE ENTRADA");
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenuItem jMenuItemAnular;
    private javax.swing.JMenuItem jMenuItemImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenuEntradas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcomboxPago;
    private com.toedter.calendar.JDateChooser jdateFechaFin;
    private com.toedter.calendar.JDateChooser jdateFechaInicio;
    private javax.swing.JTable jtblReporteEntrada;
    // End of variables declaration//GEN-END:variables

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }

    }

    private void limpiarControles() {
        limpiarJTable();
        jdateFechaInicio.setCalendar(null);
        jdateFechaFin.setCalendar(null);
    }
   private void llenarComboTipoPago() {
        try {
            rsTipoPago = objTipoPagoDAO.buscar("%");
            while (rsTipoPago.next()) {
                jcomboxPago.addItem(rsTipoPago.getString(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    private void obtenerIdTipoPago() {
        try {
            String nombre = jcomboxPago.getSelectedItem().toString();
            rsTipoPago.first();
            do {
                if (nombre.equals(rsTipoPago.getString(2))) {
                    xidtipopago = rsTipoPago.getInt(1);
                    rsTipoPago.last();
                }
            } while (rsTipoPago.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
}
