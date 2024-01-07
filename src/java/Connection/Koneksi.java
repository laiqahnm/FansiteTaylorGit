/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author laiqah
 */
public class Koneksi {
    private static Connection con;
    public static Connection getCon() throws SQLException {
        if(con==null){
        try {
<<<<<<< HEAD
            String DB="jdbc:mysql://localhost:3306/dbtaylor"; // dbtaylor database
=======
            String DB="jdbc:mysql://localhost:8111/dbtaylor"; // dbtaylor database
>>>>>>> 1059339fe536a543f57e8e1378920a03a81be402
                String user="root"; // user database
                String pass=""; // password database
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = (Connection) DriverManager.getConnection(DB,user,pass);
            } catch (Exception e) {
        }
        } 
        return con;
    }
}
