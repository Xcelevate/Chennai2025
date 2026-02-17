package com.JDBC.Exercise_5;

import java.sql.SQLException;

public class AccountDemo {

    public static void main(String[] args) throws SQLException {
        AccountService service = new AccountService();

        try {
            //service.creatingTable();
            service.printBalances();
            service.transfer(1, 2, 2000);
            System.out.println();
            System.out.println("After transfer");
            System.out.println();
            service.printBalances();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
