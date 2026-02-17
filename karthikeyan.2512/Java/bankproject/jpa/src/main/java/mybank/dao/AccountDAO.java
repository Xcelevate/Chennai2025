package mybank.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import mybank.connection.Connect;
import mybank.entities.Account;

import java.util.List;

public class AccountDAO {
    public List<Account> getAccountsByUserId(String uid) {
        try (EntityManager em = Connect.getEntityManager()) {
            String jpql = "select a from Account a where a.userId= :id";
            TypedQuery<Account> query = em.createQuery(jpql, Account.class);
            query.setParameter("id", uid);
            return query.getResultList();
        }
    }

    public void withdrawAmount(int id, double amt) {
        try (EntityManager em = Connect.getEntityManager();) {
            em.getTransaction().begin();
            Account account = em.find(Account.class, id);
            double am = account.getBalance();
            account.setBalance(am - amt);
            em.getTransaction().commit();
        }
    }
    public void accountCreate(String uid, double amt) {
        try(EntityManager em = Connect.getEntityManager()) {
            em.getTransaction().begin();
            Account account = new Account(uid, amt);
            em.persist(account);
            em.getTransaction().commit();
        }
    }

    public void depositAmount(int id, double amt) {
        try (EntityManager em = Connect.getEntityManager();) {
            em.getTransaction().begin();
            Account account = em.find(Account.class, id);
            double am = account.getBalance();
            account.setBalance(am + amt);
            em.getTransaction().commit();
        }
    }
    public Account getAccountByUserId(String uid , int accId) {
        try (EntityManager em = Connect.getEntityManager();) {
            Account account = em.find(Account.class, accId);
            if(account.getUserId().equals(uid)) {
                return account;
            }
            else {
                return null;
            }
        }
    }

    public void deleteAccountByAccId(int acc){
        try (EntityManager em = Connect.getEntityManager();) {
            em.getTransaction().begin();
            Account account = em.find(Account.class, acc);
            if(account.getBalance() >= 100){
                em.getTransaction().commit();
                em.close();
                System.out.println("you having some amount in your account .");
                System.out.println(" First Withdraw then you can delete");
                return;
            }
            em.remove(account);
            em.getTransaction().commit();
        }
    }
}
