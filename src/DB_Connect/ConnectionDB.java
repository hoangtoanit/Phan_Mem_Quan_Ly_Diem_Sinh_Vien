/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connect;

/**
 *
 * @author HoangVanToan
 */
import java.sql.*;

public class ConnectionDB {
    
    public static Connection getConnectionDB() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        try {
          String ConnectionURL ="jdbc:sqlserver://localhost:1433;databaseName=QLDSVDH"; 
          String username = "hoangtoan";
          String password = "123456";
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          conn = DriverManager.getConnection(ConnectionURL,username,password);
        } catch (Exception e) {

        }
        return conn;

    }

    
}
