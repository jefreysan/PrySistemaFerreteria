/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConMySql;
import DTO.CategoriaTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author JEFREY
 */
public class CategoriaDAO implements VentasInterface<CategoriaTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT *FROM vcategoria where descrcateg like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        return rs;
    }

    @Override
    public void insert(CategoriaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_categoria(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getDescrcateg());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(CategoriaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_update_categoria(?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdcategoria());
            cs.setString(2, objObjeto.getDescrcateg());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(CategoriaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_delete_categoria(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdcategoria());
            cs.execute();
        } catch (Exception e) {
        }
    }

}
