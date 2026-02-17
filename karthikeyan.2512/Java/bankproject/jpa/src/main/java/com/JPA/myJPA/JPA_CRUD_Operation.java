package com.JPA.myJPA;

import jakarta.persistence.*;


import java.util.List;

public class JPA_CRUD_Operation {

    static void start(EntityManager em) {
        em.getTransaction().begin();
    }
    static void finish(EntityManager em) {
        em.getTransaction().commit();
        em.close();
    }

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("karthik");


        System.out.println("ENTITY MANAGER CREATED\n");

        System.out.println("========= TABLE CREATION ==========");

        System.out.println("table created . ");

        System.out.println("========== INSERTION PORTION ==========");
        EntityManager em = emf.createEntityManager();
        start(em);
        for(int i = 1 ; i <= 10 ; i++){
            Tabulation tab = new Tabulation();
            tab.setName("user" + i);
            tab.setEmail("user" + i + "@gmail.com");
            em.persist(tab);
        }
        finish(em);
        System.out.println(10 + " row(s) inserted .");


        System.out.println("\n========== TABLE ==========\n");

         em = emf.createEntityManager();
        start(em);
        List<Tabulation> list = em.createQuery("select t from Tabulation t" , Tabulation.class).getResultList();
        finish(em);
        System.out.println( " Id  name     email address");
        System.out.println();
        for(Tabulation tab : list){
            System.out.println(tab.tostring());
        }

        System.out.println("\n==========particular tabula details");
        EntityManager em2 = emf.createEntityManager();
        start(em2);
        Query quer = em2.createQuery("select t from Tabulation t where t.id = :i");
        quer.setParameter("i", 1);

        Tabulation t = (Tabulation) quer.getSingleResult();
        finish(em2);
        System.out.println(t.toString());

        System.out.println("========== UPDATE PART ==========\n");
        em = emf.createEntityManager();
        start(em);
        Tabulation tab = em.find(Tabulation.class, 3);
        tab.setEmail("newmail3@gmail.com");
        tab.setName("newuser3");
        em.merge(tab);
        System.out.println("without query updated \n");
        finish(em);

        em = emf.createEntityManager();
        start(em);
        String jpql = "update Tabulation t SET t.email = :mail , t.name = :nam where t.id = :d";
        Query query = em.createQuery(jpql);
        query.setParameter("mail", "newemail7@gmail.com");
        query.setParameter("d", 7);
        query.setParameter("nam", "newuser7");
        int num = query.executeUpdate();
        finish(em);
        System.out.println( num + " row(s) updated.");
        System.out.println("with query updated \n");

        System.out.println("========== DELETE PART ==========");

        System.out.println();
        em = emf.createEntityManager();
        start(em);
        tab = em.find(Tabulation.class, 1);
        if(tab != null){
            em.remove(tab);
        }else{
            System.out.println("user not found");
        }
        finish(em);
        System.out.println("with out query \"row\" deleted\n");


        jpql = "DELETE FROM Tabulation t WHERE t.id = :id";
        em = emf.createEntityManager();
        start(em);
        query = em.createQuery(jpql);
        query.setParameter("id", 2);
        num = query.executeUpdate();
        finish(em);
        System.out.println( num + " row(s) deleted.");
        System.out.println("\n============ REMAINING TABLE ==========\n");
        em = emf.createEntityManager();
        start(em);
         list = em.createQuery("select t from Tabulation t" , Tabulation.class).getResultList();
        finish(em);
        System.out.println( " Id  name     email address\n");

        for(Tabulation tabu : list){
            System.out.println(tabu.tostring() + "\n");
        }


        System.out.println("================ DELETION OF WHOLE TABLE ==================");
        em = emf.createEntityManager();
        start(em);
        em.createNativeQuery("truncate TABLE Tabulation").getFlushMode();
        finish(em);
        System.out.println("table deleted");
    }
}
