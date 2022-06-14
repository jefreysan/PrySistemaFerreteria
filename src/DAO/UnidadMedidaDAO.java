/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.ConMySql;
import DTO.UnidadMedidaTO;
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
public class UnidadMedidaDAO implements VentasInterface<UnidadMedidaTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT *FROM vunidadmedida where descrunid like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        return rs;
    }

    @Override
    public void insert(UnidadMedidaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_unidadmedida(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getDescrunid());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(UnidadMedidaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_update_unidadmedida(?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdunidadmedida());
            cs.setString(2, objObjeto.getDescrunid());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(UnidadMedidaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_delete_unidadmedida(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdunidadmedida());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

}
