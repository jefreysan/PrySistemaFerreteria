package GUI.Registro;

import DAO.ProveedorDAO;
import DTO.ProveedorTO;
import Library.ReporteClass;
import Library.ValidarClass;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ProveedorGUI extends javax.swing.JInternalFrame {

    ProveedorDAO objProveedorDAO = new ProveedorDAO();
    ProveedorTO objProveedorTO = new ProveedorTO();
    ReporteClass objReporteClass = new ReporteClass();
    boolean sw,band;
    DefaultTableModel objDtm;
    ResultSet rsProveedor;
    int xidproveedor;
    String mensaje, ruta;
    ValidarClass objValidarClass = new ValidarClass();
    SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DefaultTableCellRenderer objDcr = new DefaultTableCellRenderer();

    public ProveedorGUI() {
        initComponents();
        objDtm = (DefaultTableModel) jtblRegistroProveedor.getModel();
        ((DefaultTableCellRenderer) jtblRegistroProveedor.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
        centrarItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistro = new javax.swing.JLabel();
        jPanelDatosProveedor = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jtxtRucProveedor = new javax.swing.JTextField();
        jLabelRUC = new javax.swing.JLabel();
        jtxtCodigoProveedor = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jtxtDireccionProveedor = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jtxtNombreProveedor = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jtxtCelularProveedor = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jtxtCorreoProveedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroProveedor = new javax.swing.JTable();
        jPanelBuscarCliente3 = new javax.swing.JPanel();
        jLabelBuscar9 = new javax.swing.JLabel();
        jtxtBuscarProveedor = new javax.swing.JTextField();
        jLabelBuscar10 = new javax.swing.JLabel();
        jdateFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabelBuscar11 = new javax.swing.JLabel();
        jdateFechaFin = new com.toedter.calendar.JDateChooser();
        btnImprimirFecha = new javax.swing.JButton();

        jPanelRegistro.setBackground(new java.awt.Color(153, 153, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelRegistro.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistro.setText("REGISTRO DEL PROVEEDOR");
        jLabelRegistro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelRegistroLayout = new javax.swing.GroupLayout(jPanelRegistro);
        jPanelRegistro.setLayout(jPanelRegistroLayout);
        jPanelRegistroLayout.setHorizontalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelRegistroLayout.setVerticalGroup(
            jPanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegistroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRegistro)
                .addGap(5, 5, 5))
        );

        jPanelDatosProveedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDatosProveedor.setOpaque(false);

        jLabelCodigo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCodigo.setText("CODIGO:");

        jtxtRucProveedor.setEditable(false);
        jtxtRucProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRucProveedorActionPerformed(evt);
            }
        });
        jtxtRucProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtRucProveedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtRucProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtRucProveedorKeyTyped(evt);
            }
        });

        jLabelRUC.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelRUC.setText("RUC-DNI:");

        jtxtCodigoProveedor.setEditable(false);
        jtxtCodigoProveedor.setBackground(new java.awt.Color(204, 204, 204));
        jtxtCodigoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCodigoProveedorActionPerformed(evt);
            }
        });
        jtxtCodigoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCodigoProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodigoProveedorKeyTyped(evt);
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
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatos.setBackground(new java.awt.Color(153, 153, 255));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATOS DEL PROVEEDOR");
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

        jLabelNombre.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelNombre.setText("NOMBRE:");

        jtxtDireccionProveedor.setEditable(false);
        jtxtDireccionProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtDireccionProveedorActionPerformed(evt);
            }
        });
        jtxtDireccionProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtDireccionProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtDireccionProveedorKeyTyped(evt);
            }
        });

        jLabelDireccion.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelDireccion.setText("DIRECCION:");

        jtxtNombreProveedor.setEditable(false);
        jtxtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNombreProveedorActionPerformed(evt);
            }
        });
        jtxtNombreProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtNombreProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtNombreProveedorKeyTyped(evt);
            }
        });

        jLabelCelular.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCelular.setText("CELULAR:");

        jtxtCelularProveedor.setEditable(false);
        jtxtCelularProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCelularProveedorActionPerformed(evt);
            }
        });
        jtxtCelularProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCelularProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCelularProveedorKeyTyped(evt);
            }
        });

        jLabelCorreo.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCorreo.setText("CORREO:");

        jtxtCorreoProveedor.setEditable(false);
        jtxtCorreoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCorreoProveedorActionPerformed(evt);
            }
        });
        jtxtCorreoProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCorreoProveedorKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCorreoProveedorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosProveedorLayout = new javax.swing.GroupLayout(jPanelDatosProveedor);
        jPanelDatosProveedor.setLayout(jPanelDatosProveedorLayout);
        jPanelDatosProveedorLayout.setHorizontalGroup(
            jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDatosProveedorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosProveedorLayout.createSequentialGroup()
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosProveedorLayout.createSequentialGroup()
                        .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCelular)
                            .addComponent(jLabelCorreo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCelularProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtCorreoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosProveedorLayout.createSequentialGroup()
                        .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosProveedorLayout.createSequentialGroup()
                                .addComponent(jtxtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRUC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        jPanelDatosProveedorLayout.setVerticalGroup(
            jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosProveedorLayout.createSequentialGroup()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtRucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRUC)
                    .addComponent(jLabelCodigo))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtDireccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(jtxtCelularProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCorreoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jtblRegistroProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC - DNI", "PROVEEDOR", "DIRECCION", "CELULAR", "REGISTRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistroProveedor.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jtblRegistroProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistroProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistroProveedor);
        if (jtblRegistroProveedor.getColumnModel().getColumnCount() > 0) {
            jtblRegistroProveedor.getColumnModel().getColumn(0).setMinWidth(70);
            jtblRegistroProveedor.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblRegistroProveedor.getColumnModel().getColumn(1).setMinWidth(100);
            jtblRegistroProveedor.getColumnModel().getColumn(1).setMaxWidth(100);
            jtblRegistroProveedor.getColumnModel().getColumn(2).setMinWidth(270);
            jtblRegistroProveedor.getColumnModel().getColumn(2).setMaxWidth(270);
            jtblRegistroProveedor.getColumnModel().getColumn(3).setMinWidth(200);
            jtblRegistroProveedor.getColumnModel().getColumn(3).setMaxWidth(200);
            jtblRegistroProveedor.getColumnModel().getColumn(4).setMinWidth(95);
            jtblRegistroProveedor.getColumnModel().getColumn(4).setMaxWidth(95);
        }

        jPanelBuscarCliente3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBuscarCliente3.setOpaque(false);

        jLabelBuscar9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar9.setText("BUSCAR PROVEEDOR:");

        jtxtBuscarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarProveedorActionPerformed(evt);
            }
        });
        jtxtBuscarProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarProveedorKeyReleased(evt);
            }
        });

        jLabelBuscar10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar10.setText("FECHA INICIO:");

        jdateFechaInicio.setOpaque(false);

        jLabelBuscar11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar11.setText("FECHA FIN:");

        jdateFechaFin.setOpaque(false);

        btnImprimirFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendario.png"))); // NOI18N
        btnImprimirFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarCliente3Layout = new javax.swing.GroupLayout(jPanelBuscarCliente3);
        jPanelBuscarCliente3.setLayout(jPanelBuscarCliente3Layout);
        jPanelBuscarCliente3Layout.setHorizontalGroup(
            jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarCliente3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuscar9)
                    .addComponent(jtxtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscar10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscar11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimirFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBuscarCliente3Layout.setVerticalGroup(
            jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarCliente3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImprimirFecha)
                    .addGroup(jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelBuscarCliente3Layout.createSequentialGroup()
                            .addGroup(jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelBuscar11)
                                .addComponent(jLabelBuscar10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBuscarCliente3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdateFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdateFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelBuscarCliente3Layout.createSequentialGroup()
                            .addComponent(jLabelBuscar9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtBuscarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelDatosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBuscarCliente3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(10, 10, 10))
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBuscarCliente3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanelDatosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtCodigoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoProveedorKeyTyped

    private void jtxtCodigoProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodigoProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoProveedorKeyReleased

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int op = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR?", "REGISTRO PROVEEDOR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                objProveedorTO.setIdproveedor(xidproveedor);
                objProveedorDAO.delete(objProveedorTO);
                limpiarControles();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtxtRucProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRucProveedorKeyTyped
        objValidarClass.numberKeyPress(evt);
        objValidarClass.validarRuc(evt, jtxtRucProveedor.getText());
    }//GEN-LAST:event_jtxtRucProveedorKeyTyped

    private void jtxtRucProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRucProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucProveedorKeyReleased

    private void jtxtRucProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRucProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucProveedorActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jtxtDireccionProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtDireccionProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccionProveedorActionPerformed

    private void jtxtDireccionProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDireccionProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccionProveedorKeyReleased

    private void jtxtDireccionProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDireccionProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtDireccionProveedorKeyTyped

    private void jtxtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreProveedorActionPerformed

    private void jtxtNombreProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtNombreProveedorKeyReleased

    private void jtxtNombreProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNombreProveedorKeyTyped
        objValidarClass.textKeyPress(evt);
    }//GEN-LAST:event_jtxtNombreProveedorKeyTyped

    private void jtxtCelularProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCelularProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCelularProveedorActionPerformed

    private void jtxtCelularProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCelularProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCelularProveedorKeyReleased

    private void jtxtCelularProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCelularProveedorKeyTyped
        objValidarClass.numberKeyPress(evt);
        objValidarClass.validarCelular(evt, jtxtCelularProveedor.getText());
    }//GEN-LAST:event_jtxtCelularProveedorKeyTyped

    private void jtxtCorreoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCorreoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCorreoProveedorActionPerformed

    private void jtxtCorreoProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCorreoProveedorKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCorreoProveedorKeyReleased

    private void jtxtCorreoProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCorreoProveedorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCorreoProveedorKeyTyped

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarControles(true);
        limpiarControles();
        sw = true;
        band=true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (objProveedorDAO.verificar(jtxtRucProveedor.getText().trim()) && band==true) {
                JOptionPane.showMessageDialog(null, "PROVEEDOR YA ESTÁ REGISTRADO", "FERRETERIA MICKY", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (!validar()) {
                    JOptionPane.showMessageDialog(null, "COMPLETAR CAJA DE TEXTO", "FERRETERIA MICKY", JOptionPane.WARNING_MESSAGE);
                } else {
                    objProveedorTO.setRucprove(jtxtRucProveedor.getText().toUpperCase());
                    objProveedorTO.setNombprove(jtxtNombreProveedor.getText().toUpperCase());
                    objProveedorTO.setDireprove(jtxtDireccionProveedor.getText().toUpperCase());
                    objProveedorTO.setCeluprove(jtxtCelularProveedor.getText());
                    objProveedorTO.setCorreoprove(jtxtCorreoProveedor.getText().toUpperCase());
                    if (sw) {
                        objProveedorDAO.insert(objProveedorTO);
                        mensaje = "PROVEEDOR REGISTRADO";
                    } else {
                        objProveedorTO.setIdproveedor(Integer.parseInt(jtxtCodigoProveedor.getText()));
                        objProveedorDAO.update(objProveedorTO);
                        mensaje = "PROVEEDOR ACTUALIZADO";
                    }
                    habilitarControles(false);
                    JOptionPane.showMessageDialog(null, mensaje, "FERRETERIA MICKY", JOptionPane.INFORMATION_MESSAGE);
                    limpiarControles();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarControles(true);
        sw = false;
        band=false;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jtblRegistroProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistroProveedorMouseClicked
        try {
            xidproveedor = Integer.parseInt(jtblRegistroProveedor.getValueAt(jtblRegistroProveedor.getSelectedRow(), 0).toString());
            rsProveedor.first();
            do {
                if (xidproveedor == rsProveedor.getInt(1)) {
                    jtxtCodigoProveedor.setText(String.valueOf(rsProveedor.getInt(1)));
                    jtxtRucProveedor.setText(rsProveedor.getString(2));
                    jtxtNombreProveedor.setText(rsProveedor.getString(3));
                    jtxtDireccionProveedor.setText(rsProveedor.getString(4));
                    jtxtCelularProveedor.setText(rsProveedor.getString(5));
                    jtxtCorreoProveedor.setText(rsProveedor.getString(6));
                    rsProveedor.last();
                }
            } while (rsProveedor.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtblRegistroProveedorMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtxtCodigoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCodigoProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodigoProveedorActionPerformed

    private void jtxtRucProveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRucProveedorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucProveedorKeyPressed

    private void jtxtBuscarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarProveedorActionPerformed

    private void jtxtBuscarProveedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarProveedorKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarProveedor.getText().isEmpty()) {
                rsProveedor = objProveedorDAO.buscar(jtxtBuscarProveedor.getText().trim());
                while (rsProveedor.next()) {
                    Object registro[] = {rsProveedor.getInt(1), rsProveedor.getString(2), rsProveedor.getString(3),
                        rsProveedor.getString(4), rsProveedor.getString(5), rsProveedor.getDate(7)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtxtBuscarProveedorKeyReleased

    private void btnImprimirFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFechaActionPerformed
        try {
            ruta = "REPProveedor_Date";
            String fechaInicio = objSimpleDateFormat.format(jdateFechaInicio.getDate());
            String fechaFinal = objSimpleDateFormat.format(jdateFechaFin.getDate());
            objReporteClass.generarReporte_Date(ruta, fechaInicio, fechaFinal);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "COMPLETAR CAJA DE TEXTO", "FERRETERIA MICKY", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnImprimirFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimirFecha;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBuscar10;
    private javax.swing.JLabel jLabelBuscar11;
    private javax.swing.JLabel jLabelBuscar9;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRUC;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBuscarCliente3;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelDatosProveedor;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdateFechaFin;
    private com.toedter.calendar.JDateChooser jdateFechaInicio;
    private javax.swing.JTable jtblRegistroProveedor;
    private javax.swing.JTextField jtxtBuscarProveedor;
    private javax.swing.JTextField jtxtCelularProveedor;
    private javax.swing.JTextField jtxtCodigoProveedor;
    private javax.swing.JTextField jtxtCorreoProveedor;
    private javax.swing.JTextField jtxtDireccionProveedor;
    private javax.swing.JTextField jtxtNombreProveedor;
    private javax.swing.JTextField jtxtRucProveedor;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        JTextField[] arrJTexFields = {jtxtRucProveedor, jtxtNombreProveedor,
            jtxtDireccionProveedor, jtxtCelularProveedor, jtxtCorreoProveedor};
        for (JTextField obJTextField : arrJTexFields) {
            obJTextField.setEditable(b);
        }
        jtxtBuscarProveedor.setEditable(!b);
        jtxtRucProveedor.grabFocus();
        btnGuardar.setEnabled(b);
        btnCancelar.setEnabled(b);
        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);
        btnNuevo.setEnabled(!b);
        jdateFechaInicio.setEnabled(!b);
        jdateFechaFin.setEnabled(!b);
        btnImprimirFecha.setEnabled(!b);
    }

    private void limpiarControles() {
        limpiarJTable();
        JTextField[] objTextFields = {jtxtCodigoProveedor, jtxtBuscarProveedor,
            jtxtRucProveedor, jtxtNombreProveedor, jtxtDireccionProveedor,
            jtxtCelularProveedor, jtxtCorreoProveedor};
        for (JTextField objTextField : objTextFields) {
            objTextField.setText(null);
        }
        jdateFechaInicio.setCalendar(null);
        jdateFechaFin.setCalendar(null);
    }

    private boolean validar() {
        JTextField[] objTextFields = {jtxtRucProveedor, jtxtNombreProveedor,
            jtxtDireccionProveedor, jtxtCelularProveedor, jtxtCorreoProveedor};
        for (JTextField objTextField : objTextFields) {
            if (objTextField.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    public final void centrarItems() {
        int columns = objDtm.getColumnCount();
        for (int i = 0; i < columns; i++) {
            objDcr.setHorizontalAlignment(SwingConstants.CENTER);
            jtblRegistroProveedor.getColumnModel().getColumn(i).setCellRenderer(objDcr);
        }
    }
}
