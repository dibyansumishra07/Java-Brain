package ADVANCE_JAVA.EXCEPTION_HANDLING.exceptionConcept;

import java.sql.*;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempt to establish a connection to a database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

            // Execute a SQL query
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

            // Process the results
            while (resultSet.next()) {
                // Process each row
            }

            // Close resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            // Handle the SQLException
            System.err.println("SQLException occurred: " + e.getMessage());
        }
    }
}
