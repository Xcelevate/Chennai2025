package com.JDBC.Exercise_4;

import com.connect.Connect;
import java.sql.*;

public class ResultSetMetaDataDemo {
    public static void main(String[] args) throws SQLException {
        Connection conn =  Connect.getConnection();
        String sql = "SELECT emp_id, name, salary FROM employees ORDER BY salary DESC";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        System.out.println();
        System.out.println("====== table using result set ======");
        System.out.println();
        while (rs.next()) {
            int empId = rs.getInt(1);
            String name = rs.getString(2);
            double salary = rs.getDouble(3);
            System.out.printf("%d --> %s  :  %s  \n", empId, name, salary);
        }
        System.out.println();
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();
        System.out.println("column count: " + columnCount);
        System.out.println();
        System.out.println("====== table using result set meta data ======");
        System.out.println();

        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rsmd.getColumnName(i) + "\t");
        }
        System.out.println();
        rs = stmt.executeQuery(sql);
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getString(i) + "   ");
            }
            System.out.println();
        }
        conn.close();

    }
}