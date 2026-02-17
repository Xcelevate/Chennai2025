package com.JDBC.Exercise_2;

import com.connect.Connect;
import java.sql.*;
import java.util.Scanner;


public class EmployeeStatement{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        //String userName =kk.next();
        try(Connection con =  Connect.getConnection();){
            Statement stmt = con.createStatement();
            stmt.executeUpdate("Delete from employees");

            stmt.executeUpdate("drop table if exists employees");
            // Ensure table exists (idempotent)
            String createSql =
                    "CREATE TABLE IF NOT EXISTS employees (" +
                            "emp_id INT PRIMARY KEY AUTO_INCREMENT, " +
                            "name VARCHAR(100) NOT NULL, " +
                            "salary DOUBLE NOT NULL" +
                            ")";
            stmt.executeUpdate(createSql);

            // INSERT

            stmt.addBatch("INSERT INTO employees (name, salary) VALUES ('Alice', 60000)");
            stmt.addBatch("INSERT INTO employees (name, salary) VALUES ('Bob', 55000)");
            stmt.executeBatch();


            // SELECT
            String querySql = "SELECT emp_id, name, salary FROM employees" /* where salary = " + userName "*/ ;
            try (ResultSet rs = stmt.executeQuery(querySql)) {
                System.out.println("Employees:");
                while (rs.next()) {
                    int id = rs.getInt("emp_id");
                    String name = rs.getString("name");
                    double salary = rs.getDouble("salary");
                    System.out.printf("%d, %s, %.2f%n", id, name, salary);
                }
            }

            // UPDATE
            String updateSql = "UPDATE employees SET salary = 65000 WHERE name = 'Alice'";

            int updated = stmt.executeUpdate(updateSql);
            System.out.println(updated + " row(s) updated.");

            // DELETE
            String deleteSql =
                    "DELETE FROM employees WHERE name = 'Bob'";
            int deleted = stmt.executeUpdate(deleteSql);
            System.out.println(deleted + " row(s) deleted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
