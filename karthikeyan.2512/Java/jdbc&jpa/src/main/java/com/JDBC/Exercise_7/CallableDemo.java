package com.JDBC.Exercise_7;

import com.connect.Connect;
import java.sql.*;

public class CallableDemo {
    public static void main(String[] args) {
        String sql = "{ call get_employee_salary() }";
        try(Connection conn =  Connect.getConnection();
        CallableStatement cstmt = conn.prepareCall(sql);) {
            cstmt.setInt(1, 1);
            cstmt.registerOutParameter(2, Types.DOUBLE);
           ResultSet rs = cstmt.executeQuery();

            /*double output = cstmt.getDouble(2);*/
            while(rs.next()) {
                System.out.println(rs.getDouble(1));
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
