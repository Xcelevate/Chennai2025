package com.JPA.mapping;


import jakarta.persistence.*;

@Entity
@Table(name = "owner")
public class Owner {

    public Long getOwnId() {
        return ownId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ownId;

    private String firstName;
    private String lastName;


    @Transient
    private String fullName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "theater_id")
    private Theater theater;


    public Owner(){}

    public Owner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "ownId=" + ownId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", theater=" + theater.getId() + "Full name="  + getFullName() +
                '}';
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

    public Theater getTheater() {
        return theater;
    }
    public void setTheater(Theater theater) {
        this.theater = theater;
    }
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

}
