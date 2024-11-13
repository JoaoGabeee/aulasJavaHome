package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import mysql.MysqlSingleton;

public abstract class GenericDAO<T> {

	protected EntityManagerFactory emf;
	protected EntityManager em;
	protected Class<T> classe;
	
	public GenericDAO(Class<T> classe) {
		emf = MysqlSingleton.getConnection();
		em = emf.createEntityManager();
		this.classe = classe;
	}

	public void create(T tipo) {
		em.getTransaction().begin();
		em.persist(tipo);
		em.getTransaction().commit();
	}
	
	public void update(T tipo) {
		em.getTransaction().begin();
		em.merge(tipo);
		em.getTransaction().commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<T> list() {
		String sql = "from " + classe.getName();
		Query query = em.createQuery(sql);
		return query.getResultList();
	}
	
	public void remove(int id) {
		T tipo = findById(id);
		em.getTransaction().begin();
		em.remove(tipo);
		em.getTransaction().commit();
	}
	
	public T findById(int id) {
		return em.find(classe, id);
	}
	
}
