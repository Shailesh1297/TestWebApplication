/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validation;

import database.DatabaseConnection;
import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author UCHIHA
 */
public class Validation {
    
    public boolean validate(String username,String password)
    {
        boolean flag=false;
        Connection con=DatabaseConnection.connect();
        try{
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from users where username='"+username+"' AND password='"+password+"'");  
        rs.last();
        if(rs.getRow()==1)
           
        {       flag=true;
        
        
        }
        
            // rs.getString("username")+"  "+rs.getString("password")+" "+rs.getLong("mobile")); 
        
                
         con.close();  
        }catch(Exception e)
        {
            
        }
        return flag;
    }
    
}
