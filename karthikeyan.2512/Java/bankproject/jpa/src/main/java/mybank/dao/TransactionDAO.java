package mybank.dao;

import jakarta.persistence.EntityManager;
import mybank.connection.Connect;
import mybank.entities.Transaction;

public class TransactionDAO {

    public void selfTransferFunds(String toUserId, int fromAcc, int toAcc, double amount) {

        try (EntityManager em = Connect.getEntityManager();) {
            em.getTransaction().begin();
            em.persist(new Transaction(toUserId, fromAcc, amount, "Debit"));
            em.persist(new Transaction(toUserId, toAcc, amount, "Credit"));
            em.getTransaction().commit();
        }
    }

    public void transferToAnotherUser(String fromUser , String toUser , int fromAcc, int toAcc, double amount) {
        try (EntityManager em = Connect.getEntityManager();) {
            em.getTransaction().begin();
            em.persist(new Transaction(fromUser, fromAcc, amount, "Debit"));
            em.persist(new Transaction(toUser, toAcc, amount, "Credit"));
            em.getTransaction().commit();
        }
    }
}
