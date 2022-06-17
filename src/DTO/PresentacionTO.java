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
public class PresentacionTO {
   private int idpresentacion;
   private int idudm;
   private String descrpresent;
   private double cantpresent;

    public int getIdpresentacion() {
        return idpresentacion;
    }

    public void setIdpresentacion(int idpresentacion) {
        this.idpresentacion = idpresentacion;
    }

    public int getIdudm() {
        return idudm;
    }

    public void setIdudm(int idudm) {
        this.idudm = idudm;
    }

    public String getDescrpresent() {
        return descrpresent;
    }

    public void setDescrpresent(String descrpresent) {
        this.descrpresent = descrpresent;
    }

    public double getCantpresent() {
        return cantpresent;
    }

    public void setCantpresent(double cantpresent) {
        this.cantpresent = cantpresent;
    }
   
}
