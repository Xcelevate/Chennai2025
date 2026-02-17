package com.JPA.practice_3;

import com.JPA.practice_1.Student;
import com.JPA.practice_2.StudentCrudService;

import java.util.List;

public class Lab3Main {

    public static void main(String[] args) {
        StudentCrudService service = new StudentCrudService();

        try {
            // Ensure we have some data
            if (service.findAllStudents().isEmpty()) {
                service.createStudent("Alice", "Singh", "alice.singh@example.com");
                service.createStudent("Bob", "Singh", "bob.singh@example.com");
                service.createStudent("Charlie", "Brown", "charlie.brown@example.com");
            }

            System.out.println("Total students: " + service.countStudents());

            System.out.println("=== Students with lastName = 'Singh' ===");
            List<Student> singhList = service.findByLastName("Singh");
            singhList.forEach(System.out::println);

        } finally {
            service.shutdown();
        }
    }
}
