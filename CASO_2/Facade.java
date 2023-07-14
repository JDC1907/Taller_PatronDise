/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CASO_2;

import CASO_2.Sistema.*;

/**
 *
 * @author sebas
 */
public class Facade {
    
    public void otherOperation(){
        
    }
    public static void purchase(Plataforma p){
        Facturacion.factura(p.getDinero());
        Compra.compraProducto(p.getDinero());
        Registro.registroVenta(p.getNombre());
    }
    
}
