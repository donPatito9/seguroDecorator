/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguros.model;

/**
 *
 * @author Robinson Concha
 */
public class Compra {
    private int id;
    private String producto;
    private int precio;
    
    public Compra(){}
    public Compra(int id, String producto, int precio){
    this.id = id;
    this.producto = producto;
    this.precio = precio;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
