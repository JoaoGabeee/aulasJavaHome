package pessoa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class GerenciarPessoa {

    EntityManagerFactory entityManagerFactory;
    EntityManager entityManager;

    public GerenciarPessoa(){
        entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        entityManager = entityManagerFactory.createEntityManager();
    }

    public void criarPessoa(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.persist(pessoa);
        entityManager.getTransaction().commit();
    }

    public void alterarPessoa(Pessoa pessoa) {
        entityManager.getTransaction().begin();
        entityManager.merge(pessoa);
        entityManager.getTransaction().commit();
    }

    public Pessoa findById(int id){
        return entityManager.find(Pessoa.class, id);
    }

    public void excluirPessoa(int id) {
        Pessoa pessoa = findById(id);

        if (pessoa == null) {
            return;
        }

        entityManager.getTransaction().begin();
        entityManager.remove(pessoa);
        entityManager.getTransaction().commit();
    }

    public List<Pessoa> listarPessoas() {
        String sql = "from Pessoa";
        Query hql = entityManager.createQuery(sql);
        return hql.getResultList();
    }

    public void fecharConexoes() {
        entityManagerFactory.close();
        entityManager.close();
    }

}
