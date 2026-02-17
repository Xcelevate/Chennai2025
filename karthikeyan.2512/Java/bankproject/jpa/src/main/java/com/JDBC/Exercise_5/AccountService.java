package com.JDBC.Exercise_5;

import com.connect.Connect;
import java.sql.*;



public class AccountService {
    Connection conn ;

    public void transfer(int fromAccId, int toAccId, double amount) throws SQLException {
        String withdrawSql = "UPDATE accounts SET balance = balance - ? WHERE acc_id = ?";
        String depositSql = "UPDATE accounts SET balance = balance + ? WHERE acc_id = ?";

        PreparedStatement withdrawStmt = conn.prepareStatement(withdrawSql);
        PreparedStatement depositStmt = conn.prepareStatement(depositSql);
        withdrawStmt.setDouble(1, amount);
        withdrawStmt.setInt(2 , fromAccId);
        depositStmt.setDouble(1, amount);
        depositStmt.setInt(2, toAccId);

        withdrawStmt.executeUpdate();
        depositStmt.executeUpdate();
    }

    public void printBalances() throws SQLException {
        String sql = "SELECT acc_id, name, balance FROM accounts";

        try (
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("Account balances:");
            while (rs.next()) {
                System.out.printf("%d - %s: %.2f%n",
                        rs.getInt("acc_id"),
                        rs.getString("name"),
                        rs.getDouble("balance"));
            }
        }
    }
    public void creatingTable() throws SQLException {
        Statement stmt = conn.createStatement();
        stmt.addBatch("CREATE TABLE IF NOT EXISTS accounts (" +
                "    acc_id   INT PRIMARY KEY," +
                "    name     VARCHAR(100) NOT NULL," +
                "    balance  DOUBLE NOT NULL);"
                    );

        stmt.addBatch( "INSERT INTO accounts (acc_id, name, balance) VALUES (1, 'Account A', 10000)" );
        stmt.addBatch( "INSERT INTO accounts (acc_id, name, balance) VALUES (2, 'Account B', 5000)");
        stmt.executeBatch();
    }

    AccountService() throws SQLException {
        conn =  Connect.getConnection();
    }
}