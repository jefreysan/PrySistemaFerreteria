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
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String xidentrada = objObject.toString();
            String sql = "SELECT * FROM  ventrada WHERE identrada = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, xidentrada);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return rs;
    }

    @Override
    public void insert(EntradaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_entrada(?,?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getFechaent());
            cs.setString(2, objObjeto.getNroent());
            cs.setString(3, objObjeto.getTipopago());
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
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_update_entrada(?,?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getFechaent());
            cs.setString(2, objObjeto.getNroent());
            cs.setString(3, objObjeto.getTipopago());
            cs.setInt(4, objObjeto.getIdencargado());
            cs.execute();
        } catch (Exception e) {
        }
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

    public ResultSet buscarPorFecha(Object Objecto1, Object Objecto2, Object Objecto3) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String fechaInicio = Objecto1.toString();
        String fechaFin = Objecto2.toString();
        String estado = Objecto3.toString();
        String sql = "SELECT *FROM ventrada where date(fechaent) between ? and ? and tipopago=?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFin);
        ps.setString(3, estado);
        rs = ps.executeQuery();
        return rs;
    }

    public ResultSet buscarPorFecha_Prov(Object Objecto1, Object Objecto2, Object Objecto3, Object Objecto4) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String fechaInicio = Objecto1.toString();
        String fechaFin = Objecto2.toString();
        String estado = Objecto3.toString();
        String idproveedor = Objecto4.toString();
        String sql = "SELECT *FROM ventrada where date(fechaent) between ? and ? and tipopago=? and idproveedor=?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setString(1, fechaInicio);
        ps.setString(2, fechaFin);
        ps.setString(3, estado);
        ps.setString(4, idproveedor);
        rs = ps.executeQuery();
        return rs;
    }

    public String nroSerieEntrada() throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String sql = "SELECT MAX(identrada) from entrada";
        PreparedStatement ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.last();
        return rs.getString(1);
    }

    public double obtenerPrecioPresent(Object objObject, Object objObject2) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String descpresent = objObject.toString();
        String idproducto = objObject2.toString();
        String sql = "SELECT * FROM vpreprecio WHERE descrpresent=? and idproducto=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, descpresent);
        pst.setString(2, idproducto);
        rs = pst.executeQuery();
        rs.last();
        return rs.getDouble(6);
    }
}
