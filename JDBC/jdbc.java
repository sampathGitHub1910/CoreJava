package JDBC;

import java.beans.Statement;
import java.sql.*;

public class jdbc {

    public static void main(String[] args) {
        String driverClassName = "";
        String url = "";
        String username = "";
        String pass = "";
        String query = "";

        // Load the driver
        try {
            Class.forName(driverClassName);

            // Create a connection
            Connection conn = DriverManager.getConnection(url, username, pass);

            // Prepare a statement --> query to exec
            Statement st = (Statement) conn.createStatement();

            

            System.out.println("Rows effected: ");
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } 

        
    }
}