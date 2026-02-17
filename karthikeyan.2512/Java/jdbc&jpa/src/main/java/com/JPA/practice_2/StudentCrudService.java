package com.JPA.practice_2;

import com.JPA.practice_1.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class StudentCrudService {

    private final EntityManagerFactory emf;

    public StudentCrudService() {
        this.emf = Persistence.createEntityManagerFactory("labPU");
    }

    public void shutdown() {
        if (emf != null) {
            emf.close();
        }
    }

    // TODO-1: Implement createStudent
    public Student createStudent(String first, String last, String email) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Student s = new Student(first, last, email);
            em.persist(s);

            em.getTransaction().commit();
            return s;
        } finally {
            em.close();
        }
    }

    // TODO-2: Implement findStudentById
    public Student findStudentById(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(Student.class, id);
        } finally {
            em.close();
        }
    }

    // TODO-3: Implement updateStudentEmail
    public void updateStudentEmail(Long id, String newEmail) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Student s = em.find(Student.class, id);
            if (s != null) {
                s.setEmail(newEmail);
            }

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // TODO-4: Implement deleteStudent
    public void deleteStudent(Long id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();

            Student s = em.find(Student.class, id);
            if (s != null) {
                em.remove(s);
            }

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // Helper: list all students
    public List<Student> findAllStudents() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT s FROM Student s", Student.class)
                    .getResultList();
        } finally {
            em.close();
        }
    }
    public void truncateTable(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Student").executeUpdate();
        em.getTransaction().commit();
        em.close();
    }
    public List<Student> findByLastName(String lastName) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery(
                            "SELECT s FROM Student s WHERE s.lastName = :ln", Student.class)
                    .setParameter("ln", lastName)
                    .getResultList();
        } finally {
            em.close();
        }
    }


    public long countStudents() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery(
                            "SELECT COUNT(s) FROM Student s", Long.class)
                    .getSingleResult();
        } finally {
            em.close();
        }
    }
}
