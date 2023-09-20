/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.servicios;

import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;
import Tienda.persistencia.EntidadDaoExt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author astud
 */
public class Service {

    private EntidadDaoExt dao;

    public Service() {
        this.dao = new EntidadDaoExt();
    }

    public void LlamarTodoProductos() throws Exception {
        try {
            Collection<Producto> pros = dao.listarProductos();

            if (pros.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            } else {
                for (Producto pro : pros) {
                    System.out.println(pro);
                }
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void LlamarProductosNombrePrecio() throws Exception {
        try {
            Collection<Producto> pros = dao.listarProductos();

            if (pros.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            } else {
                for (Producto pro : pros) {
                    System.out.println("Nombre del producto: " + pro.getNombre() + " precio: " + pro.getPrecio());
                }
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void ProductoPreciosEntre() throws Exception {
        try {
            Collection<Producto> pros = dao.ProductosPrecios();

            if (pros.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            } else {
                for (Producto pro : pros) {
                    System.out.println(pro);
                }
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void Portatiles() throws Exception {
        try {
            Collection<Producto> pros = dao.BuscarPortatiles();

            if (pros.isEmpty()) {
                throw new Exception("No hay productos que mostrar");
            } else {
                for (Producto pro : pros) {
                    System.out.println(pro);
                }
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void MostarProductoMasBarato() throws Exception {
        try {
            Producto pro = dao.BuscarProductoMasBarato();

            if (pro == null) {
                throw new Exception("No hay producto que mostrar");
            } else {
                System.out.println(pro);
            }

        } catch (Exception e) {
            throw e;
        }

    }

    public void NuevoProducto(String nombre, double precio, int codigoF) throws Exception {
        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe tener un nombre");
            }
            if (precio == 0) {
                throw new Exception("Debe tener un precio");
            }
            if (codigoF == 0) {
                throw new Exception("Debe tener un fabricante");
            }
            Producto nuevo = new Producto();
            nuevo.setNombre(nombre);
            nuevo.setPrecio(precio);
            nuevo.setCodigoFabricante(codigoF);
            dao.GuardarProducto(nuevo);

        } catch (Exception e) {
            throw e;
        }
    }

    public void NuevoFabricante(String nombre) throws Exception {
        try {

            if (nombre == null || nombre.trim().isEmpty()) {
                throw new Exception("Debe tener un nombre");
            }

            Fabricante nuevo = new Fabricante();
            nuevo.setNombre(nombre);

            dao.GuardarFabricante(nuevo);

        } catch (Exception e) {
            throw e;
        }
    }

    public void CambiarPrecioProducto(int id, double precioN) throws Exception {
        try {
            Producto ju = dao.BuscarPorIdProducto(id);
            if (ju.getPrecio() == precioN) {
                throw new Exception("El precio que desea cambiar es el mismo precio del producto que ya le fue asignado");
            }
            dao.ModificarProductoPrecio(ju);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
