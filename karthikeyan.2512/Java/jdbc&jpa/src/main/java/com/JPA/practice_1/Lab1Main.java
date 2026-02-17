package com.JPA.practice_1;

import jakarta.persistence.*;
import java.util.List;

public class Lab1Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = null;
        EntityManager em = null;

        try {
            emf = Persistence.createEntityManagerFactory("labPU");
            em = emf.createEntityManager();
            System.out.println("EntityManager created successfully!");
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            Student s = new Student("karthik", "keyan", "karthik@123gmail.com");
            em.persist(s);
            tx.commit();

            Student stu = em.find(Student.class, 1);
            System.out.println(stu.getFirstName());

            String jpql = "select s from Student s where s.id = ?1";
            Query query = em.createQuery(jpql);
            query.setParameter(1, 1);
            List<Student> students = query.getResultList();
            for (Student s1 : students) {
                System.out.println(s1);
            }

        } finally {
            if (em != null) {
                em.close();
                System.out.println("EntityManager closed.");
            }
            if (emf != null) {
                emf.close();
                System.out.println("EntityManagerFactory closed.");
            }
        }
    }
}
