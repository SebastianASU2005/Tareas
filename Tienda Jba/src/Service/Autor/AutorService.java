/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Autor;

import Dao.DaoAutor;
import Entidades.Autor;

/**
 *
 * @author astud
 */
public class AutorService {

    DaoAutor dao = new DaoAutor();

    public void CrearAutor() {
        try {
            Autor a = new Autor(2, "Jose andres", true);
            dao.GuardarAutor(a);
        } catch (Exception e) {
            throw e;
        }
    }

    public Autor BuscarAutorId() {
        int id;
        id = 1;
        Autor a = dao.BuscarAutorPorId(id);
        return a;
    }

    public void CambiarDatos() {
        int id = 1;
        dao.ModificarAutor(id);
    }

    public void BuscarAutorPorNombre() {
    String nombre="Jose andres";
    Autor a=dao.BucarPorNombreUno(nombre);
        System.out.println(a);
    }

}
