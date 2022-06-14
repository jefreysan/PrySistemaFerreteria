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
public class DetalleComprobanteVenta {
    private int iddetallecomprobanteVenta;
    private int idcomprobanteVenta;
    private int idproducto;
    private double pcompradet;
    private int cantidaddet;
    private double importedet;

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

    public double getPcompradet() {
        return pcompradet;
    }

    public void setPcompradet(double pcompradet) {
        this.pcompradet = pcompradet;
    }

    public int getCantidaddet() {
        return cantidaddet;
    }

    public void setCantidaddet(int cantidaddet) {
        this.cantidaddet = cantidaddet;
    }

    public double getImportedet() {
        return importedet;
    }

    public void setImportedet(double importedet) {
        this.importedet = importedet;
    }
    
}
