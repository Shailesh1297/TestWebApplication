<%-- 
    Document   : home
    Created on : Nov 9, 2020, 11:26:20 AM
    Author     : UCHIHA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% out.print("Hello "+(String)session.getAttribute("username")); %>
    </body>
</html>
