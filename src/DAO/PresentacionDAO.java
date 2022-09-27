/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.ConMySql;
import DTO.PresentacionTO;
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
public class PresentacionDAO implements VentasInterface<PresentacionTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT *FROM vpresentacion where descrudm like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        return rs;
    }

    @Override
    public void insert(PresentacionTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_presentacion(?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdudm());
            cs.setString(2, objObjeto.getDescrpresent());
            cs.setDouble(3, objObjeto.getCantpresent());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(PresentacionTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_update_presentacion(?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdpresentacion());
            cs.setInt(2, objObjeto.getIdudm());
            cs.setString(3, objObjeto.getDescrpresent());
            cs.setDouble(4, objObjeto.getCantpresent());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(PresentacionTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_delete_presentacion(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdpresentacion());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    public ResultSet buscarPresentacion(Object objObject) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String xdescrUDM = objObject.toString();
        String sql = "SELECT * FROM vpresentacion WHERE descrudm =?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, xdescrUDM);
        rs = pst.executeQuery();
        return rs;
    }

    public String obtener_Valor(Object objObject, Object objObject2) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String xdescrUDM = objObject.toString();
        String xdescrPresent = objObject2.toString();
        String sql = "SELECT * FROM vpresentacion WHERE descrudm =? and  descrpresent =?";
        PreparedStatement pst = cn.prepareStatement(sql);
        pst.setString(1, xdescrUDM);
        pst.setString(2, xdescrPresent);
        rs = pst.executeQuery();
        rs.next();
        return rs.getString(4);
    }
}
