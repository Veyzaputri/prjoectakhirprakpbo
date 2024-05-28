/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author My ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {
     public static Connection getConnection() {
        Connection con = null;
        try {
            // Replace the following with your database credentials and URL
            String url = "jdbc:mysql://localhost:3306/tokobuku";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
