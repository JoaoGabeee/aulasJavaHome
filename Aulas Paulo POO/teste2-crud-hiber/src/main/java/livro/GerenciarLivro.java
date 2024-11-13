package livro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GerenciarLivro {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public GerenciarLivro() {
        entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void criarLivro()

}
