package Learnjdbc;

import java.math.BigDecimal;
import java.sql.*;
/*
use anudipsql;

CREATE TABLE Employees (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_name VARCHAR(100),
    salary DECIMAL(10, 2)
);

INSERT INTO Employees (employee_name, salary) VALUES
('John Doe', 50000.00),
('Jane Smith', 60000.00),
('Alice Johnson', 70000.00);

mysql> select * from Employees;
+-------------+---------------+----------+
| employee_id | employee_name | salary   |
+-------------+---------------+----------+
|           1 | John Doe      | 50000.00 |
|           2 | Jane Smith    | 60000.00 |
|           3 | Alice Johnson | 70000.00 |
+-------------+---------------+----------+

mysql>  select * from Employees;
+-------------+---------------+----------+
| employee_id | employee_name | salary   |
+-------------+---------------+----------+
|           1 | John Doe      | 90000.00 |
|           2 | Jane Smith    | 60000.00 |
|           3 | Alice Johnson | 70000.00 |
+-------------+---------------+----------+
 */

public class Lab16 {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3307/anudipsql";
        String username = "root";
        String password = "Sunny123@";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loded:");


            Connection connection = DriverManager.getConnection(url, username, password);
            // Update the salary of an employee
            String updateQuery = "UPDATE Employees SET salary = ? WHERE employee_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setBigDecimal(1, new BigDecimal(90000.00)); // New salary
            preparedStatement.setInt(2, 1); // Employee ID
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Salary updated successfully.");
            } else {
                System.out.println("No employee found with the given ID.");
            }


        }catch(Exception e){
            e.printStackTrace();

        }
            



    }
}

