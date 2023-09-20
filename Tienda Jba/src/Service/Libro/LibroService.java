/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Libro;

import Dao.DaoLibro;
import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;

/**
 *
 * @author astud
 */
public class LibroService {
    DaoLibro dao=new DaoLibro();
 public void CrearLibro(Autor a,Editorial b){ 
     try {
         Libro c =new Libro(3421, "Mesias", 2005,1200, 1000, 0, true, a, b);
         c.setEjemplaresRestantes(c.getEjemplares()-c.getEjemplaresPrestados());
         dao.GuardarLibro(c);
     } catch (Exception e) {
     }
 }
 public void ModificarDatos(){
     try {
     int isbn=3421;
     dao.ModificarLibro(isbn);
     } catch (Exception e) {
     }
 }
}
