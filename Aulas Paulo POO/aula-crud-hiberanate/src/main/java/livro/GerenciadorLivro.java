package livro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class GerenciadorLivro {

    private  EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public GerenciadorLivro() {
        entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void create(Livro livro) {
        entityManager.getTransaction().begin();
        entityManager.persist(livro);
        entityManager.getTransaction().commit();
    }

    public void delete(Livro livro) {
        entityManager.getTransaction().begin();
        entityManager.remove(livro);
        entityManager.getTransaction().commit();
    }

    public List<Livro> list() {
        String sql00 = "from Livro";
        Query hql = entityManager.createQuery(sql00);
        return hql.getResultList();

    }

    public Livro findById(long id) {
        return entityManager.find(Livro.class, id);
    }

    public void update(Livro livro) {
        entityManager.getTransaction().begin();
        entityManager.merge(livro);
        entityManager.getTransaction().commit();

    }

    public void fechar() {
        entityManagerFactory.close();
        entityManager.close();
    }
 }
