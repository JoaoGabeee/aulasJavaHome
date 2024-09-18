package main;

import aluno.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Create {

    public static void main(String[] args) {

        Aluno paulo = new Aluno();
        paulo.setNome("Paulo Paulada");
        paulo.setEmail("paulo3@paulo.com");
        paulo.setDataNascimento(LocalDate.of(2020,12,12));

        //criar uma conexão com o bd usando o arquivo
        //persistence.xml

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");

        //criar um gerenciador de entradas

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //criar transação
        entityManager.getTransaction().begin();

        //create - insert na tabela
        entityManager.persist(paulo);

        //finalizar a transação
        entityManager.getTransaction().commit();

        //fechar o entityManager
        entityManager.close();

        //fechar o entityManagerFactory
        entityManagerFactory.close();
    }
}
