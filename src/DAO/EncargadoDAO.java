package DAO;

import Conexion.ConMySql;
import DTO.EncargadoTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class EncargadoDAO implements VentasInterface<EncargadoTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT * FROM  vencargado where CONCAT(rucencarg,nombencarg) like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
        return rs;
    }

    @Override
    public void insert(EncargadoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_encargado(?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getRucencarg());
            cs.setString(2, objObjeto.getNombencarg());
            cs.setString(3, objObjeto.getDireencarg());
            cs.setString(4, objObjeto.getCeluencarg());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(EncargadoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_update_encargado(?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdencargado());
            cs.setString(2, objObjeto.getRucencarg());
            cs.setString(3, objObjeto.getNombencarg());
            cs.setString(4, objObjeto.getDireencarg());
            cs.setString(5, objObjeto.getCeluencarg());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(EncargadoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_delete_encargado(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdencargado());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    public boolean verificar(String dni) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "SELECT * FROM  vencargado where rucencarg=?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, dni);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return false;
    }
}
