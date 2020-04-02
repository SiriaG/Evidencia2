/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author gmndi
 */
public class Cuentas {
    public int NoCuenta;
    public int NoCliente;
    public String Tipo;
    public double monto;

    public Cuentas(int NoCuenta, int NoCliente, String Tipo, double monto) {
        this.NoCuenta = NoCuenta;
        this.NoCliente = NoCliente;
        this.Tipo = Tipo;
        this.monto = monto;
    }
    
    

    public int getNoCuenta() {
        return NoCuenta;
    }

    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }

    public int getNoCliente() {
        return NoCliente;
    }

    public void setNoCliente(int NoCliente) {
        this.NoCliente = NoCliente;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public void addMonto(double valor){
        this.monto = this.monto+valor;
    }
    
    public double getMonto(){
        return monto;
    }
    
    public enum Tipo{
        debito("Debito"), retiro("Retiro");
        String valor;
        
        Tipo(String valor){
            this.valor = valor;
            
        }
        
        public String getValor(){
            return this.valor;
        }
    }
}
