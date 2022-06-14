/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.ConMySql;
import DTO.DetalleCreditoTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DetalleCreditoDAO implements VentasInterface<DetalleCreditoTO> {

    ResultSet rs;
    JOptionPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(DetalleCreditoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_detallecredito(?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdcredito());
            cs.setDouble(2, objObjeto.getAbonodet());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @Override
    public void update(DetalleCreditoTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(DetalleCreditoTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
