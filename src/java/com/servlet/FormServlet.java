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
        String name,email,dob,gender,password;
                name=req.getParameter("name");
                email=req.getParameter("email");
                dob=req.getParameter("dob");
                gender=req.getParameter("gender");
                password=req.getParameter("password");
                System.out.println(name+email+dob+gender+password);
                if(email.equals("abc@gmail.com") && password.equals("asdfg"))
                {
                    resp.sendRedirect("home.jsp");
                }
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       // super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
        String[] path=req.getRequestURI().split("/");
        if(path[2].equals("student"))
            resp.sendRedirect("student.html");
    }
    
    
    
}
