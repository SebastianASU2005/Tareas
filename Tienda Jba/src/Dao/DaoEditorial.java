/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Entidades.Editorial;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author astud
 */
public class DaoEditorial {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Tienda_JbaPU");
    EntityManager em = emf.createEntityManager();

    public void GuardarEditorial(Editorial a) {
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }

    }

    public Editorial BuscarUnEditorialPorId(int id) {
        try {
            if (id == 0) {
                throw new Exception("No hay un id valido");
            }
        } catch (Exception e) {
        }
        try {
            Editorial e = (Editorial) em.createQuery("Select e from Editorial e where e.id=:id").setParameter("id", id).getSingleResult();
            return e;
        } catch (Exception e) {
            throw e;
        }
    }

    public void ModificarEditorial(int id) {
        try {
            Editorial e = em.find(Editorial.class, id);
            e.setAlta(false);
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();
        } catch (Exception e) {
            throw e;
        }

    }
}
