package usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class GerenciarUsuario {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public GerenciarUsuario() {
        entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void create(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.persist(usuario);
        entityManager.getTransaction().commit();
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> list() {
        String hqlList = "from Usuario";
        Query queryList = entityManager.createQuery(hqlList);
        return queryList.getResultList();
    }

    public Usuario findById(long id) {
        return entityManager.find(Usuario.class, id);
    }

    public void update(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.merge(usuario);
        entityManager.getTransaction().commit();
    }

    public void delete(Usuario usuario) {
        entityManager.getTransaction().begin();
        entityManager.remove(usuario);
        entityManager.getTransaction().commit();
    }

    public void fecharConexao() {
        entityManager.close();
    }

}
