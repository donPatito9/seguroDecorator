/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguros;

import com.seguros.decorador.SeguroDecorador;
import com.seguros.interf.ITarjetadeCredito;
import com.seguros.interf.impl.TarjetadeCredito;
import com.seguros.model.Compra;
/**
 *
 * @author Robinson Concha
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compra c = new Compra(1, "Televisor", 350000);
        
        ITarjetadeCredito compra = new TarjetadeCredito();
        ITarjetadeCredito compraAsegurada = new SeguroDecorador(compra);
        
        compraAsegurada.ingresarCompra(c);
    }
    
}
