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
public class ComprobanteTO {

    private int idcomprobante;
    private int idencargado;
    private int idcliente;
    private String nrocomp;
    private double subTotalcomp;
    private double igvcomp;
    private int idtipopago;
    private double totalcomp;

    public int getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(int idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public int getIdencargado() {
        return idencargado;
    }

    public void setIdencargado(int idencargado) {
        this.idencargado = idencargado;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNrocomp() {
        return nrocomp;
    }

    public void setNrocomp(String nrocomp) {
        this.nrocomp = nrocomp;
    }

    public double getSubTotalcomp() {
        return subTotalcomp;
    }

    public void setSubTotalcomp(double subTotalcomp) {
        this.subTotalcomp = subTotalcomp;
    }

    public double getIgvcomp() {
        return igvcomp;
    }

    public void setIgvcomp(double igvcomp) {
        this.igvcomp = igvcomp;
    }

    public int getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(int idtipopago) {
        this.idtipopago = idtipopago;
    }

    public double getTotalcomp() {
        return totalcomp;
    }

    public void setTotalcomp(double totalcomp) {
        this.totalcomp = totalcomp;
    }

  
}
