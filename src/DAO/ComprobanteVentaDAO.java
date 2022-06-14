/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.ConMySql;
import DTO.ComprobanteVentaTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author HP
 */
public class ComprobanteVentaDAO implements VentasInterface<ComprobanteVentaTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(ComprobanteVentaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_comprobante(?,?,?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdencargado());
            cs.setInt(2, objObjeto.getIdcliente());
            cs.setInt(3, objObjeto.getIdtipopago());
            cs.setString(4, objObjeto.getNrocomp());
            cs.setDouble(5, objObjeto.getSubTotalcomp());
            cs.setDouble(6, objObjeto.getIgvcomp());
            cs.setDouble(7, objObjeto.getTotalcomp());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(ComprobanteVentaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(ComprobanteVentaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int obternerIDIngreso() throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String sql = "SELECT *FROM vcomprobante";
        PreparedStatement ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.last();
        return rs.getInt(1);
    }

    public String NroSerieComprobante() {
        String serie = "";
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "SELECT max(idcomprobante) from comprobante";
            PreparedStatement ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                serie = rs.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
        return serie;
    }
    
        public ResultSet buscarPorFecha(Object Objecto1, Object Objecto2) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String fechaInicio = Objecto1.toString();
        String fechaFin = Objecto2.toString();
        String sql = "SELECT *FROM vcomprobante where date(fechacomp) between ? and ?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFin);
        rs = ps.executeQuery();
        return rs;
    }
}
