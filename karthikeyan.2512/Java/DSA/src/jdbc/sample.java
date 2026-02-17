package jdbc;

//import com.mysql.cj.x.protobuf.MysqlxPrepare;
import java.sql.*;

public class sample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String name = "root";
        String password = "#Karthi123";
        String query = "SELECT * FROM employees;";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url , name , password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        ResultSetMetaData rsmd = rs.getMetaData();
        int col = rsmd.getColumnCount();

        for(int i = 1 ;i <= col;i++){
            System.out.print(rsmd.getColumnName(i) + "  ");
        }
        System.out.println();

        while(rs.next()){
            for(int i = 1 ;i <=col;i++){
                System.out.print(rs.getString(i) + "  ");
            }
            System.out.println();
        }
    }
}