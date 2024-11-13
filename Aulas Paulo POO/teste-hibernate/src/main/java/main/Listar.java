package main;

import aluno.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class Listar {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String sqlNativo = "select * from tb_aluno";
        Query nativeQuary = entityManager.createNativeQuery(sqlNativo, Aluno.class);
        List<Aluno> alunos = nativeQuary.getResultList();

        for (Aluno aluno:alunos) {
            System.out.println(aluno.getNome());

        }
        String sqlOO = "from Aluno";
        Query hql = entityManager.createQuery(aqlOO);
        
        List<Aluno> alunos1 = hql.getResultList();

        for (Aluno aluno:alunos) {
            System.out.println(aluno.getNome());

        }
    }


}
