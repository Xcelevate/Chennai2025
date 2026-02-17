package mybank.dao;

import jakarta.persistence.EntityManager;
import mybank.connection.Connect;
import mybank.entities.Users;

public class UserServiceDAO {
    public Users getUserById(String uid, String pwd) {
        EntityManager em = Connect.getEntityManager();
        return em.find(Users.class, uid);
    }
}
