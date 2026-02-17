package mybank.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "account")
public final class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int accId;
    String userId;
    double balance;


    public Account() {
    }

    public Account(String userid, double balance) {
        this.userId = userid;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return this.accId + " " + this.balance;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
