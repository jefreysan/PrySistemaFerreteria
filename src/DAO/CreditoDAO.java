/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Conexion.ConMySql;
import DTO.CreditoTO;
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
public class CreditoDAO implements VentasInterface<CreditoTO> {

    ResultSet rs;
    JOptionPane rootPane;

    @Override
    public ResultSet buscar(Object objObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void insert(CreditoTO objObjeto) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            String sql = "CALL sp_insert_credito(?,?);";
            CallableStatement cs = cn.prepareCall(sql);
            cs.setInt(1, objObjeto.getIdcomprobante());
            cs.setDouble(2, objObjeto.getDeudacred());
            cs.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @Override
    public void update(CreditoTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(CreditoTO objObjeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     public int obternerIDCredito() throws Exception {
        Connection cn = ConMySql.getInstance().getConection();
        String sql = "SELECT *FROM vcredito";
        PreparedStatement ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.last();
        return rs.getInt(1);
    }
    
    
    public ResultSet buscarCreditoCliente(Object Objecto1, Object Objecto2)throws Exception  {
            Connection cn = ConMySql.getInstance().getConection();
            int xidcliente = Integer.parseInt(Objecto1.toString());
            int xidtipopago = Integer.parseInt(Objecto2.toString());
            String sql = "CALL sp_buscar_creditocliente(?,?);";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, xidcliente);
            ps.setInt(2, xidtipopago);
            rs = ps.executeQuery();
            return rs;  
    }

}
