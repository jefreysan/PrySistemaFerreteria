/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author JEFREY
 */
public class CreditoTO {
    
  private int idcredito;
  private int idcomprobante;
  private double deudacred;
  
    public int getIdcredito() {
        return idcredito;
    }

    public void setIdcredito(int idcredito) {
        this.idcredito = idcredito;
    }

    public int getIdcomprobante() {
        return idcomprobante;
    }

    public void setIdcomprobante(int idcomprobante) {
        this.idcomprobante = idcomprobante;
    }

    public double getDeudacred() {
        return deudacred;
    }

    public void setDeudacred(double deudacred) {
        this.deudacred = deudacred;
    }   
}
