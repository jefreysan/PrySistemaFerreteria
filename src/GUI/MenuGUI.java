/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import GUI.Registro.ProveedorGUI;
import GUI.Registro.ClienteGUI;
import GUI.ComprobantePago.ComprobantePagoGUI;
import GUI.Registro.EncargadoGUI;
import GUI.Entrada.EntradaGUI;
import GUI.Producto.CategoriaGUI;
import GUI.Producto.PrePrecioGUI;
import GUI.Producto.PresentacionGUI;
import GUI.Producto.ProductoGUI;
import GUI.Producto.UnidadMedidaGUI;
import GUI.Reportes.REPEntrada;
import Library.ReporteClass;
import java.awt.Color;

/**
 *
 * @author HP
 */
public class MenuGUI extends javax.swing.JFrame {

    ReporteClass objReporteClass = new ReporteClass();
    String ruta;

    public MenuGUI() {
        initComponents();
        setVisible(true);
        setTitle("SISTEMAS DE VENTAS - FERRETERIA MICKY");
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        Menu = new javax.swing.JMenuBar();
        Registro = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        Proveedor = new javax.swing.JMenuItem();
        Encargado = new javax.swing.JMenuItem();
        Materiales = new javax.swing.JMenu();
        Producto = new javax.swing.JMenuItem();
        Categoria = new javax.swing.JMenuItem();
        UDM = new javax.swing.JMenuItem();
        Presentacion = new javax.swing.JMenuItem();
        Precios = new javax.swing.JMenuItem();
        Inventario = new javax.swing.JMenu();
        Entradas = new javax.swing.JMenuItem();
        Salidas = new javax.swing.JMenuItem();
        Ventas = new javax.swing.JMenu();
        Comprobante = new javax.swing.JMenuItem();
        Cobranzas = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        REP_Entradas = new javax.swing.JMenuItem();
        REP_Salidas = new javax.swing.JMenuItem();
        REP_Registro = new javax.swing.JMenu();
        REPEncargado = new javax.swing.JMenuItem();
        REPCliente = new javax.swing.JMenuItem();
        REPProveedor = new javax.swing.JMenuItem();
        REP_Productos = new javax.swing.JMenu();
        REPCategoria = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        Soporte = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setForeground(new java.awt.Color(204, 204, 204));

        Registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/registro_menu.png"))); // NOI18N
        Registro.setMnemonic('f');
        Registro.setText("REGISTRO");

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cliente_reg.png"))); // NOI18N
        Cliente.setMnemonic('o');
        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        Registro.add(Cliente);

        Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/proveedor_reg.png"))); // NOI18N
        Proveedor.setMnemonic('s');
        Proveedor.setText("Proveedor");
        Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorActionPerformed(evt);
            }
        });
        Registro.add(Proveedor);

        Encargado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/encargado_reg.png"))); // NOI18N
        Encargado.setMnemonic('a');
        Encargado.setText("Encargado");
        Encargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncargadoActionPerformed(evt);
            }
        });
        Registro.add(Encargado);

        Menu.add(Registro);

        Materiales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/materiales_menu.png"))); // NOI18N
        Materiales.setMnemonic('e');
        Materiales.setText("MATERIALES");

        Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/producto_mat.png"))); // NOI18N
        Producto.setMnemonic('t');
        Producto.setText("Producto");
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        Materiales.add(Producto);

        Categoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/categoria_mat.png"))); // NOI18N
        Categoria.setMnemonic('y');
        Categoria.setText("Categoria");
        Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActionPerformed(evt);
            }
        });
        Materiales.add(Categoria);

        UDM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/udm_mat.png"))); // NOI18N
        UDM.setMnemonic('p');
        UDM.setText("UDM");
        UDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UDMActionPerformed(evt);
            }
        });
        Materiales.add(UDM);

        Presentacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/presentacion_mat.png"))); // NOI18N
        Presentacion.setMnemonic('d');
        Presentacion.setText("Presentacion");
        Presentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresentacionActionPerformed(evt);
            }
        });
        Materiales.add(Presentacion);

        Precios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/preprecio_mat.png"))); // NOI18N
        Precios.setText("Precios");
        Precios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreciosActionPerformed(evt);
            }
        });
        Materiales.add(Precios);

        Menu.add(Materiales);

        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/compras_menu.png"))); // NOI18N
        Inventario.setMnemonic('h');
        Inventario.setText("INVENTARIO");

        Entradas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        Entradas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/entradas_inv.png"))); // NOI18N
        Entradas.setMnemonic('c');
        Entradas.setText("Entradas");
        Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradasActionPerformed(evt);
            }
        });
        Inventario.add(Entradas);

        Salidas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        Salidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salidas_inv.png"))); // NOI18N
        Salidas.setText("Salidas");
        Inventario.add(Salidas);

        Menu.add(Inventario);

        Ventas.setText("VENTAS");

        Comprobante.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        Comprobante.setText("Comprobante");
        Comprobante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprobanteActionPerformed(evt);
            }
        });
        Ventas.add(Comprobante);

        Menu.add(Ventas);

        Cobranzas.setText("COBRANZAS");

        jMenuItem6.setText("Proveedores");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Cobranzas.add(jMenuItem6);

        jMenuItem7.setText("Clientes");
        Cobranzas.add(jMenuItem7);

        Menu.add(Cobranzas);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/reportes_menu.png"))); // NOI18N
        jMenu3.setText("REPORTES");

        REP_Entradas.setText("Entradas");
        REP_Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REP_EntradasActionPerformed(evt);
            }
        });
        jMenu3.add(REP_Entradas);

        REP_Salidas.setText("Salidas");
        jMenu3.add(REP_Salidas);

        REP_Registro.setText("Registros");

        REPEncargado.setText("Encargados");
        REPEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPEncargadoActionPerformed(evt);
            }
        });
        REP_Registro.add(REPEncargado);

        REPCliente.setText("Clientes");
        REPCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPClienteActionPerformed(evt);
            }
        });
        REP_Registro.add(REPCliente);

        REPProveedor.setText("Proveedores");
        REPProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPProveedorActionPerformed(evt);
            }
        });
        REP_Registro.add(REPProveedor);

        jMenu3.add(REP_Registro);

        REP_Productos.setText("Productos");

        REPCategoria.setText("Categoria");
        REPCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REPCategoriaActionPerformed(evt);
            }
        });
        REP_Productos.add(REPCategoria);

        jMenuItem9.setText("UDM");
        REP_Productos.add(jMenuItem9);

        jMenuItem10.setText("Producto");
        REP_Productos.add(jMenuItem10);

        jMenu3.add(REP_Productos);

        Menu.add(jMenu3);

        Soporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/soporte_menu.png"))); // NOI18N
        Soporte.setText("SOPORTE");
        Menu.add(Soporte);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncargadoActionPerformed
        EncargadoGUI e = new EncargadoGUI();
        MenuGUI.desktopPane.add(e);
        e.setVisible(true);
        e.setSize(1275, 405);
        e.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_EncargadoActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        ClienteGUI c = new ClienteGUI();
        MenuGUI.desktopPane.add(c);
        c.setVisible(true);
        c.setSize(1265, 400);
        c.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_ClienteActionPerformed

    private void ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorActionPerformed
        ProveedorGUI pv = new ProveedorGUI();
        MenuGUI.desktopPane.add(pv);
        pv.setVisible(true);
        pv.setSize(1275, 445);
        pv.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_ProveedorActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        ProductoGUI prod = new ProductoGUI();
        MenuGUI.desktopPane.add(prod);
        prod.setVisible(true);
        prod.setSize(1343, 505);
        prod.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_ProductoActionPerformed

    private void PresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresentacionActionPerformed
        PresentacionGUI pre = new PresentacionGUI();
        MenuGUI.desktopPane.add(pre);
        pre.setVisible(true);
        pre.setSize(897, 350);
        pre.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_PresentacionActionPerformed

    private void CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActionPerformed
        CategoriaGUI cat = new CategoriaGUI();
        MenuGUI.desktopPane.add(cat);
        cat.setVisible(true);
        cat.setSize(905, 340);
        cat.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_CategoriaActionPerformed

    private void UDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UDMActionPerformed
        UnidadMedidaGUI udm = new UnidadMedidaGUI();
        MenuGUI.desktopPane.add(udm);
        udm.setVisible(true);
        udm.setSize(815, 350);
        udm.getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_UDMActionPerformed

    private void PreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreciosActionPerformed
        MenuGUI.desktopPane.add(new PrePrecioGUI());
    }//GEN-LAST:event_PreciosActionPerformed

    private void EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradasActionPerformed
        MenuGUI.desktopPane.add(new EntradaGUI());
    }//GEN-LAST:event_EntradasActionPerformed

    private void REP_EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REP_EntradasActionPerformed
        MenuGUI.desktopPane.add(new REPEntrada());
    }//GEN-LAST:event_REP_EntradasActionPerformed

    private void ComprobanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprobanteActionPerformed
        MenuGUI.desktopPane.add(new ComprobantePagoGUI());
    }//GEN-LAST:event_ComprobanteActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        MenuGUI.desktopPane.add(new PagoEntradaGUI());
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void REPEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPEncargadoActionPerformed
        ruta = "REPEncargado";
        objReporteClass.generarReporte(ruta);
    }//GEN-LAST:event_REPEncargadoActionPerformed

    private void REPClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPClienteActionPerformed
        ruta = "REPCliente";
        objReporteClass.generarReporte(ruta);
    }//GEN-LAST:event_REPClienteActionPerformed

    private void REPProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPProveedorActionPerformed
        ruta = "REPProveedor";
        objReporteClass.generarReporte(ruta);
    }//GEN-LAST:event_REPProveedorActionPerformed

    private void REPCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REPCategoriaActionPerformed
         ruta = "REPCategoria";
        objReporteClass.generarReporte(ruta);
    }//GEN-LAST:event_REPCategoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Categoria;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenu Cobranzas;
    private javax.swing.JMenuItem Comprobante;
    private javax.swing.JMenuItem Encargado;
    private javax.swing.JMenuItem Entradas;
    private javax.swing.JMenu Inventario;
    private javax.swing.JMenu Materiales;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenuItem Precios;
    private javax.swing.JMenuItem Presentacion;
    private javax.swing.JMenuItem Producto;
    private javax.swing.JMenuItem Proveedor;
    private javax.swing.JMenuItem REPCategoria;
    private javax.swing.JMenuItem REPCliente;
    private javax.swing.JMenuItem REPEncargado;
    private javax.swing.JMenuItem REPProveedor;
    private javax.swing.JMenuItem REP_Entradas;
    private javax.swing.JMenu REP_Productos;
    private javax.swing.JMenu REP_Registro;
    private javax.swing.JMenuItem REP_Salidas;
    private javax.swing.JMenu Registro;
    private javax.swing.JMenuItem Salidas;
    private javax.swing.JMenu Soporte;
    private javax.swing.JMenuItem UDM;
    private javax.swing.JMenu Ventas;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables

}
