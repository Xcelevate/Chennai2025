package com.JDBC;

import com.connect.Connect;
import java.sql.*;

public class CRUD_Operation {
    public static void main(String[] args) {
        // setting the connection
        try {
            Connection con =  Connect.getConnection();
            Statement st = con.createStatement();


            ///* create the table*///
            String createTable = "create table if not exists studs(" +
                    "roll_no int primary key, " +
                    "name varchar(255), " +
                    "ph_no varchar(13)," +
                    "address varchar(255) );";

            st.executeUpdate(createTable);
            System.out.println("========= TABLE CREATION =========\n");
            st.executeUpdate("truncate table studs");
            System.out.println("Table Created\n\n");


            /* insert the values*/

            System.out.println("====== INSERTION PARTITION =========");

            st.addBatch("insert into studs " +
                    "values" +
                    "(2501 , 'karthik', '+919847982323','24/8,appear st , kosapalayam ,arni')," +
                    "(2502 ,'Harikrishnan' , '+97436746745','102 new big street , arni,985432')," +
                    "(2503, 'Karthik', '+919876543210', '45 Gandhi Road, Chennai, 600001')," +
                    "(2504, 'Meena', '+918765432109', '12 Anna Nagar, Madurai, 625020')," +
                    "(2505, 'Ravi', '+917654321098', '78 MG Street, Coimbatore, 641002');");

            int[] arr = st.executeBatch();
            System.out.println("\n"+ arr[0] + " Value(s) inserted in the table. \n\n\n");

            System.out.println(" ====================== TABLE =====================\n");


            // execute part to show the output
            String query = "select * from studs";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmt = rs.getMetaData();   // for column name you should use metadata ,
            // otherwise result set is enough
            int col = rsmt.getColumnCount();
            for (int i = 1; i <= col; i++) {
                System.out.print(rsmt.getColumnName(i) + "   "); // column name will print
            }
            System.out.println();
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "  ");
                }
                System.out.println();
            }


            //update the values
            System.out.println("\n\n============= UPDATE PART ==============");
            System.out.println();
            int count = st.executeUpdate("update studs set name = 'Alice' where roll_no = 2503");
            count += st.executeUpdate("update studs set name = 'Krish' where roll_no = 2502");
            System.out.println(count + " row(s) updated");
            count -= count;
            System.out.println("update finished\n\n");


            // delete some rows
            System.out.println("============= DELETE PART ==============\n");
            count += st.executeUpdate("delete from studs where roll_no = 2505");
            System.out.println(count + " row(s) deleted");
            System.out.println("delete finished\n\n");


            // read the remain table
            System.out.println("============= REMAINING TABLE ==============\n");
            for (int i = 1; i <= col; i++) {
                System.out.print(rsmt.getColumnName(i) + "   ");
            }
            System.out.println();
            rs = st.executeQuery("select * from studs");
            while (rs.next()) {
                for (int i = 1; i <= col; i++) {
                    System.out.print(rs.getString(i) + "  ");
                }
                System.out.println();
            }

            // delete the table
            System.out.println("\n\n\n=============== DELETION OF WHOLE TABLE ==============\n");
            System.out.println("delete finished");

            System.out.print("\n\n                       THANK YOU          \n\n");
        }catch(SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
