/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConMySql;
import DTO.Pago_EntradaTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author JEFREY
 */
public class Pago_EntradaDAO implements VentasInterface<Pago_EntradaTO> {

    ResultSet rs;
    JOptionPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String xidentrada = objObject.toString();
            String sql = "SELECT * FROM  vpagoentrada WHERE identrada =?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, xidentrada);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
        return rs;

    }

    @Override
    public void insert(Pago_EntradaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_pagoentrada(?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdentrada());
            cs.setDouble(2, objObjeto.getMontoTotal());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @Override
    public void update(Pago_EntradaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Pago_EntradaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet buscarCreditoProveedor(Object Objecto1) throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        int xidproveedor = Integer.parseInt(Objecto1.toString());
        String sql = "SELECT * FROM vpagoentrada where idproveedor=?";
        PreparedStatement ps = cn.prepareStatement(sql);
        ps.setInt(1, xidproveedor);
        rs = ps.executeQuery();
        return rs;
    }

}
