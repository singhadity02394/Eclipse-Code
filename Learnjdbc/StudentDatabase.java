package Learnjdbc;

import java.sql.*;

public class StudentDatabase {



    private static final String URL = "jdbc:mysql://localhost:3306/databases";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Sunny123@";


    // Method to retrieve all records from the Student table and print them to the console
    public static void printStudentRecords() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            // Execute the query to retrieve all records from the Student table
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Student");

            // Iterate over the result set and print each record
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Call the method to print student records
        printStudentRecords();
    }
}

