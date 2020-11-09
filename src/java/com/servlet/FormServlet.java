/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import validation.Validation;

/**
 *
 * @author UCHIHA
 */
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // System.out.println("Running");
        String username,email,dob,gender,password;
                username=req.getParameter("username");
                password=req.getParameter("password");
                String[] path=req.getRequestURI().split("/");
               // System.out.println(username+password+path.toString());
                Validation val=new Validation();
                
                
                if(val.validate(username, password))
                {
                    HttpSession hs=req.getSession();
                    hs.setAttribute("username", username);
                    resp.sendRedirect("home.jsp");
                }else
                {
                    resp.sendRedirect("student.html");
                }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        String [] path=req.getRequestURI().split("/");
        System.out.println(Arrays.toString(path));
       
//          if(path.length==2)
//          {
//             resp.sendRedirect("student.html"); 
//          }else
//          {
              if(path[2].equals("login")){ 
               resp.sendRedirect("student.html");
          }
           
        }
    
    
    
    
}
