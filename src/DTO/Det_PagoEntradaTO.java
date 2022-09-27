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
public class Det_PagoEntradaTO {
   private int idpagoent;
   private int idencargado;
   private String descrpago;
   private double abono;

    public int getIdpagoent() {
        return idpagoent;
    }

    public void setIdpagoent(int idpagoent) {
        this.idpagoent = idpagoent;
    }

    public int getIdencargado() {
        return idencargado;
    }

    public void setIdencargado(int idencargado) {
        this.idencargado = idencargado;
    }

    public String getDescrpago() {
        return descrpago;
    }

    public void setDescrpago(String descrpago) {
        this.descrpago = descrpago;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }


 
}
