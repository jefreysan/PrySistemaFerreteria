/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConMySql;
import DTO.ProductoTO;
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
public class ProductoDAO implements VentasInterface<ProductoTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT * FROM  vproducto where descrprod like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return rs;

    }

    @Override
    public void insert(ProductoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_producto(?,?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdcategoria());
            cs.setInt(2, objObjeto.getIdunidadmedida());
            cs.setString(3, objObjeto.getNombprod());
            cs.setDouble(4, objObjeto.getPcompraprod());
            cs.setDouble(5, objObjeto.getPventaprod());
            cs.setDouble(6, objObjeto.getCantiprod());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(ProductoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_update_producto(?,?,?,?,?,?,?)";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdproducto());
            cs.setInt(2, objObjeto.getIdcategoria());
            cs.setInt(3, objObjeto.getIdunidadmedida());
            cs.setString(4, objObjeto.getNombprod());
            cs.setDouble(5, objObjeto.getPcompraprod());
            cs.setDouble(6, objObjeto.getPventaprod());
            cs.setDouble(7, objObjeto.getCantiprod());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(ProductoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_delete_producto(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdproducto());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    public int obtenerCodProducto() {
        int codproducto=0;
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "SELECT max(idproducto) from vproducto";
            PreparedStatement ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                codproducto = rs.getInt(1);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return codproducto;
    }
}
