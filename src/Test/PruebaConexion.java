/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import Conexion.ConMySql;
import java.sql.Connection;

/**
 *
 * @author Jefrey
 */
public class PruebaConexion {
    public static void main(String[] args) {
        try {
            Connection cn = ConMySql.getInstance().getConection();
            System.out.println("CONEXION ESTABLECIDA");
        } catch (Exception e) {
            System.out.println("ERROR"+e);
        }
    }
}
