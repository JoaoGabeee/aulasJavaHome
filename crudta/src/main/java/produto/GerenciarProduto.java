package produto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class GerenciarProduto {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public GerenciarProduto() {
        entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void create(Produto produto) {
        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
    }

    public void update(Produto produto) {
        entityManager.getTransaction().begin();
        entityManager.merge(produto);
        entityManager.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public List<Produto> list() {
        String sql = "from Produto";
        Query hql = entityManager.createQuery(sql);
        return hql.getResultList();
    }

    public void remove(int id) {
        Produto produto = findById(id);

        if(produto == null) {
            return;
        }

        entityManager.getTransaction().begin();
        entityManager.remove(produto);
        entityManager.getTransaction().commit();
    }

    public Produto findById(int id) {
        return entityManager.find(Produto.class, id);
    }

    public void fecharConexao() {
        entityManagerFactory.close();
        entityManager.close();
    }

}