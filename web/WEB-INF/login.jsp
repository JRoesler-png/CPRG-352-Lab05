<%-- 
    Document   : login
    Created on : Oct 16, 2021, 1:14:15 AM
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
        <h1>Login</h1>
        <br>
        <form method="Post" action="">
            <label>Username:</label>
            <input type="text" name="username" value="${username}">
            <br>
            <label>Password:</label>
            <input type="text" name="password" value="${password}">
            <br>
            
            <input type="submit" name="login" value="Login">
            <p>${message}</p>
          </form>
    </body>
</html>
