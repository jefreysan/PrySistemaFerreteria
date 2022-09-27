
package DAO;
import Conexion.ConMySql;
import DTO.ProveedorTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class ProveedorDAO implements VentasInterface<ProveedorTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT *FROM vproveedor where CONCAT(rucprove,nombprove) like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        return rs;
    }

    @Override
    public void insert(ProveedorTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_proveedor(?,?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getRucprove());
            cs.setString(2, objObjeto.getNombprove());
            cs.setString(3, objObjeto.getDireprove());
            cs.setString(4, objObjeto.getCeluprove());
            cs.setString(5, objObjeto.getCorreoprove());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(ProveedorTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_update_proveedor(?,?,?,?,?,?)";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdproveedor());
            cs.setString(2, objObjeto.getRucprove());
            cs.setString(3, objObjeto.getNombprove());
            cs.setString(4, objObjeto.getDireprove());
            cs.setString(5, objObjeto.getCeluprove());
            cs.setString(6, objObjeto.getCorreoprove());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(ProveedorTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_delete_proveedor(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdproveedor());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    public boolean verificar(String dni) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "SELECT * FROM  vproveedor where rucprove=?";
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
