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
public abstract class CompraDecorador implements ITarjetadeCredito{
  protected ITarjetadeCredito compraDecorada;
  
  public CompraDecorador(ITarjetadeCredito compraDecorada){
   this.compraDecorada = compraDecorada; 
 }
  @Override
  public void ingresarCompra(Compra c) {
  this.compraDecorada.ingresarCompra(c);
  }
}
