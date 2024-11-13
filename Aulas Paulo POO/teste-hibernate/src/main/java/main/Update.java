package main;

import aluno.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Update {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //select * from tb_aluno where id = 1;
        Aluno paulo = entityManager.find(Aluno.class, 1L);
        paulo.setNome("www");

        entityManager.getTransaction().begin();
        entityManager.merge(paulo);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }

}
