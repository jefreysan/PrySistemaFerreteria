/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import java.sql.ResultSet;

/**
 *
 * @author JEFREY
 */
public interface VentasInterface<Objeto> {
      public ResultSet buscar(Object objObject);

    public void insert(Objeto objObjeto) ;

    public void update(Objeto objObjeto) ;

    public void delete(Objeto objObjeto) ;  
}
