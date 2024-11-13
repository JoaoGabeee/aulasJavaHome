package conector;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class ConectorBanco {

    private static EntityManagerFactory entityManagerFactory;

    private ConectorBanco() {}

    public static synchronized EntityManagerFactory getConnection() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");;
        }
        return entityManagerFactory;
    }

    public static void fecharConexao(){
        entityManagerFactory.close();
    }

}
