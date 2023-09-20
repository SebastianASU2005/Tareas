/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entidades.Libro;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author astud
 */
public class DaoLibro {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tienda_JbaPU");
    EntityManager em = emf.createEntityManager();

    public void GuardarLibro(Libro a) {
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
    }

    public void ModificarLibro(int isbn) {
        try {
            Libro l = em.find(Libro.class, isbn);
            l.setAlta(false);
            l.setEjemplares(1400);
            l.setEjemplaresRestantes(l.getEjemplares() - l.getEjemplaresPrestados());
            em.getTransaction().begin();
            em.merge(l);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }
    }
}
