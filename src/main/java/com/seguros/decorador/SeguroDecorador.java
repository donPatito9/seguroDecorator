/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguros.decorador;

import com.seguros.interf.ITarjetadeCredito;
import com.seguros.model.Compra;
/**
 *
 * @author Robinson Concha
 */
public class SeguroDecorador extends CompraDecorador{
  public SeguroDecorador(ITarjetadeCredito compraDecorada) {
  super(compraDecorada);
  }
  
  @Override
  public void ingresarCompra(Compra c) {
   compraDecorada.ingresarCompra(c);
   agregarSeguro(c);
  }
  public void agregarSeguro(Compra c) {
  System.out.println("se agrego un Seguro al producto Adquirido " + c.getProducto());
  }
          
         
}
