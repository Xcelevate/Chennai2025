package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static String url = "jdbc:mysql://localhost:3306/jdbc";
    public static String name = "karthik";
    public static String pass = "#Karthi123";
    static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        if(conn == null) {
            try {
                conn = DriverManager.getConnection(url, name, pass);
            } catch (SQLException e) {
                System.out.println("connection failed!");
                throw new SQLException();
            }
        }
        return conn;
    }
}
