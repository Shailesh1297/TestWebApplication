package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Date;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author UCHIHA
 */
public class MyServlet implements Servlet{

    ServletConfig conf;
    @Override
    public void init(ServletConfig servletConfig)
    {
        this.conf=servletConfig;
         System.out.println("Init");
    }
    
    @Override
    public void service(ServletRequest rq,ServletResponse res)throws ServletException, IOException
    {
        System.out.println(rq.toString());
        
        //res.setContentType("text/html");
        //PrintWriter out=res.getWriter();
        //out.println("<h1>Hello World</h1>");
        //out.println("<p>Date:"+new Date().toString()+"</p>");
    }
    
    @Override
    public void destroy()
    {
        System.out.println("destroyed");
    }
    
    @Override
    public ServletConfig getServletConfig()
    {
     return this.conf;   
    }
    
    @Override
    public String getServletInfo()
    {
        return "Hello Tomcat";
    }
    
}
