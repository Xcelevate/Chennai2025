package jdbc;

import java.sql.*;
import java.util.*;

public class Example {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String name = "root";
        String password = "#Karthi123";
        String query = "select *  from employees";
        Connection con = DriverManager.getConnection(url , name , password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        // System.out.println(rs.getMetaData().getColumnName(1));
        for(int i = 1; i <= 8 ;i++)
            System.out.print(rs.getMetaData().getColumnName(i) + "  ");
        System.out.println();
        while(rs.next()){
            for(int i = 1; i <= 8 ;i++)
                System.out.print(rs.getString(i) + "    ");
        System.out.println();
        }
    }
}
