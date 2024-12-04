package org.ifpr.crudta.banco;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class GenericDAO<E> {

    private final Class<E> classe;
    private final EntityManager entityManager;

    public GenericDAO(Class<E> classe) {
        entityManager = ConectorBanco.getInstance().createEntityManager();
        this.classe = classe;
    }

    public void create(E entidade) {
        entityManager.getTransaction().begin();
        entityManager.persist(entidade);
        entityManager.getTransaction().commit();
    }

    public void update(E entidade) {
        entityManager.getTransaction().begin();
        entityManager.merge(entidade);
        entityManager.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public List<E> list() {
        String hqlList = "from Usuario";
        Query list = entityManager.createQuery(hqlList);
        return (List<E>) list.getResultList();
    }

    public void delete(E entidade) {
        entityManager.getTransaction().begin();
        entityManager.remove(entidade);
        entityManager.getTransaction().commit();
    }

    public E findById(int id) {
        return entityManager.find(classe, id);
    }

}
