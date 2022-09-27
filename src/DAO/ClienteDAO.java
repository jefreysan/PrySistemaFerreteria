
package DAO;
import Conexion.ConMySql;
import DTO.ClienteTO;
import Interfaz.VentasInterface;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

public class ClienteDAO implements VentasInterface<ClienteTO> {

    ResultSet rs;
    JRootPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String nombre = "%" + objObject + "%";
            String sql = "SELECT * FROM  vcliente where CONCAT(rucclien,nombclien) like ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
        return rs;
    }

    @Override
    public void insert(ClienteTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_cliente(?,?,?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setString(1, objObjeto.getRucclien());
            cs.setString(2, objObjeto.getNombclien());
            cs.setString(3, objObjeto.getDireclien());
            cs.setString(4, objObjeto.getCeluclien());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void update(ClienteTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_update_cliente(?,?,?,?,?)";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdcliente());
            cs.setString(2, objObjeto.getRucclien());
            cs.setString(3, objObjeto.getNombclien());
            cs.setString(4, objObjeto.getDireclien());
            cs.setString(5, objObjeto.getCeluclien());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    @Override
    public void delete(ClienteTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "call sp_delete_cliente(?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdcliente());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    public boolean verificar(String dni) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "SELECT * FROM  vcliente where rucclien=?";
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
