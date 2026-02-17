package com.JPA;


import com.connect.Connect;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.*;

public class HikariSingleClassDemo {

    private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(new Connect().url);
        config.setUsername(new Connect().name);
        config.setPassword(new Connect().pass);
        // =======================================

        config.setMaximumPoolSize(10);
        config.setMinimumIdle(5);
        config.setConnectionTimeout(30_000);
        config.setIdleTimeout(600_000);
        config.setMaxLifetime(1_800_000);

        dataSource = new HikariDataSource(config);
    }

    public static void main(String[] args) {
        try {
            createTable();
            insertEmployee("John Doe", 75000);
            insertEmployee("Jane Smith", 82000);
            listEmployees("After inserts");
            updateEmployeeSalary("John Doe", 80000);
            listEmployees("After update");
            deleteEmployee("Jane Smith");
            listEmployees("After delete");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (dataSource != null) {
                dataSource.close();
            }
        }
    }

    private static void createTable() throws SQLException {
        String createTableSql = " CREATE TABLE IF NOT EXISTS HikariTable (" +
                " id  int PRIMARY KEY, name VARCHAR(100) NOT NULL, " +
                "salary  DOUBLE PRECISION NOT NULL ) ";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(createTableSql)) {
            ps.execute();
            System.out.println("Table 'HikariTable' ready.");
        }
    }

    private static void insertEmployee(String name, double salary) throws SQLException {
        String sql = "INSERT INTO HikariTable (id, name, salary) VALUES (?, ?, ?)";

        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            int nextId = getNextId(conn);
            ps.setInt(1, nextId);
            ps.setString(2, name);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("Inserted: " + name + " with id=" + nextId);
        }
    }

    private static int getNextId(Connection conn) throws SQLException {
        String sql = "SELECT COALESCE(MAX(id), 0) + 1 FROM HikariTable";
        try (PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            rs.next();
            return rs.getInt(1);
        }
    }

    private static void updateEmployeeSalary(String name, double newSalary) throws SQLException {
        String sql = "UPDATE HikariTable SET salary = ? WHERE name = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setDouble(1, newSalary);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println("Updated " + rows + " row(s) for " + name);
        }
    }

    private static void deleteEmployee(String name) throws SQLException {
        String sql = "DELETE FROM HikariTable WHERE name = ?";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, name);
            int rows = ps.executeUpdate();
            System.out.println("Deleted " + rows + " row(s) for " + name);
        }
    }

    private static void listEmployees(String label) throws SQLException {
        String sql = "SELECT id, name, salary FROM HikariTable ORDER BY id";
        try (Connection conn = dataSource.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            System.out.println("=== " + label + " ===");
            while (rs.next()) {
                System.out.printf("ID=%d, Name=%s, Salary=%.2f%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"));
            }
            System.out.println();
        }
    }
}
