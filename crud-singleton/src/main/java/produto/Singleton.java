package produto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Singleton {

    private static EntityManagerFactory entityManagerFactory;

    private Singleton() {}

    public static EntityManagerFactory getInstance() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");;
        }
        return entityManagerFactory;
    }

}
