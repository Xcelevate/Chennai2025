package com.JDBC.Exercise_3;

import java.sql.SQLException;

public class EmployeePreparedDemo {

    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();

        try {
            dao.deleteAllEmployees();
            dao.addEmployee("Charlie" , 50000);

            dao.addEmployee("Diana", 72000);

            dao.listEmployees();

            dao.updateSalary(1, 70000);
            dao.deleteEmployee(2);

            dao.listEmployees();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
