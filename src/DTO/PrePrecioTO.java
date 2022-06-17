/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HP
 */
public class PrePrecioTO {
   private int idpreprecio;
   private int idproducto;
   private int idpresentacion;
   private double preprecio;

    public int getIdpreprecio() {
        return idpreprecio;
    }

    public void setIdpreprecio(int idpreprecio) {
        this.idpreprecio = idpreprecio;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdpresentacion() {
        return idpresentacion;
    }

    public void setIdpresentacion(int idpresentacion) {
        this.idpresentacion = idpresentacion;
    }

    public double getPreprecio() {
        return preprecio;
    }

    public void setPreprecio(double preprecio) {
        this.preprecio = preprecio;
    }
   
}
