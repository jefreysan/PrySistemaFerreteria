/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.ConMySql;
import DTO.DetalleEntradaTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author HP
 */
public class DetalleEntradaDAO implements VentasInterface<DetalleEntradaTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(DetalleEntradaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_detalleentrada(?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdentrada());
            cs.setInt(2, objObjeto.getIdproducto());
            cs.setDouble(3, objObjeto.getPcompraent());
            cs.setInt(4, objObjeto.getCantidadent());
            cs.setDouble(5, objObjeto.getImporteent());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(DetalleEntradaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(DetalleEntradaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
