package carro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class GerenciarCarro {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public GerenciarCarro(){
        entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void adicionarCarro(Carro carro) {
        entityManager.getTransaction().begin();
        entityManager.persist(carro);
        entityManager.getTransaction().commit();
    }

    public void excluirCarro(int id) {
        Carro carro = findById(id);

        if (carro == null) {
            return;
        }

        entityManager.getTransaction().begin();
        entityManager.remove(carro);
        entityManager.getTransaction().commit();
    }

    public Carro findById(int id) {
        return entityManager.find(Carro.class, id);
    }

    public void alterarCarro(Carro carro) {
        entityManager.getTransaction().begin();
        entityManager.merge(carro);
        entityManager.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public List<Carro> listarCarros(){
        String sql = "from Carro";
        Query hql = entityManager.createQuery(sql);
        return hql.getResultList();
    }

    public void fecharConexoes() {
        entityManagerFactory.close();
        entityManager.close();
    }

}
