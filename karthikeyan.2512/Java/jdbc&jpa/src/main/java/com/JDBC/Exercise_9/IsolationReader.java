package com.JDBC.Exercise_9;

import com.connect.Connect;
import java.sql.*;
public class IsolationReader {

    public static void main(String[] args) throws InterruptedException {


        String sql = "SELECT balance FROM accounts WHERE acc_id = 1";

        try (Connection con =  Connect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            con.setAutoCommit(false);
            con.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            // Try also: TRANSACTION_REPEATABLE_READ, TRANSACTION_SERIALIZABLE

            ResultSet rs1 = pstmt.executeQuery();
            if (rs1.next()) {
                System.out.println("First read balance = " + rs1.getDouble(1));
            }

            System.out.println("Sleeping 20 seconds. Run Writer now...");
            Thread.sleep(20_000);

            ResultSet rs2 = pstmt.executeQuery();
            if (rs2.next()) {
                System.out.println("Second read balance = " + rs2.getDouble(1));
            }

            con.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
