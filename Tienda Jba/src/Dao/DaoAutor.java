/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entidades.Autor;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author astud
 */
public class DaoAutor {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tienda_JbaPU");
    EntityManager em = emf.createEntityManager();

    public void GuardarAutor(Autor a) {
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;

        }
    }

    public Autor BuscarAutorPorId(int id) {
        try {
            Autor a = (Autor) em.createQuery("Select a from Autor a where a.id=:id").setParameter("id", id).getSingleResult();
            return a;
        } catch (Exception e) {
            throw e;
        }

    }

    public void ModificarAutor(int id) {
        try {
            Autor a = em.find(Autor.class, id);
            a.setNombre("Fran Sinatra");
            a.setAlta(false);
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
    }

    public Autor BucarPorNombreUno(String nombre) {
        try {
            Autor a = (Autor) em.createQuery("Select a from Autor a where a.nombre=:nombre").setParameter("nombre", nombre).getSingleResult();
            return a;
        } catch (Exception e) {
            throw e;
        }

    }
}
