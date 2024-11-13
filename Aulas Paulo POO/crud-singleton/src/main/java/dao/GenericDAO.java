package dao;

import conector.ConectorBanco;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;

import java.util.List;

public abstract class GenericDAO<T> {

    protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    protected Class<T> classe;

    public GenericDAO(Class<T> classe) {
        entityManagerFactory = ConectorBanco.getConnection();
        entityManager = entityManagerFactory.createEntityManager();
        this.classe = classe;
    }

    public void create(T tipo) {
        entityManager.getTransaction().begin();
        entityManager.persist(tipo);
        entityManager.getTransaction().commit();
    }

    public void update(T tipo) {
        entityManager.getTransaction().begin();
        entityManager.merge(tipo);
        entityManager.getTransaction().commit();
    }

    public void delete(int id) {
        T tipo = findById(id);
        entityManager.getTransaction().begin();
        entityManager.remove(tipo);
        entityManager.getTransaction().commit();
    }

    public T findById(long id) {
        return entityManager.find(classe, id);
    }

    @SuppressWarnings("unchecked")
    public List<T> list() {
        String hqlList = "from " + classe.getName();
        Query queryList = entityManager.createQuery(hqlList);
        return queryList.getResultList();
    }

}

