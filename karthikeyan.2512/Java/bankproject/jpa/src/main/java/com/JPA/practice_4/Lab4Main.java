package com.JPA.practice_4;

import com.JPA.practice_1.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Lab4Main {

    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("labPU");

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            Student s = new Student("Ravi", "Kumar", "ravi.kumar@example.com");
            Course c1 = new Course("JPA Fundamentals");
            Course c2 = new Course("Spring Data JPA");

            s.addCourse(c1);
            s.addCourse(c2);

            em.createNativeQuery("truncate TABLE Course").getFlushMode();
            em.createNativeQuery("truncate table Student").getFlushMode();
            em.getTransaction().commit();

            em.getTransaction().begin();
            em.persist(s); // cascades to courses

            em.getTransaction().commit();

            // Fetch back
            em.clear();
            Student found = em.find(Student.class, s.getId());
            System.out.println("Student: " + found);
            System.out.println("Courses:");
            found.getCourses().forEach(System.out::println);


        } finally {
            em.close();
            emf.close();
        }
    }
}