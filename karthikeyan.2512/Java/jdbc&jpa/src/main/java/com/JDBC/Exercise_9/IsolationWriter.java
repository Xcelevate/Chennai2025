package com.JDBC.Exercise_9;

import com.connect.Connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IsolationWriter {

    public static void main(String[] args) {

        String sql = "UPDATE accounts SET balance = balance + 1000 WHERE acc_id = 1";

        try (Connection con =  Connect.getConnection();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            int rows = pstmt.executeUpdate();
            System.out.println("Writer updated rows: " + rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
