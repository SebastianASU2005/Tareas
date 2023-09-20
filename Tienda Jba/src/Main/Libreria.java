/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Service.Autor.AutorService;
import Service.Editorial.EditorialService;
import Service.Libro.LibroService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author astud
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AutorService as = new AutorService();
        EditorialService es = new EditorialService();
        LibroService ls = new LibroService();
        try {
//            as.CrearAutor();
//            es.CrearEditorial();
//            ls.CrearLibro(as.BuscarAutorId(),es.BuscarUnEditorial());
//as.CambiarDatos();
//es.CambiarDatos();
//ls.ModificarDatos();
as.BuscarAutorPorNombre();
        } catch (Exception e) {
            throw e;
        }

    }

}
