package com.JPA.practice_1;

import com.JPA.practice_4.Course;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "JPAStudents")
public  class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // works for MySQL, Postgres (IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(unique = true, length = 100)
    private String email;

    // Fields
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Course> courses = new ArrayList<>();

    // Helper method

    public Student() {
    }

    public Student(String firstName, String lastName, String email ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void addCourse(Course course) {
        courses.add(course);
        course.setStudent(this);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourses() {
        return courses;
    }


    @Override
    public String toString() {
        return "Student{" +
        "id=" + id +
        ", firstName='" + firstName + '\''+
        ", lastName='" + lastName + '\'' +
        ", email='" + email + '\'' +

        '}';
    }

    public void removeCourse(Course course) {
        courses.remove(course);
        course.setStudent(null);
    }

}
