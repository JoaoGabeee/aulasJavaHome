package pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class GerenciarPessoa {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public GerenciarPessoa() {

        entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        entityManager = entityManagerFactory.createEntityManager();

    }

    public void adicionarPessoa(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.persist(pessoa);
        entityManager.getTransaction().commit();
    }

    public void excluirPessoa(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.remove(pessoa);
        entityManager.getTransaction().commit();
    }

    public void alterarPessoa(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.merge(pessoa);
        entityManager.getTransaction().commit();
    }

    public Pessoa findById(int id) {

    }


}
