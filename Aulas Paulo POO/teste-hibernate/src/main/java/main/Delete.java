package main;

import aluno.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Delete {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Aluno paulo = entityManager.find(Aluno.class, 1L);

        entityManager.getTransaction().begin();
        entityManager.remove(paulo);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


    }
}
