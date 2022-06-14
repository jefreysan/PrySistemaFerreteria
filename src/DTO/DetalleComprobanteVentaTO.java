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
public class DetalleComprobanteVentaTO {
    private int iddetallecomprobanteVenta;
    private int idcomprobanteVenta;
    private int idproducto;
    private double pcompracomp;
    private int cantidadcomp;
    private double importecomp;

    public int getIddetallecomprobanteVenta() {
        return iddetallecomprobanteVenta;
    }

    public void setIddetallecomprobanteVenta(int iddetallecomprobanteVenta) {
        this.iddetallecomprobanteVenta = iddetallecomprobanteVenta;
    }

    public int getIdcomprobanteVenta() {
        return idcomprobanteVenta;
    }

    public void setIdcomprobanteVenta(int idcomprobanteVenta) {
        this.idcomprobanteVenta = idcomprobanteVenta;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public double getPcompracomp() {
        return pcompracomp;
    }

    public void setPcompracomp(double pcompracomp) {
        this.pcompracomp = pcompracomp;
    }

    public int getCantidadcomp() {
        return cantidadcomp;
    }

    public void setCantidadcomp(int cantidadcomp) {
        this.cantidadcomp = cantidadcomp;
    }

    public double getImportecomp() {
        return importecomp;
    }

    public void setImportecomp(double importecomp) {
        this.importecomp = importecomp;
    }

  
    
}
