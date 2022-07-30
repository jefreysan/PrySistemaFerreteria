/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.ConMySql;
import DTO.PrePrecioTO;
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
public class PrePrecioDAO implements VentasInterface<PrePrecioTO> {

    JRootPane rootPane;
    ResultSet rs;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT *FROM vpreprecio where descrprod like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        return rs;
    }

    @Override
    public void insert(PrePrecioTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_preprecio(?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdproducto());
            cs.setInt(2, objObjeto.getIdpresentacion());
            cs.setDouble(3, objObjeto.getPreprecio());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(PrePrecioTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_update_preprecio(?,?,?,?)";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdpreprecio());
            cs.setInt(2, objObjeto.getIdproducto());
            cs.setInt(3, objObjeto.getIdpresentacion());
            cs.setDouble(4, objObjeto.getPreprecio());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(PrePrecioTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_delete_preprecio(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdpreprecio());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    public String obtenerUDM(Object objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String descpresent = objObject.toString();
        String sql = "SELECT * FROM vpresentacion WHERE descrpresent=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, descpresent);
        rs = pst.executeQuery();
        rs.last();
        String resultado = rs.getString(2);
        return resultado;
    }

    public int obtenerIDPresent(Object objObject, Object objObject2) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String descudm = objObject.toString();
        String descpresent = objObject2.toString();
        String sql = "SELECT * FROM vpresentacion WHERE descrudm=? and descrpresent=?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, descudm);
        pst.setString(2, descpresent);
        rs = pst.executeQuery();
        rs.last();
        return rs.getInt(1);
    }
}
