/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SupermarketDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author snish
 */
public class SupermarketDatabaseHandler {
     public static Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarket", "root", "");
            return conn;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}
