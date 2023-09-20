/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tienda;

import Tienda.servicios.Service;

/**
 *
 * @author astud
 */
public class TiendaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Service cs = new Service();
        try {
//            cs.LlamarTodoProductos();
//            cs.LlamarProductosNombrePrecio();
//            cs.ProductoPreciosEntre();
//            cs.Portatiles();
//            cs.MostarProductoMasBarato();
//cs.NuevoProducto("macbook",129.43, 5);
//cs.NuevoFabricante("Nepponidas");
cs.CambiarPrecioProducto(12, 130.43);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
