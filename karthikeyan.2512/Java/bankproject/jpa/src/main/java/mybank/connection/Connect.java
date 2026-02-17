package mybank.connection;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connect {
   static EntityManagerFactory emf =  Persistence.createEntityManagerFactory("JPABank");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}
