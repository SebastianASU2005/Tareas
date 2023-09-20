/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Editorial;

import Dao.DaoEditorial;
import Entidades.Editorial;

/**
 *
 * @author astud
 */
public class EditorialService {

    DaoEditorial dao = new DaoEditorial();

    public void CrearEditorial() {
        try {
            Editorial a = new Editorial(2, "champa", true);
            dao.GuardarEditorial(a);
        } catch (Exception e) {
            throw e;
        }

    }

    public Editorial BuscarUnEditorial() {
        int id = 2;
        Editorial e = dao.BuscarUnEditorialPorId(id);
        return e;
    }
    public void CambiarDatos(){
    int id;
    id=2;
    dao.ModificarEditorial(id);
    }
}
