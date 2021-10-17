<%-- 
    Document   : home
    Created on : Oct 16, 2021, 1:27:11 AM
    Author     : Jeramie R
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <br>
        <h3>Hello ${username}</h3>
        
        <a href="login?logout" name="logout">Logout</a>
    </body>
</html>
