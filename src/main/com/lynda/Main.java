package com.lynda;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING =
            "jdbc:mysql://localhost/explorecalifornia?autoReconnect=true&useSSL=false";
    public static void main( String[] args ) throws SQLException{
        try (Connection conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD)) {
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
