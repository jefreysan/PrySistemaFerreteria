/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author JEFREY
 */
public class ProductoTO {
    
    private int idproducto;
    private int idunidadmedida;
    private int idcategoria;
    private String nombprod;
    private double pcompraprod;
    private double pventaprod;
    private double cantiprod;

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getIdunidadmedida() {
        return idunidadmedida;
    }

    public void setIdunidadmedida(int idunidadmedida) {
        this.idunidadmedida = idunidadmedida;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNombprod() {
        return nombprod;
    }

    public void setNombprod(String nombprod) {
        this.nombprod = nombprod;
    }

    public double getPventaprod() {
        return pventaprod;
    }

    public double getPcompraprod() {
        return pcompraprod;
    }

    public void setPcompraprod(double pcompraprod) {
        this.pcompraprod = pcompraprod;
    }

    public void setPventaprod(double pventaprod) {
        this.pventaprod = pventaprod;
    }

    public double getCantiprod() {
        return cantiprod;
    }

    public void setCantiprod(double cantiprod) {
        this.cantiprod = cantiprod;
    }
}
