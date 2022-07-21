/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author HP
 */
public class EntradaTO {
  private int identrada;
  private int idencargado;
  private int idproveedor;
  private String fechaent;
  private String tipopago;
  private String nroent;
  private double totalent;

    public int getIdentrada() {
        return identrada;
    }

    public void setIdentrada(int identrada) {
        this.identrada = identrada;
    }

    public int getIdencargado() {
        return idencargado;
    }

    public void setIdencargado(int idencargado) {
        this.idencargado = idencargado;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getFechaent() {
        return fechaent;
    }

    public void setFechaent(String fechaent) {
        this.fechaent = fechaent;
    }

    public String getTipopago() {
        return tipopago;
    }

    public void setTipopago(String tipopago) {
        this.tipopago = tipopago;
    }

    public String getNroent() {
        return nroent;
    }

    public void setNroent(String nroent) {
        this.nroent = nroent;
    }

    public double getTotalent() {
        return totalent;
    }

    public void setTotalent(double totalent) {
        this.totalent = totalent;
    }
}
