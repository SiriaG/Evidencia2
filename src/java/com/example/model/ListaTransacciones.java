/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author andi9
 */
public class ListaTransacciones {
    
    
    private int noCuenta;
    private int noCuenta2;
    public static int monto;
    
    


public ListaTransacciones (int noCuenta, int noCuenta2, int monto){

    this.noCuenta = noCuenta;
    this.noCuenta2 = noCuenta2;
    this.monto = monto;
    

}

public int getnoCuenta(){
    return noCuenta;
    
}

public void setnoCuenta(){
    
    this.noCuenta = noCuenta;
}

public void setnoCuenta2(){
    
    this.noCuenta2 = noCuenta2;
}

public int getnoCuenta2(){
    return noCuenta2;
    
}

public int getMonto(){
    return monto;
    
}

public void setMonto(){
    
    this.monto = monto;
}


  @Override
    public String toString() {
        return "Lista Transacciones{" + "Cuenta del cliente=" + noCuenta + "Cuenta a depositar" 
                + noCuenta2 + "Monto a depositar" + monto+ '}';
    }
    









}



