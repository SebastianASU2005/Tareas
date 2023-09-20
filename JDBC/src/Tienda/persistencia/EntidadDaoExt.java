/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.persistencia;

import Tienda.Entidades.Fabricante;
import Tienda.Entidades.Producto;
import java.util.ArrayList;
import java.util.Collection;

public class EntidadDaoExt extends DAO {

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";

            consultarBase(sql);

            Producto pro = null;
            Collection<Producto> pros = new ArrayList();
            while (resultado.next()) {
                pro = new Producto();
                pro.setCodigo(resultado.getInt("codigo"));
                pro.setNombre(resultado.getString("nombre"));
                pro.setPrecio(resultado.getDouble("precio"));
                pro.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                pros.add(pro);
            }
            desconectarBase();
            return pros;
        } catch (Exception e) {
            System.out.println("Erro listarproductos");
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> ProductosPrecios() throws Exception {
        try {
            String sql = "SELECT * FROM producto where precio between 120 and 202";

            consultarBase(sql);

            Producto pro = null;
            Collection<Producto> pros = new ArrayList();
            while (resultado.next()) {
                pro = new Producto();
                pro.setCodigo(resultado.getInt("codigo"));
                pro.setNombre(resultado.getString("nombre"));
                pro.setPrecio(resultado.getDouble("precio"));
                pro.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                pros.add(pro);
            }
            desconectarBase();
            return pros;
        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Collection<Producto> BuscarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto where nombre like '%portatil%'";

            consultarBase(sql);

            Producto pro = null;
            Collection<Producto> pros = new ArrayList();
            while (resultado.next()) {
                pro = new Producto();
                pro.setCodigo(resultado.getInt("codigo"));
                pro.setNombre(resultado.getString("nombre"));
                pro.setPrecio(resultado.getDouble("precio"));
                pro.setCodigoFabricante(resultado.getInt("codigo_fabricante"));
                pros.add(pro);
            }
            desconectarBase();
            return pros;
        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public Producto BuscarProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto order by precio asc limit 1";

            consultarBase(sql);

            Producto pro = null;

            while (resultado.next()) {
                pro = new Producto();
                pro.setCodigo(resultado.getInt("codigo"));
                pro.setNombre(resultado.getString("nombre"));
                pro.setPrecio(resultado.getDouble("precio"));
                pro.setCodigoFabricante(resultado.getInt("codigo_fabricante"));

            }
            desconectarBase();
            return pro;
        } catch (Exception e) {

            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }

    public void GuardarProducto(Producto nuevo) throws Exception {
        try {
            String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante)"
                    + "VALUES ( '" + nuevo.getNombre() + "' , '" + nuevo.getPrecio() + "' ,'" + nuevo.getCodigoFabricante() + "');";
            insertarModificarEliminar(sql);
            System.out.println("Producto creado");
            desconectarBase();
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void GuardarFabricante(Fabricante nuevo) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre)"
                    + "VALUES ( '" + nuevo.getNombre() + "');";
            insertarModificarEliminar(sql);
            System.out.println("Producto creado");

        } catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Producto BuscarPorIdProducto(int id) throws Exception {
        try {
            String sql = "Select * from producto where codigo=" + id + ";";
            consultarBase(sql);
            Producto ju = null;
            while (resultado.next()) {
                ju.setCodigo(resultado.getInt(1));
                ju.setNombre(resultado.getString(2));
                ju.setPrecio(resultado.getInt(3));
                ju.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return ju;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void ModificarProductoPrecio(Producto ju) throws Exception {
        try {
            String sql = "UPDATE Producto SET precio = '" + ju.getPrecio() + "' WHERE codigo = '" + ju.getCodigo() + "'";
            insertarModificarEliminar(sql);
            System.out.println("Informacion del producto cambiado exitosamente");
        } catch (Exception e) {
            desconectarBase();
            System.out.println(e.getMessage());
        } finally {
            desconectarBase();
        }
    }

}
