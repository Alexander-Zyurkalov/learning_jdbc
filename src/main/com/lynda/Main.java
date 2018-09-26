package com.lynda;

import java.sql.*;

public class Main {
    private static final String USERNAME = "lyndacom";
    private static final String PASSWORD = "password";
    private static final String CONN_STRING =
            "jdbc:mysql://localhost/explorecalifornia?autoReconnect=true&useSSL=false";
    public static void main( String[] args ) throws SQLException{
        try (
            Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT * FROM states")
        ) {
            System.out.println("Connected");
            rs.last();
            rs.first();
            rs.next();
            System.out.println("Number of rows: "+ rs.getRow());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
