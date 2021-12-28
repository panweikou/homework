package com.epam.week4;

import java.sql.*;

/**
 * Create the connection
 */
public class DbUtils {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        //1. Load and register JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. create the connection with database
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjava?","root","Ycsz2082!");
        return conn;
    }

    /**
     * Close the connection
     * @param pStament pstament
     * @param rs      result
     * @param conn    connection
     */
    public static void closeConnection(PreparedStatement pStament, ResultSet rs, Connection conn) {
        try{
            if(pStament !=null) {
                pStament.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(rs !=null) {
                rs.close();
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            if(conn !=null && conn.isClosed() ==false) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
