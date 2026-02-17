package mybank.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transactionId;
    private String userName;
    private int accId;
    private double amount;
    private String type;
    private LocalDateTime date;


    public Transaction() {}

    public Transaction(String userName, int accId, double amount, String type) {
        this.userName = userName;
        this.accId = accId;
        this.amount = amount;
        this.type = type;
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return String.format("Transaction id: %d  \nUser Name: %s \nAccount id: %d  \nAmount: %f  \nType: %s ", this.transactionId, this.userName, this.accId, (float)this.amount, this.type);
    }
}
