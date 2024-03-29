package GUI.Registro;

import DAO.EncargadoDAO;
import DTO.EncargadoTO;
import Library.ReporteClass;
import Library.ValidarClass;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class EncargadoGUI extends javax.swing.JInternalFrame {

    EncargadoDAO objEncargadoDAO = new EncargadoDAO();
    EncargadoTO objEncargadoTO = new EncargadoTO();
    ReporteClass objReporteClass = new ReporteClass();
    boolean sw, band;
    DefaultTableModel objDtm;
    ResultSet rsEncargado;
    int xidencargado;
    String mensaje, ruta;
    ValidarClass objValidarClass = new ValidarClass();
    SimpleDateFormat objSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    DefaultTableCellRenderer objDcr = new DefaultTableCellRenderer();

    public EncargadoGUI() {
        initComponents();
        objDtm = (DefaultTableModel) jtblRegistroEncargado.getModel();
        ((DefaultTableCellRenderer) jtblRegistroEncargado.getTableHeader().getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
        centrarItems();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelRegistro = new javax.swing.JPanel();
        jLabelRegistro = new javax.swing.JLabel();
        jPanelDatosEncargado = new javax.swing.JPanel();
        jLabelCodigoEncargado = new javax.swing.JLabel();
        jtxtRucEncargado = new javax.swing.JTextField();
        jLabelRUCEncargado = new javax.swing.JLabel();
        jtxtCodEncargado = new javax.swing.JTextField();
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
        jtxtdireccionEncargado = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jtxtnombEncargado = new javax.swing.JTextField();
        jLabelCelular = new javax.swing.JLabel();
        jtxtCelularEncargado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblRegistroEncargado = new javax.swing.JTable();
        jPanelBuscarEncargado = new javax.swing.JPanel();
        jtxtBuscarEncargado = new javax.swing.JTextField();
        jdateFechaInicio = new com.toedter.calendar.JDateChooser();
        jLabelBuscar10 = new javax.swing.JLabel();
        jdateFechaFin = new com.toedter.calendar.JDateChooser();
        jLabelBuscar11 = new javax.swing.JLabel();
        btnImprimirFecha = new javax.swing.JButton();
        jLabelBuscar9 = new javax.swing.JLabel();

        jPanelRegistro.setBackground(new java.awt.Color(153, 153, 255));
        jPanelRegistro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabelRegistro.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        jLabelRegistro.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistro.setText("REGISTRO DEL ENCARGADO");
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

        jPanelDatosEncargado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelDatosEncargado.setOpaque(false);

        jLabelCodigoEncargado.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCodigoEncargado.setText("CODIGO:");

        jtxtRucEncargado.setEditable(false);
        jtxtRucEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtRucEncargadoActionPerformed(evt);
            }
        });
        jtxtRucEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtRucEncargadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtRucEncargadoKeyTyped(evt);
            }
        });

        jLabelRUCEncargado.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelRUCEncargado.setText("RUC-DNI:");

        jtxtCodEncargado.setEditable(false);
        jtxtCodEncargado.setBackground(new java.awt.Color(204, 204, 204));
        jtxtCodEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCodEncargadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCodEncargadoKeyTyped(evt);
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
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotonesLayout.setVerticalGroup(
            jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addGap(10, 10, 10))
        );

        jPanelDatos.setBackground(new java.awt.Color(153, 153, 255));
        jPanelDatos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATOS DEL ENCARGADO");
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

        jtxtdireccionEncargado.setEditable(false);
        jtxtdireccionEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdireccionEncargadoActionPerformed(evt);
            }
        });
        jtxtdireccionEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtdireccionEncargadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtdireccionEncargadoKeyTyped(evt);
            }
        });

        jLabelDireccion.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelDireccion.setText("DIRECCION:");

        jtxtnombEncargado.setEditable(false);
        jtxtnombEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnombEncargadoActionPerformed(evt);
            }
        });
        jtxtnombEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtnombEncargadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtnombEncargadoKeyTyped(evt);
            }
        });

        jLabelCelular.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelCelular.setText("CELULAR:");

        jtxtCelularEncargado.setEditable(false);
        jtxtCelularEncargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtCelularEncargadoMouseClicked(evt);
            }
        });
        jtxtCelularEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtCelularEncargadoActionPerformed(evt);
            }
        });
        jtxtCelularEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtCelularEncargadoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCelularEncargadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanelDatosEncargadoLayout = new javax.swing.GroupLayout(jPanelDatosEncargado);
        jPanelDatosEncargado.setLayout(jPanelDatosEncargadoLayout);
        jPanelDatosEncargadoLayout.setHorizontalGroup(
            jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDatosEncargadoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosEncargadoLayout.createSequentialGroup()
                        .addGroup(jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelCodigoEncargado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosEncargadoLayout.createSequentialGroup()
                                .addComponent(jtxtCodEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRUCEncargado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtRucEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtxtnombEncargado)
                            .addComponent(jtxtdireccionEncargado)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosEncargadoLayout.createSequentialGroup()
                        .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosEncargadoLayout.createSequentialGroup()
                        .addComponent(jLabelCelular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtCelularEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanelDatosEncargadoLayout.setVerticalGroup(
            jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosEncargadoLayout.createSequentialGroup()
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCodEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtRucEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRUCEncargado)
                    .addComponent(jLabelCodigoEncargado))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtnombEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtdireccionEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion))
                .addGap(10, 10, 10)
                .addGroup(jPanelDatosEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCelular)
                    .addComponent(jtxtCelularEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtblRegistroEncargado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "RUC - DNI", "ENCARGADO", "DIRECCION", "CELULAR", "REGISTRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblRegistroEncargado.setSelectionBackground(new java.awt.Color(51, 51, 255));
        jtblRegistroEncargado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblRegistroEncargadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblRegistroEncargado);
        if (jtblRegistroEncargado.getColumnModel().getColumnCount() > 0) {
            jtblRegistroEncargado.getColumnModel().getColumn(0).setMinWidth(70);
            jtblRegistroEncargado.getColumnModel().getColumn(0).setMaxWidth(70);
            jtblRegistroEncargado.getColumnModel().getColumn(1).setMinWidth(100);
            jtblRegistroEncargado.getColumnModel().getColumn(1).setMaxWidth(100);
            jtblRegistroEncargado.getColumnModel().getColumn(2).setMinWidth(270);
            jtblRegistroEncargado.getColumnModel().getColumn(2).setMaxWidth(270);
            jtblRegistroEncargado.getColumnModel().getColumn(3).setMinWidth(200);
            jtblRegistroEncargado.getColumnModel().getColumn(3).setMaxWidth(200);
            jtblRegistroEncargado.getColumnModel().getColumn(4).setMinWidth(95);
            jtblRegistroEncargado.getColumnModel().getColumn(4).setMaxWidth(95);
        }

        jPanelBuscarEncargado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBuscarEncargado.setOpaque(false);

        jtxtBuscarEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBuscarEncargadoActionPerformed(evt);
            }
        });
        jtxtBuscarEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtBuscarEncargadoKeyReleased(evt);
            }
        });

        jdateFechaInicio.setOpaque(false);

        jLabelBuscar10.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar10.setText("FECHA INICIO:");

        jdateFechaFin.setOpaque(false);

        jLabelBuscar11.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar11.setText("FECHA FIN:");

        btnImprimirFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/calendario.png"))); // NOI18N
        btnImprimirFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirFechaActionPerformed(evt);
            }
        });

        jLabelBuscar9.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabelBuscar9.setText("BUSCAR ENCARGADO:");

        javax.swing.GroupLayout jPanelBuscarEncargadoLayout = new javax.swing.GroupLayout(jPanelBuscarEncargado);
        jPanelBuscarEncargado.setLayout(jPanelBuscarEncargadoLayout);
        jPanelBuscarEncargadoLayout.setHorizontalGroup(
            jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarEncargadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBuscar9)
                    .addComponent(jtxtBuscarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscar10))
                .addGap(10, 10, 10)
                .addGroup(jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdateFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBuscar11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnImprimirFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelBuscarEncargadoLayout.setVerticalGroup(
            jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBuscarEncargadoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnImprimirFecha)
                        .addGroup(jPanelBuscarEncargadoLayout.createSequentialGroup()
                            .addGroup(jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelBuscar10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelBuscar11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanelBuscarEncargadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jdateFechaInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jdateFechaFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelBuscarEncargadoLayout.createSequentialGroup()
                        .addComponent(jLabelBuscar9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtBuscarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelDatosEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanelBuscarEncargado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addComponent(jPanelRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelBuscarEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanelDatosEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBuscarEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtBuscarEncargadoActionPerformed

    private void jtxtBuscarEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBuscarEncargadoKeyReleased
        try {
            limpiarJTable();
            if (!jtxtBuscarEncargado.getText().isEmpty()) {
                rsEncargado = objEncargadoDAO.buscar(jtxtBuscarEncargado.getText().trim());
                while (rsEncargado.next()) {
                    Object registro[] = {rsEncargado.getInt(1), rsEncargado.getString(2), rsEncargado.getString(3),
                        rsEncargado.getString(4), rsEncargado.getString(5), rsEncargado.getDate(6)};
                    objDtm.addRow(registro);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtxtBuscarEncargadoKeyReleased

    private void jtxtCelularEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCelularEncargadoKeyTyped
        objValidarClass.numberKeyPress(evt);
        objValidarClass.validarCelular(evt, jtxtCelularEncargado.getText());
    }//GEN-LAST:event_jtxtCelularEncargadoKeyTyped

    private void jtxtCelularEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCelularEncargadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCelularEncargadoKeyReleased

    private void jtxtCelularEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtCelularEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCelularEncargadoActionPerformed

    private void jtxtnombEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombEncargadoKeyTyped
        objValidarClass.textKeyPress(evt);
    }//GEN-LAST:event_jtxtnombEncargadoKeyTyped

    private void jtxtnombEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtnombEncargadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombEncargadoKeyReleased

    private void jtxtnombEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnombEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnombEncargadoActionPerformed

    private void jtxtdireccionEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdireccionEncargadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdireccionEncargadoKeyTyped

    private void jtxtdireccionEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtdireccionEncargadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdireccionEncargadoKeyReleased

    private void jtxtdireccionEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdireccionEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtdireccionEncargadoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int op = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO QUE DESEA ELIMINAR?", "REGISTRO ENCARGADO", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (op == JOptionPane.YES_OPTION) {
                objEncargadoTO.setIdencargado(xidencargado);
                objEncargadoDAO.delete(objEncargadoTO);
                limpiarControles();
                JOptionPane.showMessageDialog(null, "REGISTRO ELIMINADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jtxtCodEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodEncargadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodEncargadoKeyTyped

    private void jtxtCodEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCodEncargadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCodEncargadoKeyReleased

    private void jtxtRucEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRucEncargadoKeyTyped
        objValidarClass.numberKeyPress(evt);
        objValidarClass.validarRuc(evt, jtxtRucEncargado.getText());
    }//GEN-LAST:event_jtxtRucEncargadoKeyTyped

    private void jtxtRucEncargadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtRucEncargadoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucEncargadoKeyReleased

    private void jtxtRucEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtRucEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtRucEncargadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            if (objEncargadoDAO.verificar(jtxtRucEncargado.getText().trim()) && band == true) {
                JOptionPane.showMessageDialog(null, "ENCARGADO YA ESTÁ REGISTRADO", "FERRETERIA MICKY", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (!validar()) {
                    JOptionPane.showMessageDialog(null, "COMPLETAR CAJA DE TEXTO", "FERRETERIA MICKY", JOptionPane.WARNING_MESSAGE);
                } else {
                    objEncargadoTO.setRucencarg(jtxtRucEncargado.getText().toUpperCase().trim());
                    objEncargadoTO.setNombencarg(jtxtnombEncargado.getText().toUpperCase().trim());
                    objEncargadoTO.setDireencarg(jtxtdireccionEncargado.getText().toUpperCase().trim());
                    objEncargadoTO.setCeluencarg(jtxtCelularEncargado.getText().trim());
                    if (sw) {
                        objEncargadoDAO.insert(objEncargadoTO);
                        mensaje = "ENCARGADO REGISTRADO";
                    } else {
                        objEncargadoTO.setIdencargado(Integer.parseInt(jtxtCodEncargado.getText().trim()));
                        objEncargadoDAO.update(objEncargadoTO);
                        mensaje = "ENCARGADO ACTUALIZADO";
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

    private void jtblRegistroEncargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblRegistroEncargadoMouseClicked
        try {
            xidencargado = Integer.parseInt(jtblRegistroEncargado.getValueAt(jtblRegistroEncargado.getSelectedRow(), 0).toString());
            rsEncargado.first();
            do {
                if (xidencargado == rsEncargado.getInt(1)) {
                    jtxtCodEncargado.setText(String.valueOf(rsEncargado.getInt(1)));
                    jtxtRucEncargado.setText(rsEncargado.getString(2));
                    jtxtnombEncargado.setText(rsEncargado.getString(3));
                    jtxtdireccionEncargado.setText(rsEncargado.getString(4));
                    jtxtCelularEncargado.setText(rsEncargado.getString(5));
                    rsEncargado.last();
                }
            } while (rsEncargado.next());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtblRegistroEncargadoMouseClicked

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

    private void jtxtCelularEncargadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtCelularEncargadoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtCelularEncargadoMouseClicked

    private void btnImprimirFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirFechaActionPerformed
        try {
            ruta = "REPEncargado_Date";
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
    private javax.swing.JLabel jLabelCodigoEncargado;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelRUCEncargado;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBuscarEncargado;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelDatosEncargado;
    private javax.swing.JPanel jPanelRegistro;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdateFechaFin;
    private com.toedter.calendar.JDateChooser jdateFechaInicio;
    private javax.swing.JTable jtblRegistroEncargado;
    private javax.swing.JTextField jtxtBuscarEncargado;
    private javax.swing.JTextField jtxtCelularEncargado;
    private javax.swing.JTextField jtxtCodEncargado;
    private javax.swing.JTextField jtxtRucEncargado;
    private javax.swing.JTextField jtxtdireccionEncargado;
    private javax.swing.JTextField jtxtnombEncargado;
    // End of variables declaration//GEN-END:variables

    private void habilitarControles(boolean b) {
        JTextField[] arrJTexFields = {jtxtRucEncargado, jtxtnombEncargado,
            jtxtdireccionEncargado, jtxtCelularEncargado};
        for (JTextField obJTextField : arrJTexFields) {
            obJTextField.setEditable(b);
        }
        jtxtBuscarEncargado.setEditable(!b);
        jtxtRucEncargado.grabFocus();
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
        JTextField[] objTextFields = {jtxtCodEncargado, jtxtBuscarEncargado,
            jtxtRucEncargado, jtxtnombEncargado, jtxtdireccionEncargado,
            jtxtCelularEncargado};
        for (JTextField objTextField : objTextFields) {
            objTextField.setText(null);
        }
        jdateFechaInicio.setCalendar(null);
        jdateFechaFin.setCalendar(null);
    }

    private boolean validar() {
        JTextField[] objTextFields = {jtxtRucEncargado, jtxtnombEncargado,
            jtxtdireccionEncargado, jtxtCelularEncargado};
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
            jtblRegistroEncargado.getColumnModel().getColumn(i).setCellRenderer(objDcr);
        }
    }
}
