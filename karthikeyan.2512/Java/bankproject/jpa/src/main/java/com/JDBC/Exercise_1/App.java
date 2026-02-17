package com.JDBC.Exercise_1;

import com.connect.Connect;

import java.sql.*;

public class App {
    public static void main( String[] args ) throws SQLException {

        // CTRL + Alt + V --> creates a variable;

        Connection conn = Connect.getConnection();
        System.out.println("Connected to database successfully");
        DatabaseMetaData metaData = conn.getMetaData();
        System.out.println("DB Name: " + metaData.getDatabaseProductName());
        System.out.println("DB Version: " + metaData.getDatabaseProductVersion());
        System.out.println("Driver Name: " + metaData.getDriverName());
        System.out.println("Driver Version: " + metaData.getDriverVersion());
        System.out.println("Driver Major: " + metaData.getDriverMajorVersion());
        System.out.println("Driver Minor: " + metaData.getDriverMinorVersion());
        System.out.println();



    }
}
