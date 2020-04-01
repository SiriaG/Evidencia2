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
public class ListaClientes {
    
    private int nocliente;
    private String nombre;
    private String direccion;
    private int cp;
    private String ciudad;
    private String estado;
    private String pais;
    private long telefono;
    private String cumple;
    private String correo;
    private String contrasena;

    public int getNocliente() {
        return nocliente;
    }

    public void setNocliente(int nocliente) {
        this.nocliente = nocliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCumple() {
        return cumple;
    }

    public void setCumple(String cumple) {
        this.cumple = cumple;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ListaClientes(int nocliente, String nombre, String direccion, int cp, String ciudad, String estado,
            String pais, long telefono, String cumple, String correo, String contrasena) {
        this.nocliente = nocliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cp = cp;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
        this.telefono = telefono;
        this.cumple = cumple;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    
}
