package com.JPA.mapping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("labPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Owner owner = new Owner("karthi" , "keyan" );
        Theater t1 = new Theater("kamala" , "3d theater at chennai");
        owner.setTheater(t1);
        t1.setOwner(owner);
        em.persist(owner);
        em.persist(t1);
        em.getTransaction().commit();

        em.close();

        em =  emf.createEntityManager();
        em.getTransaction().begin();
        Theater town = em.find(Theater.class , t1.getId());
        em.getTransaction().commit();
        em.close();
        emf.close();
        System.out.println("Owner : " + town.getOwner());
        //System.out.println("Theater" + town);
    }
}
