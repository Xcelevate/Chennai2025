package jdbc;

import  java.sql.*;

public class ClassicDataBase {
    public static void main(String[] args) throws Exception {
        String url ="jdbc:mysql://localhost:3306/classicmodels";
        String user_name ="root";
        String password = "#Karthi123";

        String query = "select * from customers;";
        Connection con = DriverManager.getConnection(url , user_name , password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        ResultSetMetaData rsmd = rs.getMetaData();

        int column = rsmd.getColumnCount();
        for (int i = 1; i <= column; i++) {
            System.out.print(rsmd.getColumnName(i) + "   ");
        }
        System.out.println( );
        while(rs.next()){
            for (int i = 1; i <= column; i++) {
                System.out.print(rs.getString(i) +  "   ");
            }
            System.out.println();
        }
    }
}
