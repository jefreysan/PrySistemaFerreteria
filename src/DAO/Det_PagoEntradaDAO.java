
package DAO;

import Conexion.ConMySql;
import DTO.Det_PagoEntradaTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Det_PagoEntradaDAO implements VentasInterface<Det_PagoEntradaTO> {

    ResultSet rs;
    JOptionPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Det_PagoEntradaTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_detpagoentrada(?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdpagoent());
            cs.setInt(2, objObjeto.getIdencargado());
            cs.setDouble(3, objObjeto.getAbono());
            cs.setString(4, objObjeto.getDescrpago());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @Override
    public void update(Det_PagoEntradaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Det_PagoEntradaTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
