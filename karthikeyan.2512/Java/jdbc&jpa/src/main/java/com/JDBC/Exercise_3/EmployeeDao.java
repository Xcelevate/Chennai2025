package com.JDBC.Exercise_3;

import com.connect.Connect;

import java.sql.*;

public class EmployeeDao {

    Connection conn;


    public void addEmployee(String nm, double sal) throws SQLException{
        // Using prepared statement insert a new employee
        String sql = "INSERT INTO employees (name, salary) VALUES (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, nm);
        ps.setDouble(2, sal);

        ps.executeUpdate();
    }

    public void updateSalary(int eId, double sal) throws SQLException {
        // Using prepared statement insert a new employee
        String sql = "UPDATE employees SET salary = ? WHERE emp_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setDouble(1, sal);
        ps.setInt(2, eId);
        ps.executeUpdate();

    }

    public void deleteEmployee(int empId) throws SQLException {
        String sql = "DELETE FROM employees WHERE emp_id = ?";
        // Using prepared statement delete an employee
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, empId);
        ps.executeUpdate();
    }

    public void listEmployees() throws SQLException {

        // Using prepared statement list all employee
        String sql = "SELECT emp_id, name, salary FROM employees";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        ResultSetMetaData rsmd = rs.getMetaData();

        int columncount =  rsmd.getColumnCount();
        for(int i=1;i<=columncount;i++){
            System.out.print(rsmd.getColumnName(i) + "      ");
        }
        System.out.println();
        while (rs.next()) {
            for (int i = 1; i <= columncount; i++) {
                System.out.print(rs.getString(i)+ "      ");
            }
            System.out.println();
        }
    }
    public void deleteAllEmployees() throws SQLException {
        String sql = "truncate table employees";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.executeUpdate();
    }
    public void findById() throws SQLException {
        String sql = "SELECT * FROM employees WHERE emp_id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, 1);
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columncount = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columncount; i++) {
                System.out.print(rs.getString(i)+ "      ");
            }
        }
    }

    public EmployeeDao()  {
        try{
            conn =   Connect.getConnection();
        }catch(SQLException e){
            System.out.println("Connection Failed! Check output console");
        }
    }
}
