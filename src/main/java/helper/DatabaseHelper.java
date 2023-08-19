/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author OS
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/polyapp";
        String username = "root";
        String password = "26112002";
        Connection con = DriverManager.getConnection(url,username,password);
        return con;
    }
}
