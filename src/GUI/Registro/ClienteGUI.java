package GUI.Registro;

import DAO.ClienteDAO;
import DTO.ClienteTO;
import Library.ReporteClass;
import Library.ValidarClass;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ClienteGUI extends javax.swing.JInternalFrame {

    ClienteDAO objClienteDAO = new ClienteDAO();
    ClienteTO objClienteTO = new ClienteTO();
    ReporteClass objReporteClass = new ReporteClass();
    boolean sw, band;
    DefaultTableModel objDtm;
    ResultSet rsCliente;
    int xidcliente;
    String mensaje, ruta;
    ValidarClass objValidarClass = new ValidarClass();
    SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DefaultTableCellRenderer objDcr = new DefaultTableCellRenderer();

    public ClienteGUI() {
        initComponents();
        objDtm = (DefaultTableModel) jtblRegistroCliente.getModel();
        ((DefaultTableCellRenderer) jtblRegistroCliente.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);

        centrarItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistro = new javax.swing.JLabel();
        jPanelDatosCliente = new javax.swing.JPanel();
        jLabelCodigoCliente = new javax.swing.JLabel();
        jtxtRucCliente = new javax.swing.JTextField();
        jLabelRUCCliente = new javax.swing.JLabel();
        jtxtCodCliente = new javax.swing.JTextField();
        jPanelBotones = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanelDatosCliene = new javax.swing.JPanel();
        jLabelDatosCliente = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jtxtdireCliente = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jtxtnombCliente = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jtxtCeluCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroCliente = new javax.swing.JTable();
        jPanelBuscarCliente = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jtxtBuscarCliente = new javax.swing.JTextField();
        jLabelBuscar2 = new javax.swing.JLabel();
        jdateFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabelBuscar1 = new javax.swing.JLabel();
        jdateFechaFin = new com.toedter.calendar.JDateChooser();
        btnImprimirFecha = new javax.swing.JButton();

        jPanelRegistro.setBackground(new java.awt.Color(153, 153, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelRegistro.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistro.setText("REGISTRO DEL CLIENTE");
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
            .addGroup(jPanelRegistroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelDatosCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDatosCliente.setOpaque(false);

        jLabelCodigoCliente.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCodigoCliente.setText("CODIGO:");

        jtxtRucCliente.setEditable(false);
        jtxtRucCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRucClienteActionPerformed(evt);
            }
        });
        jtxtRucCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtRucClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtRucClienteKeyTyped(evt);
            }
        });

        jLabelRUCCliente.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelRUCCliente.setText("RUC-DNI:");

        jtxtCodCliente.setEditable(false);
        jtxtCodCliente.setBackground(new java.awt.Color(204, 204, 204));
        jtxtCodCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCodClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodClienteKeyTyped(evt);
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
                .addContainerGap()
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
                .addContainerGap()
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

        jPanelDatosCliene.setBackground(new java.awt.Color(153, 153, 255));
        jPanelDatosCliene.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelDatosCliente.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabelDatosCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDatosCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDatosCliente.setText("DATOS DEL CLIENTE");
        jLabelDatosCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelDatosClieneLayout = new javax.swing.GroupLayout(jPanelDatosCliene);
        jPanelDatosCliene.setLayout(jPanelDatosClieneLayout);
        jPanelDatosClieneLayout.setHorizontalGroup(
            jPanelDatosClieneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClieneLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabelDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        jPanelDatosClieneLayout.setVerticalGroup(
            jPanelDatosClieneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosClieneLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabelDatosCliente)
                .addGap(5, 5, 5))
        );

        jLabelNombre.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelNombre.setText("NOMBRE:");

        jtxtdireCliente.setEditable(false);
        jtxtdireCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdireClienteActionPerformed(evt);
            }
        });
        jtxtdireCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtdireClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtdireClienteKeyTyped(evt);
            }
        });

        jLabelDireccion.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelDireccion.setText("DIRECCION:");

        jtxtnombCliente.setEditable(false);
        jtxtnombCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombClienteActionPerformed(evt);
            }
        });
        jtxtnombCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtnombClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtnombClienteKeyTyped(evt);
            }
        });

        jLabelCelular.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCelular.setText("CELULAR:");

        jtxtCeluCliente.setEditable(false);
        jtxtCeluCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCeluClienteActionPerformed(evt);
            }
        });
        jtxtCeluCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtCeluClienteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCeluClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCeluClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosClienteLayout = new javax.swing.GroupLayout(jPanelDatosCliente);
        jPanelDatosCliente.setLayout(jPanelDatosClienteLayout);
        jPanelDatosClienteLayout.setHorizontalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                        .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCodigoCliente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                                .addComponent(jtxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelRUCCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtRucCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtnombCliente)
                            .addComponent(jtxtdireCliente)
                            .addComponent(jtxtCeluCliente))))
                .addGap(10, 10, 10))
            .addComponent(jPanelDatosCliene, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelDatosClienteLayout.setVerticalGroup(
            jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosClienteLayout.createSequentialGroup()
                .addComponent(jPanelDatosCliene, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigoCliente)
                    .addComponent(jLabelRUCCliente)
                    .addComponent(jtxtRucCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtnombCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtdireCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(jtxtCeluCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jtblRegistroCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC - DNI", "CLIENTE", "DIRECCION", "CELULAR", "REGISTRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistroCliente.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jtblRegistroCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistroClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistroCliente);
        if (jtblRegistroCliente.getColumnModel().getColumnCount() > 0) {
            jtblRegistroCliente.getColumnModel().getColumn(0).setMinWidth(70);
            jtblRegistroCliente.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblRegistroCliente.getColumnModel().getColumn(1).setMinWidth(100);
            jtblRegistroCliente.getColumnModel().getColumn(1).setMaxWidth(100);
            jtblRegistroCliente.getColumnModel().getColumn(2).setMinWidth(270);
            jtblRegistroCliente.getColumnModel().getColumn(2).setMaxWidth(270);
            jtblRegistroCliente.getColumnModel().getColumn(3).setMinWidth(200);
            jtblRegistroCliente.getColumnModel().getColumn(3).setMaxWidth(200);
            jtblRegistroCliente.getColumnModel().getColumn(4).setMinWidth(95);
            jtblRegistroCliente.getColumnModel().getColumn(4).setMaxWidth(95);
        }

        jPanelBuscarCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBuscarCliente.setOpaque(false);

        jLabelBuscar.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar.setText("BUSCAR CLIENTE:");

        jtxtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarClienteActionPerformed(evt);
            }
        });
        jtxtBuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarClienteKeyReleased(evt);
            }
        });

        jLabelBuscar2.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar2.setText("FECHA INICIO:");

        jdateFechaInicio.setOpaque(false);

        jLabelBuscar1.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar1.setText("FECHA FIN:");

        jdateFechaFin.setOpaque(false);

        btnImprimirFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendario.png"))); // NOI18N
        btnImprimirFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBuscarClienteLayout = new javax.swing.GroupLayout(jPanelBuscarCliente);
        jPanelBuscarCliente.setLayout(jPanelBuscarClienteLayout);
        jPanelBuscarClienteLayout.setHorizontalGroup(
            jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuscar)
                    .addComponent(jtxtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBuscarClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jdateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanelBuscarClienteLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelBuscar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimirFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBuscarClienteLayout.setVerticalGroup(
            jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarClienteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnImprimirFecha)
                    .addGroup(jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelBuscarClienteLayout.createSequentialGroup()
                            .addGroup(jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelBuscar1)
                                .addComponent(jLabelBuscar2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdateFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdateFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanelBuscarClienteLayout.createSequentialGroup()
                            .addComponent(jLabelBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarClienteActionPerformed

    private void jtxtBuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarClienteKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarCliente.getText().isEmpty()) {
                rsCliente = objClienteDAO.buscar(jtxtBuscarCliente.getText().trim());
                while (rsCliente.next()) {
                    Object registro[] = {rsCliente.getInt(1), rsCliente.getString(2),
                        rsCliente.getString(3), rsCliente.getString(4),
                        rsCliente.getString(5), rsCliente.getDate(6)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtxtBuscarClienteKeyReleased

    private void jtxtCeluClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCeluClienteKeyTyped
        objValidarClass.numberKeyPress(evt);
        objValidarClass.validarCelular(evt, jtxtCeluCliente.getText());
    }//GEN-LAST:event_jtxtCeluClienteKeyTyped

    private void jtxtCeluClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCeluClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCeluClienteKeyReleased

    private void jtxtCeluClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCeluClienteActionPerformed

    }//GEN-LAST:event_jtxtCeluClienteActionPerformed

    private void jtxtnombClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombClienteKeyTyped
        objValidarClass.textKeyPress(evt);
    }//GEN-LAST:event_jtxtnombClienteKeyTyped

    private void jtxtnombClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombClienteKeyReleased

    private void jtxtnombClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombClienteActionPerformed

    private void jtxtdireClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdireClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdireClienteKeyTyped

    private void jtxtdireClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdireClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdireClienteKeyReleased

    private void jtxtdireClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdireClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdireClienteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int op = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR?", "REGISTRO CLIENTE", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                objClienteTO.setIdcliente(xidcliente);
                objClienteDAO.delete(objClienteTO);
                limpiarControles();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtxtCodClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodClienteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodClienteKeyTyped

    private void jtxtCodClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodClienteKeyReleased

    private void jtxtRucClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRucClienteKeyTyped
        objValidarClass.numberKeyPress(evt);
        objValidarClass.validarRuc(evt, jtxtRucCliente.getText());
    }//GEN-LAST:event_jtxtRucClienteKeyTyped

    private void jtxtRucClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRucClienteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucClienteKeyReleased

    private void jtxtRucClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRucClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucClienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (objClienteDAO.verificar(jtxtRucCliente.getText().trim()) && band == true) {
                JOptionPane.showMessageDialog(null, "CLIENTE YA ESTÁ REGISTRADO", "FERRETERIA MICKY", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (!validar()) {
                    JOptionPane.showMessageDialog(null, "COMPLETAR CAJA DE TEXTO", "FERRETERIA MICKY", JOptionPane.WARNING_MESSAGE);
                } else {
                    objClienteTO.setRucclien(jtxtRucCliente.getText().toUpperCase().trim());
                    objClienteTO.setNombclien(jtxtnombCliente.getText().toUpperCase().trim());
                    objClienteTO.setDireclien(jtxtdireCliente.getText().toUpperCase().trim());
                    objClienteTO.setCeluclien(jtxtCeluCliente.getText().trim());
                    if (sw) {
                        objClienteDAO.insert(objClienteTO);
                        mensaje = "CLIENTE REGISTRADO";
                    } else {
                        objClienteTO.setIdcliente(Integer.parseInt(jtxtCodCliente.getText()));
                        objClienteDAO.update(objClienteTO);
                        mensaje = "CLIENTE ACTUALIZADO";
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

    private void jtblRegistroClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistroClienteMouseClicked
        try {
            xidcliente = Integer.parseInt(jtblRegistroCliente.getValueAt(jtblRegistroCliente.getSelectedRow(), 0).toString());
            rsCliente.first();
            do {
                if (xidcliente == rsCliente.getInt(1)) {
                    jtxtCodCliente.setText(String.valueOf(rsCliente.getInt(1)));
                    jtxtRucCliente.setText(rsCliente.getString(2));
                    jtxtnombCliente.setText(rsCliente.getString(3));
                    jtxtdireCliente.setText(rsCliente.getString(4));
                    jtxtCeluCliente.setText(rsCliente.getString(5));
                    rsCliente.last();
                }
            } while (rsCliente.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtblRegistroClienteMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarControles(true);
        limpiarControles();
        sw = true;
        band = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        habilitarControles(true);
        sw = false;
        band = false;
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        habilitarControles(false);
        limpiarControles();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtxtCeluClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCeluClienteKeyPressed

    }//GEN-LAST:event_jtxtCeluClienteKeyPressed

    private void btnImprimirFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFechaActionPerformed
        try {
            ruta = "REPCliente_Date";
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
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JLabel jLabelBuscar1;
    private javax.swing.JLabel jLabelBuscar2;
    private javax.swing.JLabel jLabelCelular;
    private javax.swing.JLabel jLabelCodigoCliente;
    private javax.swing.JLabel jLabelDatosCliente;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRUCCliente;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBuscarCliente;
    private javax.swing.JPanel jPanelDatosCliene;
    private javax.swing.JPanel jPanelDatosCliente;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdateFechaFin;
    private com.toedter.calendar.JDateChooser jdateFechaInicio;
    private javax.swing.JTable jtblRegistroCliente;
    private javax.swing.JTextField jtxtBuscarCliente;
    private javax.swing.JTextField jtxtCeluCliente;
    private javax.swing.JTextField jtxtCodCliente;
    private javax.swing.JTextField jtxtRucCliente;
    private javax.swing.JTextField jtxtdireCliente;
    private javax.swing.JTextField jtxtnombCliente;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        JTextField[] arrJTexFields = {jtxtRucCliente, jtxtnombCliente,
            jtxtdireCliente, jtxtCeluCliente};
        for (JTextField obJTextField : arrJTexFields) {
            obJTextField.setEditable(b);
        }
        jtxtBuscarCliente.setEditable(!b);
        jtxtRucCliente.grabFocus();
        btnGuardar.setEnabled(b);
        btnCancelar.setEnabled(b);
        btnNuevo.setEnabled(!b);
        btnEditar.setEnabled(!b);
        btnEliminar.setEnabled(!b);
        btnSalir.setEnabled(!b);
        jdateFechaInicio.setEnabled(!b);
        jdateFechaFin.setEnabled(!b);
        btnImprimirFecha.setEnabled(!b);
    }

    private void limpiarControles() {
        limpiarJTable();
        JTextField[] objTextFields = {jtxtCodCliente, jtxtBuscarCliente,
            jtxtRucCliente, jtxtnombCliente, jtxtdireCliente, jtxtCeluCliente};
        for (JTextField objTextField : objTextFields) {
            objTextField.setText(null);
        }
        jdateFechaInicio.setCalendar(null);
        jdateFechaFin.setCalendar(null);
    }

    private boolean validar() {
        JTextField[] objTextFields = {jtxtRucCliente, jtxtnombCliente,
            jtxtdireCliente, jtxtCeluCliente};
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
            jtblRegistroCliente.getColumnModel().getColumn(i).setCellRenderer(objDcr);
        }
    }
}
