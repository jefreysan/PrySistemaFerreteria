/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.ConMySql;
import DTO.EntradaTO;
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
public class EntradaDAO implements VentasInterface<EntradaTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(EntradaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_entrada(?,?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getFechaent());
            cs.setString(2, objObjeto.getNroent());
            cs.setInt(3, objObjeto.getIdtipago());
            cs.setInt(4, objObjeto.getIdencargado());
            cs.setInt(5, objObjeto.getIdproveedor());
            cs.setDouble(6, objObjeto.getTotalent());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(EntradaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(EntradaTO objObjeto) {
       try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_anular_entrada(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdentrada());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    public int obternerIDIngreso() throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String sql = "SELECT *FROM ventrada";
        PreparedStatement ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.last();
        return rs.getInt(1);
    }

    public ResultSet buscarPorFecha(Object Objecto1, Object Objecto2,Object Objecto3) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String fechaInicio = Objecto1.toString();
        String fechaFin = Objecto2.toString();
        String estado = Objecto3.toString();
        String sql = "SELECT *FROM ventrada where date(fechaent) between ? and ? and descrpago=?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFin);
        ps.setString(3, estado);
        rs = ps.executeQuery();
        return rs;
    }
}
