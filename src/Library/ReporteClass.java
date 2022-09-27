/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import Conexion.ConMySql;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author HP
 */
public class ReporteClass {

    public void generarReporte(String ruta) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String direccion = System.getProperty("user.dir") + "\\src\\Reportes\\" + ruta + ".jrxml";
            JasperReport reporte = JasperCompileManager.compileReport(direccion);
            JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, null, cn);
            JasperViewer view = new JasperViewer(mostrarReporte, false);
            view.setTitle("REPORTE FERRETERIA MICKY");
            view.setExtendedState(MAXIMIZED_BOTH);
            view.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void generarReporte_Date(String ruta, String fechaInicio, String fechaFinal) {
            try {
                Connection cn = ConMySql.getInstance().getConection();
                String direccion = System.getProperty("user.dir") + "\\src\\Reportes\\" + ruta + ".jrxml";
                JasperReport reporte = JasperCompileManager.compileReport(direccion);
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("fechaInicio", fechaInicio);
                map.put("fechaFin", fechaFinal);
                JasperPrint mostrarReporte = JasperFillManager.fillReport(reporte, map, cn);
                JasperViewer view = new JasperViewer(mostrarReporte, false);
                view.setTitle("REPORTE FERRETERIA MICKY");
                view.setExtendedState(MAXIMIZED_BOTH);
                view.setVisible(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "FERRETERIA MICKY", JOptionPane.ERROR_MESSAGE);
            }
    }
}
