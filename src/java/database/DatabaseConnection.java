/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;


/**
 *
 * @author UCHIHA
 */
public class DatabaseConnection {
    
    public static Connection connect()
    {
        Connection con=null;
        try{  
         DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
        con=(Connection) DriverManager.getConnection("jdbc:mariadb://localhost:3306/"+Env.database,Env.user,Env.password);
        System.out.println("Database connected");
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        return con;
    }
    
}
