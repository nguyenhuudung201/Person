package com.class2.uitl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
    public static Connection getConnection() throws Exception {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Person","sa","040620");
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return conn;
    }

}
