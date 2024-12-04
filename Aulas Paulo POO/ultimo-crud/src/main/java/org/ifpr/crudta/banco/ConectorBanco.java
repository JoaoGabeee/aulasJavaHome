package org.ifpr.crudta.banco;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class ConectorBanco {

    private static EntityManagerFactory entityManagerFactory;

    private ConectorBanco() {}

    public static synchronized EntityManagerFactory getInstance() {
        if (entityManagerFactory == null) {
            entityManagerFactory = Persistence.createEntityManagerFactory("xuxu");
        }

        return entityManagerFactory;
    }

}
