package mysql;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MysqlSingleton {

	private static EntityManagerFactory emf;
	
	private MysqlSingleton() {
	}
	
	public synchronized static EntityManagerFactory getConnection()
	{
		if ( emf == null )
		{
			emf = Persistence.createEntityManagerFactory("xuxu");
		}
		return emf;
	}
	
	public static void fecharConexao()
	{
		emf.close();
	}
	
}
