/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UCHIHA
 */
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running");
        String username,email,dob,gender,password;
                username=req.getParameter("username");
                password=req.getParameter("password");
                String[] path=req.getRequestURI().split("/");
                System.out.println(username+password+path.toString());
                
                if(username.equals("20mca1260") && password.equals("asdfg"))
                {
                    resp.sendRedirect("/TestWebApplication/home.html");
                }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        String[] path=req.getRequestURI().split("/");
        if(path[2].equals("login"))
            resp.sendRedirect("student.html");
    }
    
    
    
}
